package homework02;




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








