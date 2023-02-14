package com.coppel.demo.repository;

import com.coppel.demo.entity.Cedis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CedisRepository extends JpaRepository<Cedis,Long> {
}
