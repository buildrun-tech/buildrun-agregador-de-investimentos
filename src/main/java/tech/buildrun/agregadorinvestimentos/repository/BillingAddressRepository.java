package tech.buildrun.agregadorinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.buildrun.agregadorinvestimentos.entity.Account;
import tech.buildrun.agregadorinvestimentos.entity.BillingAddress;

import java.util.UUID;

@Repository
public interface BillingAddressRepository extends JpaRepository<BillingAddress, UUID> {
}
