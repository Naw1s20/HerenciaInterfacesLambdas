package org.alex.repositorio;

import org.alex.modelo.Cliente;

import java.util.List;

public interface CRUDInterface {
    List<Cliente> listar();
    Cliente porID(Integer id);
    void crear(Cliente c);
    void editar(Cliente c);
    void eliminar(Integer id);
}
