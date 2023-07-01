package com.dannycodes.transaction_reference;


import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BankAccount {

    private int id;
    private String account_name;
    private String account_number;
    private String bank_name;
    private String bank_code;


}
