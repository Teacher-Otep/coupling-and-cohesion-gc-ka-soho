package com.coffeeshop.refactored;

/**
 * interface so that we are not stuck with one tax rule forever
 */
public interface TaxCalculator {
    double calculateFinalPrice(double basePrice);
}
