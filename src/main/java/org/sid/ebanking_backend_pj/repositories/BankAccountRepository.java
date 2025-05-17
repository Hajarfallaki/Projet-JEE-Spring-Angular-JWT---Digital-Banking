package org.sid.ebanking_backend_pj.repositories;

import org.sid.ebanking_backend_pj.entities.BankAccount;
import org.sid.ebanking_backend_pj.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}