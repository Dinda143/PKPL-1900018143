package com.company;
public class obat {
    private String kode_obat;
    private String nama_obat;
    private String jenis_obat;
    private Integer stok;
    private String harga_beli;
    private String harga_jual;

    public obat(){};
    public obat(String kode_obat, String nama_obat, String jenis_obat, String harga_beli,String harga_jual, Integer stok){
        this.kode_obat = kode_obat;
        this.nama_obat = nama_obat;
        this.jenis_obat = jenis_obat;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.stok = stok;

    }
    public String getKode_obat() {
        return kode_obat;
    }
    public void setKode_obat(String kode_obat) {
        this.kode_obat= kode_obat;
    }
    public String getNama_obat() {
        return nama_obat;
    }
    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }
    public String getJenis_obat() {
        return jenis_obat;
    }
    public void setJenis_obat(String jenis_obat) {
        this.jenis_obat = jenis_obat;
    }
    public String getHarga_beli() {
        return harga_beli;
    }
    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }
    public String getHarga_jual() {
        return harga_jual;
    }
    public void setHarga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }


    public Integer getStok() {
        return stok;
    }
    public void setStok(Integer stok) {
        this.stok = stok;
    } }