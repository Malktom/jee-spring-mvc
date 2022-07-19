package pl.coderslab.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@Getter
@ToString
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private int id;

    public Product(String name, double price) {  // zweryfikowac
    }
}
