package mysort.sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {

	// 생성자 오버라이딩
	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		quickSort(sortedData, 0, sortedData.length-1);
	}
	
	// 퀵소트 메서드
	void quickSort(T[] dataList, int start, int end) {
		// base condition 시작이 끝보다 클 시 리턴
		if (start >= end) return;
		
		// 파티션 지정하는 함수
		int p = partition(dataList, start, end);
		
		// start부터 p - 1까지 퀵소트
		quickSort(dataList, start,  p-1);
		// p + 1부터 end까지 퀵소트
		quickSort(dataList, p+1, end);
	}
	
	// pivot보다 작은수를 왼쪽으로 옮기고 파티션 리턴하는 메서드
	int partition(T[] dataList, int start, int end) {
		// pivot을 마지막 인덱스로 지정
		T pivot = dataList[end];
		int leftEnd = start - 1;	// leftend가 중간일수도 있기 때문에 -1
		
		for (int i = start; i <= end - 1; i++) {
			// pivot보다 dataList[i]가 작을 경우 
			if (dataList[i].compareTo(pivot) < 0) {
				// dataList[++leftEnd]과 dataList[i] swap
				swap(dataList, ++leftEnd, i);
			}
		}
		// pivot을 leftEnd로 swap
		swap(dataList, leftEnd + 1, end);
		return leftEnd + 1; // 파티션 리턴
	}

}
