package com.saha.tdd.sample.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.saha.tdd.sample.banking.Matematik;

public class MatematikTest {


	@Before
	public void init(){
		System.out.println("Test calismaya basladi");
	}
	
	@After
	public void after(){
		System.out.println("Test sona erdi ");
	}
	
	@Test
	public void toplamaTest(){
		Matematik mat = new Matematik();
		int sonuc = mat.topla(2, 4);
		assertEquals(6, sonuc);
		
	}
	
	@Test
	public void cikarmaTest(){
		Matematik mat = new Matematik();
		int sonuc2 = mat.cikar(6, 2);
		assertEquals(4, sonuc2);
		
	}
	
	
	
}
