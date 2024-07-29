package com.demo.camiseteria.repository;

import com.demo.camiseteria.model.entity.MembersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends JpaRepository<MembersEntity, Long> {

}
