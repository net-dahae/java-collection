package net.dahae.study.collection;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class HashSetTest {
	String[] nums = {"1", "2", "3", "4", "5"};
	int count = 0;
	
	@Test
	public void testOrder() throws Exception {
		Set<String> hashSet = new HashSet<String>();
		for (String num : nums) {
			hashSet.add(num);
		}		
/*		Object[] hsNums = hashSet.toArray();
		for (int i = 0; i < hsNums.length; i++) {
			if(nums[i]==hsNums[i]){
				count++;
			}
		}*/
		Iterator<String> iterator = hashSet.iterator();

		for (int i = 0; iterator.hasNext(); i++) {
			if(nums[i]==iterator.next()){
				count++;
				System.out.println(nums[i]);
			}
		}
		//assertThat(count, is(hsNums.length));
		assertFalse(count==hashSet.size());
	}
	
	@Test
	public void testDuplication() throws Exception {
		Set<String> hashSet = new HashSet<String>();
		for (String num : nums) {
			hashSet.add(num);
		}
		for (String num : nums) {
			hashSet.add(num);
		}
		hashSet.equals(nums);
		
		assertThat(hashSet.size(), is(5));
	}
}
