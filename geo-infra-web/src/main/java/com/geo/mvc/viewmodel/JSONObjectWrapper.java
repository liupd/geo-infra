package com.geo.mvc.viewmodel;

import com.alibaba.fastjson.JSONObject;

public class JSONObjectWrapper {  
    private JSONObject jsonObject;  
  
    public JSONObjectWrapper(JSONObject jsonObject) {  
        this.jsonObject = jsonObject;  
    }  
  
    public JSONObject getJSONObject() {  
        return jsonObject;  
    }  
}  