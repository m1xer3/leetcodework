package ru.danilsibgatullin.thresum;

public class ThreSum {

    public static void main(String[] args){

        int[] num ={-1,0,1,2,-1,-4};
        for (int i=0;i<sumElemetsIs0(num).length;i++)
        System.out.print(sumElemetsIs0(num)[i]+" ");

    }

    /*
    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
    Notice that the solution set must not contain duplicate triplets.
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
     */
    static int[] sumElemetsIs0 (int[] arr){
        boolean isEmpty = true;
        int[] outPutArray = new int[3];
        for (int a=0;a<arr.length;a++){
            for (int b=a+1;b<arr.length;b++){
                for (int c=b+1;c<arr.length;c++){
                    if (arr[a]+arr[b]+arr[c]==0){
                        outPutArray[0] = arr[a];
                        outPutArray[1] = arr[b];
                        outPutArray[2] = arr[c];
                        isEmpty = false;
                        return outPutArray;
                    }
                }
            }
        }

        return outPutArray;
    }

}
