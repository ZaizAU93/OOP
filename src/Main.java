public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //1.1 Создать класс Calculator с полями weight, cost, color и заполнить их. И методами
        //нахождения суммы, разности, деления, умножения двух чисел. Метод main в этом классе
        //не создавать !
        //1.2 Создать объект класса Calculator в main методе другого класса. Проверить работу
        //методов и вывести в консоль значения полей weight, cost, color.
        //1.3 Создать конструктор для класса Calculator, чтобы иметь возможность
        //инициализировать поля в момент создания объекта. Также в логическом блоке добавить
        //вывод в консоль, создаётся объект Calculator

        Calculator calculator = new Calculator(10, 50, "blue");
        System.out.println("Weight: " + calculator.getWeight());
        System.out.println("Cost: " + calculator.getCost());
        System.out.println("Color: " + calculator.getColor());

        double x = 5.5;
        double y = 2.5;

        double sum = calculator.getSum(x, y);
        double difference = calculator.getDifference(x, y);
        double division = calculator.getDivision(x, y);
        double multiplication = calculator.getMultiplication(x, y);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Division: " + division);
        System.out.println("Multiplication: " + multiplication);

        //Задача 2:
        //2.1 Создать класс Person, который содержит: переменные fullName, age; методы
        //talk(String text) и move(), в которых вывести на консоль сообщение -"*fullName* talk
        //*text*..." и "*fullName* walk.".
        //2.2 Добавьте два конструктора - Person() и Person(fullName, age).
        //2.3 Создайте два объекта этого класса. Один объект инициализируется конструктором
        //Person(), другой - Person(fullName, age). Вызовите методы move() и talk()

        System.out.println("exercise №2");
        Person person1 = new Person();
        person1.move();
        person1.talk("Hello");

        Person person2 = new Person("BRUS", 23);
        person2.move();
        person2.talk("Hello");

        //Блок 2. Домашнее задание
        //Задача 1:
        //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
        //метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
        //который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
        //выводит текущую информацию о карточке. Напишите программу, которая создает три
        //объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
        //третьей. Выведите на экран текущее состояние всех трех карточек.

        System.out.println("");
        System.out.println("exercise №3");
        CreditCard card1 = new CreditCard("121", 180.0);
        CreditCard card2 = new CreditCard("122", 25.7);
        CreditCard card3 = new CreditCard("123", 50.0);

        card1.deposit(50.0);
        card2.deposit(100.0);
        card3.withdraw(75.0);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();

        System.out.println("exercise №4");
        ATM atm = new ATM(10, 15, 20);
        atm.addMoney(0, 2, 1);
        boolean success = atm.withdrawMoney(20);
        System.out.println("Withdrawal success: " + success);
    }
}