package com.example.ajay.customer.Remote;

import com.example.ajay.customer.Model.FCMResponse;
import com.example.ajay.customer.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAJSAqiIc:APA91bGbBDApaBhJMOUJLYfkI3Kn5iX7BECIJd3yued8rJAL-xW8F8oaJas_UaZsZ74fmZG6n8Mvef8xA9ZTVrxqVlRkNiK-LOlqY3LXz5rAgCvKBWWaeXSWbyRFVhuxq-IjamVieL2E"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage (@Body Sender body);
}
