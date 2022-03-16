/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lyliseeu
 */
public class AlgoritmosDeOrdenamiento {
    int i,j,temporal,pasadas;
    public AlgoritmosDeOrdenamiento(){
        this.i=0;
        this.j=0;
        this.temporal=0;
    }
    //Metodo Burbuja Version 1
    public void burbuja1(int [] arreglo){
        pasadas=0;
        for(i=0;i<arreglo.length;i++){
            for(j=i+1;j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){
                    temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Terminó en " + pasadas + " Pasadas");
    }
    //Metodo Burbuja Version 2
    public void burbuja2(int [] arreglo){
        pasadas=0;
         for(i=1;i<arreglo.length;i++){
            for(j=0;j<arreglo.length-1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    temporal=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
                pasadas++;
            }
        }
         System.out.println("Terminó en " + pasadas + " Pasadas");
    }
    //Mostrar los datos del vector
    public void mostrarArreglo(int [] arreglo){
        int k;
        for (k=0;k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");
            
        }
        System.out.println();
    }
}
