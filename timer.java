package se;

import java.awt.FlowLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class timer {

	public static void timer() {
		JLabel jLabelt = new JLabel();
		se.jframetime.setLayout(new FlowLayout());
		se.jframetime.setTitle("®É¶¡");
		se.jframetime.setSize(400, 100);
		se.jframetime.add(jLabelt);
		se.jframetime.setVisible(true);
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			int i = 600;

			public void run() {
				jLabelt.setText("Time left: " + i);
				i--;
				if (i < 0) {
					timer.cancel();
					jLabelt.setText("Time Over");
				}
			}
		}, 0, 1000);
	}

}
