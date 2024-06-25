/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;
import java.util.ArrayList;
import paquete2.Arriendo;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);
        System.out.print("¿Cuántos objetos de tipo ArriendoLocalComida desea "
                + "ingresar?: ");
        int cantidadComida = lady.nextInt();
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        for (int i = 0; i < cantidadComida; i++) {
            System.out.println("Ingrese los detalles para ArriendoLocalComida "
                    + (i + 1) + ":");
            System.out.print("Nombre del arrendatario: ");
            lady.nextLine();
            String nombreArrendatario = lady.nextLine();
            System.out.print("Valor base de arriendo mensual: ");
            double valorBase = lady.nextDouble();

            ArriendoLocalComida arriendoComida = new ArriendoLocalComida
        (nombreArrendatario, valorBase);
            arriendoComida.establecerIva(10); // en porcentaje
            arriendoComida.establecerValorAgua(20.2); // en $
            arriendoComida.establecerValorLuz(40.2); // en $

            listaArriendos.add(arriendoComida);
        }

        System.out.print("¿Cuántos objetos de tipo ArriendoLocalComercial desea "
                + "ingresar?");
        int cantidadComercial = lady.nextInt();
        for (int i = 0; i < cantidadComercial; i++) {
            System.out.println("Ingrese los detalles para ArriendoLocalComercial "
                    + (i + 1) + ":");
            System.out.print("Nombre del arrendatario: ");
            lady.nextLine();
            String nombreArrendatario = lady.nextLine();
            System.out.print("Valor base de arriendo mensual: ");
            double valorBase = lady.nextDouble();

            ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial
        (nombreArrendatario, valorBase);
            arriendoComercial.establecerValorAdicionalFijo(100); // en $

            listaArriendos.add(arriendoComercial);

        }

        System.out.print("¿Cuántos objetos de tipo ArriendoLocalSesiones desea "
                + "ingresar? ");
        int cantidadSesiones = lady.nextInt();
        for (int i = 0; i < cantidadSesiones; i++) {
            System.out.println("Ingrese los detalles para ArriendoLocalSesiones "
                    + (i + 1) + ":");
            System.out.print("Nombre del arrendatario: ");
            lady.nextLine(); // Consumir el salto de línea anterior
            String nombreArrendatario = lady.nextLine();
            System.out.print("Valor base de arriendo mensual: ");
            double valorBase = lady.nextDouble();

            ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones
        (nombreArrendatario, valorBase);
            arriendoSesiones.establecerValorSillas(10); // en $
            arriendoSesiones.establecerValorAmplificacion(20); // en $

            listaArriendos.add(arriendoSesiones);
        }

        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }

        CentroComercial centro = new CentroComercial("La Pradera",
                listaArriendos);
        centro.establecerTotalArriendosBaseMensual();
        centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);

    }
}
