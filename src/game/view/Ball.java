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
		if (x + xa < 0)
			xa = 1;
		if (x + xa > controller.getWidth() - DIAMETER)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > controller.getHeight() - DIAMETER)
			ya = -1;
		if (collision()){
			ya = -1;
			y = controller.racquet.getTopY() - DIAMETER;
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
		
		//g.setColor(new Color(212, 212, 212));
	}
	
	public Rectangle getBounds() 
	{
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}
}
