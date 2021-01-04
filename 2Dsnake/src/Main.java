import java.awt.Color;

import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		Gameplay game=new Gameplay();
		f.getContentPane().add(game);
		f.setBounds(10,10,913,700);
		f.setBackground(Color.DARK_GRAY);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
