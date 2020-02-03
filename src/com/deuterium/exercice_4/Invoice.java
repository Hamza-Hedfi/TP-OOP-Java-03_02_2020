package com.deuterium.exercice_4;

public class Invoice {
    private InvoiceItem[] inv;

    public Invoice(int lines) {
        this.inv = new InvoiceItem[lines];
    }
}
