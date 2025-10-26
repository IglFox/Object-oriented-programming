import lr1.Complex;
import lr1.CustomString;

import lr2.COne;
import lr2.CTwo;

import lr3.CThree;

import lr4.CFour;

import java.lang.IO;
import java.util.Objects;

class LabWorkRunner {

    static void main(String[] args) {
        boolean next = true;

        while (next) {
            String input = IO.readln("Input num of lr:\n-> ");
            int choice = Integer.parseInt(input);
            LabWorkRunner.StartWork(choice);

            next = (Objects.equals(IO.readln("- Continue?\n 1. yes\n 2. no\n-> "), "1"));
        }
    }

    public static void StartWork(int choice) {
        switch (choice) {
            case 1:
                LabWork1();
                break;
            case 2:
                LabWork2();
                break;
            case 3:
                LabWork3();
                break;
            case 4:
                LabWork4();
                break;
            case 5:
                LabWork5();
                break;
            default:
                IO.println("[Error] Enter num from 1 to 6");
        }
    }

    public static void printALL(CTwo[] twos, int n) {
        for (int i = 0; i < n; i++) {
            twos[i].print();
        }
    }

    public static void LabWork1() {
        System.out.println("=== Тестирование класса CustomString ===");

        CustomString str1 = new CustomString("Hello, World!");
        CustomString str2 = new CustomString();

        System.out.print("str1: ");
        str1.print();
        System.out.println("Длина str1: " + str1.Length());

        str2.Copy(str1);
        System.out.print("str2 после копирования: ");
        str2.print();

        System.out.println("Поиск 'o' с позиции 0: " + str1.Find('o', 0));
        System.out.println("Последнее вхождение 'l': " + str1.FindLast('l'));

        CustomString substring = str1.Substr(7, 5);
        System.out.print("Подстрока (7,5): ");
        substring.print();

        str1.Remove(5, 2);
        System.out.print("После удаления (5,2): ");
        str1.print();

        str1.Insert(" Java", 5);
        System.out.print("После вставки ' Java' в позицию 5: ");
        str1.print();

        System.out.println("\n=== Тестирование класса Complex ===");

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);

        System.out.print("c1: ");
        c1.print();

        System.out.print("c2: ");
        c2.print();

        Complex sum = c1.add(c2);
        System.out.print("c1 + c2: ");
        sum.print();

        Complex diff = c1.subtract(c2);
        System.out.print("c1 - c2: ");
        diff.print();

        Complex product = c1.multiply(c2);
        System.out.print("c1 * c2: ");
        product.print();

        Complex quotient = c1.divide(c2);
        System.out.print("c1 / c2: ");
        quotient.print();
    }

    public static void LabWork2() {
        IO.println("========test class COne========");
        COne one_empty = new COne();
        one_empty.print();

        COne one_1par = new COne("one with 1 par");
        one_1par.print();


        IO.println("========test class CTwo========");
        CTwo two_empty = new CTwo();
        two_empty.print();

        CTwo two_1par = new CTwo("two with 1 par");
        two_1par.print();

        CTwo two_1par_2 = new CTwo(one_1par);
        two_1par_2.print();
    }

    public static void LabWork3() {
        IO.println("========test class CThree=======");
        CThree three_empty = new CThree();
        three_empty.print();

        CThree three_par = new CThree("not empty");
        three_par.print();
    }

    public static void LabWork4() {
        IO.println("========test class CFour=======");
        CFour four_empty = new CFour();
        four_empty.print();

        COne one = new COne(10231240, "obj one");
        CFour four_par = new CFour(one);
        four_par.print();


        IO.println("========test printALL========");
        CTwo two = new CTwo("two", new COne(12314, "two.one"));
        CThree three = new CThree("three");
        CTwo[] array = {two, three, four_par};

        printALL(array, array.length);
    }

    public static void LabWork5() {
        return;
    }
}