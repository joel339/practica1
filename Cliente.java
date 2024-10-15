/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Joel
 */
public class Cliente extends Persona {

    private String tipoCliente;

    public Cliente(String nombre, String identificacion, String tipoCliente) {
        super(nombre, identificacion);
        this.tipoCliente = tipoCliente;
    }

    public void contactarRepresentante() {
        System.out.println(getNombre() + " está contactando a su representante.");
    }

    public void solicitarInformacion() {
        System.out.println(getNombre() + " ha solicitado información.");
    }
}
