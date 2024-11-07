package tomykulak.services.dto;

public record ProductRequest(
        String id,
        String name,
        String description,
        double price
) {
}
