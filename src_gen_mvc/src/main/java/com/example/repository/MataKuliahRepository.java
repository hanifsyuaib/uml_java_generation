package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.MataKuliah;

@Repository
public interface MataKuliahRepository extends JpaRepository<MataKuliah, Long> {
    // Add more here if needed
}
