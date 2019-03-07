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

public class WalkingManMain extends JFrame implements ActionListener
{
	private WalkingMan walkingMan;
	public WalkingManMain()
	{
		this.setBounds(100, 100, 600, 600);
		this.setLayout(null);
		walkingMan = new WalkingMan(120, 120);
		this.add(walkingMan);
		
		Timer t1 = new Timer(100, this);
		t1.start();
		this.setFocusable(true);

		this.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_UP)
				{
					walkingMan.setY(-3);
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN && walkingMan.getY()+51 < getY()+getHeight())
				{
					walkingMan.setY(3);
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT && walkingMan.getX()+31 < getX()+getWidth())
				{
					walkingMan.setX(3);
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT && walkingMan.getX() > getX())
				{
					walkingMan.setX(-3);
				}
			}

			@Override
			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_UP)
				{
					walkingMan.setY(0);
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN)
				{
					walkingMan.setY(0);
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				{
					walkingMan.setX(0);
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT)
				{
					walkingMan.setX(0);
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

		});
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		walkingMan.update();
		repaint();
	}
	
public static void main(String args[])
	{
		new WalkingManMain();
	}



}
