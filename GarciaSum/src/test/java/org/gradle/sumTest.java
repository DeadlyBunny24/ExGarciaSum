package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void test() {
		sum s1 = new sum();
		assertEquals(s1.sumador("2,3"),5);
		assertEquals(s1.sumador("3"),3);
		assertEquals(s1.sumador("3,6"),9);
	}
}
