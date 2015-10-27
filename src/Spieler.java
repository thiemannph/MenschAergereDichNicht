import java.util.ArrayList;
import java.util.Random;


public class Spieler {
	
	private String Name;
	private ArrayList<Figur> _figureList = new ArrayList<Figur>();
	private int letzteWürfelZahl = 0;
	private int startPosition = 0;
	private boolean hatGewürfelt = false;
	
	public int roll()
	{
		return new Random().nextInt(6);
	}
	
	public ArrayList<Figur> getPossibleFigures(int steps)
	{
		ArrayList<Figur> possibleFigures;
		_figureList.add(new Figur(1, Farbe.BLAU));
		_figureList.add(new Figur(2, Farbe.BLAU));
		if (steps != 6)
		{
			possibleFigures = new ArrayList<Figur>();
			for (Figur figure : _figureList)
			{
				if (figure.getPosition() > 0) possibleFigures.add(figure);
			}		
		}
		else
		{
			possibleFigures = new ArrayList<Figur>();
			for (Figur figure : _figureList) possibleFigures.add(figure);
		}
		return possibleFigures;
	}
	
	public Spieler(int Startposition, Farbe farbe)
	{
		for ( int i = 0; i <= 3; i++)
		{
			Figur f = new Figur(Startposition, farbe);
		}
	}
}
