/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.banca.ejemplo.servicio.banca.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sarti
 */
public class JacksonDtoGestionV2 {

    private List<ItemsConsultados> itemsConsultados;

    public List<ItemsConsultados> getItemsConsultados() {
        return itemsConsultados;
    }

    public void setItemsConsultados(List<ItemsConsultados> itemsConsultados) {
        this.itemsConsultados = itemsConsultados;
    }

    public JacksonDtoGestionV2() {
        this.itemsConsultados = new ArrayList<>();
    }

    public static class ItemsConsultados {

        private Object idItem;
        private String nombreItem;

        public Object getIdItem() {
            return idItem;
        }

        public void setIdItem(Object idItem) {
            this.idItem = idItem;
        }

        public String getNombreItem() {
            return nombreItem;
        }

        public void setNombreItem(String nombreItem) {
            this.nombreItem = nombreItem;
        }

    }
}
