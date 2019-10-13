package com.codility.lesson2;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int[] array = A;
        outer: for (int i = 0; i < array.length; ++ i) {
            if (array[i] != 0) {
                for (int j = i + 1; j < array.length; ++ j) {
                    if (array[i] == array[j]) {
                        array[i] = array[j] = 0;
                        continue outer;
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < array.length; ++ i) {
            if (array[i] != 0) {
                result = array[i];
                break;
            }
        }
        return result;
    }
}
