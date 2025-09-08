package com.duoc.bffweb.BffWeb.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.bffweb.BffWeb.dto.AnnualAccountResponse;
import com.duoc.bffweb.BffWeb.dto.InterestResponse;
import com.duoc.bffweb.BffWeb.dto.TransactionResponse;
import com.duoc.bffweb.BffWeb.services.BffService;


@RestController
@CrossOrigin
@RequestMapping("/bff-web")
public class BffController {

	private final BffService bffService;

	public BffController(BffService bffService) {
		this.bffService = bffService;
	}

    @GetMapping("/transaction")
    public ResponseEntity<List<TransactionResponse>> getAllTransactions(){
        return ResponseEntity.ok(bffService.findAllTransactions());
    }

    @GetMapping("/interest")
    public ResponseEntity<List<InterestResponse>> getAllInterests() {
        return ResponseEntity.ok(bffService.findAllInterests());
    }

    @GetMapping("/annual-account")
    public ResponseEntity<List<AnnualAccountResponse>> getAllAnnualAccounts() {
        return ResponseEntity.ok(bffService.findAllAnnualAccounts());
    }
}