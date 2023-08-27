
public class SelectionSort {

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
		for (int i=0;i<n-1;i++) {
			int minIndex = i;
			for (int j=i+1;j<n;j++) {
				if (arr[j] < arr[minIndex]) {
					int temp = arr[minIndex];
					arr[minIndex] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

}
