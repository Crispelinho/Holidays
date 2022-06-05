package com.example.demo.application.usecase;

import com.example.demo.application.ports.ApiClient;
import com.example.demo.shared.models.Holidays;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Component
public class HolidaysUseCase {

    private final ApiClient apiClient;

    public List<Holidays> saveHolidays() throws IOException {
        return apiClient.get();
    }
}
