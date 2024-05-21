package mysort;

import mysort.sort.SelectionSort;
import mysort.sort.Sort;

public class SortClassTest {

	public static void main(String[] args) {
		int[] dataList = {5, 21, 14, 3, 31, 8, 27, 15};
		sortData(dataList);
	}
	
	static void sortData(int[] dataList) {
		Sort sort;
		
		sort = new SelectionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
	}
}
