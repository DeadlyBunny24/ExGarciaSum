package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void test() {
		sum s1 = new sum();
		assertEquals(s1.sumador("2,3"),5);
	}
}
