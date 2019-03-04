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
		WalkingMan walkingMan = new WalkingMan(120, 120);
		this.add(walkingMan);
		
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e)
			{
				
				int iniLocX = getX();
				int iniLocY = getY();
				if(e.getKeyCode() == KeyEvent.VK_UP)
				{
					iniLocY--;
					walkingMan.setLocation(iniLocX, iniLocY);
					repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN)
				{
					iniLocY++;
					walkingMan.setLocation(iniLocX, iniLocY);
					repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				{
					iniLocX++;
					walkingMan.setLocation(iniLocX, iniLocY);
					repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT)
				{
					iniLocX--;
					walkingMan.setLocation(iniLocX, iniLocY);
					repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

		});
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
public static void main(String args[])
	{
		WalkingManMain man = new WalkingManMain();
	}
}
