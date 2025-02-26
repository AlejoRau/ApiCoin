package springboot.app.dtos;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Getter
public class monedaDTO {
    private long id;

    String nombre;
    double valor;

    public monedaDTO(String nombre,  double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
}
