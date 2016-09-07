package com.saha.tdd.sample.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import  org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import com.saha.tdd.sample.banking.KrediHesaplama;
import com.saha.tdd.sample.banking.MerkezBankasiServis;

@RunWith(MockitoJUnitRunner.class)
public class KrediHesaplamaTest {

	@InjectMocks
	KrediHesaplama hesaplama;
	
	@Mock
	MerkezBankasiServis merkez;
	
	@Test
	public void hesaplamaTest(){
		when(merkez.faizOrani()).thenReturn(0.1);
		double sonuc = hesaplama.krediHesapla(100, 12);
		System.out.println(sonuc);
	}
}
