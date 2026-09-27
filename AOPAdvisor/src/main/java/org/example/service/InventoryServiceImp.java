package org.example.service;

public class InventoryServiceImp implements InventoryServiceInterface{
    @Override
    public int checkStock(String sku) {
        return sku.length();
    }

    @Override
    public void reserveStock(String sku, int qty) throws IllegalStateException {

        if (qty>100){
            throw new IllegalStateException("qty greater than 100");
        }
    }
}
