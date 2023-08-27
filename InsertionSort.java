
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		
		sort(arr);
		
		for (int i:arr) {
			System.out.println(i);
		}

	}

	static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length - 1;
		for (int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while (j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

}
