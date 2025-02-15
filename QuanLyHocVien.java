/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author thao trang
 */
public class QuanLyHocVien {

    private List<HocVien> dsHocVien = new ArrayList<>();
    private String LABEL = String.format("%s\t%-20s\t%-15s\t%-15s\t%-15s\t%-15s",
            "ID", "Ho Ten", "Gioi Tinh", "Que Quan", "Ngay Sinh", "Ngay gia nhap");
    private Object tuKhoa;

//        public QuanLyHocVien() {
//
//	}
    public void them(HocVien... hv) {
        this.dsHocVien.addAll(Arrays.asList(hv));
    }

    public void xoa(HocVien... hv) {
        this.dsHocVien.removeAll(Arrays.asList(hv));

    }

    public void thongKe(HocVien hv) {
        System.out.println(hv);
        System.out.print(hv.getThanhTich());
    }
    public void xuatDanhSachHv() {
        System.out.println(this.LABEL);
        for (HocVien hv : dsHocVien) {
            System.out.println(hv);
        }
    }
    public void xuatDanhSachHv(List<HocVien> dsHV) {
        System.out.println(this.LABEL);
        for (HocVien hv : dsHV) {
            System.out.println(hv);
        }
    }

    /**
     * tra cuu theo ma hoc vien
     *
     * @param maHocVien
     * @return hoc viên tương ứng
     */
    public HocVien traCuu(int maHocVien) {
        return this.dsHocVien.stream().filter(hocVien -> hocVien.getMaHocVien() == maHocVien).findFirst().orElse(null);
    }

    /**
     * tra cuu theo ngay sinh
     * @param ngaySinh
     * @return các học viên tra cứu được
     */
     public List<HocVien> traCuu(Date ngaySinh){
        return this.dsHocVien.stream().filter(hv -> hv.getNgaySinh().equals(ngaySinh)).collect(Collectors.toList());
    }

    /**
     * Tra cuu theo tu khoa
     *
     * @param tuKhoa
     * @param tukhoa
     * @return các học viên tra cứu được
     */
    public List<HocVien> traCuu(String tuKhoa) {
        return this.dsHocVien.stream().filter(hocVien -> hocVien.getHoTen().equals(tuKhoa) || hocVien.getQueQuan().equals(tuKhoa)
                || hocVien.getGioiTinh().equals(tuKhoa)).collect(Collectors.toList());
    }
    /**
     * @return the dsHocVien
     */
    public List<HocVien> getdsHocVien() {
        return dsHocVien;
    }

    /**
     * @param dsHocVien the danhSachHocVien to set
     */
    public void setDsHocVien(List<HocVien> dsHocVien) {
        this.dsHocVien = dsHocVien;
    }

    /**
     * @return the LABEL
     */
    public String getLABEL() {
        return LABEL;
    }

    /**
     * @param LABEL the LABEL to set
     */
    public void setLABEL(String LABEL) {
        this.LABEL = LABEL;
    }

}
