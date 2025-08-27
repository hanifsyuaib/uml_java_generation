package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.service.ProgramStudiService;
import com.example.model.ProgramStudi;

@RestController
@RequestMapping("/api/programStudis")
public class ProgramStudiController {

    @Autowired
    private ProgramStudiService programStudiService;

    @PostMapping
    public ProgramStudi create(@RequestBody ProgramStudi entity) {
        return programStudiService.create(entity);
    }

    @GetMapping
    public List<ProgramStudi> getAll() {
        return programStudiService.findAll();
    }

    @GetMapping("/{id}")
    public ProgramStudi getById(@PathVariable Long id) {
        return programStudiService.findById(id);
    }

    @PutMapping("/{id}")
    public ProgramStudi update(@PathVariable Long id, @RequestBody ProgramStudi entity) {
        return programStudiService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        programStudiService.delete(id);
    }
}
