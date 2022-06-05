package com.example.demo.shared.models;

import com.example.demo.infrastructure.out.rest.client.persistence.entities.HolidaysEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Data
public class Holidays implements Serializable {

    private String date;

    private String title;

    private String extra;

    public HolidaysEntity toEntity(){
        return HolidaysEntity.builder().date(date).title(title).extra(extra).build();
    }
}
