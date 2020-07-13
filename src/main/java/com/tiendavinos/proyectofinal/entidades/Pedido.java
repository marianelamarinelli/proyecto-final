/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendavinos.proyectofinal.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Pedido {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    private Cliente cliente;
    private List<Vino> listadoVinos;
    private Double precioTotal;
    private String direccionEnvio;
    private String medioDePago;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    
}
