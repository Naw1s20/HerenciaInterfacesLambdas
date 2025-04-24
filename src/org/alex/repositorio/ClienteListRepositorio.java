package org.alex.repositorio;

import org.alex.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements FullRepo{

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porID(Integer id) {
       Cliente resultado = null;
       for (Cliente cli: dataSource){
           if (cli.getId().equals(id) && (cli != null)){
               resultado = cli;
               break;
           }
       }
       return resultado;
    }

    @Override
    public void crear(Cliente c) {
        this.dataSource.add(c);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porID(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        dataSource.remove(this.porID(id));
    }

    @Override
    public List<Cliente> listar(String campo, Enum dir) {
        dataSource.sort((a, b) -> {
                int resultado = 0;

                if (dir == Direccion.ASC){
                    switch (campo){
                        case ("id") ->
                            resultado = a.getId().compareTo(b.getId());
                        case ("nombre") ->
                            resultado = a.getNombre().compareTo(b.getNombre());
                        case ("apellido") ->
                            resultado = a.getApellido().compareTo(b.getApellido());
                    }
                }
                else if (dir== Direccion.DESC){

                }
                return resultado;

        });
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


}
