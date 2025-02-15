/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thao trang
 */
public class Conversation extends CauHoi {

    private List<MultipleChoice> dsCauHoi;
    private int doKho;
    
    public Conversation(String content, int doKho) {
        super(content, doKho);
        this.dsCauHoi = new ArrayList<>();
    }

    public Conversation(String danhMuc, String content, int doKho) {
        super(danhMuc, content, doKho);
        this.dsCauHoi = new ArrayList<>();
    }

    public void themCauHoi(MultipleChoice q) {
        this.getDsCauHoi().add(q);
    }

    public void hienThi() {
        System.out.println(this.getNoiDung());
        for (int i = 0; i < this.getDsCauHoi().size(); i++) {
            System.out.printf("\nCau hoi so %d: ", i + 1);
            this.getDsCauHoi().get(i).hienThi();
        }    
    }

    @Override
    public String toString() {
        String s = super.toString(); //To change body of generated methods, choose Tools | Templates.

        for (MultipleChoice q : this.getDsCauHoi()) {
            s += q;
        }
        return s;
    }

    /**
     * @return the dsCauHoi
     */
    public List<MultipleChoice> getDsCauHoi() {
        return dsCauHoi;
    }

    /**
     * @param dsCauHoi the dsCauHoi to set
     */
    public void setDsCauHoi(List<MultipleChoice> dsCauHoi) {
        this.dsCauHoi = dsCauHoi;
    }

    /**
     * @return the doKho
     */
    public int getDoKho() {
        return doKho;
    }

    /**
     * @param doKho the doKho to set
     */
    public void setDoKho(int doKho) {
        this.doKho = doKho;
    }
    
}