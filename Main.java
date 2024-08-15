public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("Второй");
        arrayList.add(3);
        arrayList.add("Четвертый");
        arrayList.add(5);
        arrayList.add("Шестой");
        arrayList.add(7);
        arrayList.add("Восьмой");
        arrayList.add(9);
        arrayList.add("Десятый");
        arrayList.add(11);

        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.getIndex(i));
        }
    }
}
