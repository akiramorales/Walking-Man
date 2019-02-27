import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * @author Akira Morales
 * Period 6
 * Walking Man Main
 */
public class WalkingManMain extends JFrame
{
	public static void main(String arags[])
	{
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 300);
		
		WalkingMan man = new WalkingMan(120, 120);
		frame.add(man);
		
		/**Timer t1 = new Timer(100, new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(keyTyped)
			}
		});
		t1.start();**/
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
