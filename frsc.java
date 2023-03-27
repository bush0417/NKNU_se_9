package se;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class frsc {

	public static void frsc() {
		JFrame framess = new JFrame();
		framess.setLayout(new FlowLayout());
		framess.setTitle("分數");
		framess.setVisible(true);
		framess.setSize(200, 200);
		framess.setLocationRelativeTo(null);

		se.s = Integer.toString(se.scc);
		se.jLabesc2.setText("分數: " + se.s);
		framess.add(se.jLabesc2);
		
		writeScore.writeScore("C:\\Users\\USER\\Desktop\\" + se.acc + "sc.txt", se.s);

	}

}
