package se;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Edit {
	static int t = 0;

	public static void Edit() {
		JFrame framed = new JFrame();
		framed.setLayout(null);
		framed.setTitle("編輯題庫");
		framed.setVisible(true);
		framed.setSize(900, 600);
		framed.setLocationRelativeTo(null);

		JButton buttont = new JButton("新增");
		buttont.setBounds(350, 200, 200, 50);
		buttont.setFont(new Font("標楷體", Font.BOLD, 20));
		buttont.setForeground(new Color(0x272727));
		buttont.setBackground(new Color(0xE0E0E0));
		buttont.setBorder(BorderFactory.createLineBorder(new Color(0x9D9D9D), 5));

		JRadioButton math = new JRadioButton("英文A");
		JRadioButton en = new JRadioButton("英文B");
		math.setBounds(300, 50, 100, 40);
		en.setBounds(500, 50, 100, 40);
		math.setFont(new Font("標楷體", Font.BOLD, 20));
		math.setForeground(new Color(0x272727));
		math.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		en.setFont(new Font("標楷體", Font.BOLD, 20));
		en.setForeground(new Color(0x272727));
		en.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(math);
		buttonGroup.add(en);
		
		JTextArea jta2 = new JTextArea(10, 15);
		JTextArea jta3 = new JTextArea(10, 15);

		se.jta.setBounds(50, 300, 250, 200);
		framed.add(se.jta);
		jta2.setBounds(320, 300, 250, 200);
		framed.add(jta2);
		jta3.setBounds(590, 300, 250, 200);
		framed.add(jta3);

		framed.add(math);
		framed.add(en);
		framed.add(buttont);
		buttont.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					se.textword = se.jta.getText();
					se.textans = jta2.getText();
					se.textd = jta3.getText();
					if (math.isSelected()) {
						try {
							writetext.writetext("C:\\Users\\USER\\Desktop\\text.csv");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (en.isSelected()) {
						try {
							writetext.writetext("C:\\Users\\USER\\Desktop\\text.csv");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
			}
		});
	}

}
