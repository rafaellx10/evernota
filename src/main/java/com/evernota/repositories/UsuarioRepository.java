package com.evernota.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evernota.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);

}
