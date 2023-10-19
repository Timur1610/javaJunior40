package kommentarii;

public class KOLLEKCII {
    /**
     * Коллекциями называют структуры, предназначенные для хранения однотипных данных
     *
     *                                                                                                               На вершине *библиотеки* контейнеров Java расположены два основных интерфейса,
     *                                                                                                                    которые представляют два принципиально разных вида коллекций:
     *
     *                                                                                                   интерфейс Collection – группа объектов                                                                                                   интерфейс Map – ассоциативный массив объектов (от слова ассоциация - взаимосвязь одного с другим)
     *                                                                                                   от интерфейса Collection (java.util.Collection)                                                                                          Map — это структура данных, которая содержит набор пар “ключ-значение”.
     *                                                                                                   идут два дочерних класса - расширяющие:                                                                                                  По своей структуре данных напоминает словарь, поэтому ее часто так и называют.
     *                                                                                                     java.util.List   и   java.util.Set                                                                                                      В то же время, Map является интерфейсом,
     *                                                                                                                                                                                                                                            и в стандартном jdk содержит основные реализации: Hashmap, LinkedHashMap, Hashtable, TreeMap.
     *                                                                                                                                                                                                                                              1) Являются ли MAP'ы коллекциями? Можно сказать и да и нет, это считается ассоциативный массив, но их приписывают также и к коллекциям
     *                                                                                                                                                                                                                                               2) Где их используют? Турнирные таблицы - команды/баллы; Рецепты - продукты/вес; Телефонная книга - ФИО/номер телефона.
     *                                                                                                                                                                                                                                               Это любые списки которые имеют один ключ и одно значение
     *
     *                                                                                               *Библиотека* - это папка, в которой лежит набор классов по работе с каким то одним инструментом
     *                                                                                               (папка в которой собраны классы по работе с интернетом или по работе с базой данных или по работе с коллекциями)
     *
     *                                                                                                                    Разница между интерфейсами
     *
     *                                                   LIST                                                                                                                                            SET                                                                          HASHMAP
     *
     *                                    List – это список объектов                                                                                                                  Set – множество неповторяющихся объектов.                                         HashMap в Java — это структура данных,
     *                                    List - это интерфейс,                                                                                                                       Set – это интерфейс,                                                              которая позволяет хранить пары «ключ-значение».
     *                                    который наследуется от интерфейса Collection.                                                                                               который наследуется от интерфейса Collection.                                     Основное преимущество HashMap заключается в том,
     *                                                                                                                                                                                                                                                                  что она обеспечивает быстрый доступ к значениям по ключам
     *                                    1) есть индексы(каки у массива (от 0 до 9, к примеру)                                                                                 1) (нет индексов(аналог мешка:
     *                                    положили 10 элементов, каждый элемент лежит по индексам)                                                                              закидали яблоки в мешок и каждое яблоко не по индексу
     *
     *                                    2) могут быть дубликаты - может быть такое,                                                                                           2) без дубликатов, сохраняет исключительно уникальные объекты
     *                                    что 3 абсолютно одинаковых элемент туда могут зайти                                                                                   (если положить туда 3 одинаковых элемента,
     *                                    Предположим, 3 одинаковых логина хранятся в List'е                                                                                    то сохранит только первый из них, а 2 других выкинет
     *
     *                                    3) порядок вхождения (если положить 1, 2, 3, 4 объекты,                                                                               3) нет порядка вхождения (аналог мешка:
     *                                    то ровно в такой же последовательности они и будут лежать                                                                                закидали яблоки в мешок, поэтому все яблоки вразброс
     *                                                                                                                                                                             и когда из этого мешка напечатать на консоль, то выведется
     *                                                                                                                                                                             все в хаотичном порядке
     *
     *
     *                      Интерфейс List реализуется двумя самыми популярными классами (коллекциями)                                                                                                      Интерфейс Set
     *                      Разница ArrayList и LinkedList в скорости выполнения определенных методов
     *
     *               ArrayList                                                                 LinkedList                                                                                  HashSet                                                   SortedSet
     * Класс ArrayList представляет собой список динамической длины.       (обеспечивает возможность создания двунаправленной очереди из любых элементов.                    1)В классе HashSet элементы не упорядочены
     * Данные внутри класса хранятся во внутреннем массиве                 Каждый объект, помещенный в связанный список, является узлом (нодом).                               (но если нам важен порядок вхождения,
     * (Когда какой-то элемент удаляют, длина уменьшается                  Каждый узел содержит элемент, ссылку на предыдущий и следующий узел.)                                то можно использовать дочерний класс - LinkedHashSet)
     * Когда какой-то элемент добавляют, длина увеличивается                                                                                                                 2)Дубликатов нет
     * все это автоматически)
     *
     * 1)Метод add(вставка по индексу) будет работать медленно,                      1)Метод add(вставка по индексу) работает быстро
     * так как он будет передвигать каждый элемент на один вправо,                     не будет ничего передвигать,
     * ему нужно будет освободить указанный индекс                                     автоматически  все переиндексируется
     * (медленно будет работать, если этих элементов, к примеру, больше 1000000)
     *
     * 2)Метод set(заменяет по индексу) будет работать быстро,                       2)Метод set(заменяет по индексу) работает быстро
     * так как он просто удалит старый элемент по индексу и                            не будет ничего передвигать,
     * заменит его новым элементом                                                     автоматически  все переиндексируется
     *
     * 3)Метод remove(удаляет по индексу)будет работать медленно,                    3)Метод remove(удаляет по индексу) работает быстро
     * ему нужно будет удалить указанный элемент под индексом и                        не будет ничего передвигать,
     * передвинуть каждый элемент на один шаг влево, таким образом,                    автоматически  все переиндексируется
     * нельзя оставлять пустые ячейки
     *
     * 4)Метод get(найти по индексу) работает быстро                                 4)Метод get(найти по индексу) работает медленно
     *                                                                                 (находит, деля путь на 2)
     *
     *
     *                                                                               итог - если в задачи стоит частое ДОБАВЛЕНИЕ или
     *                                                                               УДАЛЕНИЕ, то нужно выбирать LinkedList
     *
     *
     *
     *
     *
     *
     */
}