public class SingleBuffer<T> {

    private T buffer;
    private boolean isEmpty;

    public SingleBuffer() {
        isEmpty = true;
    }
    public boolean put(T value){
        if(isEmpty){
            buffer = value;
            isEmpty = false;
            return true;
        }else{
            return false;
        }
    }
    public T get(){
        if(isEmpty){
            return null;
        }else{
            T temp = buffer;
            buffer = null;
            isEmpty = true;
            return temp;
        }
    }
}