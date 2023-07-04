package com.Inventory.Management.System.Stock_Page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StockRepository extends JpaRepository<Stock,Integer>, JpaSpecificationExecutor<Stock> {
}