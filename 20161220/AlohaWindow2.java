import java.awt.*;
import javax.swing.*;

public class AlohaWindow2{
	
		static JFrame frame;
		static JLabel label;
		static JButton button;
		static Container ctnr;

		public static void main(String[]args){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,200);
		frame.setTitle("タパ");
		frame.setLayout(new FlowLayout());

		label=new JLabel("Hello");
		button=new JButton("CLICK");

		ctnr=frame.getContentPane();
		ctnr.add(label);
		ctnr.add (button);

		frame.setVisible(true);
	}
	}
