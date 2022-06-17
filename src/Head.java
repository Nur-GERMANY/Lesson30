import java.util.Scanner;


public class Head {
    private static final
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберитепунктменю");
            System.out.println("    1) Работа с товарами");
            System.out.println("    2) Работа со складом");
            System.out.println("    0) Выход  из программы");
            mainMenuItem = in.nextInt();
            if (mainMenuItem == 1) {
                //Метод для работы с товарами
                workWithProducts();
                } else if (mainMenuItem == 2) {
                // Метод для работы со складами
                workWithStorages();
                } else if (mainMenuItem == 0) {
                 System.out.println("-------------------------------------------------------------");
                 System.out.println("Выход из программы...");
                break;
                 } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
    }

    private static void workWithStorages() {
    }


    private static void workWithProducts(){
            while (true) {
                int mainMenuItem;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню в работе с товарами");
            System.out.println("    1) Добавление товара на склад");
            System.out.println("    2) Добавление группы товаров на склад");
            System.out.println("    3) Удаление товара со склада");
            System.out.println("    4) Удаление группы товаров со склада");
            System.out.println("    5) Показать типы товаров и их количество");
            System.out.println("    0) Выход в главное меню");
            mainMenuItem = in.nextInt();
            //Код для дальнейшей работы

         }
        private static void workWithStorages(); {
         while (true) {
         int mainMenuItem = sc.nextInt();
         System.out.println("-------------------------------------------------------------");
         System.out.println("Выберите пункт меню в работе со складами");
         System.out.println("    1) Показать список складов и товаров в них");
         System.out.println("    2) Добавть новый склад");
         System.out.println("    3) Удалить склад");
         System.out.println("    0) Выход в главное меню");
         mainMenuItem = in.nextInt();
        //Код для дальнейшей работы
        }
   }

}