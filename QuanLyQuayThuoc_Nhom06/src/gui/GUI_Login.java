package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import bus.NhanVien_BUS;
import connectDB.ConnectDB;
import entities.NhanVien;

public class GUI_Login extends JFrame {
	private JTextField jTextFieldUsername;
	private JPasswordField jPasswordField;
	private Connection conn;
	public GUI_Login() {
		
				conn = ConnectDB.getConnection();
				JLabel jLabel_title = new JLabel("Welcome");
				jLabel_title.setFont(new Font("Verdana", Font.BOLD, 20));
				jLabel_title.setBounds(100, 121, 388, 45);
				getContentPane().add(jLabel_title);
				
				JLabel jLabel_Username = new JLabel("Username:");
				jLabel_Username.setFont(new Font("Verdana", Font.PLAIN, 14));
				jLabel_Username.setBounds(100, 193, 388, 45);
				getContentPane().add(jLabel_Username);
				
				jTextFieldUsername = new JTextField();
				jTextFieldUsername.setBounds(100, 236, 369, 35);
				getContentPane().add(jTextFieldUsername);
				jTextFieldUsername.setColumns(10);
				
				JLabel jLabelPassword = new JLabel("Password:");
				jLabelPassword.setFont(new Font("Verdana", Font.PLAIN, 14));
				jLabelPassword.setBounds(100, 277, 388, 45);
				getContentPane().add(jLabelPassword);
				
				jPasswordField = new JPasswordField();
				jPasswordField.setColumns(10);
				jPasswordField.setBounds(100, 319, 369, 35);
				getContentPane().add(jPasswordField);
				
				JButton jButton_DangNhap = new JButton("Đăng nhập");
				jButton_DangNhap.setForeground(Color.WHITE);
				jButton_DangNhap.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ConnectDB.getInstance().connect();
						
						NhanVien_BUS nhanVien_BUS = new NhanVien_BUS();
						ArrayList<NhanVien> list = nhanVien_BUS.getAllEmployees();
						;
						GUI_Login account = new GUI_Login();
						for(NhanVien nv : list)
						{
							if((nv.getUserName()).equals(jTextFieldUsername.getText()))
							{
								
								if((nv.getPassword()).equals(new String(jPasswordField.getPassword())))
								{
									MainActivityTest mainActivityTest = new MainActivityTest();
									return;
								}
								else
								{
									JOptionPane.showMessageDialog(null, "Sai mật khẩu");
									return;
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại");
								return;
							}
						}
						
					}
				});
				jButton_DangNhap.setFont(new Font("Verdana", Font.PLAIN, 14));
				jButton_DangNhap.setBounds(100, 419, 156, 45);
				jButton_DangNhap.setBackground(new Color(15, 145, 239));
				
				getContentPane().add(jButton_DangNhap);
				
				JButton jButton_Thoat = new JButton("Thoát");
				jButton_Thoat.setForeground(Color.WHITE);
				jButton_Thoat.setFont(new Font("Verdana", Font.PLAIN, 14));
				jButton_Thoat.setBounds(300, 419, 157, 45);		
				jButton_Thoat.setBackground(new Color(15, 145, 239));
				getContentPane().add(jButton_Thoat);
				
				JLabel lblDesignedBy = new JLabel();
				lblDesignedBy.setHorizontalAlignment(SwingConstants.CENTER);
				lblDesignedBy.setFont(new Font("Verdana", Font.PLAIN, 12));
				lblDesignedBy.setBounds(110, 480, 369, 45);
				getContentPane().add(lblDesignedBy);
		this.setSize(600, 620);
		this.setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		GUI_Login frame = new GUI_Login();
		frame.setVisible(true);
	}
}
