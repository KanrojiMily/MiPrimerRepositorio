/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lyliseeu
 */
public class EstructuraDeDatosGITHUB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlgoritmosDeOrdenamiento ordenar=new AlgoritmosDeOrdenamiento();
        int vector1[]={5,6,3,44,22,1};
        int vector2[]={55,4,43,2,10};
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo Ordenado con Burbuja 1");
        ordenar.burbuja1(vector1);
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo Ordenado con Burbuja 2");
        ordenar.burbuja1(vector2);
        ordenar.mostrarArreglo(vector2);
    }
    
}
