package com.example.demo.shared.models;

import com.example.demo.infrastructure.out.rest.client.persistence.entities.HolidaysEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class Holidays {

    private Integer id;

    private String date;

    private String title;

    private String extra;

    public HolidaysEntity toEntity(){
        return HolidaysEntity.builder().id(id).date(date).title(title).extra(extra).build();
    }
}
