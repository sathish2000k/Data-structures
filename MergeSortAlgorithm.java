import java.util.*;

public class MergeSortAlgorithm {
	
	static void merge(int[] arr, int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int[] leftSide = new int[n1];
		int[] rightSide = new int[n2];
		
		for (int i=0;i<n1;i++) {
			leftSide[i] = arr[start+i];
		}
		for (int j=0;j<n2;j++) {
			rightSide[j] = arr[mid+j+1];
		}
		
		int i = 0;
		int j = 0;
		int k=start;
		while (i<n1 && j<n2) {
			if (leftSide[i] <= rightSide[j]) {
				arr[k] = leftSide[i];
				i++;
			}
			else {
				arr[k] = rightSide[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = leftSide[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = rightSide[j];
			j++;
			k++;
		}
	}

	static void mergeSort (int[] arr, int start, int end) {
		if (start<end) {
			int mid = start + (end-start)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			
			merge(arr, start, mid, end);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {38, 27, 43, 3, 9, 82, 10};
		
		mergeSort(arr, 0, arr.length-1);
		
		for (int i:arr) {
			System.out.println(i);
		}
	}

}
