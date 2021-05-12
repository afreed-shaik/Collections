package com.ojas.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Duplicates {
//		public static List<Integer> getDuplicatesList(List<Integer> list) {
//			Set<Integer> s = new HashSet<Integer>();
//			int count = 0;
//			Integer array[] = new Integer[list.size()];
//			array = list.toArray(array);
//			for(int i = 0;i < array.length;i++) {
//				for(int j = i + 1; j < array.length;j++) {
//					if(array[i] == array[j]) {
//						count++;
//					}
//				}
//				if(count > 0) {
//					s.add(array[i]);
//				}
//				count = 0;
//			}
//			return list.stream().collect(Collectors.toList());
//	          TreeSet ts = new TreeSet();
//	          for (Integer i : list)
//	                ts.add(i);
//	        return ts;      
//	      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(33);
		l.add(45);
		l.add(67);
		l.add(89);
		l.add(33);
		l.add(47);
		l.add(21);
		l.add(45);
		
//		Set<Integer> s = new HashSet<Integer>();
//        List<Integer> res  = getDuplicatesList(l);
//        
//        Iterator i = res.iterator();
//        while(i.hasNext()) {
//        	System.out.println(i.next());
//        }
		
		Set<Integer> sourcelist=new HashSet<Integer>();
	    Set<Integer> targetlist=new HashSet<Integer>();
	   
	    for(Integer x: l) {
	        if(sourcelist.add(x)) {
	           
	        }
	        else {
	            targetlist.add(x);
	            }
	    }
	    System.out.println(targetlist);
	}

}
