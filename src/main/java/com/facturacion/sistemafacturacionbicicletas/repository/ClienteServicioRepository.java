package com.facturacion.sistemafacturacionbicicletas.repository;

import com.facturacion.sistemafacturacionbicicletas.model.ClienteServicio; // Importa tu clase de entidad ClienteServicio
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List; // Necesario para el método de búsqueda que devolverá una lista

@Repository
public interface ClienteServicioRepository extends JpaRepository<ClienteServicio, Long>{
    List<ClienteServicio> findByNombresContainingIgnoreCase(String nombres);

}
