import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sklad> sklads = new ArrayList<>();
        Sklad sklad1 = new Sklad();
        Sklad sklad2 = new Sklad();

        sklads.add(sklad1);
        sklads.add(sklad2);

        vygruzka(sklads, new ArrayList<>());

        Sklad sklad3 = new Sklad();
        sklad3.add(sklad3);
        vygruzka(sklads, new ArrayList<>());
    }

    public static void vygruzka(ArrayList<Sklad> sklads, ArrayList<Tovar> tovars){

        for (Sklad sklad : sklads) {
            ArrayList<Tovar> tovarsInSklad = new ArrayList<>();
            ArrayList<Tovar> tovarsInUse = new ArrayList<>();
            for (Tovar t: tovars) {
                if (sklad.getVolume() > t.getVolumeBox() && !tovarsInUse.contains(t)){
                    tovarsInSklad.add(t);
                    tovarsInUse.add(t);
                }
                else {
                    break;
                }
            }
            sklad.setTovars(tovarsInSklad);
            tovarsInSklad = new ArrayList<>();
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Выберите пункт меню в работе с товарами");
        System.out.println("    1) Добавление товара на склад");
        System.out.println("    2) Добавление группы товаров на склад");
        System.out.println("    3) Удаление товара со склада");
        System.out.println("    4) Удаление группы товаров со склада");
        System.out.println("    5) Показать типы товаров и их количество");
        System.out.println("    0) Выход в главное меню");
        while (true) {
            int mainMenuItem = sc.nextInt();
    }
}