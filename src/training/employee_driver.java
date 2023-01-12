package training;
public class employee_driver {
    public static void main(String[] args) {


        employee e1 = new tester("manu", 111, 20000);
        employee e2 = new hr("sham", 111, 25000);
        employee e3 = new developer("zee", 111, 50000);
        employee[] e = {e1, e2, e3};
        for (int i = 0; i < e.length; i++) {
            e[i].display();
            e[i].work();
            System.out.println("=================");
        }

    }

}
