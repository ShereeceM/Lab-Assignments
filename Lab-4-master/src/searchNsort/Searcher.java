package searchNsort;

public class Searcher extends Sorter{
	public static int linearSearch(int[] arr, int arrSize, int searchVal) {
		
		for(int i = 0; i < arrSize; i++) {
			if(arr[i] == searchVal) {
				return(i);
			}
		}
	
		return (-1);
	}
	
	public static int binarySearch(int[] arr, int arrSize, int searchVal ) {
		arr = bubbleSort(arr, arrSize);
		
		int start = 0, end = arrSize, mid; 
		
		while(start <= end) {
			mid = (start + (end - 1)) / 2;
			
			if(arr[mid] == searchVal) {
				return(mid);
			}else if(arr[mid] < searchVal) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		
		return(-1);
	}
}
