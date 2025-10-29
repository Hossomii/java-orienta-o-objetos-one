package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Welcome to the jungle");
        minhaMusica.setCantor("Guns n Roses");

        // Simular reproduções
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        // Simular curtidas
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Gustavo Guanabara");

        for (int i = 0; i < 351; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 98; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
