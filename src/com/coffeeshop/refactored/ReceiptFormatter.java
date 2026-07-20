package com.coffeeshop.refactored;

/**
 * builds the recipt text, it does not touch tax or files
 */
public class ReceiptFormatter {

    public String format(Order order, double finalPrice) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n===== COFFEE SHOP RECEIPT =====\n");
        sb.append("Customer: ").append(order.getCustomerName()).append("\n");
        sb.append("Beverage: ").append(order.getCoffeeType()).append("\n");
        sb.append("Total Amount (incl. Tax): PHP ").append(finalPrice).append("\n");
        sb.append("================================\n");
        return sb.toString();
    }
}
