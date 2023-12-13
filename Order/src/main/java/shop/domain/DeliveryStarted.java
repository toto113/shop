package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private String id;
    private String orderId;
    private String customerId;
    private String productId;
    private Integer qty;
}
