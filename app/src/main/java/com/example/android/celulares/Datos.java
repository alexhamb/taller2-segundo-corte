package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class Datos {
    private static ArrayList<Celular> celular= new ArrayList<>();

    public static void guardar (Celular c) {celular.add(c);}

    public static ArrayList<Celular> obtener() {return celular; }

public  static String Reporte1(){
    String resultado = "";
    for (int i = 0; i <celular.size() ; i++) {
        if (celular.get(i).getColor().equalsIgnoreCase("negro") && celular.get(i).getMarca().equalsIgnoreCase("samsung") && celular.get(i).getSistemaoperativo().equalsIgnoreCase("android")){
         resultado = resultado + "Celular " +(i+1)+": "+celular.get(i).getPrecio()+" - "+celular.get(i).getCapacidad()+ "\n";
        }
    }
    return resultado;
}
    public  static String Reporte4(){
        String resultado = "";
        int x=0;
        for (int i = 0; i <celular.size() ; i++) {
            if (celular.get(i).getColor().equalsIgnoreCase("negro") && celular.get(i).getMarca().equalsIgnoreCase("apple")){
                x++;
            }
        }
        return ""+x;
    }
    public  static String Reporte5(){
        String resultado = "";
        int x=0;
        double suma =0 ;
        for (int i = 0; i <celular.size() ; i++) {
            if (celular.get(i).getMarca().equalsIgnoreCase("nokia")){
               x++;
                suma = suma + celular.get(i).getPrecio();
            }
        }
        return ""+(suma/x);
    }
    }