package verificaFinaleMorritti;

public class Album {
	
	private String title;
	private int year;
	private String recordLabel;
	private int copiesSold;
	private double price;
	
	public Album() {
		
	}

	public Album(String title, int year, String recordLabel, int copiesSold, double price) {
		this.title = title;
		this.year = year;
		this.recordLabel = recordLabel;
		this.copiesSold = copiesSold;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public void setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
	}

	public int getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double revenue() {
		return copiesSold * price;
	}

	@Override
	public String toString() {
		return "Album: title: " + title + ", year: " + year + ", recordLabel: " + recordLabel + ", copiesSold: "
				+ copiesSold + ", price: " + price ;
	}
	
	
	
	//OK
	
	
	
	
	
	
	
	
	

}
