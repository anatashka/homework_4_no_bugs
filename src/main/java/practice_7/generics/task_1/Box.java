package practice_7.generics.task_1;

public class Box<T> {
    private T value;

    public T get(){
        return value;
    }

    public void set(T value){
        this.value = value;
    }
}
