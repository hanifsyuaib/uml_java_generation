package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.service.MahasiswaService;
import com.example.model.Mahasiswa;
import com.example.repository.MahasiswaRepository;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Override
    public Mahasiswa create(Mahasiswa entity) {
        return mahasiswaRepository.save(entity);
    }

    @Override
    public List<Mahasiswa> findAll() {
        return mahasiswaRepository.findAll();
    }

    @Override
    public Mahasiswa findById(Long id) {
        return mahasiswaRepository.findById(id).orElse(null);
    }

    @Override
    public Mahasiswa update(Long id, Mahasiswa entity) {
        if (mahasiswaRepository.existsById(id)) {
            entity.setId(id);
            return mahasiswaRepository.save(entity);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        mahasiswaRepository.deleteById(id);
    }
}
