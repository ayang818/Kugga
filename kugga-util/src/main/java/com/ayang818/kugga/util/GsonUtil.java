package com.ayang818.kugga.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author 杨丰畅
 * @description TODO
 * @date 2020/1/13 14:24
 **/
public class GsonUtil {
    private static final Gson GSON = new GsonBuilder().create();

    public static String toJsonString(Object o) {
        return GSON.toJson(o);
    }
}
