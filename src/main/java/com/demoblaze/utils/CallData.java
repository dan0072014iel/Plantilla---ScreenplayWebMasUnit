package com.demoblaze.utils;

import com.demoblaze.exceptions.ExcepcionesExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.demoblaze.exceptions.ExcepcionesExcel.*;
import static com.demoblaze.utils.Constants.RUTA_EXCEL1;


public class CallData {

    private CallData () {
    }

    public static List<Map<String, String>> extractToLogin(){
        List<Map<String, String>> dataLogin = new ArrayList<>();
        try {
            dataLogin = Excel.leerDatosDeHojaDeExcel(RUTA_EXCEL1,"DatosLogin");
        } catch (IOException e) {
            throw new ExcepcionesExcel(MENSAJE_EXCEL_LOGIN + RUTA_EXCEL1, e);
        }
        return dataLogin;
    }

    public static List<Map<String, String>> extractToVariables(){
        List<Map<String, String>> url = new ArrayList<>();
        try {
            url = Excel.leerDatosDeHojaDeExcel(RUTA_EXCEL1,"Variables");
        } catch (IOException e) {
            throw new ExcepcionesExcel(MENSAJE_EXCEL_VARIABLES + RUTA_EXCEL1, e);
        }
        return url;
    }

    public static List<Map<String, String>> extractToForm() {
        List<Map<String, String>> dataFormulario = new ArrayList<>();
        try {
            dataFormulario = Excel.leerDatosDeHojaDeExcel(RUTA_EXCEL1,"DatosFormularioContacto");
        } catch (IOException e) {
            throw new ExcepcionesExcel(MENSAJE_EXCEL_FORM + RUTA_EXCEL1, e);
        }
        return dataFormulario;
    }

}
