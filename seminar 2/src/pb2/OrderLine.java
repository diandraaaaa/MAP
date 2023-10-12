package pb2;

public class OrderLine {
    private int quantity;
    private Movie movie;
    private Discounter discounter;

    public OrderLine(int quantity, Movie movie) {
        this.quantity = quantity;
        this.movie = movie;
    }

    public double calculatePrice(){
//        return movie.calculatePrice()*quantity;
        return quantity* discounter.calculatePrice(movie.getPrice());
    }
}
