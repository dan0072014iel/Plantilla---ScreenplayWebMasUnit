package com.demoblaze.exceptions;

public class ResultadoNoEsperado extends AssertionError{

    public static final String INICIO_SESION_FALLO = "Verificar las credenciales ingresadas";
    public static final String ADICION_PRODUCTO_FALLO = "Volver a agregar el producto";


    public ResultadoNoEsperado(String message) {
        super(message);
    }

    public ResultadoNoEsperado(String message, Throwable cause) {
        super(message, cause);
    }


}
