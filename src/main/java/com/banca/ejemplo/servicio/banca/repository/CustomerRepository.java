/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.banca.ejemplo.servicio.banca.repository;

import com.banca.ejemplo.servicio.banca.entities.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sarti
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
