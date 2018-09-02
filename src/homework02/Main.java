package homework02;


class  ListException extends Exception{


}

class  EmptyListException  extends ListException{


}

class FullListException extends ListException {


}

class List <T>{
    T[] obj;
    int size = -1;
    int cur = -1;

    List(int size) {
        cur = 0;
        this.size = size;
        obj = new T[size];
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



public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>(1);
        try {
            list.add(265);
            list.add(265);
            list.add(265);
        } catch (ListException ex) {
            System.out.println( "Ошибка  "+ ex.toString());

        }

//        try {
//            list.removeLast();
//            list.removeLast();
//            list.removeLast();
//        } catch (ListException ex) {
//            System.out.println( "Ошибка  "+ ex.toString());
//
//        }

        Integer size = list.size();
        System.out.println("Размер List " + size);
    }
}








