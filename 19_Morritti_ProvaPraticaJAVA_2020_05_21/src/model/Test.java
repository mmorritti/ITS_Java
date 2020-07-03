package model;

import java.util.ArrayList;
import java.util.Arrays;



public class Test {
	public static void main(String [] args) {
		
		Venditore v1 = new Venditore("23mfffi3","Alberto Fantini", "23/11/1967", 1500.45,"auto");
		Venditore v2 = new Venditore("23mfffi4","giada trombino", "23/1/1967", 1505.45,"moto");
		Venditore v3 = new Venditore("23mfffi5","aldo testina", "23/10/1967", 1515.45,"moto");
		
		ArrayList <Venditore> venditori = new ArrayList <Venditore>();
		
		venditori.add(v1);
		venditori.add(v2);
		venditori.add(v3);
		
		ResponsabileVenditore rv = new ResponsabileVenditore("1111capo11","MegaCapoSupremo","14/12/1950", 2700, "auto e moto",venditori);
		
		
		
		
	}

}
