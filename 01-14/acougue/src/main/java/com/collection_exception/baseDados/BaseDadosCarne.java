package com.collection_exception.baseDados;

import java.util.ArrayList;
import java.util.List;

import com.collection_exception.model.Carne;

public class BaseDadosCarne {
	private List<Carne> listaCarne = new ArrayList<Carne>();

	public List<Carne> getListaCarne() {
		return listaCarne;
	}

	public void setListaCarne(List<Carne> listaCarne) {
		this.listaCarne = listaCarne;
	}

}
