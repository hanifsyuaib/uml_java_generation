package com.example.service;

import java.util.List;
import com.example.model.Mahasiswa;

public interface MahasiswaService {

    Mahasiswa create(Mahasiswa entity);

    List<Mahasiswa> findAll();

    Mahasiswa findById(Long id);

    Mahasiswa update(Long id, Mahasiswa entity);

    void delete(Long id);
}
