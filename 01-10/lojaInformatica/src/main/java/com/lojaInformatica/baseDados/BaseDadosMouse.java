package com.lojaInformatica.baseDados;

import java.math.BigDecimal;

import com.lojaInformatica.model.Mouse;

public class BaseDadosMouse {
	private Mouse listaMouse[];
	
	public BaseDadosMouse() {
		listaMouse = new Mouse[2];
		
		listaMouse[0] = new Mouse(new BigDecimal(160), "Mouse Microsoft Comfort 4500", "Microsoft", "4Fd-00025", 2010, 4500, true, false);
		listaMouse[1] = new Mouse(new BigDecimal(60), "Mouse Wireless M170 Cinza - Logitech", "Logitech", "M170", 2010, 1000, false, true);
	}

	public Mouse[] getListaMouse() {
		return listaMouse;
	}

	public void setListaMouse(Mouse[] listaMouse) {
		this.listaMouse = listaMouse;
	}
	
}
