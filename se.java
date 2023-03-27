package se;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.border.Border;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class se  {

	static int num;
	static String pww; // 判斷密碼
	static String acc; // 判斷帳號
	static String stacc;
	static String anss;
	static String ansu;
	static String s;
	static String textd;
	static String textans;
	static String sscc;
	static String cl = "1";
	static String[] answers = new String[10];
	static String[] pw = new String[3];
	static String textPath; // 題目位置
	static String textword; // 新增題目的文字
	static String userac = "410xxx0xx"; // 使用者帳號
	static String userpw = "xxxxxxxxx"; // 使用者密碼
	
	static String[] quiz = new String[11]; // 考卷
	
	static JButton button4 = new JButton(); // 數學按鈕
	static JButton button3 = new JButton(); // 英文按鈕
	static JButton buttonE = new JButton();
	static JButton buttonN = new JButton();
	static JButton buttonH = new JButton();

	static JLabel jLabesc2 = new JLabel();
	static JLabel labelcc = new JLabel();
	static JLabel labeltext = new JLabel();

	static JTextArea jta = new JTextArea(10, 15); // 題目輸入欄
	static JTextArea jtac = new JTextArea(10, 15);
	static JTextArea jtpw = new JTextArea(10, 15);
	static JTextArea ans = new JTextArea(10, 15);
	static JFrame frameff = new JFrame();
	static JFrame frame4 = new JFrame();
	static JFrame jframetime = new JFrame();
	static int root = 1; // 1 學生 2 老師 3 系統管理者 // 權限
	static int diff;
	static int scc = 100;
	static boolean examm = false; // 判斷是否為測驗
	static boolean key = false;
	static boolean alt = false;

	public static void main(String[] args) throws Exception {
	}
}
