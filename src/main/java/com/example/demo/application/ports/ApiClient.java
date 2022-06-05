package com.example.demo.application.ports;

import com.example.demo.shared.models.Holidays;

import java.io.IOException;
import java.util.List;

public interface ApiClient<T extends Holidays>{
    List<T> get() throws IOException;
}
