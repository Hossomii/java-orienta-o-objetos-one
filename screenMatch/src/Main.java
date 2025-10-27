import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.TVserie;

public class Main {
    public static void main(String[] args) {
        Movie primeiroFilme = new Movie();
        primeiroFilme.setName("The Matrix");
        primeiroFilme.setReleaseYear(1999);
        primeiroFilme.setMovieTimeMinutes(136);

        primeiroFilme.exibeFichaTecnica();

        primeiroFilme.setReview(9);
        primeiroFilme.setReview(7);
        primeiroFilme.setReview(10);

        // -- Recomendado: Acessar a informação por métodos ---
        System.out.println("Total de avaliações: " + primeiroFilme.getTotalReviews());
        System.out.printf("Avaliação: %.2f\n", primeiroFilme.getAverageReview());
        System.out.println("Tempo de filme: " + primeiroFilme.getMovieTimeHours() + " horas");
        System.out.println("Incluido no plano: " + primeiroFilme.getInclusoNoPlano());

        /* -- Não recomendado --
        primerioFilme.sumReviews = 10;
        primeiroFilme.totalReviews = 1;
        Qualquer pessoa poderia facilmente alterar um dado importante do sistema.
        */

        TVserie aliceinborderland = new TVserie();
        aliceinborderland.setName("Alice in Borderland");
        aliceinborderland.setReleaseYear(2020);
        aliceinborderland.exibeFichaTecnica();
        aliceinborderland.setSeasons(3);
        aliceinborderland.setEpisodePerSeason(10);
        aliceinborderland.setMinutesPerEpisode(50);

        System.out.println("Duração para maratonar Alice in Borderland: " + aliceinborderland.getMovieTimeMinutes());
    }
}
