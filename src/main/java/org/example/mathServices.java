package org.example;


import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class mathServices {
  //  public static void main(String[] args) {



  //  }

    public static  String Busquedalineal ( String[] list,String valor){

        String output = "-1";
        for ( int i = 0; i< list.length; i++){
            if(valor.equals(list[i])){
                output= String.valueOf(i);
            }
        }
        String respuesta= ("{operation: Busqueda lineal, inputlist"+String.join(",",list)+"value"+valor+"output"+String.valueOf(output));

        System.out.printf(respuesta);
        return output;

    }

    public static String busquedabinaria(String[] list,String valor){

         int Output= binaryrecursive(list,valor,0,list.length-1);
         String repuesta= ("{operation: Busqueda binaria, inputlist"+String.join(",",list)+"value"+valor+"output"+String.valueOf(Output));
        return String.valueOf(Output);
    }
    public static int binaryrecursive(String [] list, String valor,int left, int right ){

        if(left<=right){
            int mid = left+(right-left)/2;
            if( valor.equals(list[mid]) ){
                return  mid;
            }
            if ( Integer.parseInt(list[mid])>Integer.parseInt(valor)){
                binaryrecursive(list,valor,left,mid-1);
            }
            binaryrecursive(list,valor,left,mid-1);
        }
        return -1;
    }


}