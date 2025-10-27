public class Song {
    String title;
    String artist;
    int releaseYear;
    double sumReviews;
    double totalReviews;

    void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Release Year: " + releaseYear);
    }

    void setReview(double review) {
        sumReviews += review;
        totalReviews++;
    }

    double getAverageReview() {
        return sumReviews / totalReviews;
    }
}
