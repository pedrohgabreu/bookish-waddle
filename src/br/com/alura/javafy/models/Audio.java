package br.com.alura.javafy.models;

public class Audio {
    private String title;
    private int duration;
    private int totalStreams;
    private int likes;
    private int classification;
    private String creator;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void like(){
        this.likes++;
    }

    public void stream(){
        this.totalStreams++;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalStreams() {
        return totalStreams;
    }

    public void setTotalStreams(int totalStreams) {
        this.totalStreams = totalStreams;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
