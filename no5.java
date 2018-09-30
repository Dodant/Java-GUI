import java.awt.*;
import javax.swing.*;

public class no5 extends JFrame{
	public no5(){
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4, 4));
		
		JLabel lb0 = new JLabel("0");
		lb0.setBackground(Color.BLACK);
		cp.add(lb0);
		
		setTitle("4 by 4 Color Frame");
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new no5();
	}
}
