package Package2;

public class loop {

	
	public void whileSample()
	{
		int I = 1;
		while(keepRunning())
		{
			System.out.println("repeat");
			I++;
		}

	}
	public boolean keepRunning() {
		int I = 1;
		if(I < 10) return true; else return false;
		
	}	 
}
