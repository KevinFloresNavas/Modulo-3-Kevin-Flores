/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo3_kevinflores;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Estudiante {
     Scanner sc = new Scanner(System.in);
        
    String Nombre;
    String Apellido;
    String Sexo;
    String Carrera;
    int Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void Obteniendo_datos()
    {
        System.out.println("Lectura de datos");
        System.out.println("");
        System.out.println("Ingrese primer nombre del estudiante: ");
        setNombre(sc.nextLine());
        System.out.println("Ingrese primer apellido del estudiante:");
        setApellido(sc.nextLine());
        System.out.println("Ingrese sexo del estudiante: ");
        setSexo(sc.nextLine());
        System.out.println("Ingrese edad del estudiante: ");
        setEdad(sc.nextInt());
        
      
   
   
        
    
    }
    
}
