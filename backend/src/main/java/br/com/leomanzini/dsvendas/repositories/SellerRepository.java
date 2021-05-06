package br.com.leomanzini.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leomanzini.dsvendas.obj.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long>{

}
