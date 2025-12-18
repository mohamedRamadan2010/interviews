//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//        Example 1:
//Input: nums = [2,6,11,15], target = 8
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 8, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

import java.util.HashMap;

public class FindTowSum {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       int [] result = findTowSum(new int[]{2,6,11,15},8);
       System.out.println("Output: ["+result[0]+","+result[1]+"]");
    }

    public static int[] findTowSum(int input[],int target){
        int [] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            int complement = target-input[i];
            if(map.containsKey(complement)){
                result[0]=map.get(complement);
                result[1]=i;
            }else{
                map.put(input[i],i);
            }
        }
        return result;
    }
}