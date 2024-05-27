package mysort.sort;

public class SelectionSort<T extends Comparable<T>> extends Sort<T> {
	// 선택 정렬 = 
	
	
	// 생성자 오버라이딩
	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		// 끝에서부터 소팅 시작
		for (int last = sortedData.length - 1; last >= 1; last--) {
			// last를 기준으로 최고값을 찾는다 
			int maxIndex = selectMax(sortedData, last);
			// 만약 최고값 인덱스가 마지막이 아닐경우 스왑
			if (maxIndex != last)
				swap(sortedData, maxIndex, last);
		}
	}
	
	// max 값 찾는 메서드
	int selectMax(T[] dataList, int last) {
		// 제네릭 max 변수
		T max = dataList[0];
		int maxIndex = 0;
		
		// last까지 최고값 비교 후 최고값일 경우 인덱스 저장
		for (int i = 1 ; i <= last; i++) {
			if (dataList[i].compareTo(max) > 0) {
				max = dataList[i];
				maxIndex = i;
			}
		}
		// 최고값 인덱스 리턴
		return maxIndex;
	}

	
}
