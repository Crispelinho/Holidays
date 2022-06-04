package com.example.demo.infrastructure.out.rest.client.persistence.DAOS;

import com.example.demo.application.ports.HolidaysPersistence;
import com.example.demo.infrastructure.out.rest.client.persistence.entities.HolidaysEntity;
import com.example.demo.infrastructure.out.rest.client.persistence.repository.HolidaysRepository;
import com.example.demo.infrastructure.out.rest.client.retrofit.HolidaysApiClient;
import com.example.demo.shared.models.Holidays;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Component
public class HolidaysPersistencePostgres implements HolidaysPersistence {

    @Autowired
    HolidaysRepository holidaysRepository;

    @Autowired
    HolidaysApiClient holidaysApiClient;

    @Override
    public List<Holidays> findAll() throws IOException {
        List<HolidaysEntity> holidaysList;
        if (this.holidaysRepository.findAll() != null)
        {
            holidaysList = this.holidaysRepository.saveAll(
                    this.holidaysApiClient.getHolidays().stream().map(
                            holidays -> holidays.toEntity()
                    ).collect(Collectors.toList())
            );
            return holidaysList.stream().map(holidaysEntity -> holidaysEntity.toModel()).collect(Collectors.toList());
        }
        return null;
    }
}
