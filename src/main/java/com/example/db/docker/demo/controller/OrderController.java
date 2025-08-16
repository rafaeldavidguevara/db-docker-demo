package com.example.db.docker.demo.controller;

import com.example.db.docker.demo.entity.OrderEntity;
import com.example.db.docker.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseBody
    public OrderEntity saveOrder(@RequestBody OrderEntity order) {
        return orderService.saveOrder(order);
    }

    @GetMapping
    @ResponseBody
    public List<OrderEntity> getAllOrders() {
        return orderService.getAllOrders();
    }

}
