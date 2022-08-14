package com.app.agenda.repository;

import com.app.agenda.entity.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("telefonoRepository")
public interface TelefonoRepository extends JpaRepository<Telefono, Serializable> {
}
