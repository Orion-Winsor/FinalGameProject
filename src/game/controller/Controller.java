package game.controller;

import javax.swing.JOptionPane;
import game.view.GameFrame;
import game.view.Mechanisms; 

import java.awt.EventQueue;

import javax.swing.*;

public class Controller extends JFrame
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

	private void intitUI()
	{
		add (new Mechanisms());
		
		setTitle("Moving sprite");
		setSize(400, 300);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void MovingSpriteEx()
	{
		intitUI();
	}

}
