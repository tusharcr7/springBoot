package com.cr7.spring.basics.springcheckint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl implements Sortalgo {
	
	@Autowired
	private Sortalgo objSortalgo;
	
	

	



	/*
	 * public BinarySearchImpl(Sortalgo objSortalgo) { super(); this.objSortalgo =
	 * objSortalgo; }
	 */

	public int binarySearch(int num[], int h) {

		 objSortalgo.sort(num);
		 return 1;
	}




	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		return new int[10];
	}

}
