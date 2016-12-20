import java.awt.*;
import javax.swing.*;

public class AlohaWindow{
	public static void main(String[]args){
	JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,200);
	frame.setTitle("タパ");

	frame.setLayout(new FlowLayout());
	JLabel label=new JLabel("HELLO");
	Container ctnr=frame.getContentPane();
	ctnr.add(label);

	JButton button=new JButton("CLICK");
	ctnr.add(button);

	frame.setVisible(true);

	}
	}
