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
public class Empleado extends Persona {

    private String departamento;

    public Empleado(String nombre, String identificacion, String departamento) {
        super(nombre, identificacion);
        this.departamento = departamento;
    }

    public void solicitudPermiso() {
        System.out.println(getNombre() + " ha solicitado un permiso.");
    }

    public void reporteHorasExtra() {
        System.out.println(getNombre() + " ha reportado horas extra.");
    }
}
