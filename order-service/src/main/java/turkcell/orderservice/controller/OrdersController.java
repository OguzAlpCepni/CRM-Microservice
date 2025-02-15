package turkcell.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import turkcell.orderservice.client.ProductClient;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {

    private final ProductClient productClient;

    public OrdersController(ProductClient productClient) {
        this.productClient = productClient;
    }

    //sync iletişim
    @GetMapping
    public String get(){
        String response = productClient.get();
        System.out.println(response);
        return response;
    }
}
