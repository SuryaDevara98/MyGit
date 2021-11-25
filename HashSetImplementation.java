package com.sumit.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementation {
	public Set<Integer> unionOfElements(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> sX = new HashSet<Integer>(s1);
		Set<Integer> sY = new HashSet<Integer>(s2);
		//System.out.println(sX);
		//System.out.println(sY);
		sX.addAll(sY);
		return sX;
	}
	
	public Set<Integer> subtractionOfElements(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> sX = new HashSet<Integer>(s1);
		Set<Integer> sY= new HashSet<Integer>(s2);
		//System.out.println(sX);
		//System.out.println(sY);
		sX.removeAll(sY);
		return sX;
	}

	public Set<Integer> intersectionOfElements(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> sX = new HashSet<Integer>(s1);
		Set<Integer> sY = new HashSet<Integer>(s2);
		//System.out.println(sX);
		//System.out.println(sY);
		sX.retainAll(sY);
		return sX;
	}

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(9);
		set2.add(3);
		set2.add(7);
		
		HashSetImplementation obj1 = new HashSetImplementation();
		System.out.println(obj1.unionOfElements(set1, set2)); 
		
		HashSetImplementation obj2 = new HashSetImplementation();
	 	System.out.println(obj2.subtractionOfElements(set1, set2));
	 	
		HashSetImplementation obj3 = new HashSetImplementation();
		System.out.println(obj3.intersectionOfElements(set1, set2));

	}

}
