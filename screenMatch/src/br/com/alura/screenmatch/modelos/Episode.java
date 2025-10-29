package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculator.Classifying;

public class Episode implements Classifying {
    private int number;
    private String name;
    private TVserie serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TVserie getSerie() {
        return serie;
    }

    public void setSerie(TVserie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassifying() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
