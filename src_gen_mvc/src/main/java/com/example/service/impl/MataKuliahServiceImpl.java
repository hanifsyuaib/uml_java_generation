package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.service.MataKuliahService;
import com.example.model.MataKuliah;
import com.example.repository.MataKuliahRepository;

@Service
public class MataKuliahServiceImpl implements MataKuliahService {

    @Autowired
    private MataKuliahRepository mataKuliahRepository;

    @Override
    public MataKuliah create(MataKuliah entity) {
        return mataKuliahRepository.save(entity);
    }

    @Override
    public List<MataKuliah> findAll() {
        return mataKuliahRepository.findAll();
    }

    @Override
    public MataKuliah findById(Long id) {
        return mataKuliahRepository.findById(id).orElse(null);
    }

    @Override
    public MataKuliah update(Long id, MataKuliah entity) {
        if (mataKuliahRepository.existsById(id)) {
            entity.setId(id);
            return mataKuliahRepository.save(entity);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        mataKuliahRepository.deleteById(id);
    }
}
