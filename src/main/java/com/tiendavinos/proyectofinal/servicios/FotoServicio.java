/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiendavinos.proyectofinal.servicios;

import com.tiendavinos.proyectofinal.entidades.Foto;
import com.tiendavinos.proyectofinal.errores.ErrorServicio;
import com.tiendavinos.proyectofinal.repositorios.FotoRepositorio;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FotoServicio {
    
    @Autowired
    private FotoRepositorio fotoRepositorio;
    
    @Transactional
    public Foto guardar(MultipartFile archivo) throws ErrorServicio {
        
        if (archivo != null) {
            
            try{
                Foto foto = new Foto();
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());
                
                return fotoRepositorio.save(foto);
                
            }catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        return null;
        
    }
    
}
