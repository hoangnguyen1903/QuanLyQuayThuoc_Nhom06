package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TAB_ThongKe extends javax.swing.JPanel{

	public TAB_ThongKe() {
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
setLayout(new BorderLayout());
		
		JPanel jPanel_DoanhThu = new JPanel();
		JPanel jPanel_DanhSachDoanhThu = new JPanel();
		JPanel jPanel_ChucNangQuanLy = new JPanel();
		
		//DoanhThu: doanh thu theo tháng, ngày
		//DanhSachDanhThu: danh sách doanh thu theo sản phẩm
		//ChucNangQuanLy: Thống kê theo tháng nào (hoặc) ngày nào trong tháng (Chọn một trong hai)
		
		jPanel_DoanhThu.setPreferredSize(new Dimension(0, 250));
		jPanel_ChucNangQuanLy.setPreferredSize(new Dimension(250, 0));
		
		jPanel_DoanhThu.setBorder(BorderFactory.createTitledBorder("Doanh thu"));
		jPanel_DanhSachDoanhThu.setBorder(BorderFactory.createTitledBorder("Danh sách sản phẩm"));
		jPanel_ChucNangQuanLy.setBorder(BorderFactory.createTitledBorder("Chức năng"));
		
		
		add(jPanel_DoanhThu, BorderLayout.NORTH);
		add(jPanel_DanhSachDoanhThu, BorderLayout.CENTER);
		add(jPanel_ChucNangQuanLy, BorderLayout.EAST);
		
    }// </editor-fold>   
}
