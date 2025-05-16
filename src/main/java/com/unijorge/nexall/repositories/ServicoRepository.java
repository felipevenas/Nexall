package com.unijorge.nexall.repositories;

import com.unijorge.nexall.domain.entities.Profissional;
import com.unijorge.nexall.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
}
