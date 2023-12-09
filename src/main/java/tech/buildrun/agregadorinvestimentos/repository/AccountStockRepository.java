package tech.buildrun.agregadorinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.buildrun.agregadorinvestimentos.entity.AccountStock;
import tech.buildrun.agregadorinvestimentos.entity.AccountStockId;
import tech.buildrun.agregadorinvestimentos.entity.Stock;

import java.util.UUID;

@Repository
public interface AccountStockRepository
        extends JpaRepository<AccountStock, AccountStockId> {
}
