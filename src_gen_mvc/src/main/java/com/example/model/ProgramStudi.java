package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ProgramStudi {

    private Integer id;
    private String nama;
    private String fakultas;

    public ProgramStudi() {}

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
    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
