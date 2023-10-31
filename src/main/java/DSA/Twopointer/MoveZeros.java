package DSA.Twopointer;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	/*
	 * https://leetcode.com/problems/move-zeroes/
	 */
	
	@Test
	public void test1() {
		int[] moveZeros = moveZeros(new int[] {0,1,0,3,12});
		System.out.println(Arrays.toString(moveZeros));
	}
	
	
	@Test
	public void test2() {
		int[] moveZeros = moveZeros1(new int[] {0,1,0,3,12});
		System.out.println(Arrays.toString(moveZeros));
	}
	
	private int[] moveZeros1(int[] arr) {
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				arr[j++]=arr[i];
			}
		}
		while(j<arr.length) {
			arr[j++]=0;
		}
		return arr;
	}


	public int[] moveZeros(int[] arr) {
			int start=0,end=0;
			while(start<arr.length && end<arr.length) {
				if(arr[start]==0 && arr[end] ==0) {
					end++;
				}
				else if(arr[end]!=0){
					int temp=arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
					start++;
					end++;
				}
			}
			return arr;
		}

	

}
