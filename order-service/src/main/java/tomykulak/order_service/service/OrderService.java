package tomykulak.order_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tomykulak.order_service.dto.OrderRequest;
import tomykulak.order_service.model.Order;
import tomykulak.order_service.repository.OrderRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();

        order.setOrderNo(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());

        orderRepository.save(order);
    }
}
