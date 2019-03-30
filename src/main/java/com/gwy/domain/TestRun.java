package com.gwy.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Administrator
 *
 */
public class TestRun implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
		System.out.println("-------------------");
		System.out.println("=====================");
		System.out.println("************************");
	}

	public static void main(String[] args) {
		
		
		int[] nums = {-1,-2,-3,-4,-5};
		int[] twoSum = twoSum(nums, -8);
		for (int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}
		Map m = new HashMap();
		
		
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        int[] indexArr = new int[2];
	        List indexList = new ArrayList();
	        for(int i=0;i<nums.length;i++){
	            int num = target - nums[i];
	            int index = getIndex(nums,num);
	           System.out.println(num+"---"+index);
	            if(index>=0){
	              indexList.add(index);
	            }
	        }
	       
	        for(int i=0;i<indexList.size();i++){
	            indexArr[i] = (Integer)indexList.get(i);
	        }
	        Arrays.sort(indexArr);
	        return indexArr;
	 }
	 
	 public static int getIndex(int[] nums,int miNum){
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==miNum){
	                return i;
	            }
	        }
	        return -1;
	 }
}
