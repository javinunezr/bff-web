package com.duoc.bffweb.BffWeb.restclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.bffweb.BffWeb.dto.AnnualAccountResponse;
import com.duoc.bffweb.BffWeb.dto.InterestResponse;
import com.duoc.bffweb.BffWeb.dto.TransactionResponse;

@FeignClient(name = "ClienteRest", url = "http://localhost:8090/backend/api")
public interface ClienteRest {

	@GetMapping("/transaction")
	List<TransactionResponse> findAllTransactions();

    @GetMapping("/interest")
    List<InterestResponse> findAllInterests();
    
    @GetMapping("/annual-account")
    List<AnnualAccountResponse> findAllAnnualAccounts();

}
