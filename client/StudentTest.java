package com.capgemini.client;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	private static Student pratik;
	private static Student pawan;
	private static Student ram;
	
	@Before
	public void StartUp() {
		pratik=new Student(1,"pratik","pune");
		pawan=new Student(2,"pawan","mumbai");
		ram=new Student(3,"ram","nagpur");	
	}
	@Test
	public void testwhetherDuplicateOrNot() {
		HashSet<Student> student=new HashSet<Student>();
		student.add(pratik);
		student.add(pawan);
		student.add(ram);
		assertEquals(3,student.size());
		}
	@Test
	public void testMapForKeyValuePair() {
		Map<String, String>map=new HashMap<String,String>();
		map.put(pratik.getName(),"apple");
		map.put(pawan.getName(),"mango");
		map.put(ram.getName(),"grapes");
		assertEquals("apple",map.get(pratik.getName()));
		assertEquals("mango",map.get(pawan.getName()));
		assertEquals("grapes",map.get(ram.getName()));
		
		
		
		}
	}


