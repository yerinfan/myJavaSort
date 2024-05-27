package mysort;

import mysort.sort.BubbleSort;
import mysort.sort.InsertionSort;
import mysort.sort.MergeSort;
import mysort.sort.QuickSort;
import mysort.sort.SelectionSort;
import mysort.sort.Sort;

public class SortClassTest {

	public static void main(String[] args) {
		// dataList 배열을 정수형으로 초기화
		Integer[] dataList = {5, 21, 14, 3, 31, 8, 27, 15};
		sortData(dataList);
	}
	
	static <T extends Comparable<T>> void sortData(T[] dataList) {
		Sort sort;
		
		// 선택형 정렬 클래스
		sort = new SelectionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		// 삽입형 정렬 클래스
		sort = new InsertionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		// 버블 정렬 클래스
		sort = new BubbleSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		// 머지 정렬(병합 정렬) 클래스
		sort = new MergeSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		// 퀵 정렬 클래스
		sort = new QuickSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();	
	}
}
