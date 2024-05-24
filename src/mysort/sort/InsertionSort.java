package mysort.sort;

public class InsertionSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		
		for (int i = 1; i < sortedData.length; i++) {
			int loc = findLessFromLast(sortedData, sortedData[i], i-1);
			if (loc != i-1)
				insertData(sortedData, loc+1, i);
		}

	}

	private void insertData(int[] dataList, int target, int source) {
		int temp = dataList[source];
		for (int i = source; i > target; i--) {
			dataList[i] = dataList[i-1];
		}
		dataList[target] = temp;
	}

	private int findLessFromLast(int[] dataList, int data, int last) {
		for (int i = last; i >= 0; i--) {
			if (dataList[i] <= data) return i; 
		}
		return -1;
	}
	
	 

}
