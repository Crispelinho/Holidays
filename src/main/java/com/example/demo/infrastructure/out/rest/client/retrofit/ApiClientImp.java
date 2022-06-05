package com.example.demo.infrastructure.out.rest.client.retrofit;

import com.example.demo.application.ports.ApiClient;
import com.example.demo.shared.models.Holidays;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@AllArgsConstructor
public class ApiClientImp implements ApiClient {

    HolidaysApiClient holidaysApiClient;

    @Override
    public List<Holidays> get() throws IOException {
        return this.holidaysApiClient.getHolidays();
    }
}
