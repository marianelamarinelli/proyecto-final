package com.tiendavinos.proyectofinal.repositorios;

import com.tiendavinos.proyectofinal.entidades.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegaRepositorio extends JpaRepository<Bodega, String> {

}
