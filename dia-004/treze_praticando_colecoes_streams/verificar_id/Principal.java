package treze_praticando_colecoes_streams.verificar_id;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        System.out.println("Digite o id do cliente que deseja buscar: ");
        int idCliente = sc.nextInt();

        if (clientes.containsKey(idCliente)) {
            String nomeCliente = clientes.get(idCliente);
            System.out.println("O nome do cliente com ID " + idCliente + " é: " + nomeCliente);;
        } else {
            System.out.println("Cliente com ID " + idCliente + " não encontrado.");
        }


        sc.close();
    }
}
