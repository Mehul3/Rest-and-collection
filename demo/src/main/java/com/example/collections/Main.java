package com.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"alice",50005);
		Student s2 = new Student(14,"Ram",60007);
		Student s3 = new Student(13,"Shyam",80008);
		Student s4 = new Student(1,"alice",50005);
		
		
		//ArrayList (ordered and allows duplication
		List<Student> arrayList = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
//		List<Student> arrayList = Arrays.asList(s1,s2,s3,s4);
		System.out.println("\n ArrayList");
		
		arrayList.forEach(System.out::println);
		
		
		//LinkedList (ordered and allows duplication
		List<Student> linkedList = new LinkedList<>(Arrays.asList(s1,s2,s3,s4));
//		List<Student> arrayList = Arrays.asList(s1,s2,s3,s4);
		System.out.println("\n LinkedList");
		
		linkedList.forEach(System.out::println);
		
		
		//Hashset (  No duplication and no gurranted order
		Set<Student> hashset = new HashSet<>(Arrays.asList(s1,s2,s3,s4));
//		List<Student> arrayList = Arrays.asList(s1,s2,s3,s4);
		System.out.println("\n Hashset");
		
		hashset.forEach(System.out::println);
		
		//LinkedHashset (  No duplication and  preserves insertion order
				Set<Student> linkedHashset = new LinkedHashSet<>(Arrays.asList(s1,s2,s3,s4));
//				List<Student> arrayList = Arrays.asList(s1,s2,s3,s4);
				System.out.println("\n LinkedHashset");
				
				linkedHashset.forEach(System.out::println);
		
				
				//Tree set - sorted and no duplication 
				// need comparator because student is in custom class
				Set<Student> treeSet = new TreeSet<>(Comparator.comparingDouble(Student::getSalary));
				
				treeSet.addAll(Arrays.asList(s1,s2,s3,s4));
				
				System.out.println("\n treeSet sorted by salary");
				
				treeSet.forEach(System.out::println);
				
				
				//HashMap (key value pairs and no gurranted order
				
				Map<Integer,Student> hashMap = new HashMap<>();
				
				hashMap.put(s1.getid(),s1);
				hashMap.put(s2.getid(),s2);
				hashMap.put(s3.getid(),s3);
				
				System.out.println("\n hashmap");
				hashMap.forEach((k, v) ->
				System.out.println(k + "=" + v));
				
				
				
				//LinkedHashMap (key value pairs and insertion order preserved
				Map<Integer,Student> linkedHashMap = new LinkedHashMap<>(hashMap);
				System.out.println("\n linkedHashMap");
				linkedHashMap.forEach((k,v) ->
				System.out.println(k + "=" + v));
				
				
			
				//TreeMap (key value pairs sorted by key
				Map<Integer,Student> treeMap = new TreeMap<>(hashMap);
				
			System.out.println("\n TreeMap (key value pairs sorted by key");
				treeMap.forEach((k,v) ->
				System.out.println(k + "=" + v));
	}

}
