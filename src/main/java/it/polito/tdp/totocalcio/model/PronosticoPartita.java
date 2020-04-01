package it.polito.tdp.totocalcio.model;

import java.util.HashSet;
import java.util.Set;

public class PronosticoPartita {
	private Set<RisultatoPartita> risultati = new HashSet<>();
	
	public PronosticoPartita(String giocata) {
		for(int i=0; i<giocata.length(); i++) {
			risultati.add(RisultatoPartita.valueOf(giocata.charAt(i))) ;
		}
		
	}

	public String toString() {
		String r = "" ;
		for(RisultatoPartita pp: this.risultati) {
			r += pp.toString() ;
		}
		return r ;
	}
	
	public Set<RisultatoPartita> getRisultati() {
		return this.risultati ;
	}
}
