package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main2 {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String,String>();
		hm.put("ds", "Rekha");
		hm.put("ab","Akash");
		hm.put("bc", "Santosh");
		hm.put("zz", "Bhushan");
		System.out.println("Hashmap before sorting..");
		Set<Entry<String, String>> mapset=	hm.entrySet();
		for(Entry<String, String> e:mapset) {
			System.out.println(e.getKey()+"......"+e.getValue());
		}
		System.out.println("Hashmap afetr sorting on key sorting..");
		TreeMap<String, String> tm=new TreeMap<String,String>(hm);
		Set<Entry<String, String>> mapset1=	tm.entrySet();
		for(Entry<String, String> e:mapset1) {
			System.out.println(e.getKey()+"......"+e.getValue());
		}	
		System.out.println("Hashmap afetr sorting on values sorting..");
				Comparator<Entry<String, String>> myComp=new Comparator<Map.Entry<String,String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		List<Entry<String, String>> list=new ArrayList<Entry<String, String>>(mapset);
		//Collections.sort(list,( Entry<String, String> o1,  Entry<String, String> o2)->o1.getValue().compareTo(o2.getValue()));
		Collections.sort(list,myComp);
		LinkedHashMap<String, String> sortedByVal=new LinkedHashMap<String, String>();
		for(Entry<String, String> e1:list) {
			sortedByVal.put(e1.getKey(), e1.getValue());
		}

		Set<Entry<String, String>> sortbyvalset= sortedByVal.entrySet();
		for(Entry<String, String> e:sortbyvalset) {
			System.out.println(e.getKey()+"......"+e.getValue());
		}

	}
}
