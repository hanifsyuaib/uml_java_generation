package com.example.service;

import java.util.List;
import com.example.model.MataKuliah;

public interface MataKuliahService {

    MataKuliah create(MataKuliah entity);

    List<MataKuliah> findAll();

    MataKuliah findById(Long id);

    MataKuliah update(Long id, MataKuliah entity);

    void delete(Long id);
}
