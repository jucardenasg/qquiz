/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Universidad universidad=new Universidad("La Nacho");
        Scanner lectura=new Scanner(System.in);
        int i=0;
        do{
            System.out.println("1.Adicionar Estudiante: ");
            System.out.println("2.Adicionar Proyecto:");
            System.out.println("3.Adicionar Estudiante a Proyecto:");
            System.out.println("4.Listar Estudiante:");
            System.out.println("5.Listar proyectos: ");
            System.out.println("6.Buscar Estudiante: ");
            
            i = lectura.nextInt();
             
            switch(i){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre=lectura.next();
                    System.out.println("Ingrese el codigo del estudiante: ");
                    int cod=lectura.nextInt();
                    
                    if(universidad.adicionarEstudiante(new Estudiante(cod,nombre))){
                        System.out.println("Se ha adicionado satisfactoriamente al estudiante");
                    }else{
                        System.out.println("Problemas al adicional al estudiante");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del proyecto: ");
                    nombre=lectura.next();             
                    
                    if(universidad.adicionarProyecto(nombre)){
                        System.out.println("Se ha creado satisfactoriamente el proyecto");
                    }else{
                        System.out.println("Problemas al realizar la creacion del Proyecto");
                    }
                    break;
                case 3:
                     HashMap<Integer, Estudiante> estudiantes = 
                              universidad.listarEstudiantes();
                     System.out.println("Seleccione el codigo del estudiante");
                
                     for (Estudiante estudiante : estudiantes.values()) {
                           System.out.println(estudiante.getCodigo()  + " . " + estudiante.getNombre() );
                     }
                     cod = lectura.nextInt();
                     Estudiante estudiante = universidad.buscarEstudiante(cod);
                     
                     System.out.println("Seleccione el proyecto");
                     ArrayList<Proyecto> proyectos = universidad.listarProyectos();
                     for (int j = 0; j < proyectos.size(); j++) {
                         System.out.println(j + " " + proyectos.get(j).getNombre());
                    }
                    cod =  lectura.nextInt();
                    
                    if(estudiante != null){
                       if(universidad.adicionarEstudianteProyecto(estudiante, cod)){
                           System.out.println("Se ha adicionado satisfactoriamente el estudiante al proyecto");
                       }else{
                           System.out.println("Problemas al adicionar al estudiante en el proyecto");
                       }
                    }
                    
                    
                    break;
                case 4:
                    
                    estudiantes = 
                              universidad.listarEstudiantes();
                                    
                     for (Estudiante _est : estudiantes.values()) {
                           System.out.println(_est.getCodigo()  + " . " + _est.getNombre() );
                     }
                     
                    break;
                case 5:
                     proyectos = universidad.listarProyectos();
                     for (int j = 0; j < proyectos.size(); j++) {
                         System.out.println(j + " " + proyectos.get(j).getNombre());
                    }
                     
                    break;
                    
                   
                case 6:
                     System.out.println("Buscar estudiante.");
                     System.out.println("Seleccione el codigo del estudiante");
                
                     estudiantes = 
                              universidad.listarEstudiantes();
                     
                     for (Estudiante _est : estudiantes.values()) {
                           System.out.println(_est.getCodigo()  + " . " + _est.getNombre() );
                     }
                     cod = lectura.nextInt();
                     estudiante = universidad.buscarEstudiante(cod);
                     
                     if(estudiante != null){
                         System.out.println(estudiante.getCodigo() + " " + estudiante.getNombre());
                         System.out.println("Esta registrado en los siguientes proyectos");
                     }else{
                         System.out.println("El estudiante seleccionado no existe");
                     }                     
                     break;
            }
            
           
        }while(i>=0 && i<=7);
            
    }
}
    

