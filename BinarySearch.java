
public class BinarySearch {
	
	static void search (int[] arr, int i) {
		int start = 0;
		int end = arr.length-1;
		while (start<=end) {
			int mid = (start+end)/2;
			if (arr[mid] == i) {
				System.out.println(i+" is found at index "+ mid);
				return;
			}
			if (arr[mid] < i) {
				start = mid + 1;
			}
			else if (arr[mid] > i) {
				end = mid - 1;
			}
		}
		System.out.println(i+" is not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11, 12, 22, 25, 34, 64, 90};
		search(arr, 64);
	}

}
