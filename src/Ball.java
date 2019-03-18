import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent
{
	private Ellipse2D.Double circle;
	private int dx = 0, dy = 0;
	public Ball (int x, int y)
	{
	circle = new Ellipse2D.Double(0, 0, 10, 10);
	setBounds(x, y, 11, 11);
	}
	
	public void setX(int x)
	{
		dx = x;
	}
	
	public void setY(int y)
	{
		dy = y;
	}
	
	public void move()
	{
		while(getX() != getWidth())
		setLocation(getX()+5, getY());
	}

	
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.fill(circle);
	}
}
