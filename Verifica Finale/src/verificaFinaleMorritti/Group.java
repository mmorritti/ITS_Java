package verificaFinaleMorritti;

import java.util.ArrayList;

public class Group extends Musician {
	
	private int numOfElements;
	private ArrayList<Album> listOfAlbums;

	public Group() {
	}

	public Group(String stageName, int startingYear, int endingYear, int numOfElements) {
		super(stageName,startingYear,endingYear);
		this.numOfElements = numOfElements;
		listOfAlbums = new ArrayList<Album>();
	}
	
	public int getNumOfElements() {
		return numOfElements;
	}

	public void setNumOfElements(int numOfElements) {
		this.numOfElements = numOfElements;
	}

	public ArrayList<Album> getListOfAlbums() {
		return listOfAlbums;
	}

	public void setListOfAlbums(ArrayList<Album> listOfAlbums) {
		this.listOfAlbums = listOfAlbums;
	}

	@Override
	public String getDescription() {
		String descrizione = "Il gruppo " + stageName + 
				" è formato da " + numOfElements + 
				" membri e ha pubblicato " + listOfAlbums.size() + "album";
		return descrizione;
	}
	
	@Override
	public void addComposition(Object a) {
		listOfAlbums.add((Album)a);
	}

	@Override
	public String toString() {
		return "Group numOfElements=" + numOfElements + ", listOfAlbums=" + listOfAlbums + ", stageName=" + stageName;
	}
	
	


}
