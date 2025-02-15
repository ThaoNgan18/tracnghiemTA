/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.text.ParseException;
import java.util.function.Predicate;
import javax.sound.midi.MidiChannel;

/**
 *
 * @author thao trang
 */
public class QuanLyCauHoi {
    private List<CauHoi> cauhoi;
    private String LABEL = String.format("%s\t%-15s\t%-15s",
            "Chu De", "Noi dung", "Cap do");

    public QuanLyCauHoi() {
        this.cauhoi = new ArrayList<>();
    }

    public void themCauHoi(CauHoi q) {
        this.getCauhoi().add(q);
    }


    public void xuatNoiDung() {
        for (int i = 0; i < this.cauhoi.size(); i++) {
            System.out.printf("%d) %s\n", i + 1, this.cauhoi.get(i).getNoiDung());
        }

    }

    public QuanLyCauHoi traCuuTheoDoKho(int doKho) {
        QuanLyCauHoi result = new QuanLyCauHoi();
        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi.getCapDo() == doKho) {
                result.themCauHoi(cauHoi);
            }
        }

        return result;
    }

    public QuanLyCauHoi traCuuTheoNoiDung(String nd) {
        QuanLyCauHoi result = new QuanLyCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi.getNoiDung().toLowerCase().contains(nd.toLowerCase())) {
                result.themCauHoi(cauHoi);
            }
        }

        return result;
    }

    public QuanLyCauHoi traCuuTheoDanhMuc(String danhMuc) {
        QuanLyCauHoi result = new QuanLyCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi.getDanhMuc().toLowerCase().contains(danhMuc.toLowerCase())) {
                result.themCauHoi(cauHoi);
            }
        }

        return result;
    }
    
    public QuanLyCauHoi danhSachTheoMultipleChoice(int n) {
        QuanLyCauHoi result = new QuanLyCauHoi();
        int dem = 0;

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof MultipleChoice && dem < n) {
                dem++;
                result.themCauHoi(cauHoi);
            }
        }

        return result;
    }

    public CauHoi ngauNhienInComplete(String mucDo) {
        QuanLyCauHoi result = new QuanLyCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof InComplete && cauHoi.getCapDo() == mucDo) {
                result.themCauHoi(cauHoi);
            }
        }

        int sl = (int) (Math.random() * result.getCauhoi().size());
        return result.getCauhoi().get(sl);
    }

    public CauHoi ngauNhienConversation(int doKho) {
        QuanLyCauHoi result = new QuanLyCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof Conversation && cauHoi.getCapDo() == doKho) {
                result.themCauHoi(cauHoi);
            }
        }

        int sl = (int) ((Math.random() * result.getCauhoi().size()));
        return result.getCauhoi().get(sl);
    }

    public int soLuongMultipleChoice() {
        int dem = 0;

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof MultipleChoice) {
                dem++;
            }
        }

        return dem;
    }

    public CauHoi ngauNhienMultipleChoice(int doKho) {
        QuanLyCauHoi result = new QuanLyCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof MultipleChoice && cauHoi.getCapDo() == doKho) {
                result.themCauHoi(cauHoi);
            }
        }

        int sl = (int) ((Math.random() * (result.getCauhoi().size() - 0)) + 0);
        return result.getCauhoi().get(sl);
    }

    public void hienThi() {
        for (CauHoi cauHoi : cauhoi) {
            cauHoi.hienThi();
        }
    }

    /**
     * @return the cauhoi
     */
    public List<CauHoi> getCauhoi() {
        return cauhoi;
    }

    /**
     * @param cauhoi the cauhoi to set
     */
    public void setCauhoi(List<CauHoi> cauhoi) {
        this.cauhoi = cauhoi;
    }

}