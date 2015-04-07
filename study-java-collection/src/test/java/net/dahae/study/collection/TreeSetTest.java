package net.dahae.study.collection;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;

public class TreeSetTest {
	String[] nums = {"apple", "elephant", "announcer", "character", "zoo"};
	int count = 0;
	
	@Test
	public void testOrder() throws Exception {
		TreeSet<String> treeSet = new TreeSet<String>();
		for (String num : nums) {
			treeSet.add(num);
		}

		Iterator<String> iterator = treeSet.iterator();
		/*for (int i = 0; iterator.hasNext(); i++) {
			if(nums[i]==iterator.next()){
				count++;
			}
		}*/
		//System.out.println(nums);
		System.out.print("Tree set data: ");
		while (iterator.hasNext()) {
		    System.out.print(iterator.next() + " ");
		}
	}

}
