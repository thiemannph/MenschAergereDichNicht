
public class Figur {
	
	private int position = 1;
	private Farbe farbe;
	private int startposition;
	
	public Figur(int Startposition, Farbe farbe) 
	{
		this.farbe = farbe;
		this.startposition = Startposition;
	}
	
	public int getPosition() { return position; }
	public void move(int steps)
	{
		int newPosition = position + steps;
		if ( position == 0 )
		{
			newPosition = startposition;
		}
		
	}
}
