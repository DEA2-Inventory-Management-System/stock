package com.Inventory.Management.System.Stock_Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3006")
@RestController
public class StockController {

    @Autowired
    StockService    StockService;

    @PostMapping("/stock")
    private Stock saveStock(@RequestBody Stock stock){
        StockService.saveStock(stock);
        return stock;
    }

    @GetMapping("/stock")
    private List<Stock> getStock(){
        return StockService.getStock();
    }

    @DeleteMapping("/stock/{id}")
    private ResponseEntity<Object> deleteStock(@PathVariable("id") int id){
        return StockService.deleteStockById(id);
    }

    @PutMapping("/stock/{id}")
    private ResponseEntity<Object> updateStock(@PathVariable int id, @RequestBody Stock stock){
        return StockService.updateRequest(id,stock);
    }
}