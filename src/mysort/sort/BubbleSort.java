package mysort.sort;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

	// 생성자 오버라이딩
	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		
		// 마지막에서부터 1까지 반복
		for (int last = sortedData.length - 1; last >= 1; last--) {
			// 0부터 last - 1까지 data를 비교
			for (int i = 0; i <= last - 1; i++) {
				// sortedData[i]가 다음 인덱스보다 클 경우 swap
				if (sortedData[i].compareTo(sortedData[i + 1]) > 0)
					swap(sortedData, i, i+1);
			}
		}
	}

}
