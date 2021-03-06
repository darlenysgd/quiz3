package quiz3.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quiz3.Entidades.Cliente;
import quiz3.repositorio.ClienteRepository;

import javax.transaction.Transactional;

/**
 * Created by darle on 10/8/2017.
 */
@Service
public class ClienteServices {

    @Autowired
    ClienteRepository clienteRepository;

    @Transactional
    public Cliente crearCliente(Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }
}
