package model;

import java.util.ArrayList;
import java.util.Collection;

public class CapoOfficina extends Meccanico {
	
	ArrayList<Ordine>ordini = new ArrayList<Ordine>();

	public CapoOfficina(String matricola, String nome, String dataNascita, double stipendio, String tipologia,
			ArrayList<Ordine> ordini) {
		super(matricola, nome, dataNascita, stipendio, tipologia);
		this.ordini = ordini;
	}

	public CapoOfficina() {
	}

	public ArrayList<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(ArrayList<Ordine> ordini) {
		this.ordini = ordini;
	}

	@Override
	public String toString() {
		return "CapoOfficina [" + (ordini != null ? "ordini=" + ordini + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}
	
	public void aggiungiOrdine(Ordine ordine) {
		ordini.add(ordine);
	}
	
	public int numeroOrdini() {
		return ordini.size();
	}
	
	@Override 
	public double tredicesima() {
		Ordine o = null;
		double tot = 0;
		for(int i = 0; i < ordini.size(); i++) {
			tot += o.getImportoOrdine();
		}
		return (getStipendio() * 2) + tot;
	}

	
}
