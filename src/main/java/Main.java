import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести исходные данные");
        System.out.print("Введите размер списка: ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите верхнюю границу для заполения: ");
        int bound = Integer.parseInt(scanner.nextLine());

        logger.log("Создаём и заполняем список");
        List<Integer> list = new Random().ints(size, 0, bound).boxed().collect(Collectors.toList());
        System.out.print("Вот случайный список: ");
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = Integer.parseInt(scanner.nextLine());

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        filteredList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        logger.log("Завершаем программу");

    }

}
