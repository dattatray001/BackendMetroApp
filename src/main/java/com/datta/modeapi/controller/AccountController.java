package com.datta.modeapi.controller;


import com.datta.modeapi.DTO.Otp;
import com.datta.modeapi.DTO.getOtp;
import com.datta.modeapi.DTO.otpResponse;
import com.datta.modeapi.Entity.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @PostMapping("/create")
    public ResponseEntity<Otp> createAccount(@RequestBody Account account) {
        Otp otp=Otp.builder().success(true).message("541245").build();
        return ResponseEntity.ok(otp);
    }

    @PostMapping("/verifyOtp")
    public ResponseEntity<otpResponse> verifyAccount(@RequestBody getOtp getOtp) {
        boolean status = "123456".equals(getOtp.getOtp());

        otpResponse otp = otpResponse.builder()
                .success(status)
                .message(status ? "Account verified successfully" : "Invalid OTP")
                .build();

        if (status) {
            return ResponseEntity.ok(otp);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(otp);
        }
    }


}
