
package javacoreiface;

public class FixedPay implements Salary {

    @Override
    public void salary() {
       System.out.println("Другий працівник отримує зарплату: 20000 грн в місяць");
    }

    @Override
    public void salary(int hours, int hourRate) {
            }
    
}
