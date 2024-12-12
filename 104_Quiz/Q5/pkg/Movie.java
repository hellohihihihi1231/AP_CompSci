package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie() {
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;    
        revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue) {
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    public int getRevenue() {
        return revenue;
    }
    
    public void addRating(double newRating) {
        double x = (double)numRatings;
        numRatings ++;
        rating = ((x*rating)+newRating) / numRatings;
    }
    
    public boolean compareRatings(Movie x) {
        return this.rating > x.rating; 
    }
    
    public String revenueToString() {
        String x = "";
        int y = revenue;
        int i = 0;
        while(i < 3) { 
            x = "," + Integer.toString(y%1000) + x;
            y = y / 1000;
            i++;
        }
        return x;
    }
    
    public Movie pirateMovie() {
        return new Movie(movieName, rating, numRatings, revenue);
    }
}
