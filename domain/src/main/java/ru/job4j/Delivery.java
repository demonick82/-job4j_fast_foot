package ru.job4j;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Delivery {
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private List<Courier> couriers = new ArrayList<>();
}
