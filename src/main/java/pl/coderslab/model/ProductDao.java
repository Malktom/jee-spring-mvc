package pl.coderslab.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductDao {

    public List<Product> getList() {
        List<Product> items = List.of(
                new Product("rower", 3000, 1),
                new Product("ksiazka", 50, 2),
                new Product("okulary", 100, 3));
        return items;
    }

    public Product showProductById(List<Product> list, int id) {
        for (Product product : list) {
            if (product.getId() == (id)) {
                return product;
            }

        }
        return null;
    }
}
