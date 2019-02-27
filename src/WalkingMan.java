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
	public WalkingMan(int x, int y)
	{
		head = new Ellipse2D.Double(10, 0, 10, 10);
		body = new Rectangle(10, 10, 10, 20);
		leftLeg = new Rectangle(5, 30, 5, 20);
		rightLeg = new Rectangle(20, 30, 5, 20);
		leftArm = new Rectangle(5, 10, 10, 5);
		rightArm = new Rectangle(20, 10, 10, 5);
		setBounds(x, y, 31, 51);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(head);
		g2.draw(body);
		g2.draw(leftLeg);
		g2.draw(rightLeg);
		g2.draw(leftArm);
		g2.draw(rightLeg);
		
	}
}
