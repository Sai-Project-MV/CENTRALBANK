package com.nt.resource;

public class DuplicateElement {
	
	public DuplicateElement(){
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 5, 6, 2, 7 };
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++)
				if ((a[i] == a[j]) && (i != j)) 
					System.out.println(a[j]);      
	    }
	
}
