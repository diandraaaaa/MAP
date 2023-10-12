package pb2;

public class Main {
    public static void main(String[] args) {
        OrderLine orderLine = new OrderLine( 10, new ComedyMovie(" Bad Movie",10));
        System.out.println(orderLine.calculatePrice());
    }

}