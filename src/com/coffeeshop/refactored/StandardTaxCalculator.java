package com.coffeeshop.refactored;

/**
* the actual 12% VAT calculation, seperarted out from everything else
 */
public class StandardTaxCalculator implements TaxCalculator {
    private static final double VAT_RATE = 0.12; // 12% VAT

    @Override
    public double calculateFinalPrice(double basePrice) {
        return basePrice + (basePrice * VAT_RATE);
    }
}
