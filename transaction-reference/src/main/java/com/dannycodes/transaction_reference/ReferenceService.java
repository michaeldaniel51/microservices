package com.dannycodes.transaction_reference;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReferenceService {


    private final WebClient.Builder webClientBuilder;
    @Value("${bank.url}")
    private String bank_url;



    public List<BankAccount> getBankAccounts(){

        Flux<BankAccount> bankAccountFlux = webClientBuilder.build()
                .get()
                .uri(bank_url)
                .retrieve()
                .bodyToFlux(BankAccount.class);

        List<BankAccount> bankAccounts = bankAccountFlux
                .collect(Collectors.toList())
                .share().block();

        return bankAccounts;

    }






//    public List<BankAccount> getBankAccounts(){
//
//        Flux<BankAccount> bankAccountFlux = WebClient
//                .create(reference_url)
//                .get()
//                .retrieve()
//                .bodyToFlux(BankAccount.class);
//
//        List<BankAccount> bankAccounts = bankAccountFlux
//                .collect(Collectors.toList())
//                .share().block();
//
//        return bankAccounts;
//
//    }

}
