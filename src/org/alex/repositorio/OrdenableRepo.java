package org.alex.repositorio;

import org.alex.modelo.Cliente;

import java.util.List;

public interface OrdenableRepo {
    List<Cliente> listar(String campo, Enum dir);
}
