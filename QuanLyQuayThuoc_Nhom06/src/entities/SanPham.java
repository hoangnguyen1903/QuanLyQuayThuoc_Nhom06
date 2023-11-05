package entities;

import java.sql.Date;
import java.util.Objects;

public class SanPham {
	private int sanPhamID;
	private String tenSanPham;
	private double donGia;
	private String tinhTrang;
	private String loSanXuat;
	private String loaiSanPham;
	private String thanhPhan;
	private String xuatXu;
	private Date hanSuDung;
	private String imgPath;
	private Date ngaySanXuat;
	private int soLuongTon;
	private double giaBan;
	
	public SanPham() {
		setSanPhamID(sanPhamID);
		this.tenSanPham = "";
		this.donGia = 0;
		this.tinhTrang = "";
		this.loSanXuat = "";
		this.loaiSanPham = "";
		this.thanhPhan = "";
		this.xuatXu = "";
		long millis = System.currentTimeMillis();
		this.hanSuDung = new java.sql.Date(millis);
		this.imgPath = "";
		this.ngaySanXuat = new java.sql.Date(millis);
		this.soLuongTon = 0;
		this.giaBan = 0;
	}
	
	public int getSanPhamID() {
		return sanPhamID;
	}
	public void setSanPhamID(int sanPhamID) {
		this.sanPhamID = sanPhamID;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) throws Exception{
		if (tenSanPham.trim().isEmpty() || tenSanPham.trim().isBlank()) {
			throw new Exception("Tên sản phẩm không được để trống");
		}
		this.tenSanPham = tenSanPham;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception{
		if (donGia < 0)
			throw new Exception("Đơn giá không được âm");
		this.donGia = donGia;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public String getLoaiSanPham() {
		return loaiSanPham;
	}
	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	public String getLoSanXuat() {
		return loSanXuat;
	}
	public void setLoSanXuat(String loSanXuat) {
		this.loSanXuat = loSanXuat;
	}
	public String getThanhPhan() {
		return thanhPhan;
	}
	public void setThanhPhan(String thanhPhan) {
		this.thanhPhan = thanhPhan;
	}
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	public Date getHanSuDung() {
		return hanSuDung;
	}
	public void setHanSuDung(Date hanSuDung) {
		this.hanSuDung = hanSuDung;
	}
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws Exception{
		if (soLuongTon < 0)
			throw new Exception("Số lượng không được âm");
		this.soLuongTon = soLuongTon;
	}
	


	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) throws Exception {
		if (giaBan < 0)
			throw new Exception("Giá bản không được âm");
		this.giaBan = giaBan;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	
	public SanPham(int sanPhamID, String tenSanPham, double donGia, String tinhTrang, String loSanXuat,
			String loaiSanPham, String thanhPhan, String xuatXu, Date hanSuDung, String imgPath, Date ngaySanXuat,
			int soLuongTon, double giaBan) throws Exception {
		super();
		setSanPhamID(sanPhamID);
		setTenSanPham(tenSanPham);
		setDonGia(donGia);
		setTinhTrang(tinhTrang);
		setLoSanXuat(loSanXuat);
		setLoaiSanPham(loaiSanPham);
		setThanhPhan(thanhPhan);
		setXuatXu(xuatXu);
		setHanSuDung(hanSuDung);
		setImgPath(imgPath);
		setNgaySanXuat(ngaySanXuat);
		setSoLuongTon(soLuongTon);
		setGiaBan(giaBan);
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(sanPhamID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return sanPhamID == other.sanPhamID;
	}
	
	@Override
	public String toString() {
		return tenSanPham;
	}
	
	
}
