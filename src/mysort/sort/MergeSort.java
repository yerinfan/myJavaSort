package mysort.sort;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends Sort<T> {

	// 생성자 오버라이딩
	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		mergeSort(sortedData, 0, sortedData.length-1);
	}
	
	void mergeSort(T[] dataList, int start, int end) {
		// base condition = 원소가 하나 남았을 때 리턴 
		if (start >= end) return;
		
		// 중간 값을 기준으로 머지 소팅 (재귀 함수)
		int mid = (start + end) / 2;
		mergeSort(dataList, start, mid);
		mergeSort(dataList, mid + 1, end);
		
		// dataList 병합
		merge(dataList, start, mid, end);
	}
	
	void merge(T[] dataList, int start, int mid, int end) {
		// dataList 카피
		T[] tempList = Arrays.copyOfRange(dataList, start, end + 1);
		
		int i = 0 , j = mid - start + 1, k = start;
		// i 와 j가 start ~ end 사이에 있는 동안만 반복
		while (i < mid - start && j <= end - start) {
			// tempList[i]가 tempList[j]보다 작거나 같으면 tempList[i++]를 dataList[start++]에 넣는다
			if (tempList[i].compareTo(tempList[j]) <= 0)
				dataList[k++] = tempList[i++];
			else // 다른 경우 tempList[j++]를 dataList[start++]에 넣는다
				dataList[k++] = tempList[j++];
		}
		
		while (i < mid - start + 1) dataList[k++] = tempList[i++];
		while (j <= end - start) dataList[k++] = tempList[j++];
		
		for (i = start, k = 0; k < tempList.length; i++, k++)
			dataList[i] = tempList[k];
		
		
		//System.arraycopy(tempList, 0, tempList.length-1, dataList, start);
	}

}
