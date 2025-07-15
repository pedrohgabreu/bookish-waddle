package br.com.alura.jafavy.main;

import br.com.alura.javafy.models.Musics;
import br.com.alura.javafy.models.MyFavorites;
import br.com.alura.javafy.models.Podcasts;

public class Main {
    public static void main(String[] args) {
        Musics myMusic = new Musics();
        myMusic.setTitle("Get the Dutch");
        myMusic.setAlbum("Contemporary Movement");
        myMusic.setCreator("Duster");
        myMusic.setGenre("Shoegaze");
        myMusic.setDuration(286);

        for (int i = 0; i < 1000; i++) {
            myMusic.stream();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcasts myPodcast = new Podcasts();
        myPodcast.setTitle("Broxada Sinistra");
        myPodcast.setCreator("Magalzao");
        myPodcast.setDescription("Papagaio");

        for (int i = 0; i < 5000; i++) {
            myPodcast.stream();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.include(myMusic);
        favorites.include(myPodcast);
    }
}