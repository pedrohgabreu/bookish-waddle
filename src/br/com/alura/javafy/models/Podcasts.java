package br.com.alura.javafy.models;

public class Podcasts extends Audio{

    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getClassification() {
        if (this.getLikes() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
