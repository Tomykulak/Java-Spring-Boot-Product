package tomykulak.services.dto;

public record ProductResponse(
        String id,
        String name,
        String description,
        double price
) {
}
