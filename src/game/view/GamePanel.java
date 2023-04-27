package game.view;

import game.controller.Controller;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.*;

public class GamePanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JLabel demoLabel;
	Ball ball = new Ball(this);
	Raquet racquet = new raquet(this);
	
	public Game()
	{
		addKeyListener(new KeyListener()
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				
			}
		}
	}
	//private SpritePanel canvas;
	
	public GamePanel(Controller app)
	{
		super();
		
		this.app = app;
		//this.canvas = new SpritePanel(app);
		
		this.layout = new SpringLayout();
		this.demoLabel = new JLabel("Placeholdertext");
		//this.getColorModel(Color.GRAY);
		
		JLabel emptyLabel = new JLabel();
		JFrame frame = new JFrame("Test Name");
		frame.add(new JLabel(new ImageIcon("Image path here")));
		frame.getContentPane().add(emptyLabel, BorderLayout.PAGE_START);
		frame.pack();
		frame.setVisible(true);
		
		
		
		setupPanel();
	}
	
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		graphics.setColor(Color.RED);
		//graphics.fillOval(x,  y,  width, height);
	}
	
	private void setupPanel()
	{
		this.setPreferredSize(new Dimension(700, 700));
		this.setBackground(Color.GREEN);
	}
	
	private void placeSprite()
	{
		
	}
}
