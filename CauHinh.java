/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author thao trang
 */
public class CauHinh {

    public static Scanner sc = new Scanner(System.in);
    public static SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public static final GregorianCalendar c = new GregorianCalendar();
   
    public static final QuanLyCauHoi quanLyCauHoi = new QuanLyCauHoi();
//    public static final HocVien hVien = new HocVien();
    public static final QuanLyHocVien quanLyHocVien = new QuanLyHocVien();
}
