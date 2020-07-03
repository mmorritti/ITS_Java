package verificaFinaleMorritti;

import java.util.ArrayList;

public class Author extends Musician {
	
	
	private String name;
	private String surname;
	private ArrayList<Track>listOfTracks;
	
	public Author() {
	}
	
	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.listOfTracks = listOfTracks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ArrayList<Track> getListOfTracks() {
		return listOfTracks;
	}

	public void setListOfTracks(ArrayList<Track> listOfTracks) {
		this.listOfTracks = listOfTracks;
	}
	

	@Override
	public String getDescription() {
		String descrizione = "L'autore " + name + " " + surname +
				" nel periodo " + startingYear + "-" + endingYear + 
				" ha scritto " + listOfTracks.size();
		return descrizione ;
	}

	@Override
	public void addComposition(Object t) {
		listOfTracks.add((Track)t);
	}
	
	//da implementare
	public ArrayList<Track> getTracksByGenre(String s) {
		ArrayList <Track>braniG = new ArrayList <Track>();
		for(Track t : listOfTracks) {
			if(t.getGenre().equals(s)) {
				braniG.add(t);
			}
		}
		return braniG;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", surname=" + surname + ", listOfTracks=" + listOfTracks + ", stageName="
				+ stageName + ", startingYear=" + startingYear + ", endingYear=" + endingYear + "]";
	}
	
	

}
