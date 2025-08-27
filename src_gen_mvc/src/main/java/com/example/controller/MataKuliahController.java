package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.service.MataKuliahService;
import com.example.model.MataKuliah;

@RestController
@RequestMapping("/api/mataKuliahs")
public class MataKuliahController {

    @Autowired
    private MataKuliahService mataKuliahService;

    @PostMapping
    public MataKuliah create(@RequestBody MataKuliah entity) {
        return mataKuliahService.create(entity);
    }

    @GetMapping
    public List<MataKuliah> getAll() {
        return mataKuliahService.findAll();
    }

    @GetMapping("/{id}")
    public MataKuliah getById(@PathVariable Long id) {
        return mataKuliahService.findById(id);
    }

    @PutMapping("/{id}")
    public MataKuliah update(@PathVariable Long id, @RequestBody MataKuliah entity) {
        return mataKuliahService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        mataKuliahService.delete(id);
    }
}
