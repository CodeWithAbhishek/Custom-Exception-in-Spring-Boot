package com.codewithabhishek.exception;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CmdStatus {

    private String type;
    private UUID code;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UUID getCode() {
        return code;
    }

    public void setCode(UUID code) {
        this.code = code;
    }
}
