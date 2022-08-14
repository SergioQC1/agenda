package com.app.agenda.repository;

import com.app.agenda.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("direccionRepository")
public interface DireccionRepository extends JpaRepository<Direccion, Serializable> {
}
