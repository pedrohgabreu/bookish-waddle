package br.com.alura.javafy.models;

public class Musics extends Audio{

    private String album;
    private String genre;


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassification() {
        if(this.getTotalStreams() > 200){
            return 10;
        } else {
            return 7;
        }
    }
}
