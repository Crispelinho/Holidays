package com.example.demo.application.usecase;

import com.example.demo.application.ports.HolidaysPersistence;
import com.example.demo.shared.models.Holidays;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Component
public class HolidaysUseCase {

    private final HolidaysPersistence holidaysPersistence;

    public List<Holidays> saveHolidays() throws IOException {
        return holidaysPersistence.findAll();
    }
}
