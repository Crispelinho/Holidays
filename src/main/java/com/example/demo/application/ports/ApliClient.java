package com.example.demo.application.ports;

import com.example.demo.shared.models.Holidays;

import java.io.IOException;
import java.util.List;

public interface  ApliClient <T extends Holidays, R extends Holidays>{
    List<T> get() throws IOException;
}
