package com.example.demo.infrastructure.out.rest.client.retrofit;

import com.example.demo.shared.constants.HolidaysConstants;
import com.example.demo.shared.models.Holidays;

import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Component
public class HolidaysApiClientImp implements HolidaysApiClient{

    @Override
    public List<Holidays> getHolidays() throws IOException {

        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance(HolidaysConstants.BASE_URL);
        RequestRetrofitDAO requestRetrofitDAO = retrofit.create(RequestRetrofitDAO.class);
        Call<List<Holidays>> requestCall =  requestRetrofitDAO.getHolidays();
        Response<List<Holidays>> execute = requestCall.execute();
        return execute.body();
    }

}
