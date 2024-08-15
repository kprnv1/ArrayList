public class ArrayList {
    int SIZE = 10;
    private Object[] array = new Object[SIZE];
    int count = 0;
    double RAISE = 1.5;

    public void add(Object name) {
        if (count == array.length) {
            resize(array.length * RAISE);
        }
        array[count++] = name;
    }

    public void resize(double newLength) {
        Object[] newArray = new Object[(int) newLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getSize() {
        return count;
    }

    public Object getIndex(int index) {
        return array[index];
    }
}
