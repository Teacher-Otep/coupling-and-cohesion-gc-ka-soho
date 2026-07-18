package com.coffeeshop.refactored;

/**
 * this is where everything gets put together - the only file 
 * that actually creates the real classes and hands them to orderprocessor.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting Refactored Coffee Shop System ===");

        TaxCalculator taxCalculator = new StandardTaxCalculator();
        ReceiptFormatter receiptFormatter = new ReceiptFormatter();
        OrderRepository orderRepository = new FileOrderRepository("orders_log.txt");

        OrderProcessor processor = new OrderProcessor(taxCalculator, receiptFormatter, orderRepository);

        // sample order for testing
        Order order = new Order("Juan Dela Cruz", "Java Chip Frappe", 150.0);
        processor.processOrder(order);

        System.out.println("\n=== Order Processing Complete ===");
    }
}
