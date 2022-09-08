package com.gxb.study.iterator2;

import java.util.ArrayList;
import java.util.List;

public class Goods implements GetIterator{

    List<String> list = new ArrayList(3);


    @Override
    public Inerator getIterator() {
        return new GoodsNames();
    }

    public class GoodsNames implements Inerator{
        int index;
        @Override
        public boolean hasNext() {
            if(list.size()>index){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Object next() {
            if(hasNext()){
                return list.get(index++);
            }else {
                return null;
            }
        }
    }
}
