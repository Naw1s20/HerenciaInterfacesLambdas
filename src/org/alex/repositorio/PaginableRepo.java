package org.alex.repositorio;

import org.alex.modelo.Cliente;

import java.util.List;

public interface PaginableRepo {
    List<Cliente> listar(int desde, int hasta);
}
