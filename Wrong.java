package se;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Wrong {

	public static void Wrong() {
		JFrame framed = new JFrame();
		framed.setTitle("���~");
		framed.setVisible(true);
		framed.setSize(300, 300);
		framed.setLocationRelativeTo(null);

		JLabel labelw = new JLabel("wrong");
		framed.add(labelw);
		labelw.setForeground(new Color(0xFF0000));
		labelw.setFont(new Font("Arial Black", Font.PLAIN, 20));
		labelw.setBackground(new Color(0xFFFFFF)); // �I���C��
		labelw.setOpaque(true);
		labelw.setHorizontalAlignment(JLabel.CENTER); // �վ���Ҧ�m
		labelw.setVerticalAlignment(JLabel.CENTER);

	}

}
