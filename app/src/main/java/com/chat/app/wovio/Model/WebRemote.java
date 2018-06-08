package com.chat.app.wovio.Model;

import java.util.List;

/**
 * Created by Hp on 6/8/2018.
 */

public class WebRemote {

private String status;
public List<Sources> sourcelist;

    public WebRemote() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Sources> getSourcelist() {
        return sourcelist;
    }

    public void setSourcelist(List<Sources> sourcelist) {
        this.sourcelist = sourcelist;
    }

    //other variables will be inform of an array getters and setters will be from Sources model

}
