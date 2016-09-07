package com.saha.tdd.sample.banking;

public class KrediHesaplama { 

	public MerkezBankasiServis merkez;
	
	public double krediHesapla(int para, int vade){
		double oran = merkez.faizOrani();
		return para * (vade * oran);
	}
}
