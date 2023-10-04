

package Demonthread1;

import java.util.Arrays;

public class Parallelshort {
	public static void main(String[] args) {
		int[]arr= {1,3,245,56,78,90};
		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.println(i);
			
		}
	}

}
