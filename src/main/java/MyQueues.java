package main.java;

public class MyQueues {
    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueue<>();
        stringMyQueue.add("Первая строка");
        stringMyQueue.add("Вторая строка");
        stringMyQueue.add("Третья строка");
        stringMyQueue.add("Четвертая строка");
        stringMyQueue.add("Пятая строка");
        System.out.println("Размер очереди до изменений : " + stringMyQueue.size());
        System.out.println(stringMyQueue.peek());
        stringMyQueue.remove(2);
        System.out.println("Удалили  node (index=2), размер очереди = " + stringMyQueue.size());
        stringMyQueue.poll();
        System.out.println(stringMyQueue.peek());
        stringMyQueue.poll();
        System.out.println(stringMyQueue.peek());
        stringMyQueue.poll();
        System.out.println(stringMyQueue.peek());
        stringMyQueue.poll();
        System.out.println(stringMyQueue.peek());
        stringMyQueue.clear();
        System.out.println("Список очистили!" + stringMyQueue.peek());

    }
}
