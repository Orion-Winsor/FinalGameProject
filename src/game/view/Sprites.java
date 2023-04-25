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
		ImageIcon icon = new ImageIcon("src/resources/spike1.png");
		image = icon.getImage();
		
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
	
	public void move()
	{
		x += moveXAxis;
		y += moveYAxis;
	}
}
