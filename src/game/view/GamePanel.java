package game.view;

import game.controller.Controller;

import javax.swing.*;

import java.awt.event.*;

public class GamePanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JLabel demoLabel;
	private SpritePanel canvas;
	
	public GamePanel(Controller app)
	{
		super();
		
		this.app = app;
		this.canvas = new SpritePanel(app);
		this.layout = new SpringLayout();
		this.demoLabel = new JLabel("Placeholdertext");
		
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		
	}
}
