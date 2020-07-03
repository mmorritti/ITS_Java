package counter;

public class Counter {
	private int count;
	private int start;
	
	public Counter(int start) {
		this.start = start;
		this.count = start;
	}
	
	public void increment () {
		count ++;
	}
	
	public void reset() {
		count = start;
	}
	
	@Override 
	public String toString() {
		return 
				"Count: "+count+
				"\nStart: "+start;
	}
	
	public int value() {
		return count;
	}
	
	public static void main(String args[]) {
		Counter c = new LimiterCounter(1,3);
		System.out.println(c);
		try {
			c.increment();
			System.out.println("Primo: "+c);
			c.increment();
			System.out.println("Secondo: "+c);
			c.increment();
			System.out.println("Terzo: "+c);
		}catch(ArithmeticException e) {
			System.out.println("Hai raggiunto il limite!!");
			c.reset();
		}
		System.out.println("Stato attuale: "+c.value());
	}
}
