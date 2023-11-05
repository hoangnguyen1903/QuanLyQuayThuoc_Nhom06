package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TAB_NhanVien extends javax.swing.JPanel{

	public TAB_NhanVien() {
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	setLayout(new BorderLayout());
		
		JPanel jPanel_ThongTinNhanVien = new JPanel();
		JPanel jPanel_DanhSachNhanVien = new JPanel();
		JPanel jPanel_ChucNangQuanLy = new JPanel();
		
		jPanel_ThongTinNhanVien.setPreferredSize(new Dimension(0, 250));
		jPanel_ChucNangQuanLy.setPreferredSize(new Dimension(250, 0));
		
		jPanel_ThongTinNhanVien.setBorder(BorderFactory.createTitledBorder("Thông tin nhân viên"));
		jPanel_DanhSachNhanVien.setBorder(BorderFactory.createTitledBorder("Danh sách nhân viên"));
		jPanel_ChucNangQuanLy.setBorder(BorderFactory.createTitledBorder("Chức năng"));
		
		
		add(jPanel_ThongTinNhanVien, BorderLayout.NORTH);
		add(jPanel_DanhSachNhanVien, BorderLayout.CENTER);
		add(jPanel_ChucNangQuanLy, BorderLayout.EAST);


    }// </editor-fold>   
}
