package com.example.demo.infrastructure.in.rest.controller;


import com.example.demo.application.usecase.HolidaysUseCase;
import com.example.demo.shared.models.Holidays;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/holidays")
@AllArgsConstructor
public class HolidaysController {

    private final HolidaysUseCase feriadosUseCase;

    @GetMapping("/")
    public ResponseEntity<List<Holidays>> saveFeriados() throws IOException {
        return ResponseEntity.ok(feriadosUseCase.saveFeriados());
    }

}
