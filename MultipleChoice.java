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
public class MultipleChoice extends CauHoi {

    private static final String[] LABELS = {"A", "B", "C", "D"};
    private List<PhuongAn> choices;

    public MultipleChoice() {
    }
    public MultipleChoice(String danhMuc, String noiDung, int doKho) {
        super(danhMuc, noiDung, doKho);
        this.choices = new ArrayList<>();
    }

    @Override
    public void addChoice(PhuongAn c) {
        if (this.choices.size() < LABELS.length) {
            this.choices.add(c);
        }
    }

    public boolean isDAn(String ans) {
        for (int i = 0; i < this.choices.size(); i++) {
            if (this.choices.get(i).isCorrect() == true
                    && LABELS[i].equals(ans.toUpperCase()) == true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void hienThi() {
        System.out.println(this);

        String traLoi;
        System.out.print("Tra loi cau hoi: ");
        traLoi = CauHinh.sc.nextLine();
//        System.out.printf("%b\n", isDAn(traLoi));
    }

    //hiển thị danh sách phương án
    @Override
    public String toString() {
        String s = "\n" + super.getNoiDung() + "\n";

        for (int i = 0; i < this.choices.size(); i++) {
            s += String.format("%s.%s\n", LABELS[i], this.choices.get(i));
        }
        return s;
    }

    /**
     * @return the choices
     */
    public List<PhuongAn> getChoices() {
        return choices;
    }

    /**
     * @param choices the choices to set
     */
    public void setChoices(List<PhuongAn> choices) {
        this.choices = choices;
    }

    @Override
    public String getDanhMuc() {
        return super.getDanhMuc();
    }

    @Override
    public List<MultipleChoice> getDsCauHoi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
