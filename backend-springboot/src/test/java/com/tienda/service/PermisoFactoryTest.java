package com.tienda.service;

import com.tienda.model.factory.PermisoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PermisoFactoryTest {

    @Test
    void testPermisoAdminLecturaEscritura() {
        String resultado = PermisoFactory.obtenerPermisoBD("ADMIN");
        assertEquals("LECTURA_ESCRITURA", resultado);
    }

    @Test
    void testPermisoClienteSoloLectura() {
        String resultado = PermisoFactory.obtenerPermisoBD("CLIENTE");
        assertEquals("LECTURA", resultado);
    }

    @Test
    void testPermisoRolInvalido() {
        String resultado = PermisoFactory.obtenerPermisoBD("INVITADO");
        assertEquals("ACCESO_DENEGADO", resultado);
    }
}