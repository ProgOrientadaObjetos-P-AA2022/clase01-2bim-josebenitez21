/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(20000);
        //System.out.println(edf1);
        Edificio edf2 = new Edificio("Edificio Sur");
        edf2.establecerCostos(30000);

        Edificio edf3 = new Edificio("Edificio Norte");
        edf3.establecerCostos(10000);

        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(5000);

        /*
        Edificio [] edificios = new Edificio [4];
        edificios [0]= edf1; 
        edificios [1]= edf2; 
        edificios [2]= edf3; 
        edificios [3]= edf4; 
         */
        Edificio[] edificios = {edf1, edf2, edf3, edf4};

        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        // Imprimir el costo de los bienes inmuebles de la empresa.
        Empresa miEmpresa = new Empresa();
        miEmpresa.establecerNombre("Empresa de Hojas");
        miEmpresa.establecerEdificios(edificios);
        miEmpresa.establecerCostoBienesInmuebles();

        Vehiculo veh1 = new Vehiculo("Auto");
        veh1.establecerValor(10000);
        veh1.establecerMatricula("LBB0011");
        //System.out.println(edf1);
        Vehiculo veh2 = new Vehiculo("Camioneta");
        veh2.establecerValor(20000);
        veh2.establecerMatricula("LCB0011");

        Vehiculo veh3 = new Vehiculo("Auto");
        veh3.establecerValor(6000);
        veh3.establecerMatricula("LBD0012");

        Vehiculo veh4 = new Vehiculo("Camioneta");
        veh4.establecerValor(10000);
        veh4.establecerMatricula("LCC0011");

        Vehiculo veh5 = new Vehiculo("Camioneta");
        veh5.establecerValor(25000);
        veh5.establecerMatricula("LDC0011");

        Vehiculo[] miVehiculo = {veh1, veh2, veh3, veh4, veh5};
        //Empresa miEmpresaVe = new Empresa();
        miEmpresa.establecerVehiculo(miVehiculo);
        miEmpresa.establecerCostoBienesInmuebles1();
        miEmpresa.establecerTotalBienes();
        //System.out.printf("%.2f",miEmpresa.obtenerCostoBienesInmuebles());
        System.out.printf("%s\n", miEmpresa);
        //System.out.printf("%s\n", miEmpresaVe);
    }
}
