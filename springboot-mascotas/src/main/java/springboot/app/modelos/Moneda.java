package springboot.app.modelos;

import jakarta.persistence.*;

import java.util.Optional;

@Entity
@Table(name = "Moneda")
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String nombre;

    double valor;

    

   


    public Moneda() {

    }

    public Moneda( String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor ;
     
    }


   
    public int getValor() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

   
   


}
