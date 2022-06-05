package com.example.demo.infrastructure.out.rest.client.retrofit;

import com.example.demo.shared.models.Holidays;

import java.io.IOException;
import java.util.List;

public interface HolidaysApiClient {
    List<Holidays> getHolidays() throws IOException;
}
