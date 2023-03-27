package se;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class main {

	public static void main(String[] args) throws IOException {
		
		CreateAc.CreateAc();
		
		ImageIcon image = new ImageIcon("NKNU.png");
		JFrame frame = new JFrame();
		Border border = BorderFactory.createLineBorder(new Color(0xFFBD9D), 5); // 邊框
		JLabel label = new JLabel();

		JMenuBar menubar = new JMenuBar(); // 建立選單欄MenuBar
		JMenu menuFile = new JMenu("帳號管理");
		JMenu menuFile2 = new JMenu("測驗");
		JMenu menuFile3 = new JMenu("練習");
		JMenu menuFile4 = new JMenu("題庫管理");
		JMenuItem check = new JMenuItem("個人資料查看");
		JMenuItem alt = new JMenuItem("個人資料修改");
		JMenuItem exam = new JMenuItem("開始測驗");
		JMenuItem score = new JMenuItem("成績查詢");
		JMenuItem quiz = new JMenuItem("開始練習");
		JMenuItem prob = new JMenuItem("題庫查詢");
		JMenuItem edit = new JMenuItem("編輯題庫");
		JMenuItem stsc = new JMenuItem("查看學生成績");

		menuFile.add(check);
		menuFile.addSeparator();
		menuFile.add(alt);

		menuFile2.add(exam);
		menuFile2.addSeparator();
		menuFile2.add(score);
		menuFile2.addSeparator();
		menuFile2.add(stsc);

		menuFile3.add(quiz);
		menuFile3.addSeparator();
		menuFile3.add(prob);

		menuFile4.add(edit);

		menubar.add(menuFile);
		menubar.add(menuFile2);
		menubar.add(menuFile3);
		menubar.add(menuFile4);
		
		stsc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == stsc) {
					if(se.root == 2) {
					stscore.stscore();
					}
					else
					{
						Wrong.Wrong();
					}
				}
			}
		});

		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == check) {
					personalcheck.personalcheck();
				}
			}
		});

		alt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == alt) {
					personalalt.personalalt();
				}
			}
		});

		exam.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == exam) {
					Exam.Exam();
				}
			}
		});

		score.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == score) {
					Score.Score();
					readScore.readScore("C:\\Users\\USER\\Desktop\\" + se.acc + "sc.txt");
				}
			}
		});

		quiz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == quiz) {
					Quiz.Quiz();
				}
			}
		});

		prob.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == prob) {
					try {
						frAllText.frAllText();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});

		edit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == edit && se.root == 2) {
					Edit.Edit();
				} else if (e.getSource() == edit && se.root != 2) {
					Wrong.Wrong();
				}
			}
		});

		JRadioButton teacher = new JRadioButton("老師");
		JRadioButton student = new JRadioButton("學生");
		teacher.setBounds(210, 310, 100, 40);
		student.setBounds(310, 310, 100, 40);
		teacher.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		teacher.setForeground(new Color(0xF75000));
		teacher.setBackground(new Color(0xFFFFFF));
		teacher.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		student.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		student.setForeground(new Color(0xF75000));
		student.setBackground(new Color(0xFFFFFF));
		student.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(teacher);
		buttonGroup.add(student);

		se.buttonE.setText("簡單");
		se.buttonE.setFont(new Font("標楷體", Font.PLAIN, 20));
		se.buttonE.setForeground(new Color(0x272727));
		se.buttonE.setBackground(new Color(0xF0F0F0));
		se.buttonE.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 5));
		se.buttonE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.diff = 1;
				readQ.readQ("C:\\Users\\USER\\Desktop\\text.csv");
				se.frameff.dispose();
				textpaper.textpaper();
				Text.Text();
				
			}
		});

		se.buttonN.setText("中等");
		se.buttonN.setFont(new Font("標楷體", Font.PLAIN, 20));
		se.buttonN.setForeground(new Color(0x272727));
		se.buttonN.setBackground(new Color(0xF0F0F0));
		se.buttonN.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 5));
		se.buttonN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.diff = 2;
				readQ.readQ("C:\\Users\\USER\\Desktop\\text.csv");
				se.frameff.dispose();
				textpaper.textpaper();
				Text.Text();
			}
		});

		se.buttonH.setText("困難");
		se.buttonH.setFont(new Font("標楷體", Font.PLAIN, 20));
		se.buttonH.setForeground(new Color(0x272727));
		se.buttonH.setBackground(new Color(0xF0F0F0));
		se.buttonH.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 5));
		se.buttonH.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				se.diff = 3;
				readQ.readQ("C:\\Users\\USER\\Desktop\\text.csv");
				se.frameff.dispose();
				textpaper.textpaper();
				Text.Text();
			}
		});
		
		se.button3.setText("英文A");
		se.button3.setFont(new Font("標楷體", Font.PLAIN, 20));
		se.button3.setForeground(new Color(0x272727));
		se.button3.setBackground(new Color(0xF0F0F0));
		se.button3.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 5));
		se.button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(se.cl.equalsIgnoreCase("1"))
				{
				frD.frD();
				}
				else
				{
					Wrong.Wrong();
				}
			}
		});

		se.button4.setText("英文B");
		se.button4.setFont(new Font("標楷體", Font.PLAIN, 20));
		se.button4.setForeground(new Color(0x272727));
		se.button4.setBackground(new Color(0xF0F0F0));
		se.button4.setBorder(BorderFactory.createLineBorder(new Color(0xBEBEBE), 5));
		se.button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(se.cl.equalsIgnoreCase("2"))
				{
				frD.frD();
				}
				else
				{
					Wrong.Wrong();
				}
			}
		});

		JButton button = new JButton();
		button.setText("Login"); // 按鈕
		button.setBounds(250, 400, 100, 50); // (x,y,width,height)
		button.setFont(new Font("Arial Black", Font.PLAIN, 25));
		button.setForeground(new Color(0xF75000));
		button.setBackground(new Color(0xF0F0F0));
		button.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					frame.dispose();
					MyDialogDemo();
				}
			}

			private void MyDialogDemo() {
				// TODO Auto-generated method stub
				JFrame frame2 = new JFrame();
				frame2.setTitle("KYUTES");
				frame2.setVisible(true);
				frame2.setSize(600, 600);
				frame2.setLocationRelativeTo(null);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JLabel label2 = new JLabel("LOGIN");
				frame2.add(label2);
				label2.setForeground(new Color(0xF75000));
				label2.setFont(new Font("Arial Black", Font.PLAIN, 40));
				label2.setBackground(new Color(0xFFFFFF)); // 背景顏色
				label2.setOpaque(true);
				label2.setBorder(border);
				label2.setHorizontalAlignment(JLabel.CENTER); // 調整標籤位置
				label2.setVerticalAlignment(JLabel.NORTH);
				label2.add(teacher);
				label2.add(student);

				JLabel labelac = new JLabel("account");
				labelac.setBounds(110, 350, 100, 40);
				labelac.setFont(new Font("Arial Black", Font.PLAIN, 15));
				label2.add(labelac);

				JLabel labelps = new JLabel("password");
				labelps.setBounds(110, 400, 100, 40);
				labelps.setFont(new Font("Arial Black", Font.PLAIN, 15));
				label2.add(labelps);

				JPasswordField password = new JPasswordField();
				JPasswordField account = new JPasswordField();
				label2.add(password);
				label2.add(account);
				account.setBounds(200, 350, 200, 40);
				password.setBounds(200, 400, 200, 40);

				JButton button2 = new JButton("LOGIN");
				label2.add(button2);
				button2.setBounds(200, 450, 200, 50);
				button2.setFont(new Font("Arial Black", Font.PLAIN, 10));
				button2.setForeground(new Color(0xF75000));
				button2.setBackground(new Color(0xF0F0F0));
				button2.setBorder(BorderFactory.createLineBorder(new Color(0xFFBD9D), 5));
				button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (e.getSource() == button2) {
							se.acc = account.getText();
							se.pww = password.getText();
							if (student.isSelected()) {
								readpf.readpf("C:\\Users\\USER\\Desktop\\login.csv");
								if (se.key) {
									MyDialogDemo2();
									frame2.dispose();
								}
							}

							if (teacher.isSelected()) {
								readpf.readpf("C:\\Users\\USER\\Desktop\\\\login2.csv");
								if (se.key) {
									MyDialogDemo2();
									se.root = 2;
									frame2.dispose();
								}
							}

						}
					}

					public void MyDialogDemo2() {
						JFrame frame3 = new JFrame();
						frame3.setTitle("KYUTES");
						frame3.setVisible(true);
						frame3.setSize(600, 600);
						frame3.setLocationRelativeTo(null);
						frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame3.setJMenuBar(menubar);

						JLabel label3 = new JLabel("KYUTES");
						frame3.add(label3);
						label3.setForeground(new Color(0xF75000));
						label3.setFont(new Font("Arial Black", Font.PLAIN, 40));
						label3.setBackground(new Color(0xFFFFFF)); // 背景顏色
						label3.setOpaque(true);
						label3.setBorder(border);
						label3.setHorizontalAlignment(JLabel.CENTER); // 調整標籤位置
						label3.setVerticalAlignment(JLabel.NORTH);
					}
				});

			}
		});

		label.setText("KYUTES"); // 標籤
		label.setIcon(image); // ICON
		label.setHorizontalTextPosition(JLabel.RIGHT);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setForeground(new Color(0xF75000)); // 標籤顏色
		label.setFont(new Font("Arial Black", Font.PLAIN, 30)); // 標籤字體,字形,顏色
		label.setIconTextGap(20); // 間距
		label.setBackground(new Color(0xFFFFFF)); // 背景顏色
		label.setOpaque(true);
		label.setBorder(border);
		label.setHorizontalAlignment(JLabel.CENTER); // 調整標籤位置
		label.setVerticalAlignment(JLabel.CENTER);

		frame.setTitle("KYUTES");
		frame.setVisible(true);
		frame.setSize(600, 600); // 視窗大小
		frame.add(label); // 新增至視窗
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.add(button);

	}

}
