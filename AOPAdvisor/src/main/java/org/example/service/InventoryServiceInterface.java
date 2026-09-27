package org.example.service;

public interface InventoryServiceInterface {

    int checkStock(String sku);
    void reserveStock(String sku, int qty)throws IllegalStateException;

}
