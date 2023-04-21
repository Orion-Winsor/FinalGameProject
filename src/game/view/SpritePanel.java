package game.view;

import game.controller.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.Dimension;

import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.ImageIO;


public class SpritePanel extends JPanel
{
	private Controller app;
	private Color currentColor;
	private BufferedImage currentCanvas;
	private BufferedImage stamp;
	private int dx;
	private int dy;
	private int x = 40;
	private int y = 60;
	private int width;
	private int height;
	private Image image;
	
	public SpritePanel(Controller app)
	{
		super();
		
		this.app = app;
		this.currentCanvas = new BufferedImage(700, 700, BufferedImage.TYPE_INT_ARGB);
		this.stamp = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		
		setupPanel();
		updateImage();
		loadImage();
	}
	
	public void setupPanel()
	{
		this.setPreferredSize(new Dimension(700, 700));
		this.setBackground(Color.black);
		this.currentColor = Color.gray;
	}
	
	private void updateImage()
	{
		Graphics2D drawingGraphics = currentCanvas.createGraphics();

	}
	
	private void loadImage()
	{
		ImageIcon staySpike = new ImageIcon("scr/resources/spike1.png");
		image = staySpike.getImage();
		
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
}
