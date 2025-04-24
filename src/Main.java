//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.alex.repositorio.*;
import org.alex.modelo.Cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FullRepo repo =  new ClienteListRepositorio();
        repo.crear(new Cliente("pepe", "peres"));
        repo.crear(new Cliente("juan", "anton"));
        repo.crear(new Cliente("pepa", "pera"));
        repo.crear(new Cliente("pipo", "paupa"));


        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("--------paginable-------");
        List<Cliente> paginable =repo.listar(1,3);
        paginable.forEach(System.out::println);


        System.out.println("------ordenable-------");
        List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);


        clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);




    }
}
