package es.ulpgc.eii.strings;

/*  Aitor Ventura Delgado
    08.03.2019
    Este método contará el número de vocales que se encuentra en una ristra habiéndose
    pasado un parámetro String y otro parámetro char. Es un método recursivo. */

public class StringUtils {
    public static int count(String s1, char a){
        //Si la ristra que tenemos está vacía
        if (s1.length() == 0){
            //Devolvemos 0
            return 0;
        }
        
        //Creamos una segunda string s2 que sea una subristra de la String s1
        String s2 = s1.substring(1);
        //Si el carácter que tenemos es el del parámetro
        if (s1.charAt(0) == a){
            //Devolvemos la cantidad de veces que tenemos el parámetro
            return count(s2, a) + 1;
        } else {
            //Si no, que se repita el proceso
            return count(s2, a);
        }
    }
}