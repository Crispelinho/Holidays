package com.example.demo.infrastructure.out.rest.client.retrofit;

import com.example.demo.shared.models.Holidays;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import java.io.IOException;
import java.util.List;

public interface RequestRetrofitDAO {
    @Headers({
            "Accept: application/json",
    })
    @POST("/feriados")
    Call<List<Holidays>> getHolidays() throws IOException;

}
