package com.tienda.service.strategy;

public class PagoTarjeta implements EstrategiaPago {
    @Override
    public boolean procesarPago(double monto) {
        return monto > 0;
    }
}