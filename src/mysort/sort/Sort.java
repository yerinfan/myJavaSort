package mysort.sort;

import java.util.Arrays;

public abstract class Sort<T> {
	// 멤버 변수
	T[] orgData; // 원본 제네릭 배열
	T[] sortedData; // 정렬된 배열
	
	// 생성자
	public abstract void sort(T[] dataList);
	
	// swap 함수
	void swap(T[] dataList, int a, int b) {
		if (a == b) return;
		T temp;
		temp = dataList[a];
		dataList[a] = dataList[b];
		dataList[b] = temp;
	}
	
	// Setter
	public void setData(T[] dataList) {
		// 원본 배열
		this.orgData = dataList;
		// 배열 복사
		this.sortedData = Arrays.copyOf(dataList, dataList.length);
	}
	
	// Getter
	public String getOrgData() {
		return Arrays.toString(orgData);
	}
	
	public String getSortedData() {
		return Arrays.toString(sortedData);
	}

}
