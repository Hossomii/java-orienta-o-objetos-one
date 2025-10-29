package br.com.alura.screenmatch.calculator;

import br.com.alura.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void includes(Movie f) {
//        this.totalTime += f.getMovieTimeMinutes();
//    }
//
//    public void includes(TVserie s) {
//        this.totalTime += s.getMovieTimeMinutes();
//    }

    // Tudo que for da classe Title (Class Movie e TVserie) {...}
    public void includesTime(Title title) {
        System.out.println("Adicionando duração em minutos de: " + title);
        this.totalTime += title.getMovieTimeMinutes();
    }
}
