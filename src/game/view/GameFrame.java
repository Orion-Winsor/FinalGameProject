package game.view;

import game.controller.*;

import java.awt.CardLayout;
import java.awt.*;

import javax.swing.*;

public class GameFrame extends JFrame
{
	private Controller app;
	private GamePanel panel;
	
	public GameFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new GamePanel(this.app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Come Up With Game Name");
		
		
		
		
		replaceScreen("START");
		
		this.setVisible(true);
	}
	
	public void replaceScreen(String screen)
	{
		if (screen.equals("GAME"))
		{
			
		}
	}
}
