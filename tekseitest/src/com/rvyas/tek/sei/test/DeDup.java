package com.rvyas.tek.sei.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.rvyas.tek.sei.MyArrayUtil;

/**
 * This Class structure and randomIntegers array is given by TEK 
 * @author rajvyas (Rajendra Vyas)
 *
 */
class DeDup {

    public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};   

	public static void main(String[] args) {
		DeDup arrayUtilTest = new DeDup();
		
		System.out.println("Given Numbers Array which may contain duplicates");
		MyArrayUtil.printIntArray(arrayUtilTest.randomIntegers);
		
		//First Method : remove duplicates from given integer array by TEK team using brute force method 		
		int[] uniqueIntArr = MyArrayUtil.removeDuplicates(arrayUtilTest.randomIntegers);
		System.out.println("First Method(Brute force): Print Unique Numbers after removing duplicates");
		MyArrayUtil.printIntArray(uniqueIntArr);
		
		//Second Method : remove duplicates from integer array given by TEK team using linkedhashset to retain given orders in array 		
		Set<Integer> hashSet = MyArrayUtil.removeDupsUsingSet(arrayUtilTest.randomIntegers);
		System.out.println("Second Method(Using Set): Print Unique Numbers after removing duplicates");
		MyArrayUtil.printObjArray(hashSet.toArray());
		
		//Third Method : remove duplicates from integer array given by TEK team using hashmap/hashtable to find frequency of duplicate elements as well 		
		Map<Integer,Integer> numAndCountMap = MyArrayUtil.removeDupsUsingHashMap(arrayUtilTest.randomIntegers);
		System.out.println("Third Method(Using Map): Print Unique Numbers after removing duplicates");
		MyArrayUtil.printObjArray(numAndCountMap.keySet().toArray());
       
		// Print duplicate elements 
        Set<Entry<Integer, Integer>> entrySet = numAndCountMap.entrySet();
        for (Entry<Integer, Integer> entry : entrySet) {

            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array : "
                        + entry.getKey());
            }
        }
		
	}
}
