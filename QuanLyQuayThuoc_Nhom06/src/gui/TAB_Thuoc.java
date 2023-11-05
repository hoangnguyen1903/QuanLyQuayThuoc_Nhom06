package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TAB_Thuoc extends javax.swing.JPanel{

	public TAB_Thuoc() {
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	
    	setLayout(new BorderLayout());
		
		JPanel jPanel_ThongTinThuoc = new JPanel();
		JPanel jPanel_DanhSachThuoc = new JPanel();
		JPanel jPanel_ChucNangQuanLy = new JPanel();
		
		jPanel_ThongTinThuoc.setPreferredSize(new Dimension(0, 250));
		jPanel_ChucNangQuanLy.setPreferredSize(new Dimension(250, 0));
		
		jPanel_ThongTinThuoc.setBorder(BorderFactory.createTitledBorder("Thông tin thuốc"));
		jPanel_DanhSachThuoc.setBorder(BorderFactory.createTitledBorder("Danh sách thuốc"));
		jPanel_ChucNangQuanLy.setBorder(BorderFactory.createTitledBorder("Chức năng"));
		
		
		add(jPanel_ThongTinThuoc, BorderLayout.NORTH);
		add(jPanel_DanhSachThuoc, BorderLayout.CENTER);
		add(jPanel_ChucNangQuanLy, BorderLayout.EAST);
    }// </editor-fold>                        
    

	
}
