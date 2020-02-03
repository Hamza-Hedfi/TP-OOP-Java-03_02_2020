package com.deuterium.exercice_5;

public class InvoiceItemUpdated {
    private String id;
    private Product product;
    private int qty;
    private double unitPrice;

    public InvoiceItemUpdated(String id, Product product, int qty, double unitPrice) {
        this.id = id;

        if (product != null) this.product = product;
        else System.out.printf("Passer une produit SVP");

        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id='" + id + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

