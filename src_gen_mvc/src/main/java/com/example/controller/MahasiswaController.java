package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.service.MahasiswaService;
import com.example.model.Mahasiswa;

@RestController
@RequestMapping("/api/mahasiswas")
public class MahasiswaController {

    @Autowired
    private MahasiswaService mahasiswaService;

    @PostMapping
    public Mahasiswa create(@RequestBody Mahasiswa entity) {
        return mahasiswaService.create(entity);
    }

    @GetMapping
    public List<Mahasiswa> getAll() {
        return mahasiswaService.findAll();
    }

    @GetMapping("/{id}")
    public Mahasiswa getById(@PathVariable Long id) {
        return mahasiswaService.findById(id);
    }

    @PutMapping("/{id}")
    public Mahasiswa update(@PathVariable Long id, @RequestBody Mahasiswa entity) {
        return mahasiswaService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        mahasiswaService.delete(id);
    }
}
