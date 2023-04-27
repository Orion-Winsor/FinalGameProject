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
	private Sprites ball;
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
		
		ball = new Sprites();
		
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
		
		g2d.drawImage(ball.getImage(), ball.getX(), ball.getY(), this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		step();
	}
	
	private void step()
	{
		ball.move();
		
		repaint(ball.getX()-1, ball.getY()-1, ball.getWidth()+2, ball.getHeight() +2);
	}
	
	private class TAdapter extends KeyAdapter
	{
		@Override
		public void keyReleased(KeyEvent e) 
		{
			ball.keyPressed(e);
		}
	}
}
