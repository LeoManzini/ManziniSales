package br.com.leomanzini.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leomanzini.dsvendas.dto.SellerDTO;
import br.com.leomanzini.dsvendas.obj.Seller;
import br.com.leomanzini.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> sellerList = repository.findAll();
		return sellerList.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
