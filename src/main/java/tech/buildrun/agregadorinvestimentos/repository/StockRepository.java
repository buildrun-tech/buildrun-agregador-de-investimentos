package tech.buildrun.agregadorinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.buildrun.agregadorinvestimentos.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {
}
