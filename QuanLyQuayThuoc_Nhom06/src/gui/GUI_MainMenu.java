package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import enums.Enum_TabMainMenu;

public class GUI_MainMenu extends JFrame{
	
	private TAB_ThanhToan tabThanhToan;
    private TAB_Thuoc tabThuoc;
    private TAB_NhanVien tabNhanVien;
    private TAB_NhaCungCap tabNhaCungCap;
    private TAB_ThongKe tabThongKe;
    
	private Enum_TabMainMenu currentSelectedTab;
	private JButton isFocusTab;
	
	private JPanel jPanel_QuanLy;
	private JPanel jPanel_DangXuat;
	private JButton button_ThanhToan;
	private JButton button_NhanVien;
	private JButton button_NhaCungCap;
	private JButton button_DangXuat;
	private JButton button_ThongKe;
	private JButton button_Thuoc;
	private JPanel jPanel_content;
	private JPanel jPanel_NORTH;
	private JPanel jPanel_CENTER;
	private JPanel jPanel_WEST;
	
	public GUI_MainMenu()
	{
		this.init();
		
		tabThanhToan = new TAB_ThanhToan();
		tabThuoc = new TAB_Thuoc();
		tabNhanVien = new TAB_NhanVien();
		tabNhaCungCap = new TAB_NhaCungCap();
		tabThongKe = new TAB_ThongKe();
		
		//Xử lý chuyển đổi các tab
		
		currentSelectedTab = Enum_TabMainMenu.KHONG_MO_TAB_NAO;
		
	}
	
	public void init()
	{
		this.setSize(1280, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		jPanel_NORTH = new JPanel();
		jPanel_CENTER = new JPanel();
		jPanel_WEST = new JPanel();
		
		jPanel_NORTH.setLayout(new BorderLayout());
		jPanel_WEST.setLayout(new BorderLayout());
		jPanel_CENTER.setLayout(new BorderLayout());
		
		
		
		jPanel_NORTH.setBorder(BorderFactory.createTitledBorder("Header"));
		jPanel_WEST.setBorder(BorderFactory.createTitledBorder("Quản lý"));
		jPanel_CENTER.setBorder(BorderFactory.createTitledBorder("Content"));

		Font font_text = new Font("Verdana", Font.BOLD, 12);
		Font font_title = new Font("Verdana", Font.BOLD, 16);
		Font font_special = new Font("Verdana", Font.BOLD, 20);
		
		//NORTH
		JPanel jPanel_Icon_DrugStore = new JPanel();
		JPanel jPanel_Info = new JPanel();
		
		ImageIcon imageIcon_DrugStore = new ImageIcon("src/IMG/DrugStore.png");
		Image scaled_DrugStore = scaleImage(imageIcon_DrugStore.getImage(), 50, 50);
		ImageIcon scaledIcon_DrugStore = new ImageIcon(scaled_DrugStore);
			
			
		JLabel jLabel_Icon_DrugStore = new JLabel(scaledIcon_DrugStore);
		JLabel jLabel_NameStore = new JLabel("Nhà Thuốc ABC");
		jLabel_NameStore.setForeground(new Color(120,200,230));
		jLabel_NameStore.setFont(font_special);
		
		jPanel_Icon_DrugStore.add(jLabel_Icon_DrugStore);
		jPanel_Icon_DrugStore.add(jLabel_NameStore);
		
		ImageIcon imageIcon_Staff = new ImageIcon("src/IMG/Staff.png");
		Image scaled_Staff = scaleImage(imageIcon_Staff.getImage(), 25, 25);
		ImageIcon scaledIcon_Staff = new ImageIcon(scaled_Staff);
		
		JLabel jLabel_Icon_Staff = new JLabel(scaledIcon_Staff);
		JLabel jLabel_info = new JLabel("Nguyễn Lê Nhật Huy");
		jLabel_info.setFont(font_title);
		jPanel_Info.add(jLabel_Icon_Staff);
		jPanel_Info.add(jLabel_info);
		jPanel_NORTH.add(jPanel_Icon_DrugStore, BorderLayout.WEST);
		jPanel_NORTH.add(jPanel_Info, BorderLayout.EAST);

	
		
		//WEST
		button_ThanhToan = new JButton("Thanh toán");
		button_Thuoc = new JButton("Thuốc");
		button_NhanVien = new JButton("Nhân viên");
		button_NhaCungCap = new JButton("Nhà cung cấp");
		button_ThongKe = new JButton("Thống kê");
		button_DangXuat = new JButton("Đăng xuất");
		
		button_ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabActionPerformed(evt);
            }
		});
		button_Thuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabActionPerformed(evt);
            }
		});
		button_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabActionPerformed(evt);
            }
		});
		button_NhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabActionPerformed(evt);
            }
		});
		button_ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabActionPerformed(evt);
            }
		});
		button_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabActionPerformed(evt);
            }
		});
		
		
		button_ThanhToan.setPreferredSize(new Dimension(200, 50));
		button_Thuoc.setPreferredSize(new Dimension(200, 50));
		button_NhanVien.setPreferredSize(new Dimension(200, 50));
		button_NhaCungCap.setPreferredSize(new Dimension(200, 50));
		button_ThongKe.setPreferredSize(new Dimension(200, 50));
		button_DangXuat.setPreferredSize(new Dimension(200, 50));
		
		ImageIcon imageIcon_ThanhToan = new ImageIcon("src/IMG/ThanhToan.png");
		ImageIcon imageIcon_Thuoc = new ImageIcon("src/IMG/medicine.png");
		ImageIcon imageIcon_NhanVien = new ImageIcon("src/IMG/NhanVien.png");
		ImageIcon imageIcon_NhaCungCap = new ImageIcon("src/IMG/NhaCungCap.png");
		ImageIcon imageIcon_ThongKe = new ImageIcon("src/IMG/ThongKe.png");
		ImageIcon imageIcon_DangXuat = new ImageIcon("src/IMG/DangXuat.png");
		
		Image scaled_ThanhToan = scaleImage(imageIcon_ThanhToan.getImage(), 22, 22);
		ImageIcon scaledIcon_ThanhToan = new ImageIcon(scaled_ThanhToan);
		Image scaled_Thuoc = scaleImage(imageIcon_Thuoc.getImage(), 22, 22);
		ImageIcon scaledIcon_Thuoc = new ImageIcon(scaled_Thuoc);
		Image scaled_NhanVien = scaleImage(imageIcon_NhanVien.getImage(), 22, 22);
		ImageIcon scaledIcon_NhanVien = new ImageIcon(scaled_NhanVien);
		Image scaled_NhaCungCap = scaleImage(imageIcon_NhaCungCap.getImage(), 22, 22);
		ImageIcon scaledIcon_NhaCungCap = new ImageIcon(scaled_ThanhToan);
		Image scaled_ThongKe = scaleImage(imageIcon_ThongKe.getImage(), 22, 22);
		ImageIcon scaledIcon_ThongKe = new ImageIcon(scaled_ThongKe);
		Image scaled_DangXuat = scaleImage(imageIcon_ThongKe.getImage(), 22, 22);
		ImageIcon scaledIcon_DangXuat = new ImageIcon(scaled_ThongKe);
		
		button_ThanhToan.setHorizontalAlignment(SwingConstants.LEFT);
		button_Thuoc.setHorizontalAlignment(SwingConstants.LEFT);
		button_NhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		button_NhaCungCap.setHorizontalAlignment(SwingConstants.LEFT);
		button_ThongKe.setHorizontalAlignment(SwingConstants.LEFT);
		button_DangXuat.setHorizontalAlignment(SwingConstants.LEFT);

		
		button_ThanhToan.setIcon(scaledIcon_ThanhToan);
		button_Thuoc.setIcon(scaledIcon_Thuoc);
		button_NhanVien.setIcon(scaledIcon_NhanVien);
		button_NhaCungCap.setIcon(scaledIcon_NhaCungCap);
		button_ThongKe.setIcon(scaledIcon_ThongKe);
		button_DangXuat.setIcon(scaledIcon_DangXuat);
		
		button_ThanhToan.setBackground(new Color(168, 230, 206));
		button_Thuoc.setBackground(new Color(168, 230, 206));
		button_NhanVien.setBackground(new Color(168, 230, 206));
		
		
		
		button_NhaCungCap.setBackground(new Color(168, 230, 206));
		button_ThongKe.setBackground(new Color(168, 230, 206));
		button_DangXuat.setBackground(new Color(168, 230, 206));
		
		button_ThanhToan.setForeground(new Color(255,251,241));
		button_Thuoc.setForeground(new Color(255,251,241));
		button_NhanVien.setForeground(new Color(255,251,241));
		button_NhaCungCap.setForeground(new Color(255,251,241));
		button_ThongKe.setForeground(new Color(255,251,241));
		button_DangXuat.setForeground(new Color(255,251,241));
		
		button_ThanhToan.setFont(font_title);
		button_Thuoc.setFont(font_title);
		button_NhanVien.setFont(font_title);
		button_NhaCungCap.setFont(font_title);
		button_ThongKe.setFont(font_title);
		button_DangXuat.setFont(font_title);
		
		button_ThanhToan.setFocusable(false);
		button_Thuoc.setFocusable(false);
		button_NhanVien.setFocusable(false);
		button_NhaCungCap.setFocusable(false);
		button_ThongKe.setFocusable(false);
		button_DangXuat.setFocusable(false);
		

		
		
		jPanel_QuanLy = new JPanel();
		jPanel_DangXuat = new JPanel();
		
		jPanel_QuanLy.setLayout(new GridLayout(5, 1, 10, 12));
		//jPanel_QuanLy.add(Box.createVerticalStrut(12));
		jPanel_QuanLy.add(button_ThanhToan);
		//jPanel_QuanLy.add(Box.createVerticalStrut(12));
		jPanel_QuanLy.add(button_Thuoc);
		//jPanel_QuanLy.add(Box.createVerticalStrut(12));
		jPanel_QuanLy.add(button_NhanVien);
		//jPanel_QuanLy.add(Box.createVerticalStrut(12));
		jPanel_QuanLy.add(button_NhaCungCap);
		//jPanel_QuanLy.add(Box.createVerticalStrut(12));
		jPanel_QuanLy.add(button_ThongKe);
		
		jPanel_DangXuat.add(button_DangXuat);
		
		jPanel_WEST.add(jPanel_QuanLy, BorderLayout.NORTH);
		jPanel_WEST.add(jPanel_DangXuat, BorderLayout.SOUTH);
		//CENTER
		
		JPanel jPanel_header = new JPanel();
		jPanel_content = new JPanel();
		
		this.add(jPanel_NORTH, BorderLayout.NORTH);
		this.add(jPanel_CENTER, BorderLayout.CENTER);
		this.add(jPanel_WEST, BorderLayout.WEST);

	}
	
	private Image scaleImage(Image image, int w, int h) {
		
		
        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return scaled;
    }
	
	 private void btnTabActionPerformed(ActionEvent evt) {                                       
	        // TODO add your handling code here:
	    	// Tab bán hàng

	       if (evt.getSource().equals(button_ThanhToan)){
	    	   tabSwitcher(tabThanhToan, Enum_TabMainMenu.THANH_TOAN, button_ThanhToan);
	    	   return;
	       } 
	       
	       // Tab sản phẩm 
	       if (evt.getSource().equals(button_Thuoc)){
	    	   tabSwitcher(tabThuoc, Enum_TabMainMenu.THUOC, button_Thuoc);
	    	   return;
	       }
	       
	       if (evt.getSource().equals(button_NhanVien)){
	    	   tabSwitcher(tabNhanVien, Enum_TabMainMenu.NHAN_VIEN, button_NhanVien);
	    	   return;
	       }
	       
	       if (evt.getSource().equals(button_NhaCungCap)){
	    	   tabSwitcher(tabNhaCungCap, Enum_TabMainMenu.NHA_CUNG_CAP, button_NhaCungCap);
	    	   return;
	       }
	       
	       if (evt.getSource().equals(button_ThongKe)){
	    	   tabSwitcher(tabThongKe, Enum_TabMainMenu.THONG_KE, button_ThongKe);
	    	   return;
	       }
	       
	       if(evt.getSource().equals(button_DangXuat))
	       {
	    	   GUI_Login gui_Login = new GUI_Login();
	    	   gui_Login.setVisible(true);
	    	   this.dispose();
	    	   return;
	       }  
	    }
	
    public void tabSwitcher(JPanel panelChuyen, Enum_TabMainMenu tabMoi, JButton btnTab) {
    	Component oldCom;
		if (currentSelectedTab == tabMoi)
			return;
		
		
		if (jPanel_CENTER.getComponentCount() > 0) {
				isFocusTab.setBackground(new Color(168, 230, 206));
				btnTab.setForeground(new Color(255,251,241));
			isFocusTab.setForeground(new Color(255,251,241));
			oldCom = jPanel_CENTER.getComponent(0);
			oldCom.setVisible(false);
			jPanel_CENTER.remove(oldCom);
		}
		
		isFocusTab = btnTab;
		isFocusTab.setBackground(new java.awt.Color(15, 145, 239));
		isFocusTab.setForeground(new Color(255,251,241));
		currentSelectedTab = tabMoi;
		panelChuyen.setVisible(true);
		jPanel_CENTER.add(panelChuyen);
		jPanel_CENTER.revalidate();
	}
    
	public static void main(String[] args) {
		GUI_MainMenu frame = new GUI_MainMenu();
		frame.setVisible(true);
	}
}
