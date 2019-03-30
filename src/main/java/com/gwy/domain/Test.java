package com.gwy.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ≤‚ ‘
 */
public class Test {

	public static void main(String[] args) throws Exception {
		
		System.out.println("=========================");
		
		System.out.println("5"+2);
		
		LinkedList list = new LinkedList();
		
		list.add("b");
		list.add("c");
		list.add("a");
		System.out.println(list.getLast());
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		List li = new Vector();
		List lii = new ArrayList();
		
		Map m = new Hashtable();
		m.put("a", "b");
		m.put("tyy", "uio");
		Set<Map.Entry> entrySet = m.entrySet();
		Iterator iterator2 = entrySet.iterator();
		while(iterator2.hasNext()){
			Map.Entry next = (Entry) iterator2.next();
			System.out.println(next.getValue()+ "==="+next.getKey());
		}
		Map m2 = new HashMap();
		Map m3 = new TreeMap();
		m3.put("b", "b1");
		m3.put("a", "a1");
		m3.put("c", "c1");
		
		Set<Map.Entry> entrySet2 = m3.entrySet();
		Iterator ii = entrySet2.iterator();
		while(ii.hasNext()){
			Map.Entry next = (Entry) ii.next();
			System.out.println(next.getValue()+ "==="+next.getKey());
		}
		
		Map m4 = new LinkedHashMap();
		m4.put("b", "b1");
		m4.put("a", "a1");
		m4.put("c", "c1");
		
		Set<Map.Entry> entrySet3 = m4.entrySet();
		Iterator ii2 = entrySet3.iterator();
		while(ii2.hasNext()){
			Map.Entry next = (Entry) ii2.next();
			System.out.println(next.getValue()+ "==="+next.getKey());
		}
		
		Set st = new HashSet();
		st.add("a");
		st.add("b");
		st.add("b");
		st.add("d");
		st.add("c");
		Iterator iterator3 = st.iterator();
		while(iterator3.hasNext()){
			System.out.println("st:"+iterator3.next());
		}
		
		Set st2 = new TreeSet();
		
		int i = 1 << 4;
		System.out.println("i:"+i);
		
		System.out.println("][[[[[[[[[[[[[[[[[[[[[[[[[[[[[");
		
		Map mp = new ConcurrentHashMap();
		
		
		
		
		
	}
	
}
