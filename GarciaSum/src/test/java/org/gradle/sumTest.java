package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

    public static final int num_5=5;
    public static final int num_9=9;
    public static final int num_3=3;
    public static final int num_6=6;
    public static final int num_15=15;
    public static final int num_18=18;
    public static final int num_46=46;
    public static final int num_33=33;    
    
	@Test
	public void test() {
		sum s1 = new sum();
		assertEquals(s1.sumador("2,3"), num_5);
		assertEquals(s1.sumador("3"), num_3);
		assertEquals(s1.sumador("3,6"), num_9 );
		assertEquals(s1.sumador("3,6,15,18,46,33"), num_3 + num_6 + num_15 +num_18 +num_46 + num_33);
	}
}
