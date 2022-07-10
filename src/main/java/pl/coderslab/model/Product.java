package pl.coderslab.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private long id;

    public Product(String name, double price) {  // zweryfikowac
    }
}
