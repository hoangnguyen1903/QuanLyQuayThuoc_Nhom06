package entities;

import java.sql.Date;
import java.util.Objects;

public class NhanVien {
	private int nhanVienID;
	private String hoTen;
	private String gioiTinh;
	private String soDienThoai;
	private String chucVu;
	private Date ngaySinh;
	private String diaChi;
	private String userName;
	private String password;
	private String email;

	
	


	public int getNhanVienID() {
		return nhanVienID;
	}

	public void setNhanVienID(int nhanVienID) {
		this.nhanVienID = nhanVienID;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nhanVienID);
	}

	public NhanVien(int nhanVienID, String hoTen, String gioiTinh, String soDienThoai, String chucVu, Date ngaySinh,
			String diaChi, String userName, String password, String email) {
		super();
		setNhanVienID(nhanVienID);
		setHoTen(hoTen);
		setGioiTinh(gioiTinh);
		setSoDienThoai(soDienThoai);
		setChucVu(chucVu);
		setNgaySinh(ngaySinh);
		setDiaChi(diaChi);
		setUserName(userName);
		setPassword(password);
		setEmail(email);
	}

	
	
	public NhanVien() {
		this.hoTen = "";
		this.gioiTinh = "";
		this.soDienThoai = "";
		this.chucVu = "";
		this.diaChi = "";
		this.userName = "";
		this.password = "";
		this.email = "";
		long millis = System.currentTimeMillis();
		this.ngaySinh = new java.sql.Date(millis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(nhanVienID, other.nhanVienID);
	}

	@Override
	public String toString() {
		return "NhanVien [nhanVienID=" + nhanVienID + ", hoTen=" + hoTen + "]";
	}
	
	
}
