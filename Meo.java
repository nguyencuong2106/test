/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class Meo {
    private String ten;
    private int tuoi;
    private String gioitinh;
    private String ngaysinh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên con mèo ");
        ten = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi con mèo ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Mời bạn nhập giới tính  ");
        gioitinh = sc.nextLine();
        System.out.println("Mời bạn nhập ngày sinh ");
        ngaysinh = sc.nextLine();
    }

    public void output() {
        System.out.println("tên con mèo là " + ten);
        System.out.println("Tuổi con mèo là " + tuoi);
        System.out.println("giới tính của con mèo" + gioitinh);
        System.out.println("Ngày sinh của con mèo " + ngaysinh);
}
}
