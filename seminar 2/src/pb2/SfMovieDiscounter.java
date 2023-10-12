package pb2;

public class SfMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice(double price){
        return price*1;
    }
}
