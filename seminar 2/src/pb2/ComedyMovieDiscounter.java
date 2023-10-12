package pb2;

public class ComedyMovieDiscounter implements Discounter{
    public double calculatePrice(double price){
        return price*0.5;
    }

}
