/**
 * @author Akira Morales
 * Period 6
 * Walking Man Main
 */
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
		
		Timer t1 = new Timer(100, new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				public void keyListener(KeyEvent e)
				{
					if(e)
					{
						man.setLocation(man.get(x), man.get(y-1));
					}
					else if(keyPressed == KeyEvent.KEY_EVENT_RIGHT)
					{
						man.setLocation(man.get(x), man.get(y+1));
					}
					else if(keyPressed == KeyEvent.KEY_EVENT_UP)
					{
						man.setLocation(man.get(x+1), man.get(y));
					}
					else if(keyPressed == KeyEvent.KEY_EVENT_DOWN)
					{
						man.setLocation(man.get(x-1), man.get(y));
					}
					man.repaint();
				}
			}
		});
		t1.start();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
