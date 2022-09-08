package com.gxb.study.factory;

public interface TestServer<E>{
    public <T>void add(T t);
    public E get();
}
