package verificaFinaleMorritti;

public class Track {
	private String title;
	private int position;
	private String genre;
	
	public Track() {
	}

	public Track(String title, int position, String genre) {
		this.title = title;
		this.position = position;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Track [title=" + title + ", position=" + position + ", genre=" + genre + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
	
	

}
