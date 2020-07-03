package verificaFinaleMorritti;

public abstract class Musician implements IArtist {
	
	protected String stageName;
	protected int startingYear;
	protected int endingYear;
	
	public Musician() {
	}
	
	public Musician(String stageName, int startingYear, int endingYear) {
		this.stageName = stageName;
		this.startingYear = startingYear;
		this.endingYear = endingYear;
	}
	
	@Override
	public String toString() {
		return "Musician: \n"
				+ "stageName: " + stageName + "\n"
				+ "startingYear: " + startingYear + "\n"
				+ "endingYear: " + endingYear;
	}
	
	@Override
	public abstract String getDescription();
	
	public abstract void addComposition(Object a);
	
	//OK
	
	
	
	

	
}
