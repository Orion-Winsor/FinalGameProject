package game.view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.*;
import java.util.*;

import game.controller.Controller;

public class Ball 
{
	private static final int DIAMETER = 30;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private Controller controller;

	public Ball(Controller controller) 
	{
		this.controller= controller;
	}

	public void move() 
	{
		boolean changeDirection = true;
		if (x + xa < 0)
		{
			xa = controller.speed;
		}
		else if (x + xa > controller.getWidth() - DIAMETER)
		{
			xa = -controller.speed;
		}
		else if (y + ya < 0)
		{
			ya = controller.speed;
		}
		else if (y + ya > controller.getHeight() - DIAMETER)
		{
			controller.gameOver();
		}
		else if (collision())
		{
			ya = -controller.speed;
			y = controller.racquet.getTopY() - DIAMETER;
			controller.speed++;
		}
		else
		{
			changeDirection = false;
		}

		x = x + xa;
		y = y + ya;
	}

	private boolean collision()
	{
		return controller.racquet.getBounds().intersects(getBounds());
	}
	
	public void paint(Graphics2D g) 
	{
		g.fillOval(x, y, DIAMETER, DIAMETER);
		
		g.setColor(new Color(212, 212, 212));
	}
	
	public Rectangle getBounds() 
	{
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}
}
