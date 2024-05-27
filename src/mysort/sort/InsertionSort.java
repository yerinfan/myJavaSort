package mysort.sort;

public class InsertionSort<T extends Comparable<T>> extends Sort<T> {

	// 생성자 오버라이딩
	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		

		// 인덱스 i부터 -배열 끝까지- last = (i-1)보다 작은 수를 찾는다.
		for (int i = 1; i < sortedData.length; i++) {
			// loc는 i보다 작은 수
			int loc = findLessFromLast(sortedData, sortedData[i], i-1);
			// 만일 loc != last일 경우 loc + 1 인덱스에 dataList[loc] 삽입
			if (loc != i-1)
				insertData(sortedData, loc + 1, i);
		}

	}
	
	// dataList[loc]를 삽입하기 위한 메서드
	private void insertData(T[] dataList, int target, int source) {
		
		T temp = dataList[source];
		for (int i = source; i > target; i--) {
			// 원래 배열에서 인덱스 한 칸씩 이동
			dataList[i] = dataList[i-1];
		}
		// loc + 1에 last의 값을 넣는다. 
		dataList[target] = temp;
	}

	// sortedData[i]보다 작은 값의 인덱스를 찾고, 리턴하는 메서드
	private int findLessFromLast(T[] dataList, T data, int last) {
		// dataList[i]가 data보다 작을 때까지 반복, 있을시 i 리턴 
		for (int i = last; i >= 0; i--) {
			// dataList[i]과 data의 값을 비교한다. 
			if (dataList[i].compareTo(data) <= 0) return i; 
		}
		// data보다 작은 값이 없을 시 -1 리턴
		return -1;
	}
	
	 

}
