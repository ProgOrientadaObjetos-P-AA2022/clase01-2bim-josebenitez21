/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author M S I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreEst;
        String nombreApe;
        String iden;
        int edad;
        int numCre;
        double costoCre;
       // double costoA;

        System.out.println("Bienvenido a nuestra Plataforma de Informacion\n");
        System.out.println("Ingrese su nombre");
        nombreEst = entrada.nextLine();
        System.out.println("Ingrese su Apellido");
        nombreApe = entrada.nextLine();
        System.out.println("Ingrese su Identifiacion");
        iden = entrada.nextLine();
        System.out.println("Ingrese su Edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el numero de creditos");
        numCre = entrada.nextInt();
        System.out.println("Ingrese el costo de cada credito");
        costoCre = entrada.nextDouble();
        
        EstudiantePresencial estudiante = new EstudiantePresencial();
        estudiante.establecerNombresEstudiante(nombreEst);
        estudiante.establecerApellidoEstudiante(nombreApe);
        estudiante.establecerIdentificacionEstudiante(iden);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerCostoCredito(costoCre);
        estudiante.establecerNumeroCreditos(numCre);
        estudiante.calcularMatriculaPresencial();
        System.out.printf("%s\n", estudiante);
        

        
        
    }

}
