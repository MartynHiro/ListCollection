import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();

        System.out.println("Приветствую пользователь");

        while (true) {
            MethodsShelf.printSelectionMenu();

            String selectOperation = scanner.next();

            if (selectOperation.equals("5")) {
                System.out.println("Досвидания");
                break;
            }

            switch (selectOperation) {
                case "1" -> MethodsShelf.addPurchase(scanner, shoppingList);

                case "2" -> MethodsShelf.list(shoppingList);

                case "3" -> {
                    MethodsShelf.list(shoppingList);
                    MethodsShelf.deletePurchase(scanner, shoppingList);
                }

                case "4" -> MethodsShelf.searching(scanner, shoppingList);

                default -> System.out.println("Такой операции не существует");
            }
        }
    }
}