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
public class TareaModulo3_KevinFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Estudiante st=new Estudiante();
          Scanner sc = new Scanner(System.in);
        
        st.Obteniendo_datos();
        
        
        System.out.println("Ingrese la carrera que estudia el estudiante: ");
        st.Carrera=sc.nextLine();
//Imprimiendo los metodos de acceso de la clase Estudiante
        System.out.println("Para imprimir los datos ingrese el numero 1 ");
        int n=sc.nextInt();
        
        
        if(n==1)
        {
        System.out.println("Imprimiendo los datos...");
        System.out.println("Nombre: "+st.getNombre());
        System.out.println("Apellido: "+st.getApellido());
        System.out.println("Edad: "+st.getEdad());
        System.out.println("Sexo: "+st.getSexo());
        System.out.println("Carrera: "+st.getCarrera());
        }
        else
        {
            System.out.println("Volviendo a ingresar los datos: ");
            st.Obteniendo_datos();
             System.out.println("Imprimiendo los datos...");
        System.out.println("Nombre: "+st.getNombre());
        System.out.println("Apellido: "+st.getApellido());
        System.out.println("Edad: "+st.getEdad());
        System.out.println("Sexo: "+st.getSexo());
        System.out.println("Carrera: "+st.getCarrera());
        }
    }

    private static void setCarrera(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
