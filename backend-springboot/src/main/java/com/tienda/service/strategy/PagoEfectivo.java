package com.tienda.service.strategy;

public class PagoEfectivo implements EstrategiaPago {
    @Override
    public boolean procesarPago(double monto) {
        return monto > 0;
    }
}