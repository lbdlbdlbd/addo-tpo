package com.uade.adoo_tpo.estadoReserva.impl;

import com.uade.adoo_tpo.domain.Reservas;
import com.uade.adoo_tpo.estadoReserva.Estado;

public class Pagada implements Estado {

    @Override
    public void cancelar(Reservas reservas) {

    }

    @Override
    public void pagar(Reservas reservas) {

    }

    private void generarFactura(){

    }
}
