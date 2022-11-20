package ru.job4j;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Courier {
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private String phoneNumber;
    private Order order;

}
