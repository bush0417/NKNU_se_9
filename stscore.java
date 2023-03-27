package se;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class stscore {

	public static void stscore() {
		
		JFrame framestsc = new JFrame();
		framestsc.setLayout(null);
		framestsc.setTitle("分數");
		framestsc.setVisible(true);
		framestsc.setSize(400, 400);
		framestsc.setLocationRelativeTo(null);
		
		JTextArea stacc = new JTextArea(5, 20);
		stacc.setBounds(30, 50, 200, 30);
		
		JButton buttong = new JButton("查詢");
		buttong.setBounds(260, 50, 100, 30);
		buttong.setFont(new Font("微軟正黑體", Font.BOLD, 10));
		buttong.setForeground(new Color(0xF75000));
		buttong.setBackground(new Color(0xF0F0F0));
		buttong.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		buttong.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.stacc = stacc.getText();
				File file = new File("C:\\Users\\USER\\Desktop\\" + se.stacc + "sc.txt");
			if (file.isFile() && file.exists())
			{
				frstsc.frstsc("C:\\Users\\USER\\Desktop\\" + se.stacc + "sc.txt");
			}
			}
		});
		
		framestsc.add(stacc);
		framestsc.add(buttong);
		
	}

}
