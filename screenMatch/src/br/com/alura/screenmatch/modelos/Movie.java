package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculator.Classifying;

// Movie herda caracteristicas de Title
public class Movie extends Title implements Classifying {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassifying() {
        return (int) getAverageReview() / 2;
    }
}
