package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Nongsan;
import Model.Phuongan;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import Controler.Execute;

import javax.swing.event.ChangeEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Giaodien extends JFrame {

	private JPanel contentPane;
	private JTextField textThang;
	private JTextField textVon;
	private JTextField textDientich;
	public double von;
	public double dientich;
	public int thang;
	public double k1;
	public double k2;
	public double k3;
	public double k4;
	public double k5;
	public double k6;
	public double k7;
	public double k8;
	public double k9;
	public double k10;
	public double k11;
	public double k12;
	public Phuongan dapso;
	public Vector<Nongsan> danhsach=new Vector<Nongsan>();
	public Vector<Phuongan> ketqua;
	public Execute ex=new Execute();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giaodien frame = new Giaodien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Giaodien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1323, 733);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonth = new JLabel("Th\u00E1ng");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblMonth.setBounds(12, 13, 121, 49);
		contentPane.add(lblMonth);
		
		textThang = new JTextField();
		textThang.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textThang.setText("1");
		textThang.setBounds(134, 13, 66, 49);
		contentPane.add(textThang);
		textThang.setColumns(10);
		
		JLabel lblVn = new JLabel("V\u1ED1n");
		lblVn.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblVn.setBounds(239, 13, 88, 49);
		contentPane.add(lblVn);
		
		textVon = new JTextField();
		textVon.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textVon.setBounds(320, 13, 225, 49);
		contentPane.add(textVon);
		textVon.setColumns(10);
		
		JLabel lblNghnvn = new JLabel("ngh\u00ECnVN\u0110");
		lblNghnvn.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNghnvn.setBounds(557, 13, 176, 49);
		contentPane.add(lblNghnvn);
		
		JLabel lblDinTch = new JLabel("Di\u1EC7n t\u00EDch");
		lblDinTch.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDinTch.setBounds(790, 13, 169, 49);
		contentPane.add(lblDinTch);
		
		textDientich = new JTextField();
		textDientich.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textDientich.setBounds(958, 13, 234, 49);
		contentPane.add(textDientich);
		textDientich.setColumns(10);
		
		JLabel lblM = new JLabel("m2");
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblM.setBounds(1200, 13, 81, 49);
		contentPane.add(lblM);
		
		JLabel lblHyChnLoi = new JLabel("H\u00E3y ch\u1ECDn lo\u1EA1i c\u00E2y tr\u1ED3ng b\u1EA1n mu\u1ED1n tr\u1ED3ng v\u00E0o m\u1EE5c kinh ngi\u1EC7m t\u01B0\u01A1ng \u1EE9ng");
		lblHyChnLoi.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblHyChnLoi.setBounds(22, 85, 1224, 49);
		contentPane.add(lblHyChnLoi);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 2));
		panel.setBounds(32, 147, 399, 326);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblGiuKinhNghim = new JLabel("Gi\u00E0u kinh nghi\u1EC7m");
		lblGiuKinhNghim.setBounds(113, 13, 155, 25);
		lblGiuKinhNghim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblGiuKinhNghim);
		
		JRadioButton btnNongsan1Giau = new JRadioButton("Ngô");
		btnNongsan1Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan1Giau.setBounds(25, 53, 138, 25);
		panel.add(btnNongsan1Giau);
		
		JRadioButton btnNongsan2Giau = new JRadioButton("Khoai lang");
		btnNongsan2Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan2Giau.setBounds(25, 96, 138, 25);
		panel.add(btnNongsan2Giau);
		
		JRadioButton btnNongsan3Giau = new JRadioButton("Sắn");
		btnNongsan3Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan3Giau.setBounds(25, 136, 138, 25);
		panel.add(btnNongsan3Giau);
		
		JRadioButton btnNongsan4Giau = new JRadioButton("Xoài");
		btnNongsan4Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan4Giau.setBounds(25, 180, 138, 25);
		panel.add(btnNongsan4Giau);
		
		JRadioButton btnNongsan5Giau = new JRadioButton("Nhãn");
		btnNongsan5Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan5Giau.setBounds(25, 222, 138, 25);
		panel.add(btnNongsan5Giau);
		
		JRadioButton btnNongsan6Giau = new JRadioButton("Vải");
		btnNongsan6Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan6Giau.setBounds(25, 261, 138, 25);
		panel.add(btnNongsan6Giau);
		
		JRadioButton btnNongsan7Giau = new JRadioButton("Lạc");
		btnNongsan7Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan7Giau.setBounds(238, 53, 138, 25);
		panel.add(btnNongsan7Giau);
		
		JRadioButton btnNongsan8Giau = new JRadioButton("Khoai tây");
		btnNongsan8Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan8Giau.setBounds(238, 96, 138, 25);
		panel.add(btnNongsan8Giau);
		
		JRadioButton btnNongsan9Giau = new JRadioButton("Cà chua");
		btnNongsan9Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan9Giau.setBounds(238, 136, 138, 25);
		panel.add(btnNongsan9Giau);
		
		JRadioButton btnNongsan10Giau = new JRadioButton("Thanh long");
		btnNongsan10Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan10Giau.setBounds(238, 180, 153, 25);
		panel.add(btnNongsan10Giau);
		
		JRadioButton btnNongsan11Giau = new JRadioButton("Cam");
		btnNongsan11Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan11Giau.setBounds(238, 222, 153, 25);
		panel.add(btnNongsan11Giau);
		
		JRadioButton btnNongsan12Giau = new JRadioButton("Quýt");
		btnNongsan12Giau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan12Giau.setBounds(238, 261, 153, 25);
		panel.add(btnNongsan12Giau);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 2, 0, 2));
		panel_1.setBounds(443, 147, 407, 326);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbltKinhNghim = new JLabel("\u00CDt kinh nghi\u1EC7m");
		lbltKinhNghim.setBounds(86, 12, 129, 25);
		lbltKinhNghim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lbltKinhNghim);
		
		JRadioButton btnNongsan1It = new JRadioButton("Ngô");
		btnNongsan1It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan1It.setBounds(8, 46, 138, 25);
		panel_1.add(btnNongsan1It);
		
		JRadioButton btnNongsan2It = new JRadioButton("Khoai lang");
		btnNongsan2It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan2It.setBounds(8, 88, 138, 25);
		panel_1.add(btnNongsan2It);
		
		JRadioButton btnNongsan3It = new JRadioButton("Sắn");
		btnNongsan3It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan3It.setBounds(8, 129, 138, 25);
		panel_1.add(btnNongsan3It);
		
		JRadioButton btnNongsan4It = new JRadioButton("Xoài");
		btnNongsan4It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan4It.setBounds(8, 172, 138, 25);
		panel_1.add(btnNongsan4It);
		
		JRadioButton btnNongsan5It = new JRadioButton("Nhãn");
		btnNongsan5It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan5It.setBounds(8, 212, 138, 25);
		panel_1.add(btnNongsan5It);
		
		JRadioButton btnNongsan6It = new JRadioButton("Vải");
		btnNongsan6It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan6It.setBounds(8, 253, 138, 25);
		panel_1.add(btnNongsan6It);
		
		JRadioButton btnNongsan7It = new JRadioButton("Lạc");
		btnNongsan7It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan7It.setBounds(213, 46, 161, 25);
		panel_1.add(btnNongsan7It);
		
		JRadioButton btnNongsan8It = new JRadioButton("Khoai tây");
		btnNongsan8It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan8It.setBounds(213, 88, 161, 25);
		panel_1.add(btnNongsan8It);
		
		JRadioButton btnNongsan9It = new JRadioButton("Cà chua");
		btnNongsan9It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan9It.setBounds(213, 129, 161, 25);
		panel_1.add(btnNongsan9It);
		
		JRadioButton btnNongsan10It = new JRadioButton("Thanh long");
		btnNongsan10It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan10It.setBounds(213, 172, 161, 25);
		panel_1.add(btnNongsan10It);
		
		JRadioButton btnNongsan11It = new JRadioButton("Cam");
		btnNongsan11It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan11It.setBounds(213, 212, 161, 25);
		panel_1.add(btnNongsan11It);
		
		JRadioButton btnNongsan12It = new JRadioButton("Quýt");
		btnNongsan12It.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan12It.setBounds(213, 253, 161, 25);
		panel_1.add(btnNongsan12It);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 2, 0, 0));
		panel_2.setBounds(862, 147, 407, 326);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblKhngCKinh = new JLabel("Kh\u00F4ng c\u00F3 kinh nghi\u1EC7m");
		lblKhngCKinh.setBounds(76, 5, 197, 25);
		lblKhngCKinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblKhngCKinh);
		
		JRadioButton btnNongsan1Khong = new JRadioButton("Ngô");
		btnNongsan1Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan1Khong.setBounds(8, 39, 142, 25);
		panel_2.add(btnNongsan1Khong);
		
		JRadioButton btnNongsan2Khong = new JRadioButton("Khoai lang");
		btnNongsan2Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan2Khong.setBounds(8, 84, 142, 25);
		panel_2.add(btnNongsan2Khong);
		
		JRadioButton btnNongsan3Khong = new JRadioButton("Sắn");
		btnNongsan3Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan3Khong.setBounds(8, 134, 142, 25);
		panel_2.add(btnNongsan3Khong);
		
		JRadioButton btnNongsan4Khong = new JRadioButton("Xoài");
		btnNongsan4Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan4Khong.setBounds(8, 175, 142, 25);
		panel_2.add(btnNongsan4Khong);
		
		JRadioButton btnNongsan5Khong = new JRadioButton("Nhãn");
		btnNongsan5Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan5Khong.setBounds(8, 216, 142, 25);
		panel_2.add(btnNongsan5Khong);
		
		JRadioButton btnNongsan6Khong = new JRadioButton("Vải");
		btnNongsan6Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan6Khong.setBounds(8, 259, 142, 25);
		panel_2.add(btnNongsan6Khong);
		
		JRadioButton btnNongsan7Khong = new JRadioButton("Lạc");
		btnNongsan7Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan7Khong.setBounds(204, 39, 158, 25);
		panel_2.add(btnNongsan7Khong);
		
		JRadioButton btnNongsan8Khong = new JRadioButton("Khoai tây");
		btnNongsan8Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan8Khong.setBounds(204, 84, 158, 25);
		panel_2.add(btnNongsan8Khong);
		
		JRadioButton btnNongsan9Khong = new JRadioButton("Cà chua");
		btnNongsan9Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan9Khong.setBounds(204, 134, 158, 25);
		panel_2.add(btnNongsan9Khong);
		
		JRadioButton btnNongsan10Khong = new JRadioButton("Thanh long");
		btnNongsan10Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan10Khong.setBounds(204, 175, 158, 25);
		panel_2.add(btnNongsan10Khong);
		
		JRadioButton btnNongsan11Khong = new JRadioButton("Cam");
		btnNongsan11Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan11Khong.setBounds(204, 216, 158, 25);
		panel_2.add(btnNongsan11Khong);
		
		JRadioButton btnNongsan12Khong = new JRadioButton("Quýt");
		btnNongsan12Khong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNongsan12Khong.setBounds(204, 259, 158, 25);
		panel_2.add(btnNongsan12Khong);
		
/*		btnNongsan1Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan1It.setSelected(false);
				btnNongsan1Khong.setSelected(false);
			}
		});
		btnNongsan1It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan1Giau.setSelected(false);
				btnNongsan1Khong.setSelected(false);
			}
		});
		btnNongsan1Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan1It.setSelected(false);
				btnNongsan1Giau.setSelected(false);
			}
		});
		btnNongsan2Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan2It.setSelected(false);
				btnNongsan2Khong.setSelected(false);
			}
		});
		btnNongsan2It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan2Giau.setSelected(false);
				btnNongsan2Khong.setSelected(false);
			}
		});
		btnNongsan2Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan2It.setSelected(false);
				btnNongsan2Giau.setSelected(false);
			}
		});
		btnNongsan3Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan3It.setSelected(false);
				btnNongsan3Khong.setSelected(false);
			}
		});
		btnNongsan3It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan3Giau.setSelected(false);
				btnNongsan3Khong.setSelected(false);
			}
		});
		btnNongsan3Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan3It.setSelected(false);
				btnNongsan3Giau.setSelected(false);
			}
		});
		btnNongsan4Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan4It.setSelected(false);
				btnNongsan4Khong.setSelected(false);
			}
		});
		btnNongsan4It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan4Giau.setSelected(false);
				btnNongsan4Khong.setSelected(false);
			}
		});
		btnNongsan4Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan4It.setSelected(false);
				btnNongsan4Giau.setSelected(false);
			}
		});
		btnNongsan5Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan5It.setSelected(false);
				btnNongsan5Khong.setSelected(false);
			}
		});
		btnNongsan5It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan5Giau.setSelected(false);
				btnNongsan5Khong.setSelected(false);
			}
		});
		btnNongsan5Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan5It.setSelected(false);
				btnNongsan5Giau.setSelected(false);
			}
		});
		btnNongsan6Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan6It.setSelected(false);
				btnNongsan6Khong.setSelected(false);
			}
		});
		btnNongsan6It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan6Giau.setSelected(false);
				btnNongsan6Khong.setSelected(false);
			}
		});
		btnNongsan6Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan6It.setSelected(false);
				btnNongsan6Giau.setSelected(false);
			}
		});
		btnNongsan7Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan7It.setSelected(false);
				btnNongsan7Khong.setSelected(false);
			}
		});
		btnNongsan7It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan7Giau.setSelected(false);
				btnNongsan7Khong.setSelected(false);
			}
		});
		btnNongsan7Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan7It.setSelected(false);
				btnNongsan7Giau.setSelected(false);
			}
		});
		btnNongsan8Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan8It.setSelected(false);
				btnNongsan8Khong.setSelected(false);
			}
		});
		btnNongsan8It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan8Giau.setSelected(false);
				btnNongsan8Khong.setSelected(false);
			}
		});
		btnNongsan8Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan8It.setSelected(false);
				btnNongsan8Giau.setSelected(false);
			}
		});
		btnNongsan9Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan9It.setSelected(false);
				btnNongsan9Khong.setSelected(false);
			}
		});
		btnNongsan9It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan9Giau.setSelected(false);
				btnNongsan9Khong.setSelected(false);
			}
		});
		btnNongsan9Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan9It.setSelected(false);
				btnNongsan9Giau.setSelected(false);
			}
		});
		btnNongsan10Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan10It.setSelected(false);
				btnNongsan10Khong.setSelected(false);
			}
		});
		btnNongsan10It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan10Giau.setSelected(false);
				btnNongsan10Khong.setSelected(false);
			}
		});
		btnNongsan10Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan10It.setSelected(false);
				btnNongsan10Giau.setSelected(false);
			}
		});
		btnNongsan11Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan11It.setSelected(false);
				btnNongsan11Khong.setSelected(false);
			}
		});
		btnNongsan11It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan11Giau.setSelected(false);
				btnNongsan11Khong.setSelected(false);
			}
		});
		btnNongsan11Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan11It.setSelected(false);
				btnNongsan11Giau.setSelected(false);
			}
		});
		btnNongsan12Giau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan12It.setSelected(false);
				btnNongsan12Khong.setSelected(false);
			}
		});
		btnNongsan12It.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan12Giau.setSelected(false);
				btnNongsan12Khong.setSelected(false);
			}
		});
		btnNongsan12Khong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNongsan12It.setSelected(false);
				btnNongsan12Giau.setSelected(false);
			}
		});*/
		ButtonGroup btnGroupNongsan1=new ButtonGroup();
		btnGroupNongsan1.add(btnNongsan1Giau);
		btnGroupNongsan1.add(btnNongsan1It);
		btnGroupNongsan1.add(btnNongsan1Khong);
		
		ButtonGroup btnGroupNongsan2=new ButtonGroup();
		btnGroupNongsan2.add(btnNongsan2Giau);
		btnGroupNongsan2.add(btnNongsan2It);
		btnGroupNongsan2.add(btnNongsan2Khong);
		
		ButtonGroup btnGroupNongsan3=new ButtonGroup();
		btnGroupNongsan3.add(btnNongsan3Giau);
		btnGroupNongsan3.add(btnNongsan3It);
		btnGroupNongsan3.add(btnNongsan3Khong);
		
		ButtonGroup btnGroupNongsan4=new ButtonGroup();
		btnGroupNongsan4.add(btnNongsan4Giau);
		btnGroupNongsan4.add(btnNongsan4It);
		btnGroupNongsan4.add(btnNongsan4Khong);
		
		ButtonGroup btnGroupNongsan5=new ButtonGroup();
		btnGroupNongsan5.add(btnNongsan5Giau);
		btnGroupNongsan5.add(btnNongsan5It);
		btnGroupNongsan5.add(btnNongsan5Khong);
		
		ButtonGroup btnGroupNongsan6=new ButtonGroup();
		btnGroupNongsan6.add(btnNongsan6Giau);
		btnGroupNongsan6.add(btnNongsan6It);
		btnGroupNongsan6.add(btnNongsan6Khong);
		
		ButtonGroup btnGroupNongsan7=new ButtonGroup();
		btnGroupNongsan7.add(btnNongsan7Giau);
		btnGroupNongsan7.add(btnNongsan7It);
		btnGroupNongsan7.add(btnNongsan7Khong);
		
		ButtonGroup btnGroupNongsan8=new ButtonGroup();
		btnGroupNongsan8.add(btnNongsan8Giau);
		btnGroupNongsan8.add(btnNongsan8It);
		btnGroupNongsan8.add(btnNongsan8Khong);
		
		ButtonGroup btnGroupNongsan9=new ButtonGroup();
		btnGroupNongsan9.add(btnNongsan9Giau);
		btnGroupNongsan9.add(btnNongsan9It);
		btnGroupNongsan9.add(btnNongsan9Khong);
		
		ButtonGroup btnGroupNongsan10=new ButtonGroup();
		btnGroupNongsan10.add(btnNongsan10Giau);
		btnGroupNongsan10.add(btnNongsan10It);
		btnGroupNongsan10.add(btnNongsan10Khong);
		
		ButtonGroup btnGroupNongsan11=new ButtonGroup();
		btnGroupNongsan11.add(btnNongsan11Giau);
		btnGroupNongsan11.add(btnNongsan11It);
		btnGroupNongsan11.add(btnNongsan11Khong);
		
		ButtonGroup btnGroupNongsan12=new ButtonGroup();
		btnGroupNongsan12.add(btnNongsan12Giau);
		btnGroupNongsan12.add(btnNongsan12It);
		btnGroupNongsan12.add(btnNongsan12Khong);
		
		JTextArea textKetqua = new JTextArea();
		textKetqua.setEditable(false);
		textKetqua.setForeground(Color.BLACK);
		textKetqua.setFont(new Font("Monospaced", Font.PLAIN, 30));
		textKetqua.setRows(3);
		textKetqua.setBounds(32, 510, 1237, 163);
	//	contentPane.add(textKetqua);
		
		JButton btnGo = new JButton("Go");
		btnGo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textKetqua.setText("");
				try {
					thang=Integer.parseInt(textThang.getText());
					von=Double.parseDouble(textVon.getText())*1000;
					dientich=Double.parseDouble(textDientich.getText());
				}catch(Exception e) {
					textKetqua.setText("lỗi nhập liệu");
					return;
				}
				try {
					int i=0;
					if(btnNongsan1Giau.isSelected()) {
						k1=0.9;
						danhsach=ex.taoDanhSach("1", danhsach, k1, 1, thang);
						i++;
					}
					if(btnNongsan1It.isSelected()) {
						k1=0.7;
						danhsach=ex.taoDanhSach("1", danhsach, k1, 1, thang);
						i++;
					}
					if(btnNongsan1Khong.isSelected()) {
						k1=0.5;
						danhsach=ex.taoDanhSach("1", danhsach, k1, 1, thang);
						i++;
					}	
					if(btnNongsan2Giau.isSelected()) {
						k2=0.9;
						danhsach=ex.taoDanhSach("2", danhsach, k2, 1, thang);
						i++;
					}
					if(btnNongsan2It.isSelected()) {
						k2=0.7;
						danhsach=ex.taoDanhSach("2", danhsach, k2, 1, thang);
						i++;
					}
					if(btnNongsan2Khong.isSelected()) {
						k2=0.5;
						danhsach=ex.taoDanhSach("2", danhsach, k2, 1, thang);
						i++;
					}
					if(btnNongsan3Giau.isSelected()) {
						k3=0.9;
						danhsach=ex.taoDanhSach("3", danhsach, k3, 1, thang);
						i++;
					}
					if(btnNongsan3It.isSelected()) {
						k3=0.7;
						danhsach=ex.taoDanhSach("3", danhsach, k3, 1, thang);
						i++;
					}
					if(btnNongsan3Khong.isSelected()) {
						k3=0.5;
						danhsach=ex.taoDanhSach("3", danhsach, k3, 1, thang);
						i++;
					}
					if(btnNongsan4Giau.isSelected()) {
						k4=0.9;
						danhsach=ex.taoDanhSach("4", danhsach, k4, 1, thang);
						i++;
					}
					if(btnNongsan4It.isSelected()) {
						k4=0.7;
						danhsach=ex.taoDanhSach("4", danhsach, k4, 1, thang);
						i++;
					}
					if(btnNongsan4Khong.isSelected()) {
						k4=0.5;
						danhsach=ex.taoDanhSach("4", danhsach, k4, 1, thang);
						i++;
					}
					if(btnNongsan5Giau.isSelected()) {
						k5=0.9;
						danhsach=ex.taoDanhSach("5", danhsach, k5, 1, thang);
						i++;
					}
					if(btnNongsan5It.isSelected()) {
						k5=0.7;
						danhsach=ex.taoDanhSach("5", danhsach, k5, 1, thang);
						i++;
					}
					if(btnNongsan5Khong.isSelected()) {
						k5=0.5;
						danhsach=ex.taoDanhSach("5", danhsach, k5, 1, thang);
						i++;
					}
					if(btnNongsan6Giau.isSelected()) {
						k6=0.9;
						danhsach=ex.taoDanhSach("6", danhsach, k6, 1, thang);
						i++;
					}
					if(btnNongsan6It.isSelected()) {
						k6=0.7;
						danhsach=ex.taoDanhSach("6", danhsach, k6, 1, thang);
						i++;
					}
					if(btnNongsan6Khong.isSelected()) {
						k6=0.5;
						danhsach=ex.taoDanhSach("6", danhsach, k6, 1, thang);
						i++;
					}
					if(btnNongsan7Giau.isSelected()) {
						k7=0.9;
						danhsach=ex.taoDanhSach("7", danhsach, k7, 1, thang);
						i++;
					}
					if(btnNongsan7It.isSelected()) {
						k7=0.7;
						danhsach=ex.taoDanhSach("7", danhsach, k7, 1, thang);
						i++;
					}
					if(btnNongsan7Khong.isSelected()) {
						k7=0.5;
						danhsach=ex.taoDanhSach("7", danhsach, k7, 1, thang);
						i++;
					}
					if(btnNongsan8Giau.isSelected()) {
						k8=0.9;
						danhsach=ex.taoDanhSach("8", danhsach, k8, 1, thang);
						i++;
					}
					if(btnNongsan8It.isSelected()) {
						k8=0.7;
						danhsach=ex.taoDanhSach("8", danhsach, k8, 1, thang);
						i++;
					}
					if(btnNongsan8Khong.isSelected()) {
						k8=0.5;
						danhsach=ex.taoDanhSach("8", danhsach, k8, 1, thang);
						i++;
					}
					if(btnNongsan9Giau.isSelected()) {
						k9=0.9;
						danhsach=ex.taoDanhSach("9", danhsach, k9, 1, thang);
						i++;
					}
					if(btnNongsan9It.isSelected()) {
						k9=0.7;
						danhsach=ex.taoDanhSach("9", danhsach, k9, 1, thang);
						i++;
					}
					if(btnNongsan9Khong.isSelected()) {
						k9=0.5;
						danhsach=ex.taoDanhSach("9", danhsach, k9, 1, thang);
						i++;
					}
					if(btnNongsan10Giau.isSelected()) {
						k10=0.9;
						danhsach=ex.taoDanhSach("10", danhsach, k10, 1, thang);
						i++;
					}
					if(btnNongsan10It.isSelected()) {
						k10=0.7;
						danhsach=ex.taoDanhSach("10", danhsach, k10, 1, thang);
						i++;
					}
					if(btnNongsan10Khong.isSelected()) {
						k10=0.5;
						danhsach=ex.taoDanhSach("10", danhsach, k10, 1, thang);
						i++;
					}
					if(btnNongsan11Giau.isSelected()) {
						k11=0.9;
						danhsach=ex.taoDanhSach("11", danhsach, k11, 1, thang);
						i++;
					}
					if(btnNongsan11It.isSelected()) {
						k11=0.7;
						danhsach=ex.taoDanhSach("11", danhsach, k11, 1, thang);
						i++;
					}
					if(btnNongsan11Khong.isSelected()) {
						k11=0.5;
						danhsach=ex.taoDanhSach("11", danhsach, k11, 1, thang);
						i++;
					}
					if(btnNongsan12Giau.isSelected()) {
						k12=0.9;
						danhsach=ex.taoDanhSach("12", danhsach, k12, 1, thang);
						i++;
					}
					if(btnNongsan12It.isSelected()) {
						k12=0.7;
						danhsach=ex.taoDanhSach("12", danhsach, k12, 1, thang);
						i++;
					}
					if(btnNongsan12Khong.isSelected()) {
						k12=0.5;
						danhsach=ex.taoDanhSach("12", danhsach, k12, 1, thang);
						i++;
					}
					if(i==0) {
						textKetqua.setText("Ban chua chon nong san");
						return;
					}
/*					for(int j=0;j<danhsach.size();j++) {
						Nongsan ns=(Nongsan)danhsach.get(j);
						System.out.println("ma: "+ns.get_manongsan()+" namme: "+ns.get_name()+" chiphi: "+ns.get_chiphi()+" giaca: "+ns.getGiaca()+" nangsuat: "+ns.get_nangsuattoida());
					}*/
					ketqua=ex.taoKetQua(danhsach, dientich, von);
					dapso=ex.phantich(ketqua, dientich);
				//	textKetqua.setText(new Integer(thang).toString()+"\n"+new Double(von).toString()+"\n"+new Double(dientich).toString());
					int a=0;
					if(dapso!=null) {
						dapso.setChiphi(dapso.tongChiPhi()*dientich/100);
						dapso.setLoinhuan(dapso.tongLoiNhuan()*dientich/100);
						Vector<Nongsan> vns=dapso.getVectorNS();
						String str="Loi nhuan: "+dapso.getLoinhuan()+" VND;chi phi: "+dapso.getChiphi()+" VND\n";
						for(int j=0;j<danhsach.size();j++) {
							Nongsan ns=(Nongsan)danhsach.get(j);
							System.out.println("ma: "+ns.get_manongsan()+" namme: "+ns.get_name()+" chiphi: "+ns.get_chiphi()+" giaca: "+ns.getGiaca()+" nangsuat: "+ns.get_nangsuattoida());
							str=str+"ma: "+ns.get_manongsan()+" namme: "+ns.get_name()+" chiphi: "+ns.get_chiphi()+" giaca: "+ns.getGiaca()+" nangsuat: "+ns.get_nangsuattoida()+"\n";
						}
						System.out.println("ketqua: ");
						str=str+"ket qua:\n";
						for(int j=0;j<vns.size();j++) {
							Nongsan ns=(Nongsan)vns.get(j);
							System.out.println(ns.get_name()+"\t"+ns.getDientich()*dientich/100+" (m2)");
							str=str+ns.get_name()+"\t"+ns.getDientich()*dientich/100+" (m2)"+"\n";
						}
						textKetqua.setText(str);
					}else {
						textKetqua.setText("khong co ket qua");
					}
					danhsach.removeAllElements();
					ketqua.removeAllElements();
					i=0;
					a=0;
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnGo.setBounds(595, 472, 97, 25);
		contentPane.add(btnGo);
		
		JScrollPane scrollPane = new JScrollPane(textKetqua);
		scrollPane.setBounds(32, 510, 1237, 163);
		contentPane.add(scrollPane);
		setLocationRelativeTo(null);
		
	}
}
