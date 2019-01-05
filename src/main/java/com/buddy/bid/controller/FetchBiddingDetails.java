package com.buddy.bid.controller;


import com.buddy.bid.entities.CarBiddingDetails;
import org.springframework.stereotype.Controller;

@Controller
public class FetchBiddingDetails {
    public CarBiddingDetails getBiddingDetails() {
        CarBiddingDetails carBiddingDetails = new CarBiddingDetails();
        return carBiddingDetails;
    }
}
