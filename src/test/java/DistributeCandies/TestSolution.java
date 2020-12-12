package DistributeCandies;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDistributeCandies() {
		Assert.assertEquals(5, Solution.distributeCandies(5,10,1));
		Assert.assertEquals(2, Solution.distributeCandies(5,2,1));
		
		Assert.assertEquals(3, Solution.distributeCandies(5,2,2));
		Assert.assertEquals(5, Solution.distributeCandies(5,2,4));
		
		Assert.assertEquals(2, Solution.distributeCandies(5,4,4));
		Assert.assertEquals(3, Solution.distributeCandies(5,10,4));
	}

}
