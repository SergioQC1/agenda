package com.app.agenda.repository;


import com.app.agenda.entity.Rol;
import com.app.agenda.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {

    public List<Usuario> findByCorreoAndPassword(String correo, String password);
}
