package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.ProgramStudi;

@Repository
public interface ProgramStudiRepository extends JpaRepository<ProgramStudi, Long> {
    // Add more here if needed
}
