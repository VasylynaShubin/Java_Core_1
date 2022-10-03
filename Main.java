package javacore;

import java.util.Scanner;

public class Main {

    private static void menu() {
        System.out.println("Натисніть 1, щоб перевірити чи є такий місяць");
        System.out.println("Натисніть 2, щоб вивести на екран всі місяці з такою ж порою року");
        System.out.println("Натисніть 3, щоб вивести на екран всі місяці які мають таку саму кількість днів");
        System.out.println("Натисніть 4, щоб вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("Натисніть 5, щоб вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("Натисніть 6, щоб вивести на екран наступну пору року");
        System.out.println("Натисніть 7, щоб вивести на екран попередню пору року");
        System.out.println("Натисніть 8, щоб вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("Натисніть 9, щоб вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("Натисніть 10, щоб дізнатися чи введений з консолі місяць має парну кількість днів");
    }

    public static void main(String[] args) {
        Month mas[] = Month.values();
        Seasons masSeasons[] = Seasons.values();
        Scanner scan = new Scanner(System.in);

        while (true) {
            menu();
            switch (scan.next()) {
                case "1": {
                    System.out.println("Введіть місяць");
                    scan = new Scanner(System.in);
                    String month = scan.next();
                    boolean flag = isMonthPresent(mas, month);
                    if (!flag) {
                        System.out.println("Такого місяця не існує, спробуйте ввести інший місяць");
                    }
                    break;
                }
                case "2": {
                    System.out.println("Введіть пору року");
                    String seasonSc = scan.next().toUpperCase();
                    boolean flag = false;
                    for (Month m : mas) {
                        if (m.getSeason().name().equalsIgnoreCase(seasonSc)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        Seasons season = Seasons.valueOf(seasonSc);

                        for (Month mon : mas) {
                            if (mon.getSeason().name().equalsIgnoreCase(seasonSc)) {
                                System.out.println(mon);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Такої пори року не існує, спробуйте ввести іншу пору року");
                    }
                    break;
                }
                case "3": {
                    System.out.println("Введіть місяць");
                    String month = scan.next().toUpperCase();
                    boolean flag = isMonthPresent(mas, month);
                    if (flag) {
                        Month monthNumDays = Month.valueOf(month);
                        for (Month m : mas) {
                            if (m.getDays() == monthNumDays.getDays()) {
                                System.out.println(m.name());
                            }
                        }
                        if (!flag) {
                            System.out.println("Такого місяця не існує, спробуйте ввести інший місяць");
                        }
                        break;
                    }
                }
                case "4": {
                    System.out.println("Введіть місяць");
                    String month = scan.next().toUpperCase();
                    boolean flag = isMonthPresent(mas, month);
                    if (flag) {
                        Month monthNumDays = Month.valueOf(month);
                        boolean flagMin = false;
                        for (Month m : mas) {
                            if (m.getDays() < monthNumDays.getDays()) {
                                System.out.println(m.name());
                                flagMin = true;
                            }
                        }
                        if (flagMin == false) {
                            System.out.println("Місяців з меншою кількістю днів не існує.");
                        }
                        if (!flag) {
                            System.out.println("Такого місяця не існує, спробуйте ввести інший місяць");
                        }
                        break;
                    }
                }
                case "5": {
                    System.out.println("Введіть місяць");
                    String month = scan.next().toUpperCase();
                    boolean flag = isMonthPresent(mas, month);
                    if (flag) {
                        Month monthNumDays = Month.valueOf(month);
                        boolean flagMax = false;
                        for (Month m : mas) {
                            if (m.getDays() > monthNumDays.getDays()) {
                                System.out.println(m.name());
                                flagMax = true;
                            }
                        }
                        if (flagMax == false){
                        System.out.println("Місяців з більшою кількістю днів не існує.");
                        }
                        if (!flag) {
                            System.out.println("Такого місяця не існує, спробуйте ввести інший місяць");
                        }
                        break;
                    }
                }
                case "6": {
                    System.out.println("Введіть пору року");
                    String seasonSc = scan.next().toUpperCase();
                    boolean flag = false;
                    for (Seasons s : masSeasons) {
                        if (s.name().equalsIgnoreCase(seasonSc)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        Seasons season = Seasons.valueOf(seasonSc);
                        int ordinal = season.ordinal();
                        if (ordinal == masSeasons.length - 1) {
                            ordinal = 0;
                            System.out.println(masSeasons[ordinal]);
                        } else {
                            System.out.println(masSeasons[ordinal + 1]);
                        }
                    }

                    if (!flag) {
                        System.out.println("Такої пори року не існує, спробуйте ввести іншу пору року");
                    }
                    break;
                }
                case "7": {
                    System.out.println("Введіть пору року");

                    String seasonSc = scan.next().toUpperCase();
                    boolean flag = false;
                    for (Seasons s : masSeasons) {
                        if (s.name().equalsIgnoreCase(seasonSc)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        Seasons season = Seasons.valueOf(seasonSc);
                        int ordinal = season.ordinal();
                        if (ordinal == 0) {
                            ordinal = masSeasons.length - 1;
                            System.out.println(masSeasons[ordinal]);
                        } else {
                            System.out.println(masSeasons[ordinal - 1]);
                        }
                    }
                    if (!flag) {
                        System.out.println("Такої пори року не існує, спробуйте ввести іншу пору року");
                    }
                    break;
                }
                case "8": {
                    System.out.println("Ці місяці мають парну кількість днів:");
                    for (Month m : mas) {
                        if (m.getDays() % 2 == 0) {
                            System.out.println(m);
                        }
                    }
                    break;
                }
                case "9": {
                    System.out.println("Ці місяці мають непарну кількість днів:");
                    for (Month m : mas) {
                        if (m.getDays() % 2 == 1) {
                            System.out.println(m);
                        }
                    }
                    break;
                }
                case "10": {
                    System.out.println("Введіть місяць");
                    String month = scan.next().toUpperCase();
                    boolean flag = isMonthPresent(mas, month);
                    if (flag) {
                        Month mo = Month.valueOf(month);
                        /* for (Month mon : mas) {*/
                        if (mo.getDays() % 2 == 0) {
                            System.out.println("Так, цей місяць має парну кількість днів");
                        } else {
                            System.out.println("Ні, цей місяць має непарну кількість днів");
                        }
                    }
                    if (!flag) {
                        System.out.println("Такого місяця не існує, спробуйте ввести інший місяць");
                    }
                    break;
                }
            }
        }
    }

    private static boolean isMonthPresent(Month[] mas, String month) {
        boolean flag = false;
        for (Month m : mas) {
            if (m.name().equalsIgnoreCase(month)) {
                System.out.println("Такий місяць існує");
                flag = true;
                break;
            }
        }
        return flag;
    }
}
