package com.example.hyfit_server.config.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BaseException  extends Exception{
    private BaseResponseStatus status;
}