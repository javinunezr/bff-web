package com.duoc.bffweb.BffWeb.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.bffweb.BffWeb.dto.AnnualAccountResponse;
import com.duoc.bffweb.BffWeb.dto.InterestResponse;
import com.duoc.bffweb.BffWeb.dto.TransactionResponse;
import com.duoc.bffweb.BffWeb.restclients.ClienteRest;
import com.duoc.bffweb.BffWeb.services.BffService;

@Service
public class BffServiceImpl implements BffService {

	private final ClienteRest clienteRest;

	public BffServiceImpl(ClienteRest clienteRest) {
		this.clienteRest = clienteRest;
	}

	@Override
	public List<TransactionResponse> findAllTransactions() {
		return clienteRest.findAllTransactions();
	}

    @Override
    public List<InterestResponse> findAllInterests() {
        return clienteRest.findAllInterests();
    }

    @Override
    public List<AnnualAccountResponse> findAllAnnualAccounts() {
        return clienteRest.findAllAnnualAccounts();
    }
}