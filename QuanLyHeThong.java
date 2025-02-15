///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.btl.tracnghiemta;
//
//import static com.btl.tracnghiemta.CauHinh.quanLyCauHoi;
//import static com.btl.tracnghiemta.CauHinh.sc;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
///**
// *
// * @author thao trang
// */
//public class QuanLyHeThong {
//    public static void luyenTap(HocVien thanhVien, String type, String mucDo) throws ClassNotFoundException {
//        CauHoi cauHoi = quanLyCauHoi.ngauNhienInComplete(mucDo)
//        cauHoi.hienThi();
//        int soCauDung = traLoiCauHoi(cauHoi.getDsCauHoi());
//        thanhVien.getThanhTich().setSoLanLam(thanhVien.getThanhTich().getSoLanLam() + 1);
//        thanhVien.getThanhTich().themDiem(Double.valueOf(soCauDung * (10 / cauHoi.getDsCauHoi().size())), getNgayLamBai());
//    }
//
//    public static void luyenTap(HocVien thanhVien, String type, int soLuong) throws ClassNotFoundException {
//        List<CauHoi> temp = (List<CauHoi>) quanLyCauHoi.ngauNhienMultipleChoice(soLuong);
//        List<MultipleChoice> dsCauHoi = (List<MultipleChoice>) (Object) temp;
//        int soCauDung = traLoiCauHoi(dsCauHoi);
//        thanhVien.getThanhTich().setSoLanLam(thanhVien.getThanhTich().getSoLanLam() + 1);
//        thanhVien.getThanhTich().themDiem(Double.valueOf(soCauDung * (10 / soLuong)), getNgayLamBai());
//    }
//
//    private static int traLoiCauHoi(List<MultipleChoice> dsCauHoi) {
//        List<Character> dsDapAn = new ArrayList<>();
//        int soCauDung = 0;
//        dsCauHoi.forEach(multipleChoice -> {
//            multipleChoice.hienThi();
//            multipleChoice.hienThi();
//            System.out.print("- Chon dap an: ");
//            dsDapAn.add(sc.next().toUpperCase().charAt(0));
//        });
//        System.out.println("====================");
//        for (int i = 0; i < dsCauHoi.size(); i++) {
//            MultipleChoice cauHoi = dsCauHoi.get(i);
//            dsCauHoi.get(i).hienThi();
//            int index = (dsDapAn.get(i)) - 'A';
//            boolean dapAn = index >= 0 && index < cauHoi.getDsPhuongAn().size() && cauHoi.getDsPhuongAn().get(index).isDapAn();
//            System.out.println("=> " + (dapAn ? "Dung" : "Sai"));
//            soCauDung = (dapAn) ? soCauDung + 1 : soCauDung;
//            System.out.println();
//        }
//        return soCauDung;
//    }
//}
