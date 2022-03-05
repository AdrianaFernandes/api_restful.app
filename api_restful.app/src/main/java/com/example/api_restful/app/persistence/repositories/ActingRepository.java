package com.example.api_restful.app.persistence.repositories;

import com.example.api_restful.app.persistence.ActingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActingRepository extends JpaRepository<ActingEntity, Long> {

}
