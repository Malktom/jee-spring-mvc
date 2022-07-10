package pl.coderslab.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDao {

    public List<Product> getList() {
        List<Product> items = List.of(
                new Product("rower", 3000, 1),
                new Product("ksiazka", 50, 2),
                new Product("okulary", 100, 3));
        return items;
    }
}
