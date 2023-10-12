package pb2;

public class HorrorMovieDiscounter implements Discounter{
    public double calculatePrice(double price){
        return price*0.9;
    }
}
