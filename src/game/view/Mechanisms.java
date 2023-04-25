package game.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Mechanisms extends JPanel implements ActionListener
{
	private Timer timer;
	private Sprites spike;
	private final int DELAY = 10;
	
	public Mechanisms()
	{
		initBoard();
	}
	
	private void initBoard()
	{
		addKeyListener(new TAdapter());
		setBackground(Color.black);
		setFocusable(true);
		
		spike = new Sprites();
		
		timer = new Timer(DELAY, this);
		timer.start();
	}
	
	//@Override
	public void paintComponenet(Graphics g)
	{
		super.paintComponent(g);
		
		doDrawing(g);
		
		Toolkit.getDefaultToolkit().sync();
	}
	
	private void doDrawing(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(spike.getImage(), spike.getX(), spike.getY(), this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		step();
	}
	
	private void step()
	{
		spike.move();
		
		repaint(spike.getX()-1, spike.getY()-1, spike.getWidth()+2, spike.getHeight() +2);
	}
	
	private class TAdapter extends KeyAdapter
	{
		@Override
		public void keyReleased(KeyEvent e) 
		{
			spike.keyPressed(e);
		}
	}
}
