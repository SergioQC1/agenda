package com.app.agenda.repository;

import com.app.agenda.entity.Correo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("correoRepository")
public interface CorreoRepository extends JpaRepository<Correo, Serializable> {
}
