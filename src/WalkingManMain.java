/**
 * @author Akira Morales
 * Period 6
 * Walking Man Main
 */
import java.awt.Point;
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
		WalkingMan man = new WalkingMan(120, 120);
		this.add(man);
	}
		public  void KeyTyped(KeyEvent e)
				{
					int iniLocX = getX();
					int iniLocY = getY();
					if(e.getKeyCode() == KeyEvent.VK_UP)
					{
						WalkingMan.setLocation(iniLocX, iniLocY-1);
					}
					else if(e.getKeyCode() == KeyEvent.VK_DOWN)
					{
						WalkingMan.setLocation(WalkingMan.get(x),WalkingMan.get(y+1));
					}
					else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
					{
						WalkingMan.setLocation(WalkingMan.get(x+1), WalkingMan.get(y));
					}
					else if(e.getKeyCode() == KeyEvent.VK_LEFT)
					{
						WalkingMan.setLocation(WalkingMan.get(x-1), WalkingMan.get(y));
					}
					repaint();
				}
public static void main(String args[])
	{
		WalkingManMain man = new WalkingManMain();
	}
}
