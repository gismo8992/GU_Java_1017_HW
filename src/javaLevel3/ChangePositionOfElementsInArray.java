package javaLevel3;

public class ChangePositionOfElementsInArray<T> {
    private T[] arrayInit;

    public ChangePositionOfElementsInArray (T[] arrayInit){
        this.arrayInit = arrayInit;
    }

    public T[] reverseElements (int indexOfElement1, int indexOfElement2){
        T[] arrayChanged = null;

        if(arrayInit != null && arrayInit.length > 1) {
            arrayChanged = arrayInit.clone();
            arrayChanged[indexOfElement1] = arrayInit[indexOfElement2];
            arrayChanged[indexOfElement2] = arrayInit[indexOfElement1];
        } else {
            arrayChanged = arrayInit;
        }
        return arrayChanged;
    }
}
