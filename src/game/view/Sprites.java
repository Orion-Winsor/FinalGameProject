package game.view;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Sprites 
{
	private int moveXAxis;
	private int moveYAxis;
	private int x = 40;
	private int y = 60;
	private int width;
	private int height;
	private Image image;
	
	public Sprites()
	{
		loadImage();
	}
	
	private void loadImage()
	{
		ImageIcon icon = new ImageIcon("src/resources/Ball.png");
		image = icon.getImage();
		
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
	
	public void move()
	{
		x += moveXAxis;
		y += moveYAxis;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Image getImage()
	{
		return image;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT)
		{
			moveXAxis = -2;
		}
		else if (key == KeyEvent.VK_RIGHT) 
		{
			moveXAxis = 2;
		}
		else
		{
			moveXAxis = 0;
		}
		
		if (key == KeyEvent.VK_UP) 
		{
			moveYAxis = -2;
		}
		else if (key == KeyEvent.VK_DOWN)
		{
			moveYAxis = 2;
		}
		else
		{
			moveYAxis = 0;
		}
	}
	
	public void keyRealeased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT)
		{
			moveXAxis = 0;
		}
		
		if(key == KeyEvent.VK_RIGHT)
		{
			moveXAxis = 0;
		}
		
		if(key == KeyEvent.VK_UP)
		{
			moveYAxis = 0;
		}
		
		if(key == KeyEvent.VK_DOWN)
		{
			moveYAxis = 0;
		}
	}
}
