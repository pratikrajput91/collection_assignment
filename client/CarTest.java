package com.capgemini.client;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {

	private static Car bmw;
	private static Car honda;
	private static Car hyndai;
	
	@BeforeClass
	public static void setUp() {
		bmw=new Car("bmw","j520","2016","27lakh");
	honda=new Car("honda","honda_city","2018","15lakh");
		hyndai=new Car("hyndai","verna","2019","16lakh");
		
	}
	@Test
	public void test() {
		HashSet<Car> c1=new HashSet<Car>();
		c1.add(bmw);
		c1.add(honda);
		c1.add(hyndai);
		assertEquals(3,c1.size());
		
	}
	@Test
	public void test1() {
		ArrayList<Car> c2=new ArrayList<Car>();
		c2.add(bmw);
		c2.add(honda);
		c2.add(hyndai);
		Iterator<Car> iterator=c2.iterator();
		assertEquals("bmw", iterator.next().getMake());
		assertEquals("honda", iterator.next().getMake());
		assertEquals("hyndai", iterator.next().getMake());
	}
	@Test
	public void test2() {
		TreeSet<Car> c2=new TreeSet<Car>();
		c2.add(bmw);
		c2.add(honda);
		c2.add(hyndai);
		Iterator<Car> iterator=c2.iterator();
		assertEquals("bmw", iterator.next().getMake());
		assertEquals("honda", iterator.next().getMake());
		assertEquals("hyndai", iterator.next().getMake());

}
}

