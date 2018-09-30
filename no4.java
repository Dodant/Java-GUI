import java.awt.*;
import javax.swing.*;

public class no4 extends JFrame{
	public no4(){
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(1, 10));
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.BLACK);
		cp.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.BLUE);
		btn1.setOpaque(true);
		cp.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.RED);
		cp.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.GRAY);
		cp.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.YELLOW);
		cp.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.ORANGE);
		cp.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.CYAN);
		cp.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.PINK);
		cp.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.GREEN);
		cp.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.MAGENTA);
		btn9.setOpaque(true);
		cp.add(btn9);
		
		setTitle("Ten Color Buttons Frame");
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new no4();
	}
}
