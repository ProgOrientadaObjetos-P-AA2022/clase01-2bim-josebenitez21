/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author M S I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            apellidos = entrada.nextLine()
            cedula = entrada.nextLine()
            edad = entrada.nextInt()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        Scanner entrada = new Scanner(System.in);
        String option;
        String mensaje;
        String nombreEst;
        String Ape;
        String iden;
        int edad;

        System.out.println("Ingresa 1 para introducir datos de Estudiante Presencial"
                + "o 2 para introducir datos de Estudiante a Distancia ");
        option = entrada.nextLine();

        if (option.equals("1") || option.equals("2")) {

            System.out.println("Bienvenido a nuestra Plataforma de Informacion\n");
            System.out.println("Ingrese su nombre");
            nombreEst = entrada.nextLine();
            System.out.println("Ingrese su Apellido");
            Ape = entrada.nextLine();
            System.out.println("Ingrese su Identifiacion");
            iden = entrada.nextLine();
            System.out.println("Ingrese su Edad");
            edad = entrada.nextInt();
            switch (option) {
                case "1":
                    mensaje = presencial(nombreEst, Ape, iden, edad);
                    System.out.println(mensaje);
                    break;
                case "2":
                    mensaje = distancia(nombreEst, Ape, iden, edad);
                    System.out.println(mensaje);
                    break;

                default:

            }
        } else {
            System.out.println("Error, opcion no valida.");
        }

    }

    public static String presencial(String nombreEst, String Ape, String iden,
            int edad) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        EstudiantePresencial estudiante = new EstudiantePresencial();
        int numCre;
        double costoCre;

        System.out.println("Ingrese el numero de creditos");
        numCre = entrada.nextInt();
        System.out.println("Ingrese el costo de cada credito");
        costoCre = entrada.nextDouble();
        estudiante.establecerNombresEstudiante(nombreEst);
        estudiante.establecerApellidoEstudiante(Ape);
        estudiante.establecerIdentificacionEstudiante(iden);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerCostoCredito(costoCre);
        estudiante.establecerNumeroCreditos(numCre);
        estudiante.calcularMatriculaPresencial();

        String cadena;
        cadena = String.format("%s\n", estudiante);
        return cadena;

    }

    public static String distancia(String nombreEst, String Ape, String iden,
            int edad) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        EstudianteDistancia estudiantedis = new EstudianteDistancia();

        int numeroAsig;
        double costoAsig;

        System.out.println("Ingrese el numero de asignaturas");
        numeroAsig = entrada.nextInt();
        System.out.println("Ingrese el costo de las asignaturas");
        costoAsig = entrada.nextDouble();
        estudiantedis.establecerNombresEstudiante(nombreEst);
        estudiantedis.establecerApellidoEstudiante(Ape);
        estudiantedis.establecerIdentificacionEstudiante(iden);
        estudiantedis.establecerEdadEstudiante(edad);
        estudiantedis.establecerNumeroAsginaturas(numeroAsig);
        estudiantedis.establecerCostoAsignatura(costoAsig);
        estudiantedis.calcularMatriculaDistancia();

        String cadena;
        cadena = String.format("%s\n", estudiantedis);
        return cadena;
    }

}
