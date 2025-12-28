public class Main {
    public static void main(String[] args) {
        // Задание номер 1
        int firstFriday = 2;
        for (byte i = 1; i <= 31; i++) {
            if (firstFriday == i) {
                System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет.");
                firstFriday += 7;
            }
        }
        // Задание номер 2
        // 1 вариант
        int distanceTraveled = 0;
        int allDistance = 42195;
        do {
            int result = allDistance - distanceTraveled;
            System.out.println("Держитесь! Осталось " + result + " метров.");
            distanceTraveled += 500;

        } while (distanceTraveled < allDistance);
        // 2 вариант
        int distanceTraveledTwo = 0;
        int allDistanceTwo = 42195;
        for (byte x = 0; ; x++) {
            if (distanceTraveledTwo < allDistanceTwo) {
                int resultTwo = allDistanceTwo - distanceTraveledTwo;
                System.out.println("Держитесь! Осталось всего " + resultTwo + " метров.");
                distanceTraveledTwo += 500;
            } else break;
        }
        // Задание номер 3
        // 1 вариант
        byte oneDay = 100;
        byte days = 0;
        int Amount = 555;
        while (Amount >= 100) {
            days++;
            if (days % 5 == 0) {
                continue;
            }
            Amount = Amount - oneDay;
        }
        System.out.println("Кол-во дней: " + days);
        // 2 вариант
        Amount = 555;
        days = 0;
        for (; ; ) {
            if (Amount < 100) {
                break;
            }
            days++;
            if (days % 5 == 0) {
                continue;
            }
            Amount = Amount - oneDay;
        }
        System.out.println("Кол-во дней: " + days);
        // Задание номер 4
        short month = 0;
        short money = 15000;
        int total = 0;
        while (true) {
            if (total > 12000000) {
                break;
            }
            month++;
            if (month % 6 == 0) {
                total += money;
                total = total + (7 * total) / 100;
            } else {
                total = total + money;
            }
            System.out.println("Месяц: " + month + ", Сумма: " + total);
        }
        System.out.println(" Итого = " + month + " месяцев");
        //Задание номер 5
        byte charge = 20;
        byte minute = 0;
        byte overheats = 0;
        while (overheats <= 100) {
            minute++;
            if (overheats == 3) {
                System.out.println(" Досрочное завершение зарядки. Заряд " + charge);
                break;
            }
            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");


    }

}
