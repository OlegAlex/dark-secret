import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arraySize = 10; // размер массива
        int minRnd = 10;    // минимальное число рандома
        int maxRnd = 100;   // максимальное число рандома
        int i;              // счётчик

        Random random = new Random(System.currentTimeMillis());

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyStack<Integer> myStack = new MyStack<>();
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

        for (i = 0; i < arraySize; i++)
            arrayList.add(random.nextInt(maxRnd - minRnd) + minRnd);

        for (i = 0; i < arraySize; i++)
            linkedList.add(random.nextInt(maxRnd - minRnd) + minRnd);

        System.out.println("-----MyArrayList-----");
        System.out.print("Массив: ");
        for (i = 0; i < arrayList.size() - 1; i++) System.out.print(arrayList.get(i) + ", ");
        System.out.println(arrayList.get(i) + ". Размер: " + arrayList.size());

        System.out.println("Удаляем 11 элемент: " + arrayList.remove(10));
        System.out.println("Удаляем 3 элемент: " + arrayList.remove(2));

        System.out.print("Массив после удаления: ");
        for (i = 0; i < arrayList.size() - 1; i++) System.out.print(arrayList.get(i) + ", ");
        System.out.println(arrayList.get(i) + ". Размер: " + arrayList.size());

        arrayList.clear();
        System.out.print("Массив после очистки: ");
        for (i = 0; i < arrayList.size() - 1; i++) System.out.print(arrayList.get(i) + ", ");
        System.out.println(arrayList.get(i) + ". Размер: " + arrayList.size());

        System.out.println("\n-----MyLinkedList-----");
        System.out.print("Список: ");
        for (i = 0; i < linkedList.size() - 1; i++) System.out.print(linkedList.get(i) + ", ");
        System.out.println(linkedList.get(i) + ". Размер: " + linkedList.size());

        System.out.println("Удаляем 11 элемент: " + linkedList.remove(10));
        System.out.println("Удаляем 3 элемент: " + linkedList.remove(2));

        System.out.print("Список после удаления: ");
        for (i = 0; i < linkedList.size() - 1; i++) System.out.print(linkedList.get(i) + ", ");
        System.out.println(linkedList.get(i) + ". Размер: " + linkedList.size());

        linkedList.clear();
        System.out.print("Список после очистки: ");
        for (i = 0; i < linkedList.size() - 1; i++) System.out.print(linkedList.get(i) + ", ");
        System.out.println(linkedList.get(i) + ". Размер: " + linkedList.size());

        System.out.println("\n-----MyQueue-----");
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.print("Очередь: ");
        for (i = 0; i < myQueue.size() - 1; i++) System.out.print(myQueue.get(i) + ", ");
        System.out.println(myQueue.get(i) + ". Размер: " + myQueue.size());
        System.out.println("Первый в очереди: " + myQueue.peek());

        System.out.println("Удаляем 4 элемент: " + myQueue.remove(3));
        System.out.println("Удаляем 2 элемент: " + myQueue.remove(1));

        System.out.print("Очеред после удаления: ");
        for (i = 0; i < myQueue.size() - 1; i++) System.out.print(myQueue.get(i) + ", ");
        System.out.println(myQueue.get(i) + ". Размер: " + myQueue.size());
        System.out.println("Первый в очереди: " + myQueue.peek());

        myQueue.poll();
        myQueue.add(4);
        myQueue.add(5);

        System.out.print("Очеред после добавления и удаления: ");
        for (i = 0; i < myQueue.size() - 1; i++) System.out.print(myQueue.get(i) + ", ");
        System.out.println(myQueue.get(i) + ". Размер: " + myQueue.size());
        System.out.println("Первый в очереди: " + myQueue.peek());

        myQueue.clear();
        System.out.print("Очеред после очистки: ");
        for (i = 0; i < myQueue.size() - 1; i++) System.out.print(myQueue.get(i) + ", ");
        System.out.println(myQueue.get(i) + ". Размер: " + myQueue.size());

        System.out.println("\n-----MyStack-----");
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.print("Стек: ");
        for (i = 0; i < myStack.size() - 1; i++) System.out.print(myStack.get(i) + ", ");
        System.out.println(myStack.get(i) + ". Размер: " + myStack.size());
        System.out.println("Первый в стеке: " + myStack.peek());

        System.out.println("Удаляем 4 элемент: " + myStack.remove(3));
        System.out.println("Удаляем 2 элемент: " + myStack.remove(1));

        System.out.print("Стек после удаления: ");
        for (i = 0; i < myStack.size() - 1; i++) System.out.print(myStack.get(i) + ", ");
        System.out.println(myStack.get(i) + ". Размер: " + myStack.size());
        System.out.println("Первый в стеке: " + myStack.peek());

        myStack.pop();
        myStack.push(4);
        myStack.push(5);

        System.out.print("Стек после добавления и удаления: ");
        for (i = 0; i < myStack.size() - 1; i++) System.out.print(myStack.get(i) + ", ");
        System.out.println(myStack.get(i) + ". Размер: " + myStack.size());
        System.out.println("Первый в стеке: " + myStack.peek());

        myStack.clear();
        System.out.print("Стек после очистки: ");
        for (i = 0; i < myStack.size() - 1; i++) System.out.print(myStack.get(i) + ", ");
        System.out.println(myStack.get(i) + ". Размер: " + myStack.size());

        System.out.println("\n-----MyHash-----");
        System.out.println("Добавляем нового: " + myHashMap.put("Дима", 5));
        System.out.println("Добавляем нового: " + myHashMap.put("Саша", 10));
        System.out.println("Добавляем дубль: " + myHashMap.put("Саша", 5));
        System.out.println("Добавляем нового: " + myHashMap.put("Олег", 15));
        System.out.println("Добавляем дубль: " + myHashMap.put("Дима", 15));

        System.out.print("Хеш: ");
        for (i = 0; i < myHashMap.size() - 1; i++) System.out.print("[" + myHashMap.getNode(i).getKey() + ", " +
                myHashMap.getNode(i).getValue() + "], ");
        System.out.println("[" + myHashMap.getNode(i).getKey() + ", " + myHashMap.getNode(i).getValue() + "]");

        System.out.println("Удаляем существующего: " + myHashMap.remove("Дима"));
        System.out.println("Удаляем несуществующего: " + myHashMap.remove("Вова"));

        System.out.print("Хеш после удаления: ");
        for (i = 0; i < myHashMap.size() - 1; i++) System.out.print("[" + myHashMap.getNode(i).getKey() + ", " +
                myHashMap.getNode(i).getValue() + "], ");
        System.out.println("[" + myHashMap.getNode(i).getKey() + ", " + myHashMap.getNode(i).getValue() + "]");

        myHashMap.clear();
        System.out.print("Хеш после очистки: ");
        for (i = 0; i < myHashMap.size() - 1; i++) System.out.print(myHashMap.getNode(i));
    }
}
