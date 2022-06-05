package com.example.demo.infrastructure.out.rest.client.persistence.repository;

import com.example.demo.infrastructure.out.rest.client.persistence.entities.HolidaysEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HolidaysRepository extends JpaRepository<HolidaysEntity, Integer> {
    List<HolidaysEntity> findAll();

    @Override
    <S extends HolidaysEntity> List<S> saveAll(Iterable<S> entities);
}
