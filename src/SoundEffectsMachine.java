import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
public static void main(String[] args) {
	SoundEffectsMachine fc = new SoundEffectsMachine();
	fc.showButton();
}
JButton button = new JButton("YOU DRINK ME AND I AM PART OF RIVERS WHAT AM I??");
JButton bob = new JButton ("THIS IS THE SOUND OF A STRING INSTRUMENT. WHICH ONE AM I??");
JButton bobo = new JButton("I'M THE SOUND HAPPY PEOPLE MEAKE! WHAT SOUND AM I?");

private void showButton() {
	System.out.println("Button clicked");
    JFrame jeff = new JFrame();
    JPanel pan = new JPanel();
	jeff.setVisible(true);
	
	pan.add(button);
	pan.add(bob);
	pan.add(bobo);
	jeff.add(pan);
	button.addActionListener(this);
	bob.addActionListener(this);
	bobo.addActionListener(this);
	jeff.pack();
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonClicked = (JButton) e.getSource();

	if (buttonClicked == button) {
		playSound("aaa.wav");
	}
	if (buttonClicked == bob) {
		playSound("ha.wav");
	}
	if (buttonClicked == bobo) {
		playSound("poop.wav");

	}
	
}
}
