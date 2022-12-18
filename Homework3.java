/*

package job;

 // 1. Реализовать алгоритм сортировки слиянием.

public class Homework3 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 2, 3, 1, 6, 2};
        print(arr);
        sort(arr, 0, arr.length - 1);
      }

      
      private static void sort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo + hi) / 2;
            sort(arr, lo, mid);           
            sort(arr, mid + 1, hi);       
            merge(arr, lo, mid, hi);      
            print(arr);
        }
    }
    private static void merge(int[] arr, int lo, int mid, int hi) {
        
        int[] left = new int[(mid - lo) + 2];
        int[] right = new int[hi - mid + 1];
       
        System.arraycopy(arr, lo, left, 0, left.length - 1);
        System.arraycopy(arr, mid + 1, right, 0, left.length - 1);
       
        left[left.length - 1] = 100;
        right[right.length - 1] = 100;
        int i = 0;
        int j = 0;
     
        for (; lo <= hi; lo++) {
            if (left[i] <= right[j]) {
                arr[lo] = left[i];
                i++;
            } else {
                arr[lo] = right[j];
                j++;
            }
        }
    }
  
    private static void print(int[] arr) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}  */


/*
package job;

 // 2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;

public class Homework3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Создание рандомной коллекции
        class_job.RandomCollection(list);
        // Удаление из коллекции чётных чисел
        class_job.delEvenNumbers(list);

    }
}     */


/*  
package job;

// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;

public class tHomework3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        // Создание рандомной коллекции
        class_job.RandomCollection(list);
        // среднеарифметическое коллекции
        class_job.midArithmetic(list);
        // Минимальное и максимальное чиса коллекции
        class_job.MinMax(list);
    }
}    */

