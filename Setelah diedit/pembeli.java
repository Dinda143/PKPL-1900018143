package com.company;
public class pembeli extends obat {
    private String id_pembeli;
    private Integer umur_pembeli;
    private String nama_pembeli;
    private Integer beli;
    public pembeli() {};
    public pembeli(String id_pembeli, Integer umur_pembeli, String nama_pembeli,Integer beli) {
        this.id_pembeli = id_pembeli;
        this.umur_pembeli = umur_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.beli=beli;
    }

    public String getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(String id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public Integer getUmur_pembeli() {
        return umur_pembeli;
    }

    public void setUmur_pembeli(Integer umur_pembeli) {
        this.umur_pembeli = umur_pembeli;
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public Integer getBeli() {
        return beli;
    }
    public void setBeli(Integer beli) {
        this.beli = beli;
    }
    public Integer getStokAkhir() {
        return getStok() - beli;
    }
}
