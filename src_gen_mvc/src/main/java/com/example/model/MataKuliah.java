package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class MataKuliah {

    private Integer id;
    private String kode;
    private String nama;
    private Integer sks;
    private Mahasiswa mahasiswa;

    public MataKuliah() {}

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public Integer getSks() {
        return this.sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }
    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
