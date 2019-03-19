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
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame implements ActionListener
{
	private WalkingMan walkingMan;
	private Ball ball;
	private ArrayList<Ball> ballList = new ArrayList<>();
	public WalkingManMain()
	{
		this.setBounds(100, 100, 600, 600);
		this.setLayout(null);
		walkingMan = new WalkingMan(120, 120);
		ball = new Ball(walkingMan.getX()+ 31, walkingMan.getY()+10);
		this.add(walkingMan);
		this.add(ball);
		
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
				else if(e.getKeyCode() == KeyEvent.VK_DOWN)
				{
					walkingMan.setY(3);
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				{
					walkingMan.setX(3);
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT)
				{
					walkingMan.setX(-3);
				}
				else if(e.getKeyCode() == KeyEvent.VK_SPACE)
				{
					
					ballList.add(ball);
					ball.move();
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
				else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				{
					ballList.add(ball);
					ball.move();
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
		if(walkingMan.getX()<0) walkingMan.setLocation(0, walkingMan.getY());
		if(walkingMan.getY()<0) walkingMan.setLocation(walkingMan.getX(), 0);
		if(walkingMan.getY()+51 > getHeight()) walkingMan.setLocation(walkingMan.getX(), getHeight()-51);
		if(walkingMan.getX()+31 > getWidth()) walkingMan.setLocation(getWidth()-31, walkingMan.getY());
		if(ball.getX() > getWidth())
		{
			ballList.remove(ball);
			this.remove(ball);
		}
		walkingMan.update();
		ball.update();
		repaint();
	}
	
public static void main(String args[])
	{
		new WalkingManMain();
	}



}
