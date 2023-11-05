package interfaces;

import java.util.ArrayList;

import entities.KhachHang;
import entities.NhanVien;

public interface IKhachHang {
	public ArrayList<KhachHang> findKhachHang(int kh);
	public ArrayList<KhachHang> getAllKhachHang();
	public boolean addKhachHang(KhachHang kh);
	public boolean editKhachHang(KhachHang kh);
}