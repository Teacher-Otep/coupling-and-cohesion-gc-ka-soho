package com.coffeeshop.refactored;

/**
 * interface for saving orders so storage can change later without breaking stuff
 */
public interface OrderRepository {
    void save(Order order, double finalPrice);
}
