/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author M S I
 */
public class Vehiculo {

    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String g) {
        tipo = g;
    }

    public void establecerTipo(String g) {
        tipo = g;
    }

    public void establecerMatricula(String a) {
        matricula = a;
    }

    public void establecerValor(double a) {
        valor = a;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }

    @Override
    public String toString() {
        //String reporte = String.format("%s (%.2f)", obtenerNombre(), 
        //obtenerCosto()); // las dos maneras son igual de validas debido a que 
        // estan en la misma clase.

        String reporte1 = String.format("%s %s(%.2f)", tipo, matricula, valor);
        return reporte1;
    }

}
