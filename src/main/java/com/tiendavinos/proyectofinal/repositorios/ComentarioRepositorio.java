package com.tiendavinos.proyectofinal.repositorios;

import com.tiendavinos.proyectofinal.entidades.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepositorio extends JpaRepository<Comentario, String> {

}
