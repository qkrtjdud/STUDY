package exgain.book.exam;

class Movie {
    String title;
    String director;
    static int count;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        count++;
    }

}

public class MovieArray {
    public static void main(String[] args) {
        Movie[] list = new Movie[10];
        list[0] = new Movie("백조", "호수");
        list[1] = new Movie("자바", "수업");

        for (int i = 0; i < Movie.count; i++) {
            System.out.println("=================");
            System.out.println("제목: " + list[i].title);
            System.out.println("제목: " + list[i].director);
            System.out.println("=================");

        }

    }
}
