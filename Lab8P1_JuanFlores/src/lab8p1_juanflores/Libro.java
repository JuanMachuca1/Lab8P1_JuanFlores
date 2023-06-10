/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_juanflores;


public class Libro {
    
    private String titulo;
    private String autor;
    private int año;

    public Libro(String titulo,String autor,int año){
        
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    public Libro(){
        
    }
    
    public String getTitulo() {
        return titulo;
        
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

   public void setAño(int año){
       this.año = año;
   }
   
   public int getAño(){
       return año;
   }
    
    
    

    
}
