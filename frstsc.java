package se;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frstsc {

	public static void frstsc(String filepath) {
		JFrame framest = new JFrame();
		framest.setLayout(new FlowLayout());
		framest.setTitle("����");
		framest.setVisible(true);
		framest.setSize(400, 400);
		framest.setLocationRelativeTo(null);
		
		JLabel sc = new JLabel();
		framest.add(sc);
		
		final String delimiter = ",";
		try {
			File file = new File(filepath);
			if (file.isFile() && file.exists()) { // �P�_�ɮ׬O�_�s�b
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// �Ҽ{��s�X�榡
				BufferedReader br = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					sc.setText(se.stacc + " score : " + lineTxt );
				}
			}
		} catch (Exception e) {
			System.out.println("Ū���ɮפ��e�X��");
			e.printStackTrace();
		}
		
	}

}
