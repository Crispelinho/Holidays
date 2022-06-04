package com.example.demo.application.usecase;

import com.example.demo.application.ports.ApliClient;
import com.example.demo.shared.models.Holidays;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Component
public class HolidaysUseCase {

    private final ApliClient apliClient;

    public List<Holidays> saveFeriados() throws IOException {
        return apliClient.get();
    }
}
