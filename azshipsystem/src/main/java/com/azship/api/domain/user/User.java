package com.azship.api.domain.user;

import com.azship.api.domain.shipping.Shipping;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collation = "users")
public class User {

    @Id
    private String id;

    @DBRef
    private List<Shipping> shippings;

    public void addShipping(Shipping shipping) {
        shippings.add(shipping);
    }

}
