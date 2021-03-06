package br.com.leomanzini.sales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leomanzini.sales.dto.SaleDTO;
import br.com.leomanzini.sales.dto.SaleSuccessDTO;
import br.com.leomanzini.sales.dto.SaleSumDTO;
import br.com.leomanzini.sales.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> saleDTOList = service.findAll(pageable);
		return ResponseEntity.ok(saleDTOList);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> saleSumDTOList = service.amountGroupedBySeller();
		return ResponseEntity.ok(saleSumDTOList);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
		List<SaleSuccessDTO> saleSuccessDTOList = service.successGroupedBySeller();
		return ResponseEntity.ok(saleSuccessDTOList);
	}
}
