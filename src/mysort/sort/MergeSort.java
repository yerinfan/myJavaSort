package mysort.sort;

public class MergeSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		mergeSort(sortedData, 0, sortedData.length-1);
	}
	
	void mergeSort(int[] dataList, int start, int end) {
		if (start >= end) return;
		
		int mid = (start + end) / 2;
		mergeSort(dataList, start, mid);
		mergeSort(dataList, mid+1, end);
		merge(dataList, start, mid, end);
	}
	
	void merge(int[] dataList, int start, int mid, int end) {
		int[] tempList = new int[end-start + 1];
		int i = start, j = mid + 1, k = 0;
		while (i <= mid && j <= end) {
			if (dataList[i] <= dataList[j])
				tempList[k++] = dataList[i++];
			else
				tempList[k++] = dataList[j++];
		}
		
		while (i <= mid) tempList[k++] = dataList[i++];
		while (j <= end) tempList[k++] = dataList[j++];
		
		for (i = start, k = 0; k < tempList.length; i++, k++)
			dataList[i] = tempList[k];
		//System.arraycopy(dataList, start, tempList, 0, end-start+1);
	}

}
