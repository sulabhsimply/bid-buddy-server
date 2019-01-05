package com.buddy.bid.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Error {
    private String code;
    private String errorMessage;
    private String recommendation;
    private String errorActivity;
}
