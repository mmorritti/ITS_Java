package model;

import java.util.ArrayList;

public class ResponsabileVenditore extends Venditore {
	
	ArrayList <Venditore> venditori = new ArrayList<Venditore>();

	public ResponsabileVenditore() {
	}

	public ResponsabileVenditore(String matricola, String nome, String dataNascita, double stipendio, String settore,
			ArrayList<Venditore> venditori) {
		super(matricola, nome, dataNascita, stipendio, settore);
		this.venditori = venditori;
	}

	public ArrayList<Venditore> getVenditori() {
		return venditori;
	}

	public void setVenditori(ArrayList<Venditore> venditori) {
		this.venditori = venditori;
	}

	@Override
	public String toString() {
		return "ResponsabileVenditore [" + (venditori != null ? "venditori=" + venditori + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}
	
	public void aggiungiVenditore(Venditore v) {
		venditori.add(v);
	}
	
	public Venditore posizioneVenditore(ArrayList<Venditore> v,int pos) {
		return v.get(pos);
	}
	
	public void deleteVenditore(ArrayList<Venditore> v,int pos) {
		v.remove(pos);
	}
	
	@Override 
	public double tredicesima() {
		int giorniLavoro = 26;
        double tariffaVenditori = 0;
        double totaleStipendio;
        for (Venditore venditore : venditori) {
            tariffaVenditori += venditore.getStipendio() * 0.15 / giorniLavoro;
        }
        return totaleStipendio = (super.getStipendio()*2)+tariffaVenditori;
        
    }
	
	
	
	
	

}
