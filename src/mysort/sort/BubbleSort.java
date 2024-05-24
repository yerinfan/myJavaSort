package mysort.sort;

public class BubbleSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		for (int last = sortedData.length - 1; last >= 1; last--) {
			for (int i = 0; i <= last - 1; i++) {
				if (sortedData[i] > sortedData[i+1])
					swap(sortedData, i, i+1);
			}
		}
	}

}
