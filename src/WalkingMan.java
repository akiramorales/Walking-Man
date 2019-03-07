/**
 * @author Akira Morales
 * Period 6
 * Walking Man
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class WalkingMan extends JComponent
{
	private Ellipse2D head;
	private Rectangle body, leftLeg, rightLeg, leftArm, rightArm;
	private int dx = 0, dy = 0;
	public WalkingMan(int x, int y)
	
	{
		head = new Ellipse2D.Double(10, 0, 10, 10);
		body = new Rectangle(10, 10, 10, 20);
		leftLeg = new Rectangle(10, 30, 4, 20);
		rightLeg = new Rectangle(16, 30, 4, 20);
		leftArm = new Rectangle(0, 10, 10, 4);
		rightArm = new Rectangle(20, 10, 10, 4);
		setBounds(x, y, 31, 51);
	}
	
	public void setX(int x)
	{
		dx = x;
	}
	
	public void setY(int y)
	{
		dy = y;
	}
	
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.fill(head);
		g2.fill(leftArm);
		g2.fill(rightArm);
		g2.setColor(Color.RED);
		g2.fill(body);
		g2.setColor(Color.DARK_GRAY);
		g2.fill(leftLeg);
		g2.fill(rightLeg);		
	}
}
