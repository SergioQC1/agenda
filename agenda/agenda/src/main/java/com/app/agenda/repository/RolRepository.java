package com.app.agenda.repository;

import com.app.agenda.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("rolRepository")
public interface RolRepository extends JpaRepository<Rol, Serializable> {



}
