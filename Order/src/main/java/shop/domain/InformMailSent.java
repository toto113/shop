package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InformMailSent extends AbstractEvent {

    private Long id;

    public InformMailSent(Order aggregate) {
        super(aggregate);
    }

    public InformMailSent() {
        super();
    }
}
//>>> DDD / Domain Event
