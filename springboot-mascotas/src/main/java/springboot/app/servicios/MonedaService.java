package springboot.app.servicios;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.app.dtos.monedaDTO;
import springboot.app.modelos.Moneda;
import springboot.app.repositorios.monedaRepository;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("monedaServicio")
public class MonedaService implements BaseService<Moneda>{

    @Autowired
    private monedaRepository monedaRespository;

    @Transactional
    public monedaDTO findByNombre(String nombre)throws Exception{

        var resultado = monedaRespository.findByNombre(nombre);
        try{
           return new monedaDTO(resultado.getNombre(), resultado.getValor());
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Override
    @Transactional
    public List<Moneda> findAll() throws Exception {
        return monedaRespository.findAll();
    }

    @Override
    @Transactional
    public Moneda findById(Long id) throws Exception {
        try{
            Optional<Moneda> moneda = monedaRespository.findById(id);
            return moneda.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Moneda save(Moneda entity) throws Exception {
        try{
            return monedaRespository.save(entity);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Moneda update(Long id, Moneda entity) throws Exception {
        try{
            Optional<Moneda> entityOpcional = monedaRespository.findById(id);
            Moneda moneda = entityOpcional.get();
            moneda = monedaRespository.save(entity);
            return moneda;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try{
            if(monedaRespository.existsById(id)){
                monedaRespository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
