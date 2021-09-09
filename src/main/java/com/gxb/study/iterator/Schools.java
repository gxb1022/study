package com.gxb.study.iterator;

public class Schools implements Container{

    String [] arr = {"aaa","bbb","ccc"};
    @Override
    public Iterator getIterator() {
        return new SchoolNames();
    }

    public class SchoolNames implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index<arr.length){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Object next() {
            if(hasNext()){
                return arr[index++];
            }else {
                return null;
            }

        }
    }
}
