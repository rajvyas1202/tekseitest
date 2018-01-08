package com.rvyas.tek.sei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author rajvyas (Rajendra Vyas)
 * 
 */
public class MyArrayUtil {

	/**
	 * First Method : To remove duplicates from given int array, this method is
	 * using traditional way or in academic also called as brute force method It
	 * compares each element of the array to every other element and performance
	 * wise this is not a good solution. This solution has the time complexity of
	 * O(n^2) as there are 2 for loop to check every other element.
	 * 
	 * @param arrayWithDups
	 * @return --> return unique numbers int array 
	 */
	public static int[] removeDuplicates(int[] arrayWithDups) {

		// System.out.println("Array With Duplicates : ");

		int noOfUniqueElements = arrayWithDups.length; // Assuming all elements in input array are unique

		for (int i = 0; i < noOfUniqueElements; i++) { // Comparing each element with all other elements
			for (int j = i + 1; j < noOfUniqueElements; j++) {

				if (arrayWithDups[i] == arrayWithDups[j]) { // If any two elements are found equal

					arrayWithDups[j] = arrayWithDups[noOfUniqueElements - 1]; // Replace duplicate element with last
																				// unique element
					noOfUniqueElements--; // Decrementing noOfUniqueElements
					j--; // Decrementing j to make sure if last number is also not same

				}
			}
		}
		// Copying only unique elements of arrayWithDups into arrayWithoutDups
		int[] arrayWithoutDups = Arrays.copyOf(arrayWithDups, noOfUniqueElements);

		return arrayWithoutDups;
	}

	/**
	 * Second Method : To remove duplicates from given int array, this method is
	 * using LinkedHashSet to retain insertion order as set only contain unique elements.
	 * Performance wise this is a good solution. This solution has the time complexity of
	 * O(n) as there is only 1 for loop to iterate element.
	 * 
	 * @param arrayWithDups
	 * @return --> set with unique array elements 
	 */
	public static Set<Integer> removeDupsUsingSet(int[] arrayWithDups) {
		
		Set<Integer> uniqueNumSet = new LinkedHashSet<Integer>(); // Use HashSet if you don't want insertion order

		for (int i = 0; i < arrayWithDups.length; i++) {
			 if (uniqueNumSet.add(arrayWithDups[i]) == false) {
	               // System.out.println("found a duplicate element in array : " + arrayWithDups[i]);
	            }
		}
		return uniqueNumSet;
	}

	/**
	 * Third Method : To remove duplicates from given int array, this method is
	 * using HashMap/ hashtable, advantage of using this technique that key contain unique elements and 
	 * map value contain repetition of duplicate element.
	 * Performance wise this is also a  good solution. This solution has the time complexity of
	 * O(n) as there is only 1 for loop to iterate element.
	 * 
	 * @param arrayWithDups
	 * @return --> hashMap with unique array elements as key and frequency of dups element 
	 */
	public static Map<Integer,Integer> removeDupsUsingHashMap(int[] arrayWithDups) {
		
		//System.out.println("Duplicate elements from array using hash table");
        Map<Integer, Integer> nameAndCount = new HashMap<>();

        // build hash table with count
        for (int num : arrayWithDups) {
            Integer count = nameAndCount.get(num);
            if (count == null) {
                nameAndCount.put(num, 1);
            } else {
                nameAndCount.put(num, ++count);
            }
        }
        
        // Print duplicate elements from array in Java
        /*Set<Entry<Integer, Integer>> entrySet = nameAndCount.entrySet();
        for (Entry<Integer, Integer> entry : entrySet) {

            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array : "
                        + entry.getKey());
            }
        } */
		return nameAndCount;
	}

	/**
	 * Print Int Array elements
	 * @param numIntArr
	 */
	public static void printIntArray(int[] numIntArr) {
		// Printing arrayWithoutDups
		System.out.println();
		for (int i = 0; i < numIntArr.length; i++) {
			System.out.print(numIntArr[i] + "  ");
		}
		System.out.println();
		System.out.println("==============================");
	}
	
	/**
	 * Print Object Array elements
	 * @param objectArr
	 */
	public static void printObjArray(Object[] objectArr) {
		// Printing arrayWithoutDups
		if(null==objectArr || objectArr.length==0)
			return;
		System.out.println();
		for (Object object : objectArr) {
			System.out.print(object + "  ");
		}
		System.out.println();
		System.out.println("==============================");
	}
}
