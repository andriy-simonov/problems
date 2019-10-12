package com.codility.lesson2;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


 
class OddOccurrencesInArray {
    public int solution(int[] A) {
        OddOccurrencesTask task = new OddOccurrencesTask(A, 0, A.length);
     
        int cores = Runtime.getRuntime().availableProcessors();
        ForkJoinPool fjPool = new ForkJoinPool(cores);
        return fjPool.invoke(task).values[0];
    }
    
    private static class OddOccurrencesTask extends RecursiveTask<Result> {
        private static final long serialVersionUID = 1L;
        
        private static int THRESHOLD = 10;
        private int[] array;
        private int beginning;
        private int end;
     
        public OddOccurrencesTask(int[] array, int beginning, int end) {
            this.array = array;
            this.beginning = beginning;
            this.end = end;
        }

        @Override
        public Result compute() {
            Result result;
             if (end - beginning < THRESHOLD) {
                 result = find(beginning, end);
             }
             else {
                 int split = end - (end - beginning) / 2;
                 
                 OddOccurrencesTask left = new OddOccurrencesTask(array, beginning, split);
                 left.fork();
                 
                 OddOccurrencesTask right = new OddOccurrencesTask(array, split, end);
                 result = merge(right.compute(), left.join());
            }
    
            return result;
        }
     
        private Result find(int beginning, int end) {
            int length = end - beginning;
            Result result = new Result(length);
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
    }

    static class Result {
        int size;
        int[] values;
        
        Result(int length) {
            size = 0;
            values = new int[length];
        }
    }
}
