import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class OrderDTO {
    private int id;
    private BigDecimal amount;

    // Constructor
    public OrderDTO(int id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    // Getters
    public int getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}

public class ThirdHighestOrder {
    public static void main(String[] args) {
        // Sample data
        List<OrderDTO> orders = Arrays.asList(
                new OrderDTO(1, BigDecimal.valueOf(500)),
                new OrderDTO(2, BigDecimal.valueOf(300.0)),
                new OrderDTO(3, BigDecimal.valueOf(700.0)),
                new OrderDTO(4, BigDecimal.valueOf(400.0)),
                new OrderDTO(5, BigDecimal.valueOf(200.0))
        );

        // Find the third-highest amount
        Optional<OrderDTO> thirdHighest = orders.stream()
                .sorted(Comparator.comparing(OrderDTO::getAmount).reversed())
                .skip(2)
                .findFirst();

        if (thirdHighest.isPresent()) {
            System.out.println("Third highest order: " + thirdHighest.get());
        } else {
            System.out.println("Not enough orders to determine the third highest.");
        }
    }
}

