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
	
	public SpritePanel(Controller app)
	{
		super();
		
		this.app = app;
		this.currentCanvas = new BufferedImage(700, 700, BufferedImage.TYPE_INT_ARGB);
		this.stamp = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		
		setupPanel();
		updateImage();
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
}
