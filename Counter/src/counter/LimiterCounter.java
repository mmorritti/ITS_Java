package counter;

import java.util.*;

public class LimiterCounter extends Counter {
	private int limit;
	
	public LimiterCounter(int start, int limit ) {
		super(start);
		this.limit = limit;
	}
	
	public void increment() throws ArithmeticException {
		if (value() < limit) 
			super.increment();
		else 
			throw new ArithmeticException();
	}

}
