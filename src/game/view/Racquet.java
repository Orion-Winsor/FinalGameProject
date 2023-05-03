package game.view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import game.controller.Controller;

public class Racquet 
{
	private static final int y = 330;
	private static final int width = 60;
	private static final int height = 10;
	int x = 0;
	int xa = 0;
	private Controller game;

	public Racquet(Controller game) 
	{
		this.game = game;
	}

	public void move() 
	{
		if (x + xa > 0 && x + xa < game.getWidth() - 60)
			x = x + xa;
	}

	public void paint(Graphics2D g) 
	{
		g.fillRect(x, y, width, height);
		
		g.setColor(Color.BLUE);
	}

	public void keyReleased(KeyEvent e) 
	{
		xa = 0;
	}

	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = - 1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
	}
	
	public Rectangle getBounds() 
	{
		return new Rectangle(x, y, width, height);
	}

	public int getTopY() 
	{
		return y;
	}
}
