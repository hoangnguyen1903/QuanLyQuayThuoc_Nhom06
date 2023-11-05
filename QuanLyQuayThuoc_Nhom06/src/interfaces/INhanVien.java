package interfaces;

import java.util.ArrayList;

import entities.NhanVien;

public interface INhanVien  {

	public ArrayList<NhanVien> getAllEmployees();

	public boolean addNhanVien(NhanVien x);
	public boolean editNhanVien(NhanVien x);

	public NhanVien getNhanVienByNhanVienID(int x);

}
