/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import herencia1.*;

/**
 *
 * @author M S I
 */
public class Ejecutor {
    public static void main(String[] args) {
       //1. Crear un objeto de tipo estudiante distancia.
       EstudianteDistancia estudiante = new EstudianteDistancia();
       estudiante.establecerNombresEstudiante("Jose");
       estudiante.establecerApellidoEstudiante("Benitez");
       estudiante.establecerEdadEstudiante(19);
       estudiante.establecerIdentificacionEstudiante("1105989626");
       estudiante.establecerCostoAsignatura(300);
       estudiante.establecerNumeroAsginaturas(5);
       estudiante.calcularMatriculaDistancia();
//        System.out.printf("%s - %.2f\n",estudiante.obtenerApellidoEstudiante(),
//                estudiante.obtenerMatriculaDistancia());
System.out.printf("%s\n", estudiante);
       
    }
    
}
