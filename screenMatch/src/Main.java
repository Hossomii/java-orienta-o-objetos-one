import br.com.alura.screenmatch.calculator.RecommendationFilter;
import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.TVserie;

public class Main {
    public static void main(String[] args) {
        // Criação e configuração do primeiro filme
        Movie primeiroFilme = new Movie();
        primeiroFilme.setName("The Matrix");
        primeiroFilme.setReleaseYear(1999);
        primeiroFilme.setMovieTimeMinutes(136);

        // Exibição da ficha técnica do primeiro filme
        primeiroFilme.exibeFichaTecnica();

        // Adicionando avaliações ao primeiro filme
        primeiroFilme.setReview(9);
        primeiroFilme.setReview(7);
        primeiroFilme.setReview(10);

        // -- Recomendado: Acessar e exibir informação por métodos ---
        System.out.println("Total de avaliações: " + primeiroFilme.getTotalReviews());
        System.out.printf("Avaliação: %.2f\n", primeiroFilme.getAverageReview());
        System.out.println("Tempo de filme: " + primeiroFilme.getMovieTimeMinutes() + " horas");
        System.out.println("Incluido no plano: " + primeiroFilme.getInclusoNoPlano());

        /* -- Não recomendado --
        Acesso direto aos atributos públicos (violaria o encapsulamento)
        primerioFilme.sumReviews = 10;
        primeiroFilme.totalReviews = 1;
        Qualquer pessoa poderia facilmente alterar um dado importante do sistema.
        */

        // Criação e configuração da série "Alice in Borderland"
        TVserie aliceinborderland = new TVserie();
        aliceinborderland.setName("Alice in Borderland");
        aliceinborderland.setReleaseYear(2020);
        aliceinborderland.exibeFichaTecnica();
        aliceinborderland.setSeasons(3);
        aliceinborderland.setEpisodePerSeason(10);
        aliceinborderland.setMinutesPerEpisode(50);

        // Exibindo o tempo total necessário para maratonar a série
        System.out.println("Duração para maratonar Alice in Borderland: " + aliceinborderland.getMovieTimeMinutes());

        // Criação e configuração de um segundo filme
        Movie segundoFilme = new Movie();
        segundoFilme.setName("Wicked 2");
        segundoFilme.setReleaseYear(2024);
        segundoFilme.setMovieTimeMinutes(138);

        // Calculando o tempo total de exibição de todos os conteúdos
        TimeCalculator calculator = new TimeCalculator();
        calculator.includesTime(primeiroFilme);
        calculator.includesTime(segundoFilme);
        calculator.includesTime(aliceinborderland);
        System.out.println(calculator.getTotalTime());

        // Aplicando o filtro de recomendação ao primeiro filme
        RecommendationFilter filtro = new RecommendationFilter();
        filtro.filter(primeiroFilme);

        // Criando um episódio da série e aplicando o filtro de recomendação
        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(aliceinborderland);
        episode.setTotalViews(300);
        filtro.filter(episode);
    }
}
