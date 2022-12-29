package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Kembali = "y";
        int pilihan;
        while (Kembali.equalsIgnoreCase("y")) {
            System.out.println();
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("\tAPLIKASI APOTEK KENCANA PURA");
            System.out.println("\t-------BENDOGANTUNGAN-------");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("1. Daftar Obat");
            System.out.println("2. Pembeli");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                pegawai gawai = new pegawai();
                System.out.print("Kode Obat : ");
                gawai.setKode_obat(input.next());
                System.out.print("Nama Obat : ");
                gawai.setNama_obat(input.next());
                System.out.print("Jenis Obat: ");
                gawai.setJenis_obat(input.next());
                System.out.print("Harga Beli: ");
                gawai.setHarga_beli(input.next());
                System.out.print("Harga Jual: ");
                gawai.setHarga_jual(input.next());
                System.out.print("stok      : ");
                gawai.setStok(input.nextInt());


                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++++++");
                System.out.println("\t----------- Data Obat ---------- ");
                System.out.println("++++++++++++++++++++++++++++++++++");
                System.out.println("Kode obat  : " + gawai.getKode_obat());
                System.out.println("Nama Obat  : " + gawai.getNama_obat());
                System.out.println("Jenis Obat : " + gawai.getJenis_obat());
                System.out.println("Harga Beli : " + gawai.getHarga_beli());
                System.out.println("Harga Jual : " + gawai.getHarga_jual());
                System.out.println("Stok       : " + gawai.getStok());
                System.out.println();
                System.out.print("Input data obat lagi ? y/n : ");
                Kembali = input.next();
            }
            if (pilihan == 2) {
                pembeli beli = new pembeli();
                System.out.print("Nama Pembeli               : ");
                beli.setNama_pembeli(input.next());
                System.out.print("ID Pembeli                 : ");
                beli.setId_pembeli(input.next());
                System.out.print("Jenis Obat yang akan dibeli: ");
                beli.setJenis_obat(input.next());
                System.out.print("Stok                       : ");
                beli.setStok(input.nextInt());
                System.out.print("Jumlah obat yang akan dibeli : ");
                beli.setBeli(input.nextInt());
                System.out.println();

                //Tampilan catatan transaksi pembelian obat
                System.out.println("++++++++++++++++++++++++++++++++++");
                System.out.println("\t---- Catatan Pembelian Obat ----");
                System.out.println("++++++++++++++++++++++++++++++++++");
                System.out.println("Nama Pembeli            :" +  beli.getNama_pembeli());
                System.out.println("ID Pembeli              :" + beli.getId_pembeli());
                System.out.println("Jenis Obat yang dibeli  : " + beli.getJenis_obat());
                System.out.println("Jumlah awal stok obat   : " + beli.getStok());
                System.out.println("Jumlah obat yang dibeli : " + beli.getBeli());
                System.out.println("Stok Akhir              : " + beli.getStokAkhir());
                System.out.println();

                System.out.print("Kembali ke menu ? y/n : ");
                Kembali = input.next();
                System.out.close();
            }

        }
            }
        }



