package searchNsort;

public class Sorter {
	public static int[] bubbleSort(int arr[], int arrSize) {
		for(int i = 0; i < arrSize-1; i++) {
			for(int j = 0; j < arrSize-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return(arr);
	}
	
	public static int[] insertionSort(int arr[], int arrSize) {
		for (int i = 1; i < arrSize; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 

            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
		return(arr);
	}
	
	public static int[] selectionSort(int arr[], int arrSize) {
		for (int i = 0; i < arrSize-1; i++) { 

            int min_idx = i; 
            for (int j = i+1; j < arrSize; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j; 
                }
            }
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        }
		return(arr);
	}
}
