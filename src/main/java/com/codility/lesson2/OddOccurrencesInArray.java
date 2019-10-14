package com.codility.lesson2;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int[] array = A;
        int max = 0;
        
        for (int i = 0; i < array.length; ++ i) {
            max = array[i] > max ? array[i] : max; 
        }
        int[] map = new int[max + 1];
        for (int i = 0; i < array.length; ++ i) {
            map[array[i]] += 1;
        }
        
        int result = 0;
        for (int i = 0; i < map.length; ++ i) {
            if (map[i] % 2 != 0) {
                result = i;
                break;
            }
        }
        
        return result;
    }
}
