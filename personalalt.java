package se;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class personalalt {

	public static void personalalt() {
		JFrame framealt = new JFrame();
		framealt.setLayout(null);
		framealt.setTitle("個人資料修改");
		framealt.setVisible(true);
		framealt.setSize(800, 600);
		framealt.setLocationRelativeTo(null);

		JLabel labelac = new JLabel();
		JLabel labelpw = new JLabel();
		JLabel labelcl = new JLabel();
		labelac.setBounds(20, 70, 200, 30);
		labelpw.setBounds(20, 110, 200, 30);
		labelac.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		labelpw.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		labelcl.setBounds(20, 150, 200, 30);
		labelcl.setFont(new Font("微軟正黑體", Font.BOLD, 15));

		labelac.setText("學號" + " " + se.userac);
		labelpw.setText("密碼" + " " + se.userpw);
		
		if(se.cl.equalsIgnoreCase("1")) {
			labelcl.setText("class A");
		}
		else if(se.cl.equalsIgnoreCase("2")) {
			labelcl.setText("class B");
		}
		framealt.add(labelac);
		framealt.add(labelpw);
		framealt.add(labelcl);

		JButton buttonpwlt = new JButton("更改");

		buttonpwlt.setFont(new Font("標楷體", Font.PLAIN, 20));
		buttonpwlt.setForeground(new Color(0x272727));
		buttonpwlt.setBackground(new Color(0xF0F0F0));
		buttonpwlt.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 2));
		framealt.add(buttonpwlt);
		buttonpwlt.setBounds(450, 110, 50, 30);
		buttonpwlt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				alt2.alt2();

			}
		});

		se.jtpw.setBounds(230, 110, 200, 30);
		framealt.add(se.jtpw);
	}

}
