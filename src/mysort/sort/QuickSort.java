package mysort.sort;

public class QuickSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		quickSort(sortedData, 0, sortedData.length-1);
	}
	
	void quickSort(int[] dataList, int start, int end) {
		if (start >= end) return;
		int p = partition(dataList, start, end);
		
		quickSort(dataList, start,  p-1);
		quickSort(dataList, p+1, end);
	}
	
	
	int partition(int[] dataList, int start, int end) {
		int pivot = dataList[end];
		int leftEnd = start - 1;	// left
		for (int i = start; i <= end - 1; i++) {
			if (dataList[i] < pivot) {
				swap(dataList, ++leftEnd, i);
			}
		}
		swap(dataList, leftEnd + 1, end);
		return leftEnd + 1; 
	}

}
