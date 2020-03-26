package enhancedcounter;

public class TestEnhancedCounter {

	public static void main(String[] args) {
		EnhancedCounter c1 = new EnhancedCounter(10);
		EnhancedCounter c2 = new EnhancedCounter(5);
		EnhancedCounter c3 = new EnhancedCounter(7);
		System.out.printf("c1's ID = %d, c2's ID = %d, c3's ID = %d%n",
				          c1.getID(), c2.getID(), c3.getID());
		System.out.printf("Initially,      c1 = %2s  c2 = %s  c3 = %s  total = %2s%n",  
				          c1, c2, c3, EnhancedCounter.getGlobal());
		for (int i = 0; i < 12; i++) {
			c1.increment();
			c2.increment();
			c3.increment();
			System.out.printf("In the loop,    c1 = %2s  c2 = %s  c3 = %s  total = %2s%n", 
				              c1, c2, c3, EnhancedCounter.getGlobal());
		}
		System.out.printf("After the loop, c1 = %2s  c2 = %s  c3 = %s  total = %2s%n",
				          c1, c2, c3, EnhancedCounter.getGlobal());
		c1.reset();
		System.out.printf("After c1 reset, c1 = %2s  c2 = %s  c3 = %s  total = %2s%n",
				          c1, c2, c3, EnhancedCounter.getGlobal());
		c2.reset();
		System.out.printf("After c2 reset, c1 = %2s  c2 = %s  c3 = %s  total = %2s%n",
				          c1, c2, c3, EnhancedCounter.getGlobal());
		c3.reset();
		System.out.printf("After c3 reset, c1 = %2s  c2 = %s  c3 = %s  total = %2s%n",
				          c1, c2, c3, EnhancedCounter.getGlobal());

	}

}
