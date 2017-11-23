public class MyArrayList<T> {
    private static final int INIT_SIZE = 16;    // размер массива при инициализации
    private static final int INC_RATE = 2;      // множитель для увеличения массива
    private static final int CUT_RATE = 4;      // делитель для проверки длины массива
    // CUT_RATE > INC_RATE
    private Object[] myArray;                   // массив объектов
    private int pointer = 0;                    // указатель на место добавления элемента

    public MyArrayList() {
        this.myArray = new Object[INIT_SIZE];
    }

    // добавляет элемент в конец
    public void add(T value) {
        // если массив закончился, то увеличиваем в INC_RATE
        if (pointer == myArray.length - 1)
            resize(myArray.length * INC_RATE);

        myArray[pointer++] = value;
    }

    // удаляет элемент под индексом
    public boolean remove(int index) {
        if (index >= 0 && index < pointer) {
            // смещение элементов справа на шаг влево
            System.arraycopy(myArray, index + 1, myArray, index, pointer - index);
            myArray[--pointer] = null;

            // если массив уменьшился в CUT_RATE, то уменьшаем его в INC_RATE
            if (myArray.length > INIT_SIZE && pointer < myArray.length / CUT_RATE)
                resize(myArray.length / INC_RATE);

            return true;
        }
        return false;
    }

    // очищает коллекцию
    public void clear() {
        // очищаем
        if (pointer > 0) {
            for (int i = 0; i < pointer; i++)
                myArray[i] = null;

            myArray = new Object[INIT_SIZE];
            pointer = 0;
        }
    }

    // возвращает размер коллекции
    public int size() {
        return pointer;
    }

    // возвращает элемент под индексом
    public T get(int index) {
        if (index >= 0 && index < pointer) return (T) myArray[index];
        return null;
    }

    // изменение длины массива
    private void resize(int length) {
        Object[] tempArray = new Object[length];
        System.arraycopy(myArray, 0, tempArray, 0, pointer);
        myArray = tempArray;
    }
}