package OOPS;

public class GarbageCollector {

	
	public int collector(GarbageCollector garbage)
	{
		garbage = new GarbageCollector();
		return 0 ;
	}
	static GarbageCollector display(GarbageCollector g)
	{
		g = new GarbageCollector();
		return g ;
	}
	public static void main(String[] args) {
		
		GarbageCollector g1 = new GarbageCollector();
		g1.toString();
		g1 = null;
		
		g1 = new GarbageCollector();
		g1.display(g1);
		
		
		GarbageCollector g2 = new GarbageCollector();
		g2.collector(g2);
		
	}
	
}

