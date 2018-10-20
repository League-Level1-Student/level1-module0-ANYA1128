import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		

}
public void showButton() {
    System.out.println("Button clicked");
    JFrame jeff = new JFrame();
	jeff.setVisible(true);
	JButton button = new JButton();
	jeff.add(button);
	button.addActionListener(this);
	jeff.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	
	int rand = new Random().nextInt(5);
	if(rand==0) {
		JOptionPane.showMessageDialog(null, "You will win a million dorrars when you actually become smart.");
	}
	else if(rand==1) {
		JOptionPane.showMessageDialog(null, "You will buy a unicorn at the grocery store.");
	}
	else if(rand==2) {
		JOptionPane.showMessageDialog(null, "You will eat something in the next 5 days.");
	}
	else if(rand==3) {
		JOptionPane.showMessageDialog(null, "You will breathe in the next 5 minutes.");
	}
	else if(rand==4) {
		JOptionPane.showMessageDialog(null, "You will fail every test and quiz you ever take.");
	}
	// TODO Auto-generated method stub
	
}	
}
