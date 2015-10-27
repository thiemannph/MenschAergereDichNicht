import java.util.*;

import javax.swing.JOptionPane;

public class Spiel {
	private Spielbrett _spielbrett;
	private Setup _setup;
	private ArrayList<Spieler> _spielerList;
	
	private boolean GameOver = false;
	
	public Spiel()
	{
		//_spielbrett = new Spielbrett();
		_setup = new Setup();
		StarteSpiel();
	}
	
	private Figur showOptionPane(ArrayList<Figur> Figures)
	{
		Object[] options = Figures.toArray();
		Object choosenvalue = JOptionPane.showInputDialog(null,
	               "What Figure", "Choose...", JOptionPane.QUESTION_MESSAGE, null,
	               options, options[0]); 
		return null;
	}
	
	public void StarteSpiel()
	{
		_spielerList = _setup.getSpielerList();
		while(!GameOver)
		{
			for (Spieler player : _spielerList)
			{
				// locals >>
				Figur choosenFigure;
				ArrayList<Figur> possibleFigures = new ArrayList<Figur>();
				
				boolean rollAgain = false;
				int steps = 0;
				// locals <<
				
				steps = player.roll();
				possibleFigures = player.getPossibleFigures(steps);
				choosenFigure = showOptionPane(possibleFigures);
				
				
				
				
			}
			GameOver = true;
		}
	}
	
	
}
