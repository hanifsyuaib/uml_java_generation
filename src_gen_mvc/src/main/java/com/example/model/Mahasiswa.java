package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Mahasiswa {

    private Integer id;
    private String nama;
    private EDate tanggalLahir;
    private String npm;
    private String email;
    private String fakultas;
    private String jurusan;
    private EFloat ipk;
    private MataKuliah matakuliah;

    public Mahasiswa() {}

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public EDate getTanggalLahir() {
        return this.tanggalLahir;
    }

    public void setTanggalLahir(EDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String getNpm() {
        return this.npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public EFloat getIpk() {
        return this.ipk;
    }

    public void setIpk(EFloat ipk) {
        this.ipk = ipk;
    }
    public MataKuliah getMatakuliah() {
        return this.matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }
}
