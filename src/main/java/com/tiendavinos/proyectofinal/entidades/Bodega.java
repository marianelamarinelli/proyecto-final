/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendavinos.proyectofinal.entidades;

import com.tiendavinos.proyectofinal.enums.Zona;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class Bodega {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    private String nombreBodega;
    private String direccion;
    private String correoElectronico;
    private List<Vino> listadoDeVino;
    
    
    private Zona zona;
    
}
