import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestToday {
	public static void main(String[] args) {
		TestTodayMan man= new TestTodayMan();
	}
}


class TestTodayMan implements ActionListener {

	ImageIcon img;
	ImageIcon img2;
	JFrame frame;					
	JButton button;					
			
	
	JLabel label;
	JPanel panel;
				

	public TestTodayMan(){
		frame = new JFrame("TestToday");
		frame.setLocation(400, 400);		
		frame.setSize(500, 500);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img = new ImageIcon("img/imgres.jpg");
		img2 = new ImageIcon("img/th.jpg");
		

			
			label = new JLabel(img);
			panel = new JPanel();
			button= new JButton("Click Me");

			button.addActionListener(this);
			button.setActionCommand("open");
		

		Container con = frame.getContentPane();
		
		panel.add(label);
		panel.add(button);
		con.add(panel);
		
		
		frame.setVisible(true);
			
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("open")){

			label.setIcon(img);
			label.setIcon(img2);

		}

			
	}
}