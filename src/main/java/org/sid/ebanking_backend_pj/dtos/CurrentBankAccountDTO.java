package org.sid.ebanking_backend_pj.dtos;

import lombok.Data;
import org.sid.ebanking_backend_pj.enums.AccountStatus;

import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}