package HW4;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        String[] myWords = {
                "Двор", "Сад", "Автомобиль", "Компьютер", "Собака",
                "Собака", "Дом", "Собака", "Яблоко", "Дом",
                "Кот", "Автомобиль", "Крот", "Сосед", "Дерево",
                "Вор", "Король", "Банан", "Крокодил", "Сад"
        };

        countUniqueWordsIn(myWords);

        System.out.println("Работа с телефонной книгой");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.appendNewPhoneToName("8(985)777-33-45", "Иванов");
        phoneBook.appendNewPhoneToName("8(985)789-33-45", "Сидоров");
        phoneBook.appendNewPhoneToName("8(985)767-33-45", "Иванов");
        phoneBook.appendNewPhoneToName("8(985)777-38-45", "Беляков");
        phoneBook.appendNewPhoneToName("8(985)777-31-45", "Козлов");
        phoneBook.appendNewPhoneToName("8(985)777-33-95", "Петров");
        phoneBook.appendNewPhoneToName("8(985)777-33-49", "Беляков");
        phoneBook.appendNewPhoneToName("8(985)747-33-45", "Громов");

        System.out.println(phoneBook.getPhonesBy("Иванов"));
        System.out.println(phoneBook.getPhonesBy("Сидоров"));
        System.out.println(phoneBook.getPhonesBy("Беляков"));
        System.out.println(phoneBook.getPhonesBy("Козлов"));
        System.out.println(phoneBook.getPhonesBy("Петров"));
        System.out.println(phoneBook.getPhonesBy("Громов"));

    }

    public static void countUniqueWordsIn(String[] array) {
        HashMap<String, Integer> wordsToCount = new HashMap<>();
        final int firstTimeSee = 1;
        for (String word : array) {
            if (wordsToCount.containsKey(word)) {
                int count = wordsToCount.get(word);
                wordsToCount.put(word, count + 1);
            } else {
                wordsToCount.put(word, firstTimeSee);
            }
        }

        System.out.println("Вывод уникальных слов в массиве");
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            if (wordEntry.getValue() == firstTimeSee) {
                System.out.println(wordEntry.getKey());
            }
        }

        System.out.println("Вывод повторений слов в массиве");
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            System.out.println(wordEntry.getKey() + " : " + wordEntry.getValue());
        }
    }
}
