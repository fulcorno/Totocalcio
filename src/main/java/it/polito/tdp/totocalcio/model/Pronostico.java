package it.polito.tdp.totocalcio.model;

import java.util.ArrayList;
import java.util.List;

public class Pronostico {
	private List<PronosticoPartita> pronostici = new ArrayList<>() ;
	
	public Pronostico() {
		
	}
	
	public void add(PronosticoPartita pp) {
		this.pronostici.add(pp) ;
	}
	
	public void add(String pp) {
		this.pronostici.add(new PronosticoPartita(pp)) ;
	}

	public String toString() {
		return this.pronostici.toString() ;
	}
	
	public int size() {
		return this.pronostici.size() ;
	}

	public PronosticoPartita get(int i) {
		return this.pronostici.get(i) ;
	}
	
}
