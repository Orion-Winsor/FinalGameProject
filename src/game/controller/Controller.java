package game.controller;

import javax.swing.JOptionPane;
import game.view.GameFrame;

public class Controller 
{
	private GameFrame frame;
	
	public Controller()
	{	
		this.frame = new GameFrame(this);
		
	}
	
	public void start()
	{
		
	}
	
	public void handleError(Exception error)
	{
		JOptionPane.showMessageDialog(frame, error.getMessage(), "Ooops!", JOptionPane.ERROR_MESSAGE);
	}
	
	public void updateDisplay()
	{
		
	}
}
