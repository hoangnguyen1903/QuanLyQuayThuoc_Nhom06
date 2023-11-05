package bus;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entities.NhanVien;
import interfaces.INhanVien;

public class NhanVien_BUS implements INhanVien{
	
	private Connection conn;
	
	public NhanVien_BUS() {
		super();
		conn = ConnectDB.getConnection();
	}


	@Override
	public ArrayList<NhanVien> getAllEmployees() {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		
		try {
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM NhanVien";
			ResultSet rs = stm.executeQuery(query);
			
			while (rs.next()) {
				try {

					int nhanvienid = rs.getInt("nhanvienid");
					String hoten = rs.getString("hoten"); 
					String gioitinh = rs.getString("gioitinh"); 
					String sodienthoai = rs.getString("sodienthoai"); 
					String chucvu = rs.getString("chucvu");
					Date ngaysinh = rs.getDate("ngaysinh");
					String diachi = rs.getString("diachi"); 
					String username = rs.getString("username");
					String password = rs.getString("password");
					String email = rs.getString("email");
					
					
					NhanVien nhanVien = new NhanVien(nhanvienid, hoten, gioitinh, sodienthoai, chucvu, ngaysinh, diachi, username, password, email);
					list.add(nhanVien);
					
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
	public boolean addNhanVien(NhanVien nv) {
		try {
			
			String sql = "INSERT INTO NhanVien(HoTen, GioiTinh, SoDienThoai, "
					+ "ChucVu, NgaySinh, DiaChi, UseName, Password, Email)"
					+ "VALUES"
					+ "(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, nv.getHoTen());
			pstm.setString(2, nv.getGioiTinh());
			pstm.setString(3, nv.getSoDienThoai());
			pstm.setString(4, nv.getChucVu());
			pstm.setDate(5, nv.getNgaySinh());
			pstm.setString(6, nv.getDiaChi());
			pstm.setString(7, nv.getUserName());
			pstm.setString(8, nv.getPassword());
			pstm.setString(9, nv.getEmail());

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
	public boolean editNhanVien(NhanVien nv) {
		int id = nv.getNhanVienID();
		try {
								
			String sql = "UPDATE NhanVien "
					+ "SET  "
					+ "HoTen = ?," 
					+ "GioiTinh = ?," 
					+ "SoDienThoai = ?," 
					+ "ChucVu = ?," 
					+ "NgaySinh = ?," 
					+ "DiaChi = ?," 
					+ "UserName = ?," 
					+ "Password = ?," 
					+ "Email = ?," 				
					+ " WHERE NhanVienID = " + id;
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, nv.getHoTen());
			pstm.setString(2, nv.getGioiTinh());
			pstm.setString(3, nv.getSoDienThoai());
			pstm.setString(4, nv.getChucVu());
			pstm.setDate(5, nv.getNgaySinh());
			pstm.setString(6, nv.getDiaChi());
			pstm.setString(7, nv.getUserName());
			pstm.setString(8, nv.getPassword());
			pstm.setString(9, nv.getEmail());
			
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
	public NhanVien getNhanVienByNhanVienID(int nhanVienID) {
		// TODO Auto-generated method stub
		try {
			

			Statement stm = conn.createStatement();
			String query = "SELECT * FROM NhanVien WHERE NhanVienID = " + nhanVienID;
			ResultSet rs = stm.executeQuery(query);
			
			while (rs.next()) {
				try {
					int nhanvienid = rs.getInt("nhanvienid");
					String hoten = rs.getString("hoten"); 
					String gioitinh = rs.getString("gioitinh"); 
					String sodienthoai = rs.getString("sodienthoai"); 
					String chucvu = rs.getString("chucvu");
					Date ngaysinh = rs.getDate("ngaysinh");
					String diachi = rs.getString("diachi"); 
					String username = rs.getString("username");
					String password = rs.getString("password");
					String email = rs.getString("email");
					
					
					NhanVien nhanVien = new NhanVien(nhanvienid, hoten, gioitinh, sodienthoai, chucvu, ngaysinh, diachi, username, password, email);
					return nhanVien;
//					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
		
	}



}
