/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thao trang
 */
public class CheckData{

    //Kiểm tra ngày nhập vào
    public Date nhapNgayThangNam(String ns) {
        Date ngay = new Date();
        try {
            ngay = CauHinh.f.parse(ns);
        } catch (Exception e) {
            System.out.println("Invalid Date");
        }
        return ngay;
    }
   
    public Date nhapThangNam(String ns) {
        Date thangNam = new Date();

        SimpleDateFormat df = new SimpleDateFormat("MM/yyyy");

        try {
            thangNam = df.parse(ns); //chuyển chuỗi thành Date
        } catch (Exception e) {
            System.out.println("Invalid Date\n");
        }
        return thangNam;
    }

    public String xuatNgayThangNam(Date ngay) {
        if (ngay != null) {
            return CauHinh.f.format(ngay);
        } else {
            return "null";
        }
    }

    public String xuatThangNam(Date thangnam) {
        if (thangnam != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
            return formatter.format(thangnam);
        } else {
            return "null";
        }
    }

    //chuyển tháng về thành số
    public int getThang(Date thang) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM");
        return Integer.parseInt(formatter.format(thang));
    }

    public int getNam(Date nam) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        return Integer.parseInt(formatter.format(nam));
    }
    
    //chuẩn hóa chuỗi ký tự người dùng nhập
    public String chuanHoa(String str){
        str = str.trim().replaceAll("\\s+", " ");
        String[] arr = str.split(" ");
        
        String s = "";
        for(String x : arr){
            s = s + (x.substring(0,1).toUpperCase() + x.substring(1));
            s = s + " ";
        }
        return s.trim();
    }
}
