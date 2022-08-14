package com.app.agenda.repository;

import com.app.agenda.entity.Contacto;
import com.app.agenda.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("contactoRepository")
public interface ContactoRepository extends JpaRepository<Contacto, Serializable> {

    public List<Contacto> findByUsuarioCorreo(String usuarioCorreo);
}
