package org.alex.repositorio;

import org.alex.modelo.Cliente;

import java.util.List;

public interface  FullRepo extends CRUDInterface, PaginableRepo,OrdenableRepo{

    List<Cliente> listar(String campo, Direccion dir);
}
