package com.buddy.bid.entities;

import com.buddy.bid.model.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.joda.time.DateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CarBiddingDetails {
    private Car car;
    private String status;
    private DateTime currentTime;
    private DateTime endTime;
}
