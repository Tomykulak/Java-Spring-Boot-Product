package tomykulak.order_service.dto;

public record OrderRequest(
        Long id,
        String orderNo,
        String skuCode,
        double price,
        Integer quantity
) {
}
