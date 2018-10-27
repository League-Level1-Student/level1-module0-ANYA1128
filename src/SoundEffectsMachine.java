import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
public static void main(String[] args) {
	SoundEffectsMachine fc = new SoundEffectsMachine();
	fc.showButton();
}

private void showButton() {
	System.out.println("Button clicked");
    JFrame jeff = new JFrame();
    JPanel pan = new JPanel();
	jeff.setVisible(true);
	JButton button = new JButton();
	JButton bob = new JButton ();
	JButton bobo = new JButton();
	pan.add(button);
	jeff.add(pan);
	button.addActionListener(this);
	jeff.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
