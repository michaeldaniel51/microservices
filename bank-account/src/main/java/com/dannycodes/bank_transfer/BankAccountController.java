package com.dannycodes.bank_transfer;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.ws.rs.Path;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Path("/")
@RestController
@RequestMapping("/bank")
public class BankAccountController {


    private final BankAccountService bankAccountService;


    @PostMapping
  public void response(){
      bankAccountService.bankAccount();

  }

    @Operation(summary = "Bank Details",  description = "Retrieves the details of a Banks",
            security = @SecurityRequirement(name = "security_auth"))
    @ApiResponses({
            @ApiResponse(responseCode="200", description ="Success", content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", description = "Server Error")
    })
  @GetMapping
  public List<BankAccount> getAllBankAccount(){
        return bankAccountService.getAllBankAccount();
  }




}
