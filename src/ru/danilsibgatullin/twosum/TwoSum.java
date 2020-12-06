package ru.danilsibgatullin.twosum;

public class TwoSum {

    public static void main (String[] args){
        int[] arr = {1,2,4,6,3,7,8,2,11};
        int target = 10;
        searchWhichElementsGiveInSumTarget(arr,target);
    }

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    static void searchWhichElementsGiveInSumTarget(int[] arr, int target){

        System.out.println("Цель " + target);
        System.out.println("Оригинальный массив");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean isFind =false;


        for (int i=0; i < arr.length;i++){

            if (arr[i] > target){
                continue;
            }

            for (int j=i+1;j < arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println("Сумма чисел элементов arr["+i+"] = "+arr[i]+" и arr["+j+"] = "+arr[j]+" равна целевому значению "+target);
                    isFind=true;
                }
            }
        }

        if (!isFind){
            System.out.println("Суммы элементов не равны целевому");
        }

    }

}
