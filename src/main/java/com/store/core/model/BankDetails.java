package com.store.core.model;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_details")
public class BankDetails {

    private String accountNumber;
    private String accountHolderName;
//    private String bankName;
    private String ifscCode;

}
