/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

import com.btl.main.main;
import static com.btl.tracnghiemta.CauHinh.c;
import static com.btl.tracnghiemta.CauHinh.f;
import static com.btl.tracnghiemta.CauHinh.sc;
import java.io.File;
//import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author thao trang
 */
public class HocVien {

    private static int dem = 0;
    private int maHocVien;
    private String hoTen;
    private Date ngaySinh;
    private Date ngayGiaNhap;
    private String gioiTinh;
    private String queQuan;
    private ThanhTich thanhTich;

    private static CheckData check = new CheckData();

    {
       ngayGiaNhap = c.getTime();
       dem++;
       maHocVien = dem;
    }

    public HocVien() {

    }

    public HocVien(String hoTen, Date ngaySinh, String gioiTinh, String queQuan, Date ngayGiaNhap) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngayGiaNhap = ngayGiaNhap;
    }

    public HocVien(String hoTen, Date ngaySinh, String gioiTinh, String queQuan, ThanhTich thanhTich) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.thanhTich = thanhTich;
    }

//    public HocVien(String hoTen, String ngaySinh, int gioiTinh, String queQuan) throws ParseException{
//        this(hoTen, f.parse(ngaySinh), gioiTinh, queQuan);
//    }
    @Override
    public String toString() {
        return String.format("%d"
                + "\t%-20s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s", this.getMaHocVien(), check.chuanHoa(this.getHoTen()), check.chuanHoa(this.getGioiTinh()),
                check.chuanHoa(this.getQueQuan()), check.xuatNgayThangNam(this.getNgaySinh()), check.xuatNgayThangNam(this.getNgayGiaNhap()));
    }

    public void nhapThongTin() throws ParseException {
        System.out.println(" ");
        System.out.print("Ho Ten: ");
        this.setHoTen(CauHinh.sc.nextLine());

        System.out.print("Gioi Tinh: ");
        this.setGioiTinh(CauHinh.sc.nextLine());

        System.out.print("Ngay Sinh (dd/MM/yyyy): ");
        this.setNgaySinh(check.nhapNgayThangNam(CauHinh.sc.nextLine()));

        System.out.print("Que Quan: ");
        this.setQueQuan(CauHinh.sc.nextLine());

    }

//    public void docThongTin() throws FileNotFoundException {
//        File file = new File("src/main/resoures/Data.txt");
//        Scanner scanner = new Scanner(file);
//        System.out.printf("%s\t%-20s\t%-15s\t%-15s\t%-15s\t%-15s",
//               "ID", "Ho Ten", "Gioi Tinh",  "Ngay Sinh","Que Quan", "Ngay Gia Nhập");
//        while (scanner.hasNextLine()) {
//            String id = scanner.nextLine();
//            String ten = scanner.nextLine();
//            String gioiTinh = scanner.nextLine();
//            String ngaySinh = scanner.nextLine();
//            String queQuan = scanner.nextLine();
//            String ngayGiaNhap = scanner.nextLine();
//            
//            System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s",id, ten, gioiTinh, ngaySinh, queQuan, ngayGiaNhap);
//        }
//        scanner.close();
//    }
//        public void docThongTin() throws FileNotFoundException, ParseException {
//        File file = new File("src/main/resoures/Data.txt");
//        Scanner scanner = new Scanner(file);
//        System.out.printf("%s\t%-20s\t%-15s\t%-15s\t%-15s\t%-15s",
//               "ID", "Ho Ten", "Gioi Tinh",  "Ngay Sinh","Que Quan", "Ngay Gia Nhập");
//        while (scanner.hasNextLine()) {
//            maHocVien = scanner.nextInt();
//            CauHinh.sc.nextLine();
//            hoTen = scanner.nextLine();
//            gioiTinh = scanner.nextLine();
//            Date ns = f.parse(scanner.nextLine());
//            ngaySinh = ns;
//            queQuan = scanner.nextLine();
////            ngayGiaNhap = scanner.nextLine();
//      
//            System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s",maHocVien, hoTen, gioiTinh, ngaySinh, queQuan, this.ngayGiaNhap);
//               
//        }
//        scanner.close();
//    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the maHocVien
     */
    public int getMaHocVien() {
        return maHocVien;
    }
    
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayGiaNhap
     */
    public Date getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    /**
     * @param ngayGiaNhap the ngayGiaNhap to set
     */
    public void setNgayGiaNhap(Date ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the thanhTich
     */
    public ThanhTich getThanhTich() {
        return thanhTich;
    }

    /**
     * @param thanhTich the thanhTich to set
     */
    public void setThanhTich(ThanhTich thanhTich) {
        this.thanhTich = thanhTich;
    }
    
       //kiểm tra
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HocVien hv = (HocVien) obj; //ép kiểu đối tượng obj thành Học viên
        return getMaHocVien() == hv.getMaHocVien();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaHocVien());
    }
}
