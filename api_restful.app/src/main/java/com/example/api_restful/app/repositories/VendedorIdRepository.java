package com.example.api_restful.app.repositories;

import com.example.api_restful.app.entity.VendedorIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorIdRepository extends JpaRepository<VendedorIdEntity, Long> {
}
