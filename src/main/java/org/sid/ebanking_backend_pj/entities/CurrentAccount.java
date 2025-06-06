package org.sid.ebanking_backend_pj.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CA")
@Data @NoArgsConstructor @AllArgsConstructor
public class CurrentAccount extends BankAccount {
    private double overDraft;
}