package br.com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int releaseYear;
    private boolean inclusoNoPlano;
    private int movieTimeMinutes;
    private double sumReview;
    private int totalReviews;


    // Set serve para passar um valor, ex: armazenar o nome de um filme na variável name
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setMovieTimeMinutes(int movieTimeMinutes) {
        this.movieTimeMinutes = movieTimeMinutes;
    }

    public void setReview(double review) {
        sumReview += review; // Soma as notas das avaliações
        totalReviews++; // Incrementa o número total de avaliações
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    // Get serve para retornar/imprimir uma informação/soma/dado com segurança
    public double getAverageReview() {
        return sumReview/totalReviews;
    }

    public String getName() {
        return this.name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public boolean getInclusoNoPlano() {
        return this.inclusoNoPlano;
    }

    public int getMovieTimeMinutes() {
        return movieTimeMinutes;
    }

    public int getMovieTimeHours() {
        return this.movieTimeMinutes / 60;
    }

    public int getTotalReviews() {
        return this.totalReviews;
    }
}
