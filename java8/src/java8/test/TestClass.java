package java8.test;

import java.io.*;
import java.util.*;

public class TestClass {
	static int minParkingSpaces(int[][] parkingStartEndTimes) {
		int arr[] = new int[parkingStartEndTimes.length];
	
		int dep[] = new int[parkingStartEndTimes.length];
		for (int a = 0; a < parkingStartEndTimes.length; a++) {
				arr[a] = parkingStartEndTimes[a][0];
				dep[a] = parkingStartEndTimes[a][1];
		}

		int platform_needed = 0, maxPlatforms = 0;
		Arrays.sort(arr); 
		Arrays.sort(dep); 
		int i = 0, j = 0;

		// Similar to merge in merge sort
		while (i < 100 && j < 100) {
			if (arr[i] < dep[j]) {
				platform_needed++;
				i++;
				if (platform_needed > maxPlatforms)
					maxPlatforms = platform_needed;
			} else {
				platform_needed--;
				j++;
			}
		}
		return maxPlatforms;

	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}