package net.dahae.study.collection;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class LinkedHashSetTest {
	String[] nums = {"1", "2", "3", "4", "5"};
	int count = 0;
	
	@Test
	public void testOrder() throws Exception {
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		for (String num : nums) {
			linkedHashSet.add(num);
		}
		Object[] lhsNums = linkedHashSet.toArray();
		for (int i = 0; i < lhsNums.length; i++) {
			if(nums[i]==lhsNums[i]){
				count++;
			}
		}
		assertThat(count, is(lhsNums.length));
		//assertFalse(count==lhsNums.length);
		//assertArrayEquals(nums, lhsNums);
		System.out.println(lhsNums);
	}

}
