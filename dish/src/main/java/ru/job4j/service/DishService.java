package ru.job4j.service;

import ru.job4j.Dish;

import java.util.Collection;

public interface DishService {

    void addDish(Dish dish);

    Collection<Dish> findAllDishes();

    Dish findDishById(long id);

    void deleteDish(long id);

}
