package StreamAPI_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class orders {

    public orders(String product, int price,String category) {
        this.product = product;
        this.price = price;
        this.category=category;
    }

    private String product;

    private int price;

    private String category;

    @Override
    public String toString() {
        return "orders{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<orders> ordersList = new ArrayList<>();

        ordersList.add(new orders("Chair",2900,"HA"));
        ordersList.add(new orders("Table",3900,"OA"));
        ordersList.add(new orders("Pen",300,"OA"));
        ordersList.add(new orders("Fan",1800,"HA"));
        ordersList.add(new orders("Bulb",1000,"HA"));
        ordersList.add(new orders("Paper",230,"OA"));
        ordersList.add(new orders("chocolate",100,"HA"));

        Map<Boolean,List<orders>> map = ordersList.stream()
                .collect(Collectors.partitioningBy(order -> order.price < 1000));

        System.out.println("Product amount greater than 1000: ");
        map.get(true).forEach(System.out::println);

        Map<String,List<orders>> groupMap = ordersList.stream()
                .collect(Collectors.groupingBy(order-> order.category));

        groupMap.forEach((cat,olist)->{
            System.out.println("Category:"+cat);
            olist.forEach(System.out::println);
        });

    }
}
