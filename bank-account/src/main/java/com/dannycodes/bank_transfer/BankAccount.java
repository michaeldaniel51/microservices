package com.dannycodes.bank_transfer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BankAccount {


    @Id
    @GeneratedValue
    private int id;
    private String account_name;
    private String account_number;
    private String bank_name;
    private String bank_code;




}
