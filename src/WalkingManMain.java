/**
 * @author Akira Morales
 * Period 6
 * Walking Man Main
 */
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame
{
	public WalkingManMain()
	{
		this.setBounds(100, 100, 300, 300);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		WalkingMan walkingMan = new WalkingMan(120, 120);
		this.add(walkingMan);
	}
	Timer t1 = new Timer(100, new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
				repaint();
			}
		});
	{t1.start();}
	public void KeyTyped(KeyEvent e)
				{
					int iniLocX = getX();
					int iniLocY = getY();
					if(e.getKeyCode() == KeyEvent.VK_UP)
					{
						setLocation(iniLocX, iniLocY--);
					}
					else if(e.getKeyCode() == KeyEvent.VK_DOWN)
					{
						setLocation(iniLocX, iniLocY++);
					}
					else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
					{
						setLocation(iniLocX++, iniLocY);
					}
					else if(e.getKeyCode() == KeyEvent.VK_LEFT)
					{
						setLocation(iniLocX--, iniLocY);
					}
				}
		
		
public static void main(String args[])
	{
		WalkingManMain man = new WalkingManMain();
	}
}
