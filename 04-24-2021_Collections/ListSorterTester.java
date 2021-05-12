package com.ojas.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorterTester {
	
	public static void sortIntList(List<Integer> inputList) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(6);
		list.add(3);

		Collections.sort(list);
		
		for(int elements:list){
			System.out.println(elements);
		}
	}
		
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<Integer>();
			ListSorterTester l=new ListSorterTester();
			l.sortIntList(list);

		}

	}


