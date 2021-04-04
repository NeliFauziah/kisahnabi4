package com.example.kisahnabi;

import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class ObjekBesar {
    private String code;
    private String message;
    private KisahNabi nabi;

    public ObjekBesar(String code, String message, KisahNabi nabi) {
        this.code = code;
        this.message = message;
        this.nabi = nabi;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public KisahNabi getNabi() {
        return nabi;
    }

    public void setNabi(KisahNabi nabi) {
        this.nabi = nabi;
    }
}
