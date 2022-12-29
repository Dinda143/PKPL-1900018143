package com.company;
public class pegawai extends obat{
    private Integer id_pegawai;
    private String nama_pegawai;
    private Integer umur_pegawai;
    private String jabatan_pegawai;
    private String alamat;
    public pegawai() {};
    public pegawai(Integer id_pegawai,String nama_pegawai,Integer umur_pegawai,String jabatan_pegawai, String alamat) {
        this.id_pegawai=id_pegawai;
        this.nama_pegawai=nama_pegawai;
        this.umur_pegawai=umur_pegawai;
        this.jabatan_pegawai=jabatan_pegawai;
        this.alamat=alamat;
    }
    public Integer getId_pegawai() {
        return id_pegawai;
    }
    public void setId_pegawai(Integer id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }
    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }


    public Integer getUmur_pegawai() {
        return umur_pegawai;
    }
    public void setUmur_pegawai(Integer umur_pegawai) {
        this.umur_pegawai = umur_pegawai;
    }


    public String getJabatan_pegawai() {
        return jabatan_pegawai;
    }
    public void setJabatan_pegawai(String jabatan_pegawai) {
        this.jabatan_pegawai =jabatan_pegawai;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat= alamat;
    }




}
