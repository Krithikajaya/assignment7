package assignment7;

import java.util.LinkedHashSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram {
	public static void main(String[] args) {
		String companyname="google";
		
		char[] charArray = companyname.toCharArray();
		System.out.println(charArray);
		Set<Character> set1 = new LinkedHashSet<Character>();
		for(char i:charArray) {
			set1.add(i);
		}
	System.out.println(set1);	
	}
	}

