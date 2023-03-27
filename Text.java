package se;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Text {

	public static void Text() {

		se.frame4.setLayout(null);
		se.frame4.setTitle("題目");
		se.frame4.setVisible(true);
		se.frame4.setSize(1500, 2000);
		se.frame4.setLocationRelativeTo(null);

		textpaper.labelt1.setBounds(0, 0, 1500, 50);
		textpaper.labelt2.setBounds(0, 60, 1500, 50);
		textpaper.labelt3.setBounds(0, 110, 1500, 50);
		textpaper.labelt4.setBounds(0, 160, 1500, 50);
		textpaper.labelt5.setBounds(0, 210, 1500, 50);
		textpaper.labelt6.setBounds(0, 260, 1500, 50);
		textpaper.labelt7.setBounds(0, 310, 1500, 50);
		textpaper.labelt8.setBounds(0, 360, 1500, 50);
		textpaper.labelt9.setBounds(0, 410, 1500, 50);
		textpaper.labelt10.setBounds(0, 460, 1500, 50);
		
		se.frame4.add(textpaper.labelt1);
		se.frame4.add(textpaper.labelt2);
		se.frame4.add(textpaper.labelt3);
		se.frame4.add(textpaper.labelt4);
		se.frame4.add(textpaper.labelt5);
		se.frame4.add(textpaper.labelt6);
		se.frame4.add(textpaper.labelt7);
		se.frame4.add(textpaper.labelt8);
		se.frame4.add(textpaper.labelt9);
		se.frame4.add(textpaper.labelt10);

		se.ans.setBounds(500, 700, 500, 100);
		se.frame4.add(se.ans);

		JButton buttonans = new JButton("繳交");
		buttonans.setFont(new Font("標楷體", Font.PLAIN, 20));
		buttonans.setForeground(new Color(0x272727));
		buttonans.setBackground(new Color(0xF0F0F0));
		buttonans.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 2));
		buttonans.setBounds(600, 820, 300, 50);
		buttonans.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				checkans.checkans();
				se.frame4.dispose();
			}
		});
		
		se.	frame4.add(buttonans);

		if (se.examm == true) {
			timer.timer();
		}

	}

}
