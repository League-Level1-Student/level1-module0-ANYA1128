import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox implements ActionListener {
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
	// TODO Auto-generated method stub
	
}

}
}
