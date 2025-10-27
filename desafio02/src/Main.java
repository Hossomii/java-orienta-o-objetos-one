public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "João";
        p2.nome = "Maria";

        p1.setHello();
        p2.setHello();

        Calculator calculator = new Calculator();
        int result = calculator.sum(3);
        System.out.println(result);

        Song newSong = new Song();
        newSong.title = "Dont Wanna Break Up Again";
        newSong.artist = "Ariana Grande";
        newSong.releaseYear = 2024;

        newSong.getInfo();
        newSong.setReview(8);
        newSong.setReview(10);
        newSong.setReview(8.3);
        System.out.println(newSong.sumReviews);
        System.out.println(newSong.totalReviews);

        double average = newSong.getAverageReview();
        System.out.println(average);
    }
}
