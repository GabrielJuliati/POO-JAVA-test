package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var filmeDoGabriel = new Filme("Distrito 9", 2009);
        filmeDoGabriel.avalia(10);

        Filme f1 = filmeDoGabriel;


        Serie lost = new Serie("Lost", 2000);

        //----------------------------------------------

        List<Titulo> lista = new LinkedList<>();

        lista.add(filmeDoGabriel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }


        ArrayList<String> buscsaPorArtista = new ArrayList<>();
        buscsaPorArtista.add("Adam Sandler");
        buscsaPorArtista.add("Gabriel");
        buscsaPorArtista.add("Paulo");
        buscsaPorArtista.add("Jacqueline");

        System.out.println(buscsaPorArtista);

        Collections.sort(buscsaPorArtista);
        System.out.println("Depois da ordenação: " + buscsaPorArtista);

        System.out.println("Lista desordenada: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        System.out.println("\nExibindo o nome dos titulos ordenadamente da lista: ");
        for (Titulo item: lista) {
            System.out.println(item.getNome());
        }

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano:\n" + lista);
    }
}