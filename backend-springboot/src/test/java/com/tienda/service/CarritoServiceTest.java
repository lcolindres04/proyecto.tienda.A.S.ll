package com.tienda.service;

import com.tienda.service.strategy.PagoPayPal;
import com.tienda.service.strategy.PagoTarjeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CarritoServiceTest {

    @Test
    void testProcesarPagoTarjetaExitoso() {
        PagoTarjeta pago = new PagoTarjeta();
        assertTrue(pago.procesarPago(250.00));
    }

    @Test
    void testProcesarPagoMontoInvalido() {
        PagoPayPal pago = new PagoPayPal();
        assertFalse(pago.procesarPago(-10.00));
    }
}