package com.lojaInformatica.baseDados;

import java.math.BigDecimal;

import com.lojaInformatica.model.Headphone;

public class BaseDadosHeadphone {
	private Headphone[] listaHeadphone;
	
	public BaseDadosHeadphone() {
		listaHeadphone = new Headphone[2];
		
		listaHeadphone[0] = new Headphone(new BigDecimal(120), "Xiaomi Earbuds", "Xiaomi", "Airdots Redmi", 2019, false, true, "intra auricular sem fio" );
		listaHeadphone[1] = new Headphone(new BigDecimal(1800), "Headset Gamer Audio-Technica", "Audio-Technica", "ATH-AG1X", 2018, true, true, "Headset com fio" );
	}

	public Headphone[] getListaHeadphone() {
		return listaHeadphone;
	}

	public void setListaHeadphone(Headphone[] listaHeadphone) {
		this.listaHeadphone = listaHeadphone;
	}
	
}
