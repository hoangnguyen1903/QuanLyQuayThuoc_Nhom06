package entities;

import java.util.Date;
import java.util.Objects;

public class KhachHang {
	private String khachHangID;
	private String hoTen;
	private String soDienThoai;
	private Date ngaySinh;
	private String gioiTinh;
	private String email;
	private String maSoThue;
	private String diaChi;
	private String loaiKhachHang;
	
	

	public KhachHang() {

	}

	public String getKhachHangID() {
		return khachHangID;
	}

	public void setKhachHangID(String khachHangID) {
		this.khachHangID = khachHangID;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiKhachHang() {
		return loaiKhachHang;
	}

	public void setLoaiKhachHang(String loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}
	
	public KhachHang(String khachHangID, String hoTen, String soDienThoai, Date ngaySinh, String gioiTinh, String email,
			String maSoThue, String diaChi, String loaiKhachHang) {
		setKhachHangID(khachHangID);
		setHoTen(hoTen);
		setSoDienThoai(soDienThoai);
		setNgaySinh(ngaySinh);
		setGioiTinh(gioiTinh);
		setEmail(email);
		setMaSoThue(maSoThue);
		setDiaChi(diaChi);
		setLoaiKhachHang(loaiKhachHang);
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(khachHangID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(khachHangID, other.khachHangID);
	}

	@Override
	public String toString() {
		return "KhachHang [hoTen=" + hoTen + ", soDienThoai=" + soDienThoai + "]";
	}
	
	
	
}
