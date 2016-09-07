package com.saha.tdd.sample.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.saha.tdd.sample.banking.Matematik;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Matematik2Test {


	
	@Test
//	@Parameters({"2,2,4", "4,4,8"})
	@FileParameters(value = "src/test/resources/data.csv")
	public void toplamaTest(int x, int y, int beklenenSonuc){
		Matematik mat = new Matematik();
		int sonuc = mat.topla(x, y);
		assertEquals(beklenenSonuc, sonuc);
		
	}
	
	
}
