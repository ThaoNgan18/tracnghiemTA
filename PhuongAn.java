/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.tracnghiemta;

/**
 *
 * @author thao trang
 */
public class PhuongAn {
    
     private String content;
     private boolean correct;
     private String giaiThich;

    public PhuongAn(String content, boolean correct, String giaiThich) {
        this.content = content;
        this.correct = correct;
        this.giaiThich = giaiThich;
    }
     
     
    public PhuongAn(String content, boolean correct){
         this.content = content;
         this.correct = correct;
     }
//       public void nhapThongTin() {
//        System.out.print("-Noi dung: ");
//        this.noiDung = sc.nextLine();
//        System.out.print("- Dap an dung (0: Dung, 1: Sai): ");
//        String dapAn = sc.nextLine();
//        this.dapAn = dapAn.equals("0") || dapAn.equalsIgnoreCase("Dung");
//        System.out.print("- Giai thich: ");
//        this.giaiThich = sc.nextLine();
//
//    }
//
//    public static List<PhuongAn> nhapDsPhuongAn(int soLuong) {
//        List<PhuongAn> dsPhuongAn = new ArrayList<>();
//        for (int i = 0; i < soLuong; i++) {
//            PhuongAn phuongAn = new PhuongAn();
//            phuongAn.nhapThongTin();
//            dsPhuongAn.add(phuongAn);
//        }
//        return dsPhuongAn;
//    }

    
    @Override
    public String toString() {
        return this.content; //To change body of generated methods, choose Tools | Templates.
    }
     
    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the correct
     */
    public boolean isCorrect() {
        return correct;
    }

    /**
     * @param correct the correct to set
     */
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    /**
     * @return the giaiThich
     */
    public String getGiaiThich() {
        return giaiThich;
    }

    /**
     * @param giaiThich the giaiThich to set
     */
    public void setGiaiThich(String giaiThich) {
        this.giaiThich = giaiThich;
    }

}