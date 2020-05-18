package com.java2blog.array;

public class StockBuySell {
	public static void main(String[] args) {
		int arr []= {14,12,70,15,99,90,65,21};
		
		System.out.println("calculate max profit:"+calculateMaxProfit(arr));
	}

	private static int calculateMaxProfit(int[] arr) {
		int lowestPriceTillThatDay=arr[0];
		int maxProfit=Integer.MIN_VALUE;
		int profit=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>lowestPriceTillThatDay) {
				profit=arr[i]-lowestPriceTillThatDay;
				if(profit>maxProfit) {
					maxProfit=profit;
				}
			}else {
				lowestPriceTillThatDay=arr[i];
			}
		}
		return maxProfit;
	}

}
