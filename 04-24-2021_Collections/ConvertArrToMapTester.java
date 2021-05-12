package com.ojas.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class ArrayToMap {
	public static Map<Integer, String> convertToMap(String names[]) {
		Map<Integer,String> m = new HashMap<>();
		for(int i = 0;i < names.length;i++) {
			m.put(i + 1, names[i]);
		}
		return m;
	}
}
public class ConvertArrToMapTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of persons you want to enter:");
		int num = scan.nextInt();
		String arr[] = new String[num];
		for(int i = 0;i < arr.length;i++) {
			System.out.println("Enter the person " + (i + 1));
			arr[i] = scan.next();
		}
		ArrayToMap atm = new ArrayToMap();
		Map<Integer,String> res = atm.convertToMap(arr);
		
		Set<Map.Entry<Integer,String>> hmap = res.entrySet();
		for(Map.Entry<Integer, String> data:hmap) {
			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}
	}

}
