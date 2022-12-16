/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.banca.ejemplo.servicio.banca.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sarti
 */
public class JacksonDtoJsonGestion {

    private JsonAduanas jsonAduanas;

    public JsonAduanas getJsonAduanas() {
        return jsonAduanas;
    }

    public void setJsonAduanas(JsonAduanas jsonAduanas) {
        this.jsonAduanas = jsonAduanas;
    }

    public static class JsonAduanas {

        private Object nitConsulta;
        private Object periodo;
        private Object codigoAuxiliar;
        private Object tipoAuxiliar;
        private Object tipoAuxiliarInv;
        private Object numeroDeclaracion;
        private Object tipoEstadoInv;
        private VariablesIngresadasDocumental variablesIngresadasDocumental;
        private boolean infoAutomatica;
        private boolean infoDocumental;
        private ArrayList<Item> items = new ArrayList<>();

        public JsonAduanas() {
            this.items = new ArrayList<>();
        }

        public Object getNitConsulta() {
            return nitConsulta;
        }

        public void setNitConsulta(Object nitConsulta) {
            this.nitConsulta = nitConsulta;
        }

        public Object getPeriodo() {
            return periodo;
        }

        public void setPeriodo(Object periodo) {
            this.periodo = periodo;
        }

        public Object getCodigoAuxiliar() {
            return codigoAuxiliar;
        }

        public void setCodigoAuxiliar(Object codigoAuxiliar) {
            this.codigoAuxiliar = codigoAuxiliar;
        }

        public Object getTipoAuxiliar() {
            return tipoAuxiliar;
        }

        public void setTipoAuxiliar(Object tipoAuxiliar) {
            this.tipoAuxiliar = tipoAuxiliar;
        }

        public Object getTipoAuxiliarInv() {
            return tipoAuxiliarInv;
        }

        public void setTipoAuxiliarInv(Object tipoAuxiliarInv) {
            this.tipoAuxiliarInv = tipoAuxiliarInv;
        }

        public Object getNumeroDeclaracion() {
            return numeroDeclaracion;
        }

        public void setNumeroDeclaracion(Object numeroDeclaracion) {
            this.numeroDeclaracion = numeroDeclaracion;
        }

        public Object getTipoEstadoInv() {
            return tipoEstadoInv;
        }

        public void setTipoEstadoInv(Object tipoEstadoInv) {
            this.tipoEstadoInv = tipoEstadoInv;
        }

        public VariablesIngresadasDocumental getVariablesIngresadasDocumental() {
            return variablesIngresadasDocumental;
        }

        public void setVariablesIngresadasDocumental(VariablesIngresadasDocumental variablesIngresadasDocumental) {
            this.variablesIngresadasDocumental = variablesIngresadasDocumental;
        }

        public boolean isInfoAutomatica() {
            return infoAutomatica;
        }

        public void setInfoAutomatica(boolean infoAutomatica) {
            this.infoAutomatica = infoAutomatica;
        }

        public boolean isInfoDocumental() {
            return infoDocumental;
        }

        public void setInfoDocumental(boolean infoDocumental) {
            this.infoDocumental = infoDocumental;
        }

        public ArrayList<Item> getItems() {
            return items;
        }

        public void setItems(ArrayList<Item> items) {
            this.items = items;
        }

    }

    public static class Item {

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class VariablesIngresadasDocumental {

        private ArrayList<Object> formOpcionesAduanas;
        private final Map<String, Object> variablesIngresadas = new HashMap<>();

        @JsonAnySetter
        public void setVariablesIngresadas(String key, Object value) {
            variablesIngresadas.put(key, value);
        }

        public Map<String, Object> getVariablesIngresadas() {
            return variablesIngresadas;
        }

        public ArrayList<Object> getFormOpcionesAduanas() {
            return formOpcionesAduanas;
        }

        public void setFormOpcionesAduanas(ArrayList<Object> formOpcionesAduanas) {
            this.formOpcionesAduanas = formOpcionesAduanas;
        }

    }

}
