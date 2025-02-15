/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thao trang
 */
public class ThanhTich {
    private List<Double> dsDiem;
    private int soLanLam;
    private List<LocalDate> ngayLamBai;

    public ThanhTich() {
        this.soLanLam = 0;
        this.dsDiem = new ArrayList<>();
        this.ngayLamBai = new ArrayList<>();
    }

    public ThanhTich(List<Double> dsDiem, int soLanLam) {
        this.dsDiem = dsDiem;
        this.soLanLam = soLanLam;
        this.ngayLamBai = ngayLamBai;
    }
    
    public void themDiem(double diem, LocalDate ngay){
        this.dsDiem.add(diem);    
        this.ngayLamBai.add(ngay);
        this.soLanLam++;
    }
    
    public double getDiemTrungBinh(){
        return this.dsDiem.stream().mapToDouble(diem -> diem).average().getAsDouble();
    }
   
    //Lấ điểm trung bình trong tháng
    public double getDiemTrungBinhTrongThang(int thang){
        double tong = 0.0;
        int soDiem = 0;
        for(int i = 0; i < this.dsDiem.size();i++){
            if(this.ngayLamBai.get(i).getMonthValue() == thang){
                tong+=this.dsDiem.get(i);
                soDiem++;
            }
        }
        return soDiem>0 ? tong/soDiem:0.0;
    }
    
    //lấy ra số lần làm trong tháng
    public int getSoLanLamTrongThang(int thang){
        int soLanLam = 0;
        for(LocalDate ngay: this.ngayLamBai){
            if(ngay.getMonthValue() == thang){
                soLanLam++;
            }
        }
        return soLanLam;
    }
    
    public void hienThiDsDiem(){
        for(int i = 0; i < this.dsDiem.size(); i++){
            System.out.printf("Diem lan thu %d: %.2f\n", i + 1, this.dsDiem.get(i));
        }
    }
    
    public void hienThiThongKe(){
        System.out.printf("So Lan lam: %d\n", soLanLam);
        this.hienThiDsDiem();
        System.out.printf("Diem trung binh: %.2f\n", this.getDiemTrungBinh());
    }
    
    public void hienThiTrongThang(int thang){
        System.out.printf("So lan lam trong thang %d: %d\n", thang, this.getSoLanLamTrongThang(thang));
        System.out.printf("Diem trung binh trong thang %d: %.2f", thang, this.getDiemTrungBinhTrongThang(thang));
    }
    /**
     * @return the dsDiem
     */
    public List<Double> getDsDiem() {
        return dsDiem;
    }

    /**
     * @param dsDiem the dsDiem to set
     */
    public void setDsDiem(List<Double> dsDiem) {
        this.dsDiem = dsDiem;
    }

    /**
     * @return the soLanLam
     */
    public int getSoLanLam() {
        return soLanLam;
    }

    /**
     * @param soLanLam the soLanLam to set
     */
    public void setSoLanLam(int soLanLam) {
        this.soLanLam = soLanLam;
    }

    /**
     * @return the ngayLamBai
     */
    public List<LocalDate> getNgayLamBai() {
        return ngayLamBai;
    }

    /**
     * @param ngayLamBai the ngayLamBai to set
     */
    public void setNgayLamBai(List<LocalDate> ngayLamBai) {
        this.ngayLamBai = ngayLamBai;
    }

}