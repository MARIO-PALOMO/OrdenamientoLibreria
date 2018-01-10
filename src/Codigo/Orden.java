/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import Clases.Computadora;
import Intefaces.IOrdenar;
import java.util.ArrayList;
import static Libreria.Ordenamiento.ordenamientoBurbuja;
import static Libreria.Ordenamiento.visualizarResultado;
import java.util.List;


public class Orden implements IOrdenar {

    public static void main(String[] args) {

        Orden orden = new Orden();
        
        System.out.println(visualizarResultado(orden.ordenar()));
    }

    @Override
    public int[] ordenar() {

        List<Computadora> lstComputadoras = new ArrayList<>();
        lstComputadoras.add(new Computadora("ASUS", "I7", 16384, 4096));
        lstComputadoras.add(new Computadora("TOSHIBA", "PENTIUM 4", 512, 1024));
        lstComputadoras.add(new Computadora("HP", "I3", 4096, 1024));
        lstComputadoras.add(new Computadora("DELL", "CORE 2", 2048, 1024));
        lstComputadoras.add(new Computadora("LENOVO", "I5", 8192, 2048));

        int[] elementos = new int[lstComputadoras.size()];
        for (int i = 0; i < lstComputadoras.size(); i++) {
            elementos[i] = lstComputadoras.get(i).getVRamVideo();
        }

        return ordenamientoBurbuja(elementos);

    }

}
