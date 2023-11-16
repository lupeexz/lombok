package com.Lupezx.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lupezx.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
