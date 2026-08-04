package treze_praticando_colecoes_streams.eventos_duplicados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> eventosUnicos = new HashSet<>(eventos);

        System.out.println("Eventos unicos: " + eventosUnicos);


    }
}
