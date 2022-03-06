package com.example.api_restful.app.repositories;

import com.example.api_restful.app.entity.SalvarVendedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalvarVendedorRepository extends JpaRepository<SalvarVendedorEntity, Long> {
}
