package com.example.service;

import java.util.List;
import com.example.model.ProgramStudi;

public interface ProgramStudiService {

    ProgramStudi create(ProgramStudi entity);

    List<ProgramStudi> findAll();

    ProgramStudi findById(Long id);

    ProgramStudi update(Long id, ProgramStudi entity);

    void delete(Long id);
}
