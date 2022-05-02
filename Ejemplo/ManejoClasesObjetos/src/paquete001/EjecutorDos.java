/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete001;
import paqueteuno.FacturaTelefono;
/**
 *
 * @author camil
 */
public class EjecutorDos {
    public static void main(String[] args) {
        FacturaTelefono telefono = new FacturaTelefono();
        telefono.establecerMinutosMes(200);
        telefono.establecerNumeroTelefono("0989204851");
        telefono.establecerValorMinuto(0.20);
        telefono.calcularValorFactura();
        System.out.printf("Factura de Teléfono\n\nNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\nValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", telefono.obtenerNumeroTelefono(),
                telefono.obtenerMinutosMes(), telefono.obtenerValorMinuto(),
                telefono.obtenerValorFactura());
    }
    
}
