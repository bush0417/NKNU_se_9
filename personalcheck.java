package se;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class personalcheck {

	public static void personalcheck() {
		JFrame framech = new JFrame();
		framech.setLayout(null);
		framech.setTitle("�ӤH��Ƭd��");
		framech.setVisible(true);
		framech.setSize(600, 400);
		framech.setLocationRelativeTo(null);

		JLabel labelac = new JLabel();
		JLabel labelpw = new JLabel();
		JLabel labelcl = new JLabel();
		labelac.setBounds(20, 70, 200, 30);
		labelpw.setBounds(20, 110, 200, 30);
		labelac.setFont(new Font("�L�n������", Font.BOLD, 15));
		labelpw.setFont(new Font("�L�n������", Font.BOLD, 15));
		labelcl.setBounds(20, 150, 200, 30);
		labelcl.setFont(new Font("�L�n������", Font.BOLD, 15));

		if (se.cl.equalsIgnoreCase("1")) {
			labelcl.setText("class A");
		}
		else if (se.cl.equalsIgnoreCase("2")) {
			labelcl.setText("class B");
		}
		labelac.setText("�Ǹ�" + " " + se.userac);
		labelpw.setText("�K�X" + " " + se.userpw);

		framech.add(labelac);
		framech.add(labelpw);
		framech.add(labelcl);
	}

}
