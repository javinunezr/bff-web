package com.duoc.bffweb.BffWeb.restclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.bffweb.BffWeb.dto.TransactionResponse;

@FeignClient(name = "ClienteRest", url = "http://localhost:8090/api/transactions")
public interface ClienteRest {

	@GetMapping
	List<TransactionResponse> findAllTransactions();

}
