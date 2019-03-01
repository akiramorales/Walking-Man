/**
 * @author Akira Morales
 * Period 6
 * Walking Man Main
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame
{
	public static void main(String arags[])
	{
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 300);
		
		WalkingMan man = new WalkingMan(120, 120);
		frame.add(man);
		
		@Override
		public  void KeyTyped(KeyEvent e)
				{
					if(e.getKeyCode() == KeyEvent.VK_UP)
					{
						WalkingMan.setLocation(man.get(x), man.get(y-1));
					}
					else if(e.getKeyCode() == KeyEvent.VK_DOWN)
					{
						man.setLocation(man.get(x), man.get(y+1));
					}
					else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
					{
						man.setLocation(man.get(x+1), man.get(y));
					}
					else if(e.getKeyCode() == KeyEvent.VK_LEFT)
					{
						man.setLocation(man.get(x-1), man.get(y));
					}
					man.repaint();
				}
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
