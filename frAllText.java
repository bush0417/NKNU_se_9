package se;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frAllText {

	public static void frAllText() throws IOException {

		ReadAllText.ReadAllText();
		JFrame frameall = new JFrame();
		frameall.setLayout(null);
		frameall.setTitle("題目");
		frameall.setVisible(true);
		frameall.setSize(200, 200);
		frameall.setLocationRelativeTo(null);
		
		JButton buttonall = new JButton();
		buttonall.setText("確認"); // 按鈕
		buttonall.setBounds(35, 110, 120, 50); // (x,y,width,height)
		buttonall.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		buttonall.setForeground(new Color(0xF75000));
		buttonall.setBackground(new Color(0xF0F0F0));
		buttonall.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		buttonall.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameall.dispose();
			}
		});
		
		se.labeltext.setText("下載題庫成功");
		se.labeltext.setBounds(35, 30, 120, 50);
		se.labeltext.setHorizontalTextPosition(JLabel.RIGHT);
		se.labeltext.setVerticalTextPosition(JLabel.CENTER);
		se.labeltext.setForeground(new Color(0xF75000)); // 標籤顏色
		se.labeltext.setFont(new Font("微軟正黑體", Font.BOLD, 15)); // 標籤字體,字形,顏色
		se.labeltext.setIconTextGap(20); // 間距
		se.labeltext.setBackground(new Color(0xFFFFFF)); // 背景顏色
		se.labeltext.setHorizontalAlignment(JLabel.CENTER); // 調整標籤位置
		se.labeltext.setVerticalAlignment(JLabel.CENTER);

		frameall.add(se.labeltext);
		frameall.add(buttonall);
	}

}
