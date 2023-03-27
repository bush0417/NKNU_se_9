package se;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class personalcheck {

	public static void personalcheck() {
		JFrame framech = new JFrame();
		framech.setLayout(null);
		framech.setTitle("個人資料查看");
		framech.setVisible(true);
		framech.setSize(600, 400);
		framech.setLocationRelativeTo(null);

		JLabel labelac = new JLabel();
		JLabel labelpw = new JLabel();
		JLabel labelcl = new JLabel();
		labelac.setBounds(20, 70, 200, 30);
		labelpw.setBounds(20, 110, 200, 30);
		labelac.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		labelpw.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		labelcl.setBounds(20, 150, 200, 30);
		labelcl.setFont(new Font("微軟正黑體", Font.BOLD, 15));

		if (se.cl.equalsIgnoreCase("1")) {
			labelcl.setText("class A");
		}
		else if (se.cl.equalsIgnoreCase("2")) {
			labelcl.setText("class B");
		}
		labelac.setText("學號" + " " + se.userac);
		labelpw.setText("密碼" + " " + se.userpw);

		framech.add(labelac);
		framech.add(labelpw);
		framech.add(labelcl);
	}

}
