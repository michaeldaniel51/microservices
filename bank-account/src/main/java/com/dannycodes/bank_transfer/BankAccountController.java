package com.dannycodes.bank_transfer;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/bank")
public class BankAccountController {


    private final BankAccountService bankAccountService;


    @PostMapping
  public void response(){
      bankAccountService.bankAccount();

  }

  @GetMapping
  public List<BankAccount> getAllBankAccount(){
        return bankAccountService.getAllBankAccount();
  }




}
