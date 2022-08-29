package javacoreiface;

public class PayPerHour implements Salary {

    @Override
    public void salary() {
    }

    @Override
    public void salary(int hours, int hourRate) {
      System.out.println("Перший працівник отримує зарплату: " + hours * hourRate + " грн в місяць");
    }
}
