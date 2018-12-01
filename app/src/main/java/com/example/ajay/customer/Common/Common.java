package com.example.ajay.customer.Common;

import com.example.ajay.customer.Remote.FCMClient;
import com.example.ajay.customer.Remote.IFCMService;

public class Common {
    public static  final String driver_tb1="Drivers";
    public static  final String user_driver_tb1="DriversInformation";
    public static  final String user_rider_tb1="RidersInformation";
    public static  final String pickup_request_tb1="PickUpRequest";
    public static  final String token_tb1="Tokens";
    private static final String fcmURL ="https://fcm.googleapis.com/";

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

}
