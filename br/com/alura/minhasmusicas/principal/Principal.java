package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.*;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Forever");
        minhamusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhamusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhamusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("BolhaDev");
        meupodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meupodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meupodcast.curte();
        }
        MinhasPreferidas minhaspreferidas = new MinhasPreferidas();
        System.out.println("Podcast obtve " + meupodcast.getTotalDeRerpoducoes() + "" +
                " de reproduções e " + meupodcast.getCurtidas() + " curtidas.");
        System.out.println("Música obtve " + minhamusica.getCurtidas() + "" +
                " de curtidas e " + minhamusica.getTotalDeRerpoducoes() + " de reproducções.");
        minhaspreferidas.inclui(meupodcast);
        minhaspreferidas.inclui(minhamusica);
    }
}


