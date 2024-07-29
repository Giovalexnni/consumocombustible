package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado= new Scanner(System.in);


        // Declarar variables
        int distancia;
        int consumoPor100Km;
        int precioPorLitro;
        String nombreConductor;
        String modeloCoche;

        // Solicitar datos al usuario

        System.out.print("Ingrese el nombre del conductor:");
        nombreConductor = entradaTeclado.nextLine();


        System.out.print("Ingrese el modelo del coche:");
        modeloCoche = entradaTeclado.nextLine();




        System.out.print("Ingrese la distancia total del viaje (en kilómetros):");
        distancia = entradaTeclado.nextInt();

        System.out.print("Ingrese el consumo de combustible del coche (litros por cada 100 km):");
        consumoPor100Km = entradaTeclado.nextInt();

        System.out.print("Ingrese el precio por litro de combustible:");
        precioPorLitro = entradaTeclado.nextInt();

        // Calcular el total de litros de combustible necesarios para el viaje
        double litrosCombustible = (distancia / 100) * consumoPor100Km;

        // Calcular el costo total del combustible necesario
        double costoTotal = litrosCombustible * precioPorLitro;

        // Imprimir resultados


        System.out.print("\n----- Resultados del Viaje -----");


        System.out.print("\nNombre del Conductor: " + nombreConductor);

        System.out.print("\nModelo del Coche: " + modeloCoche);

        System.out.print("\nDistancia del Viaje: " + distancia + " km");

        System.out.print("\nConsumo Total de Combustible: " + litrosCombustible + " litros");

        System.out.print("\nCosto Total del Combustible: $" + costoTotal);

        // Cerrar el escáner



    }
}