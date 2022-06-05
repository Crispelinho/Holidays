package com.example.demo.infrastructure.out.rest.client.persistence.entities;

import com.example.demo.shared.models.Holidays;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HolidaysEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String date;

    @Column
    private String title;

    @Column
    private String extra;

    public Holidays toModel(){
        return Holidays.builder().date(date).title(title).extra(extra).build();
    }
}
