import java.util.*;
import java.awt.*;


public class Setup {
	
	private ArrayList<Spieler> _spielerList = new ArrayList<Spieler>();	
	public ArrayList<Spieler> getSpielerList() { return _spielerList; }
	
	public Setup()
	{
		_spielerList.add(new Spieler(1, Farbe.BLAU));
		_spielerList.add(new Spieler(2, Farbe.BLAU));
		_spielerList.add(new Spieler(3, Farbe.BLAU));
		_spielerList.add(new Spieler(4, Farbe.BLAU));
	}
}
