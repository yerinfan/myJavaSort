package mysort.sort;

import java.util.Arrays;

public abstract class Sort {
	int[] orgData;
	int[] sortedData;
	
	public abstract void sort(int[] dataList);
	
	void swap(int[] dataList, int a, int b) {
		if (a == b) return;
		int temp;
		temp = dataList[a];
		dataList[a] = dataList[b];
		dataList[b] = temp;
	}
	
	public void setData(int[] dataList) {
		this.orgData = dataList;
		this.sortedData = dataList.clone();
	}
	
	public String getOrgData() {
		return Arrays.toString(orgData);
	}
	
	public String getSortedData() {
		return Arrays.toString(sortedData);
	}

}
