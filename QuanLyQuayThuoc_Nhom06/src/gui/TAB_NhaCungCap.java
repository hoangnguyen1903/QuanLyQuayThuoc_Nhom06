package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TAB_NhaCungCap extends javax.swing.JPanel{

	public TAB_NhaCungCap() {
setLayout(new BorderLayout());
		
		JPanel jPanel_ThongTinNhaCungCap = new JPanel();
		JPanel jPanel_DanhSachNhaCungCap = new JPanel();
		JPanel jPanel_ChucNangQuanLy = new JPanel();
		
		jPanel_ThongTinNhaCungCap.setPreferredSize(new Dimension(0, 250));
		jPanel_ChucNangQuanLy.setPreferredSize(new Dimension(250, 0));
		
		jPanel_ThongTinNhaCungCap.setBorder(BorderFactory.createTitledBorder("Thông tin nhà cung cấp"));
		jPanel_DanhSachNhaCungCap.setBorder(BorderFactory.createTitledBorder("Danh sách nhà cung cấp"));
		jPanel_ChucNangQuanLy.setBorder(BorderFactory.createTitledBorder("Chức năng"));
		
		
		add(jPanel_ThongTinNhaCungCap, BorderLayout.NORTH);
		add(jPanel_DanhSachNhaCungCap, BorderLayout.CENTER);
		add(jPanel_ChucNangQuanLy, BorderLayout.EAST);
	}
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	
		
    }// </editor-fold>   
}
