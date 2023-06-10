/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_juanflores;
import java.util.Scanner;
import java.util.Random;

public class Lab8P1_JuanFlores {

    static Scanner leer = new Scanner(System.in);//para enteros
    static Scanner leer2 = new Scanner(System.in);//para los Strings nombres y titulo
    static Random ran = new Random();
    
    public static void main(String[] args) {
        
        boolean menu = true;
        
        Libro[][] librero = null;
        
        while(menu){
            
            //Libro L = new Libro(); //constructor
            System.out.println("1. Crear biblioteca.");
            System.out.println("2. Modificar librero.");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    
                    librero=Llenarlibro();
                    
                    break;
                    
                case 2:
                    
                    if (librero==null){
                        System.out.println("Debe hacer el 1er caso primero");
                    }else{
                        System.out.println("ingrese el titulo del libro: ");
                        String titu = leer2.nextLine();
                        System.out.println("Ingrese el escritor: ");
                        String escritor = leer2.nextLine();
                        System.out.println("Ingrese el año de publicacion: ");
                        int añon = leer.nextInt();
                        while(añon<1){
                              System.out.println("Ingrese el año de publicacion: ");
                              añon = leer.nextInt();
                        
                        }
                     ModificarLibro(librero,titu,escritor,añon);
                    }
                    
                    break;
                    
                case 3:
                    
                    menu=false;
                    System.out.println("Has salido del menu...");
                    break;
                    
                default:
                    System.out.println("opcion invalida");
                    break;
            }
            
        }
    }
    
    //metodo para con matriz de la clase libro
    //llenar esa matriz de libro  ..titulo ..autor ..año de publicacion ..en la matriz se debe llenar solo con el nombre del libro
   
    public static Libro[][] Llenarlibro(){
        
        System.out.println("ingrese la cantidad de filas: ");
        int filas= leer.nextInt();
        while(filas<1){
            System.out.println("ingrese una cantidad positiva: ");
            filas = leer.nextInt();
        }
        System.out.println("ingrese la cantidad de columnas: ");
        int columnas=leer.nextInt();
        while(columnas<1){
            System.out.println("ingrese una cantidad positiva: ");
            filas = leer.nextInt();
        }
        
        Libro [][] librero = new Libro [filas][columnas];
        
        String titulo = "";
        String autor = "";
        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
            System.out.println("Ingrese el titulo del libro: ");
            titulo = leer2.nextLine();
            System.out.println("Ingrese el nombre del escritor: ");
            autor = leer2.nextLine();
            System.out.println("Ingrese el año de publicacion: ");
            int añoo = leer.nextInt(); 
            while(añoo<1){
                System.out.println("ingrese un año mayor a cero: ");
                añoo=leer.nextInt();
            }
            librero[i][j]=new Libro(titulo,autor,añoo);
            System.out.println("El libro fue agregado exitosamente...");
           // Libro NuevoLibro = new Libro(titulo,autor,añoo);
            }
        }
        System.out.println("El librero completo es: ");
        print(librero);
        
        return librero;
        
    }
    public static void print(Libro[][] librero){
        
     for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                               
                System.out.print("["+librero[i][j].getTitulo()+"]");
            }
            System.out.println("");
        }
    }
    
    //metodos del caso 2
    //cree un metodo llamado modificarLibro 
    //no puede ir al segundo sin hacer el primero
    public static void ModificarLibro(Libro[][]librero,String nombre,String escritor,int año){
        
        boolean si=false;

        
        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                    
                if(librero[i][j].getTitulo().equals(nombre)&& librero[i][j].getAutor().equals(escritor)&& (librero[i][j].getAño()==año)){
                      System.out.println("El libro fue encontrado en la fila "+(i+1)+ " columna "+(j+1));
                     si=true;
                }
               
            }
        }
        if (si==false){
            System.out.println("el libro no fue encontrado");
        }
        
        if(si==true){
        System.out.println("ingrese el titulo del libro: ");
        String titul = leer2.nextLine();
        System.out.println("Ingrese el escritor: ");
        String escrito = leer2.nextLine();
        System.out.println("Ingrese el año de publicacion: ");
        int añ = leer.nextInt();
        
        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                
              if(librero[i][j].getTitulo().equals(nombre)&& librero[i][j].getAutor().equals(escritor)&& (librero[i][j].getAño()==año)){
                librero[i][j].setTitulo(titul);
                librero[i][j].setAutor(escrito);
                librero[i][j].setAño(añ);
                librero[i][j].getTitulo();
                System.out.println("el libro fue modificado exitosamente");
              }            
              
            }
         }
        }
        System.out.println("el librero es modificado es: ");
        print(librero);
        
        
        
    }
}
