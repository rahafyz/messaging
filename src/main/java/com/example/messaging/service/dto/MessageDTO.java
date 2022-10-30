package com.example.messaging.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class MessageDTO implements Serializable {

    private String emailAddress;

    private String message;
}
