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
public class InComplete extends CauHoi {

    private List<MultipleChoice> dsCauHoi;
    private int doKho;

    public InComplete(String content, int doKho) {
        super(content, doKho);
        this.dsCauHoi = new ArrayList<>();
    }

    public InComplete(String chuDe, String content, int doKho) {
        super(chuDe, content, doKho);
        this.dsCauHoi = new ArrayList<>();
    }

    public void themCauHoi(MultipleChoice q) {
        this.getDsCauHoi().add(q);
    }

    @Override
    public void hienThi() {
        System.out.println(this.getNoiDung());
        for (int i = 0; i < this.getDsCauHoi().size(); i++) {
            System.out.printf("\nTra loi cau hoi so %d: ", i + 1);
            this.getDsCauHoi().get(i).hienThi();
        }
    }

    @Override
    public String toString() {
        String s = super.toString();

        for (MultipleChoice q : this.getDsCauHoi()) {
            s += q;
        }
        return s;
    }

    public int getDoKho() {
        return doKho;
    }

    public void setDoKho(int doKho) {
        this.doKho = doKho;
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

}
