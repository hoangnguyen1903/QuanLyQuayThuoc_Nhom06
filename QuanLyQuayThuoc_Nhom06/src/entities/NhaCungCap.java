package entities;

import java.util.Objects;

public class NhaCungCap {
	private String nhaCungCapID;
	private String tenNhaCungCap;
	private String soDienThoai;
	private String diaChi;
	
	
	
	public NhaCungCap() {
		
	}

	public String getNhaCungCapID() {
		return nhaCungCapID;
	}

	public void setNhaCungCapID(String nhaCungCapID) {
		this.nhaCungCapID = nhaCungCapID;
	}

	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}

	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public NhaCungCap(String nhaCungCapID, String tenNhaCungCap, String soDienThoai, String diaChi) {
		setNhaCungCapID(nhaCungCapID);
		setTenNhaCungCap(tenNhaCungCap);
		setSoDienThoai(soDienThoai);
		setDiaChi(diaChi);
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nhaCungCapID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhaCungCap other = (NhaCungCap) obj;
		return Objects.equals(nhaCungCapID, other.nhaCungCapID);
	}

	@Override
	public String toString() {
		return tenNhaCungCap;
	}
	
	
}
