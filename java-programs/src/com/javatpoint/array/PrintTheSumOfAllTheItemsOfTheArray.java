/**
 * 
 */
package com.javatpoint.array;

/**
 * @author Vipin Patel
 *
 */
public class PrintTheSumOfAllTheItemsOfTheArray {
	public static void main(String[] args) {
		int arr[] = {1,27,3,4,5};
        int sum=0;
        for(int i:arr)
        {
          sum=sum+i;
        }

        System.out.println(sum);
	}

}
