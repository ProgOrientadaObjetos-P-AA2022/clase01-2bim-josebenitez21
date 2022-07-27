/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private double costoBienesInmuebles;
    private double costoBienesInmuebles1;
    private Vehiculo[] miVehiculo;
    private double totalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerCostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + obtenerEdificios()[i].obtenerCosto();

        }

        costoBienesInmuebles = suma;

    }

    public void establecerVehiculo(Vehiculo[] g) {
        miVehiculo = g;
    }

    public void establecerCostoBienesInmuebles1() {
        double suma1 = 0;

        for (int i = 0; i < miVehiculo.length; i++) {
            suma1 = suma1 + obtenerVehiculo()[i].obtenerValor();

        }
        costoBienesInmuebles1 = suma1;
    }

    public void establecerTotalBienes() {
        totalBienes = costoBienesInmuebles1 + costoBienesInmuebles;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public Vehiculo[] obtenerVehiculo() {
        return miVehiculo;
    }

    public double obtenerCostoBienesInmuebles1() {
        return costoBienesInmuebles1;
    }

    public double obtenerTotalBienes() {
        return totalBienes;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nLista de edificios\n", nombre);
        for (int i = 0; i < edificios.length; i++) {
            cadena = String.format("%s%d. %s (%.1f)\n",
                    cadena,
                    i + 1,
                    obtenerEdificios()[i].obtenerNombre().toUpperCase(),
                    obtenerEdificios()[i].obtenerCosto());
        }
        cadena = String.format("%sTotal costo Inmuebles %.1f\n", cadena, costoBienesInmuebles);
        cadena = String.format("%s\nLista de Vehiculos\n", cadena);
        for (int i = 0; i < miVehiculo.length; i++) {
            cadena = String.format("%s%d. %s, %s (%.2f)\n",
                    cadena,
                    i + 1,
                    obtenerVehiculo()[i].obtenerTipo(),
                    obtenerVehiculo()[i].obtenerMatricula(),
                    obtenerVehiculo()[i].obtenerValor());

        }
        cadena = String.format("%sTotal de inmuebles %.1f\n", cadena, costoBienesInmuebles1);
        cadena = String.format("%s\nTotal Bienes %.1f\n", cadena, totalBienes);
        return cadena;
    }

}
