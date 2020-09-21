package ru.mine;


public class Main {


        public static void main(String[] args) {

            System.out.println("Создание MyArrayList на 50 элементов с помощью соответствующего конструктора");
            MyArrayList<Integer> numeric = new MyArrayList<Integer>(50);

            System.out.println("MyArrayList - пустой? " + numeric.isEmpty());
            System.out.println("Сколько элементов сейчас в списке? " + numeric.size());

            System.out.println("Наполним массив целочисленными значениями от 1 до 20");
            for (int i = 0; i < 50; i++) {
                numeric.add((int)(Math.random() * 20) + 1);
            }

            System.out.println("MyArrayList - пустой? " + numeric.isEmpty());
            System.out.println("Кол-во элементов в списке: " + numeric.size());

            System.out.println("Добавим число 12345 в конец списка");
            numeric.add(12345);
            System.out.println("Индекс числа 12345: " + numeric.find(12345));

            System.out.println("Кол-во элементов в списке: " + numeric.size());
            System.out.println("Значение 50-го элемента: " + numeric.get(50));

            System.out.println("Элемент под индексом 5 перед удалением: " + numeric.get(5));
            System.out.println("Кол-во элементов в списке: " + numeric.size());
            System.out.println("Удаление элемента под индексом 5");
            numeric.remove(numeric.get(5));
            System.out.println("Элемент под индексом 5 после удаления: " + numeric.get(5));
            System.out.println("Кол-во элементов в списке: " + numeric.size());

            System.out.println("Добавим элемент в определенную позицию");
            System.out.println("Элемент под индексом 10 перед вставкой другого элемента: " + numeric.get(10));
            numeric.add(10, 200);
            System.out.println("Элемент под индексом 10 после вставки: " + numeric.get(10));
            System.out.println("Элемент под индексом 11 после вставки: " + numeric.get(11));

            System.out.println("Проверка существования элемента в массиве");
            System.out.println("Число 12345 в массиве? " + numeric.isIn(12345));
            System.out.println("Число 123456 в массиве?? " + numeric.isIn(123456));

            for (int i = 0; i < numeric.size(); i++) {
                System.out.println("MyArrayList[" + i + "]: " + numeric.get(i));
            }

            System.out.println("************************************************");

            System.out.println("Проверка конструктора по умолчанию");

            MyArrayList<String> test = new MyArrayList<String>();
            System.out.println("Текущий размер списка: " + test.size());
            System.out.println("Список MyArrayList пуст? : " + test.isEmpty());
            test.add("x");
            test.add("b");
            test.add("aa");
            test.add("bh");
            test.add("G");
            test.add("d");
            test.add("a");
            test.add("e");
            test.add("bd");
            test.add("c");
            test.add(2, "CARL");
            test.add(2, "CRINGE");
            test.add(10, "CARL");
            test.add(19, "CARL");
            test.remove("CARL");
            test.remove("x");
            System.out.println("Текущий размер списка: " + test.size());
            System.out.println("Список MyArrayList пуст? : " + test.isEmpty());
            System.out.println("Элемент под индексом 1: " + test.get(1));
            System.out.println("Элемент под индексом 3: " + test.get(3));
            System.out.println("Позиция элемента \"G\": " + test.find("G"));
            System.out.println("Позиция элемента \"na\": " + test.find("na"));
            System.out.println("Элемент \"bd\" в списке? : " + test.isIn("bd"));
            System.out.println("Элемент \"bda\" в списке?: " + test.isIn("bda"));

            for(int i = 0; i < test.size(); i++) {
                System.out.println("MyArrayList[" + i + "] : " + test.get(i));
            }

            System.out.println("Выход за пределы списка: " + test.get(22));
        }

}
