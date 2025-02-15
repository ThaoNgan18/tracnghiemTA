/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import static com.btl.tracnghiemta.CauHinh.sc;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author thao trang
 */
public abstract class CauHoi {
    private static int dem = 0;
    private final int maCauHoi;
    private String danhMuc;
    private String noiDung;
    private int capDo;
    
    {
        dem++;
        this.maCauHoi = dem;
    }
    
    public CauHoi(){}
    
    public CauHoi(String noiDung){
        this.noiDung = noiDung;
    }
    
    public CauHoi(String noiDung, int doKho){
        this(noiDung);
        this.capDo = doKho;
    }
    
    /**
     *
     * @param danhMuc
     * @param noiDung
     * @param capDo
     */
    public CauHoi(String danhMuc, String noiDung, int capDo){
        this.noiDung = noiDung;
        this.capDo = capDo;
        this.danhMuc = danhMuc;
    }
    
    
    @Override
    public String toString() {
        return String.format("%-15s"
                + "\t%-15s"
                + "\t%-15s\n"
                , this.getDanhMuc(), this.getNoiDung(), this.getCapDo());
    }
    
    public void addChoice(PhuongAn c) {}
    public void hienThi() {}
    
    public abstract List<MultipleChoice> getDsCauHoi();

    /**
     * @return the maCauHoi
     */
    public int getMaCauHoi() {
        return maCauHoi;
    }

    /**
     * @return the danhMuc
     */
    public String getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the capDo
     */
    public int getCapDo() {
        return capDo;
    }

    /**
     * @param capDo the capDo to set
     */
    public void setCapDo(int capDo) {
        this.capDo = capDo;
    }


}


   
