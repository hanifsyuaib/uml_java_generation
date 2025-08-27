package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.service.ProgramStudiService;
import com.example.model.ProgramStudi;
import com.example.repository.ProgramStudiRepository;

@Service
public class ProgramStudiServiceImpl implements ProgramStudiService {

    @Autowired
    private ProgramStudiRepository programStudiRepository;

    @Override
    public ProgramStudi create(ProgramStudi entity) {
        return programStudiRepository.save(entity);
    }

    @Override
    public List<ProgramStudi> findAll() {
        return programStudiRepository.findAll();
    }

    @Override
    public ProgramStudi findById(Long id) {
        return programStudiRepository.findById(id).orElse(null);
    }

    @Override
    public ProgramStudi update(Long id, ProgramStudi entity) {
        if (programStudiRepository.existsById(id)) {
            entity.setId(id);
            return programStudiRepository.save(entity);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        programStudiRepository.deleteById(id);
    }
}
