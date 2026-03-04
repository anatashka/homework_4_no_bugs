package practice_7_exceptions_generics.generics.task_1;

public class Box<T> {
    private T value;

    public T get(){
        return value;
    }

    public void set(T value){
        this.value = value;
    }
}
