package br.com.leomanzini.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leomanzini.dsvendas.obj.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long>{

}
