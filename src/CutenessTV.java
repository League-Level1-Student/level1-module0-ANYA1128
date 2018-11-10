import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton heh = new JButton("UNICORNS");
	JButton wow = new JButton("DUCKIES");
	JButton wowza = new JButton("POOPIES");
	public static void main(String[] args) {
	CutenessTV fc = new CutenessTV();
	fc.showButton();
	
	
}
private void showButton() {
    JFrame jeff = new JFrame();
    JPanel pan = new JPanel();
	jeff.setVisible(true);
	
	pan.add(heh);
	pan.add(wow);
	pan.add(wowza);
	jeff.add(pan);
	heh.addActionListener(this);
	wow.addActionListener(this);
	wowza.addActionListener(this);
	jeff.pack();

	
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showPoopies() {
    playVideo("https://www.youtube.com/watch?v=amtuB-2wGeQ");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonClicked = (JButton) e.getSource(); 
	// TODO Auto-generated method stub
	if (buttonClicked == heh) {
		showFluffyUnicorns();
	}
	if (buttonClicked == wow) {
		showDucks();
	}
	if (buttonClicked == wowza) {
		showPoopies();

	}
}
}
