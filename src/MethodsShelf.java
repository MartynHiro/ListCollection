import java.util.List;
import java.util.Scanner;

public class MethodsShelf {
    public static void printSelectionMenu() {
        System.out.print("""
                Введите номер операции:
                \t 1. Добавить покупку
                \t 2. Показать все покупки
                \t 3. Удалить покупку
                \t 4. Найти все соответствия
                \t 5. Закончить работу
                >>""");
    }

    public static void list(List shoppingList) {
        System.out.println("Список покупок:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }

    public static void addPurchase(Scanner scanner, List<String> shoppingList) {
        System.out.print("Введите какую покупку вы хотите совершить: \n>>");
        String addItem = scanner.next();
        shoppingList.add(addItem);
        System.out.println("Итого в списке покупок: " + shoppingList.size());
    }

    public static void deletePurchase(Scanner scanner, List<String> shoppingList) {
        System.out.print("Какую покупку вы хотите удалить? Введите номер или название \n>>");

        try {
            int removeNumber = scanner.nextInt();
            shoppingList.remove(removeNumber - 1);
        } catch (RuntimeException e) {
            String removeItem = scanner.next();
            shoppingList.remove(removeItem);
        }

    }

    public static void searching(Scanner scanner, List<String> shoppingList) {
        StringBuilder matches = new StringBuilder();
        System.out.print("Введите текст для поиска \n>>");
        String searchWord = scanner.next();
        String searchLower = searchWord.toLowerCase();

        System.out.println("Найдено: ");

        for (int i = 0; i < shoppingList.size(); i++) {
            String itemLower = shoppingList.get(i).toLowerCase();

            if (itemLower.contains(searchLower)) {
                matches.append((i + 1) + ". " + shoppingList.get(i) + "\n");
            }
        }
        System.out.println(matches);
    }

}
