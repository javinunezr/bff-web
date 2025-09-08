package com.duoc.bffweb.BffWeb.services;

import java.util.List;

import com.duoc.bffweb.BffWeb.dto.AnnualAccountResponse;
import com.duoc.bffweb.BffWeb.dto.InterestResponse;
import com.duoc.bffweb.BffWeb.dto.TransactionResponse;

public interface BffService {

	List<TransactionResponse> findAllTransactions();
    List<InterestResponse> findAllInterests();
    List<AnnualAccountResponse> findAllAnnualAccounts();
}
