package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.model.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Product;
import pl.coderslab.model.ProductDao;

import java.util.Random;

@Controller
public class CartController {

    private Cart cart;
    private ProductDao productDao;
    @Autowired
    public CartController(Cart cart) {
        this.cart = cart;
    } // wstrzykniecie komponentu typy Cart

    public CartController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping("/addtocart/{id}/{quantity}")
    @ResponseBody
    public String addtocart(@PathVariable("id") int id,
                            @PathVariable("quantity") int quantity) {

        cart.addToCart(new CartItem(quantity,productDao.showProductById(productDao.getList(),id)));

//        Random rand = new Random();
//        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
    }

    @GetMapping("cart")
    @ResponseBody
    public String cardList() {
        return cart.getCartItems().toString();
    }

}
