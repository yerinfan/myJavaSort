package mysort.sort;

public class SelectionSort extends Sort {
	
	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		for (int last = sortedData.length-1; last >= 1; last--) {
			int maxIndex = selectMax(sortedData, last);
			if (maxIndex != last)
				swap(sortedData, maxIndex, last);
		}
	}
	
	int selectMax(int[] dataList, int last) {
		int max = dataList[0];
		int maxIndex = 0;
		
		for (int i = 1 ; i <= last; i++) {
			if (dataList[i] > max) {
				max = dataList[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	
}
