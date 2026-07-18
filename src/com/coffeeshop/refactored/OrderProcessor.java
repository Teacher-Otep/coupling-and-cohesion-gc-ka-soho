package com.coffeeshop.refactored;

/**
 * this class just runs the order flow- calculates tax - prints receipts, and saves it.
 * it doesn't know how any of those steps actually work, only that it can ask
 * taxcalculator/receiptformatter/orderrepository to do it.
 * that way if we ever change the tax rate or switch to a database, we dont touch this file.
 */
public class OrderProcessor {

    private final TaxCalculator taxCalculator;
    private final ReceiptFormatter receiptFormatter;
    private final OrderRepository orderRepository;

    public OrderProcessor(TaxCalculator taxCalculator,
                           ReceiptFormatter receiptFormatter,
                           OrderRepository orderRepository) {
        this.taxCalculator = taxCalculator;
        this.receiptFormatter = receiptFormatter;
        this.orderRepository = orderRepository;
    }

    public void processOrder(Order order) {
        System.out.println("[System] Calculating final totals...");
        double finalPrice = taxCalculator.calculateFinalPrice(order.getBasePrice());

        String receipt = receiptFormatter.format(order, finalPrice);
        System.out.println(receipt);

        orderRepository.save(order, finalPrice);
    }
}
