package br.com.leomanzini.sales.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.leomanzini.sales.dto.SaleSuccessDTO;
import br.com.leomanzini.sales.dto.SaleSumDTO;
import br.com.leomanzini.sales.obj.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query(" SELECT new br.com.leomanzini.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " 
	     + " FROM Sale AS obj "
		 + " GROUP BY obj.seller ")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query(" SELECT new br.com.leomanzini.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
		 + " FROM Sale AS obj " 
		 + " GROUP BY obj.seller ")
	List<SaleSuccessDTO> successGroupedBySeller();
}
