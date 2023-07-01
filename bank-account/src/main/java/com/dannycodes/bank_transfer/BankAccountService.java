package com.dannycodes.bank_transfer;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
@RequiredArgsConstructor
@Service
public class BankAccountService {


    private final BankAccountRepository bankAccountRepository;

    @PostConstruct
   public void bankAccount(){
        BankAccount bankAccount1 = new BankAccount(1,"daniel","8372837","uba","011");
        BankAccount bankAccount2 = new BankAccount(2,"sam","4635465","access","012");
        BankAccount bankAccount3 = new BankAccount(3,"smith","543226837","wema","013");

        List<BankAccount> bankAccounts = Arrays.asList(bankAccount1,bankAccount2,bankAccount3);

        bankAccountRepository.saveAll(bankAccounts);


   }

   public List<BankAccount> getAllBankAccount(){

       return bankAccountRepository.findAll();
   }

}
