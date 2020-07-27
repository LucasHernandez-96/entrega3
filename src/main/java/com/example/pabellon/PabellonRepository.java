package com.example.pabellon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PabellonRepository extends JpaRepository<Pabellon, Long>{

}