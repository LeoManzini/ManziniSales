package br.com.leomanzini.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leomanzini.sales.obj.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long>{

}
