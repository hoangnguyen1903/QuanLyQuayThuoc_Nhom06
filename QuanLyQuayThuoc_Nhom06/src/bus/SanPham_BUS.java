package bus;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entities.SanPham;
import interfaces.ISanPham;

public class SanPham_BUS implements ISanPham{

	private Connection conn;
	public SanPham_BUS() {
		super();
		// TODO Auto-generated constructor stub
		conn = ConnectDB.getConnection();
	}
	@Override
	public ArrayList<SanPham> getDanhSachSanPham(String query) {
		ArrayList<SanPham> list = new ArrayList<SanPham>();
		
		try {
			

			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(query);
			
			while (rs.next()) {
				try {
					int sanphamid = rs.getInt("sanphamid");
					String tensanpham = rs.getString("tensanpham"); 
					double dongia = rs.getDouble("dongia"); 
					String tinhtrang = rs.getString("tinhtrang"); 
					String losanxuat = rs.getString("losanxuat");
					String loaisanpham = rs.getString("loaisanpham"); 
					String thanhphan = rs.getString("thanhphan");
					String xuatxu = rs.getString("xuatxu");
					Date hansudung = rs.getDate("hansudung");
					String img = rs.getString("imgpath"); 
					Date ngaysanxuat = rs.getDate("ngaysanxuat");
					int soluongton = rs.getInt("soluongton");
					double giaban = rs.getDouble("giaban");
					
		
					SanPham sanPham = new SanPham(sanphamid, tensanpham, dongia, tinhtrang, losanxuat, loaisanpham, thanhphan, xuatxu, hansudung, img, ngaysanxuat, soluongton, giaban);
					list.add(sanPham);
					
//					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return list;
				}
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
			return list;
		}
		
		return list;
	}
	

	@Override
	public boolean addSanPham(SanPham sp) {
		try {
			
			String sql = "INSERT INTO SanPham(TenSanPham, DonGia, TinhTrang, "
					+ "LoSanXuat, LoaiSanPham, ThanhPhan, XuatXu, HanSuDung, ImgPath, "
					+ "NgaySanXuat, SoLuongTon, GiaBan )"
					+ "VALUES"
					+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, sp.getTenSanPham());
			pstm.setDouble(2, sp.getDonGia());
			pstm.setString(3, sp.getTinhTrang());
			pstm.setString(4, sp.getLoSanXuat());
			pstm.setString(5, sp.getLoaiSanPham());
			pstm.setString(6, sp.getThanhPhan());
			pstm.setString(7, sp.getXuatXu());
			pstm.setDate(8, sp.getHanSuDung());
			pstm.setString(9, sp.getImgPath());
			pstm.setDate(10, sp.getNgaySanXuat());
			pstm.setInt(11, sp.getSoLuongTon());
			pstm.setDouble(12, sp.getGiaBan());
			
			
			
			int check = pstm.executeUpdate();
			
			System.out.println("Số dòng thay đổi: " + check);
			
			if(check > 0)
			{
				System.out.println("Thêm dữ liệu thành công");
				return true;
			}
			else
			{
				System.out.println("Thêm dữ liệu thất bại");
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			System.out.println("Lỗi");
			return false;
		}
	}

	@Override
	public boolean editSanPham(SanPham sp) {
		int id = sp.getSanPhamID();
		try {
								
			String sql = "UPDATE SanPham "
					+ "SET  "
					+ "TenSanPham = ?," 
					+ "DonGia = ?," 
					+ "TinhTrang = ?," 
					+ "LoSanXuat = ?," 
					+ "LoaiSanPham = ?," 
					+ "ThanhPhan = ?," 
					+ "XuatXu = ?," 
					+ "HanSuDung = ?," 
					+ "ImgPath = ?," 
					+ "NgaySanXuat = ?," 
					+ "SoLuongTon = ?," 
					+ "GiaBan = ?"  
					+ " WHERE SanPhamID = " + id;
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, sp.getTenSanPham());
			pstm.setDouble(2, sp.getDonGia());
			pstm.setString(3, sp.getTinhTrang());
			pstm.setString(4, sp.getLoSanXuat());
			pstm.setString(5, sp.getLoaiSanPham());
			pstm.setString(6, sp.getThanhPhan());
			pstm.setString(7, sp.getXuatXu());
			pstm.setDate(8, sp.getHanSuDung());
			pstm.setString(9, sp.getImgPath());
			pstm.setDate(10, sp.getNgaySanXuat());
			pstm.setInt(11, sp.getSoLuongTon());
			pstm.setDouble(12, sp.getGiaBan());
			
			int check = pstm.executeUpdate();
			System.out.println("Số dòng thay đổi: " + check);
			
			if(check > 0)
			{
				System.out.println("Thay đổi dữ liệu thành công");
				return true;
			}
			else
			{
				System.out.println("Thay đổi dữ liệu thất bại");	
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			System.out.println("Lỗi");
			return false;
		}
		
//		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<SanPham> getDanhSachSanPhamSapHet() {
		ArrayList<SanPham> list = new ArrayList<SanPham>();
		
		//Statement stm = conn.createStatement();
		String query = "SELECT * FROM SanPham WHERE SoLuongTon <= 10";
		
		list = getDanhSachSanPham(query);
		return list;		
		
	}

	


	@Override
	public void searchSanPham(String sanPhamID, ArrayList<SanPham> list) {
		
		list = new ArrayList<SanPham>();
		
		//Statement stm = conn.createStatement();
		String query = "SELECT * FROM SanPham WHERE SanPhamID = " + sanPhamID;
		
		list = getDanhSachSanPham(query);
		
	}


	@Override
	public ArrayList<SanPham> getDanhSachSanPham() {
		ArrayList<SanPham> list = new ArrayList<SanPham>();
		
		try {
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM SanPham";
			ResultSet rs = stm.executeQuery(query);
			
			while (rs.next()) {
				try {
					int sanphamid = rs.getInt("sanphamid");
					String tensanpham = rs.getString("tensanpham"); 
					double dongia = rs.getDouble("dongia"); 
					String tinhtrang = rs.getString("tinhtrang"); 
					String losanxuat = rs.getString("losanxuat");
					String loaisanpham = rs.getString("loaisanpham"); 
					String thanhphan = rs.getString("thanhphan");
					String xuatxu = rs.getString("xuatxu");
					Date hansudung = rs.getDate("hansudung");
					String img = rs.getString("imgpath"); 
					Date ngaysanxuat = rs.getDate("ngaysanxuat");
					int soluongton = rs.getInt("soluongton");
					double giaban = rs.getDouble("giaban");
					
		
					SanPham sanPham = new SanPham(sanphamid, tensanpham, dongia, tinhtrang, losanxuat, loaisanpham, thanhphan, xuatxu, hansudung, img, ngaysanxuat, soluongton, giaban);
					list.add(sanPham);
					
//					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return list;
				}
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
			return list;
		}
		
		return list;
	}

}
