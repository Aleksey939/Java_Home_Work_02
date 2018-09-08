package homework02;

public class List <T>{
    T[] obj;
    int size = -1;
    int cur = -1;

    List(int size) {
        cur = 0;
        this.size = size;
        obj =  new T [size];
    }

    void add(T item) throws FullListException {
        obj[cur++] = item;
        if (cur >= size)
        {
            throw new FullListException();
        }
    }

    void removeLast() throws EmptyListException{
        obj[cur--] = null;
        if (cur < size)
        {
            throw new EmptyListException();
        }
    }

    int size() {
        return obj.length;
    }
}
