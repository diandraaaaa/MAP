package pb2;

import java.util.Date;
import java.util.List;

public class Order {

    private Date orderDare;

    private List<OrderLine> orderLines;

    public Order(Date orderDare, List<OrderLine> orderLines) {
        this.orderDare = orderDare;
        this.orderLines = orderLines;
    }

    public double calculateTotalPrice(){
            double price=0;

            for( OrderLine orderLine : orderLines){
                price+= orderLine.calculatePrice();
            }

            return price;
    }
}
