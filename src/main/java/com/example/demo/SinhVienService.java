package com.example.demo;

public class SinhVienService {
    public void suaSinhVien(SinhVien sv, String tenMoi, int tuoiMoi, float diemMoi, int kyHocMoi, String chuyenNganhMoi) {
        if (sv == null) {
            throw new IllegalArgumentException("Sinh viên không được null");
        }
        if (tenMoi == null || tenMoi.isEmpty() ||
                chuyenNganhMoi == null || chuyenNganhMoi.isEmpty()) {
            throw new IllegalArgumentException("Tên và chuyên ngành không được để trống");
        }

        sv.setTen(tenMoi);
        sv.setTuoi(tuoiMoi);
        sv.setDiemTrungBinh(diemMoi);
        sv.setKyHoc(kyHocMoi);
        sv.setChuyenNganh(chuyenNganhMoi);
    }


}