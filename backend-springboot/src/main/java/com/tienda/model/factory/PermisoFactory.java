package com.tienda.model.factory;

public class PermisoFactory {
    public static String obtenerPermiso(String rol) {
        switch (rol.toUpperCase()) {
            case "ADMIN":
                return "LECTURA_ESCRITURA";
            case "CLIENTE":
                return "LECTURA";
            default:
                return "SIN_ACCESO";
        }
    }
}
