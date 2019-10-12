package com.codility.lesson2;

public class OddOccurrencesInArray {
    private static int THRESHOLD = 10;
    
    public int solution(int[] A) {
        return find(A, 0, A.length).values[0];
    }
    
    private Result find(int[] array, int beginning, int end) {
        Result result;
        if (end - beginning > THRESHOLD) {
            int split = end - (end -beginning) / 2;
            Result left = find(array, beginning, split);
            Result right = find(array, split, end);
            result = merge(left, right);
        }
        else {
            int length = end - beginning;
            result = new Result(length); 
            outer: for (int i = beginning; i < end; ++ i) {
                if (array[i] != 0) {
                    for (int j = i + 1; j < end; ++ j) {
                        if (array[i] == array[j]) {
                            array[j] = 0;
                            continue outer;
                        }
                    }
                    result.values[result.size ++] = array[i];
                }
            }
        }
        
        return result;
    }
    
    private Result merge(Result r1, Result r2) {
        int length = r1.size + r2.size;
        Result result = new Result(length);

        outer: for (int i = 0; i < r1.size; ++ i) {
            for (int j = 0; j < r2.size; ++ j) {
                if (r1.values[i] == r2.values[j]) {
                    r2.values[j] = 0;
                    continue outer;
                }
            }
            result.values[result.size ++] = r1.values[i]; 
        }

        for (int i = 0; i < r2.size; ++ i) {
            if (r2.values[i] != 0) {
                result.values[result.size ++] = r2.values[i];
            }
        }

        return result;
    }
    
    private static class Result {
        private int[] values;
        int size;
        
        private Result(int length) {
            values = new int[length];
        }
    }
}
