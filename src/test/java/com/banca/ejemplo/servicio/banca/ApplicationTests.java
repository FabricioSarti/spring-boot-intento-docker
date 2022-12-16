package com.banca.ejemplo.servicio.banca;

import com.banca.ejemplo.servicio.banca.dto.JacksonDtoGestionV2;
import com.banca.ejemplo.servicio.banca.dto.JacksonDtoJsonGestion;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void holaMundo() {
        String jsonTesting = "{\"jsonContribuyente\":{},\"jsonVehiculos\":{},\"jsonContadores\":{},\"jsonRepresentantes\":{},\"jsonAduanas\":{\"nitConsulta\":null,\"periodo\":null,\"codigoAuxiliar\":null,\"tipoAuxiliar\":null,\"tipoAuxiliarInv\":null,\"numeroDeclaracion\":null,\"tipoEstadoInv\":null,\"variablesIngresadasDocumental\":{\"formOpcionesAduanas\":[39],\"aduanasIDForm\":[94]},\"infoAutomatica\":false,\"infoDocumental\":true,\"items\":[{\"id\":39}]},\"tipoSolicitud\":\"1\",\"Recaudacion\":{\"items\":[]},\"UnidadesInternas\":[94]}";

        String jsonTestingII = "{\"parametrosIngresados\":[{\"idParametro\":1,\"parametroNombre\":\"nit\",\"valor\":\"106082620\"},{\"idParametro\":19,\"parametroNombre\":\"nitValidacionModal\",\"valor\":\"106082620\"},{\"idParametro\":84,\"parametroNombre\":\"aduana\",\"valor\":\"Aduana La Ermita\"},{\"idParametro\":52,\"parametroNombre\":\"noDeclaracion\",\"valor\":\"8643215\"}],\"itemsConsultados\":[{\"id\":20,\"nombreItem\":\"Bitácora de riesgo \",\"areItem\":\"53\",\"requiereOj\":false,\"requiereFecha\":false,\"tipoInformacion\":55,\"apartado\":5,\"idItem\":25},{\"id\":29,\"nombreItem\":\"Informe proceso de despacho\",\"areItem\":\"53\",\"requiereOj\":false,\"requiereFecha\":false,\"tipoInformacion\":55,\"apartado\":5,\"idItem\":35},{\"id\":1,\"nombreItem\":\"Historial de vehículos asociados al contribuyente\",\"areItem\":\"52\",\"requiereOj\":false,\"requiereFecha\":false,\"tipoInformacion\":54,\"apartado\":1,\"idItem\":2,\"solicitado\":true},{\"id\":3,\"nombreItem\":\"Historial de contadores asociados al contribuyente\",\"areItem\":\"52\",\"requiereOj\":false,\"requiereFecha\":false,\"tipoInformacion\":54,\"apartado\":1,\"idItem\":4,\"solicitado\":true},{\"id\":4,\"nombreItem\":\"Historial libros autorizados del contribuyente\",\"areItem\":\"52\",\"requiereOj\":false,\"requiereFecha\":false,\"tipoInformacion\":54,\"apartado\":1,\"idItem\":6,\"solicitado\":true}],\"unidadesInternasNotificarManual\":[90]}";

        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            JacksonDtoJsonGestion jsonListaItems = objectMapper.readValue(jsonTestingII, JacksonDtoJsonGestion.class);

            if (jsonListaItems.getJsonAduanas() != null) {
                jsonListaItems.getJsonAduanas().getItems().forEach(action -> {
                    System.out.println("info " + action.getId());
                });
            }
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ApplicationTests.class.getName()).log(Level.INFO, "ERROR " + ex.toString(), ex);
        }

        try {
            JacksonDtoGestionV2 jsonListaItems = objectMapper.readValue(jsonTestingII, JacksonDtoGestionV2.class);
            jsonListaItems.getItemsConsultados().forEach(action -> {
                System.out.println("NOMBRE ITEM V2 " + action.getNombreItem());
            });
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ApplicationTests.class.getName()).log(Level.INFO, "ERROR " + ex.toString(), ex);
        }
    }

}
