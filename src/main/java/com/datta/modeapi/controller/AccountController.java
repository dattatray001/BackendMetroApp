package com.datta.modeapi.controller;


import com.datta.modeapi.DTO.Otp;
import com.datta.modeapi.Entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @PostMapping("/create")
    public ResponseEntity<Otp> createAccount(@RequestBody Account account) {
        Otp otp=Otp.builder().success(true).message("5412").build();
        return ResponseEntity.ok(otp);
    }


}
