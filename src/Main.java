public class Main {
   /* Задание 1.1
    Приведите пример алгоритмов и структур данных из жизни.

    Да почти все, что нас окружает это алгоритмы и структуры данных))))

    Задание 1.2
    Приведите пример алгоритмов и структур данных в
    программировании.

    Основные структуры данных в програмировании:

    Массив (Array)
    Стек (Stack)
    Очередь (Queue)
    Связный список (Linked List)
    Дерево (Tree)
    Граф (Graph)
    Префиксное дерево (Trie)
    Хэш-Таблица (Hash Table)

    Базовые алгоритмы:

    Сортировка - Сортировка слиянием, Сортировка вставками, Быстрая сортировка, Несколько взаимных перестановок.
    Умножение матриц
    Основные алгоритмы просеивания
    Беззнаковая математика, включая умножение и деление
    Алгоритм Евклида для нахождения НОД (наибольший общий делитель), Модульная инверсия, Быстрое возведение в степень
    Числа Фибоначчи с матричным умножением
    Нормальное распределение и математическое ожидание
    Статистика – среднее вероятностное значение случайной величины, медиана, дисперсия, теорема Байеса

    Популярыне алгоритмические методы:

    Алгоритмы декомпозиции – Бинарный поиск, Нахождение подмассива с наибольшей суммой элементов
    Жадные алгоритмы – Выбор задач, кодирование по алгоритму Хаффмана
    Динамичное программирование – Цепное матричное умножение, Алгоритм решения задачи по укладке ранца
    Линейное программирование – Максимизация параметра, Линейное время сортировки
    Криптографические алгоритмы – Алгоритм Манакера по нахождению длиннейшей подстроки-палиндрома, алгоритм нахождения
    наибольшей общей подпоследовательности (LSC), расстояние Левенштейна


            Задание 1.3
    Напишите программный код, в котором все данные хранятся только в
    переменных трех типов данных: Ссылочные, примитивные и своего класса
    содержащего: конструктор и метод отображения данных.
    Выведите написанные данные.
            Задание 1.4
    Дополните предыдущий код сравнением ваших данных с другой
    переменной, данный код должен имитировать простейший поиск перебором.
    Оцените время выполнения алгоритма с помощью базового метода
System.nanoTime().*/
    public static void main(String[] args) {
        task1();
    }


    private static void task1() {
        int age = 22;
        String name = "Игнат";
        String name1 = new String("Игнат");
        Cat cat = new Cat("Игнат",22);
        int age1 = new Integer(22);
        System.out.println(cat.toString());
        System.out.println(age);
        System.out.println(age1);
        System.out.println(name);
        System.out.println(name1);

        System.out.println(age==age1);
        System.out.println(name==name1);
        System.out.println(name.equals(name1));
        System.out.println(cat.equals(name));

    }
}
