package springboot.app.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//import springboot.app.dtos.ReportePerrosHabilidad;
import springboot.app.modelos.Moneda;

import java.util.List;

@Repository("MonedaRepository")
public interface monedaRepository extends JpaRepository<Moneda, Long> {

public Moneda findByNombre(String nombre);
    

}
