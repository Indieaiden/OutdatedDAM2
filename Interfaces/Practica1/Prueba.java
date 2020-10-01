package Interfaces.Practica1;

/**
 * Creo una clase sencilla que se llama Prueba para sacar por mensaje mi nombre.
 * 
 * Atributos Nombre - Un string con el nombre
 * 
 * Métodos Void - main
 */

public class Prueba {
  String nombre = new String("Jorge");

  public static void main(String[] args) {
    Prueba myObj = new Prueba();
    System.out.println(myObj.nombre);
  }
}