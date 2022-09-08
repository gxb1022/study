package com.gxb.study.myMap;

import java.util.Hashtable;
import java.util.Map;

public interface MyMap<k,v> {

    v put(k k,v v);

    v get(k k);

    interface entry<k,v>{
        k getKey();
        v getValue(k k);
    }
}
