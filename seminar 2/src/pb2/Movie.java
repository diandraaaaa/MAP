package pb2;

public abstract class Movie {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Movie(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public double calculatePrice(){
        return price;
    }
}
