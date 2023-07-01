package com.dannycodes.transaction_reference;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/transaction")
public class ReferenceController {

    private final ReferenceService referenceService;


    @GetMapping
    public List<BankAccount> getAllBankAccounts(){
       return referenceService.getBankAccounts();
    }




}
