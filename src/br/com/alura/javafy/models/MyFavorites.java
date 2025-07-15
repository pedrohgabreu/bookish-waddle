package br.com.alura.javafy.models;

import br.com.alura.javafy.models.Musics;

public class MyFavorites {

    public void include(Audio audio){
        if (audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " by " + audio.getCreator() + " is so good");
        } else {
            System.out.println(audio.getTitle() + " by " + audio.getCreator() + " man this thing is awful");
            }
        }
    }

