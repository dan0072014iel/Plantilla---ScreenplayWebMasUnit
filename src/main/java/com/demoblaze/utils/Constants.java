package com.demoblaze.utils;

public class Constants {

    private Constants() {
    }

    public static final int LONGITUD_CHAR = 8;
    public static final int CANTIDAD_STRING = 2;

    public static final String USUARIO = CallData.extractToLogin().get(0).get("Usuario");
    public static final String CLAVE = CallData.extractToLogin().get(0).get("Clave");

    public static final String EMAIL = CallData.extractToForm().get(0).get("email");
    public static final String NOMBRE = CallData.extractToForm().get(0).get("nombre");
    public static final String MENSAJE = CallData.extractToForm().get(0).get("mensaje");

    public static final String VALIDACION_FORMULARIO = "Thanks for the message!!";

    public static final String URL_DEV = CallData.extractToVariables().get(0).get("Url Dev");
    public static final String URL_QA = CallData.extractToVariables().get(0).get("Url QA");
    public static final String URL_PREP = CallData.extractToVariables().get(0).get("Url Prep");
    public static final String URL_PROD = CallData.extractToVariables().get(0).get("Url Prod");
    public static final String ENTORNO = CallData.extractToVariables().get(0).get("Entorno");
    public static final String NAVEGADOR = CallData.extractToVariables().get(0).get("Navegador");

    public static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public static final String RUTA_EXCEL1 = "src/main/resources/Data/DatosExcel.xlsx";

}
