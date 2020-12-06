package ru.danilsibgatullin.thresum;


import java.util.HashSet;


public class ThreSum {

    public static void main(String[] args){

        int[] num ={-1,0,0}; // Вводный массив

        System.out.println("Обрабатываемый массив");
        for (int i=0;i< num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
        if (num.length<3){
            System.out.println("Введенный массив  не содержит 3-х элементов для проверки условия a + b + c = 0");
            return;
        }
        System.out.println("Элементы массива удовлетворяющие условию a + b + c = 0");
        HashSet<Integer[]> outSet = new HashSet<>();
        if (outSet.isEmpty()){
             System.out.println("Указанному условию не соответсвует ни одна из комбинаций");
        }
        for (Integer[] arr : outSet){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
    }

    /*
    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
    Notice that the solution set must not contain duplicate triplets.
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
     */
    static HashSet<Integer[]> sumElemetsIs0 (int[] arr){
        HashSet<Integer[]> outSet = new HashSet<>(); //для выводва используем HashSet так как нас интересуют только уникальные значения
        for (int a=0;a<arr.length;a++){
            Integer[] outPutArray = new Integer[3];
            for (int b=a+1;b<arr.length;b++){
                for (int c=b+1;c<arr.length;c++){
                    if (arr[a]+arr[b]+arr[c]==0){
                        outPutArray[0] = arr[a];
                        outPutArray[1] = arr[b];
                        outPutArray[2] = arr[c];
                        outSet.add(outPutArray);
                    }
                }
            }
        }
        return outSet;
    }

}
