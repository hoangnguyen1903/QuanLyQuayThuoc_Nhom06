package entities;

import java.util.Date;
import java.util.Objects;

public class HoaDon {
	private String hoaDonID;
	private Date ngayLapHoaDon;
	private String trangThai;
	private double tongTien;
	private double tienThua;
	

	public HoaDon() {
	
	}

	public String getHoaDonID() {
		return hoaDonID;
	}

	public void setHoaDonID(String hoaDonID) {
		this.hoaDonID = hoaDonID;
	}

	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}

	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
	
	
	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public double getTienThua() {
		return tienThua;
	}

	public void setTienThua(double tienThua) {
		this.tienThua = tienThua;
	}

	public HoaDon(String hoaDonID, Date ngayLapHoaDon, String trangThai) {
		setHoaDonID(hoaDonID);
		setNgayLapHoaDon(ngayLapHoaDon);
		setTrangThai(trangThai);
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(hoaDonID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(hoaDonID, other.hoaDonID);
	}

	@Override
	public String toString() {
		return hoaDonID;
	}
	
	
}
