package javaLevel3;

import java.util.ArrayList;

public class ConvertArrayInArrayList<T> {
    private T[] arrayInit;

    public ConvertArrayInArrayList(T[] arrayInit) {
        this.arrayInit = arrayInit;
    }

    public ArrayList<T> convert(){
        ArrayList<T> arrayChanged = null;

        if(arrayInit != null && arrayInit.length > 0){
            arrayChanged = new ArrayList<T>();
            for(T element : arrayInit) {
                arrayChanged.add(element);
            }
        } else if(arrayInit != null) {
            arrayChanged = new ArrayList<T>();
        }
        return arrayChanged;
    }
}
