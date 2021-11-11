import java.util.List;


public class Main {

    public static void main(String[] args) {
        Customer a = new Customer("Mihai Ianculescu","str. Independentei 9", 2009000);
        Customer b = new Customer("Alexandra Turcan","str. Independentei 9", 2008889000);
        Customer c = new Customer("Iulian Popescu","str. Independentei 3", 200888990);

        Courier x = new Courier("Emil Enache", 2345, 6);
        Courier y = new Courier("Vasile Olaru", 2309, 9);
        Courier z = new Courier("Adrian Dabija", 3449, 33);

        System.out.println("\n ID of " + a.getName() + " " );
        System.out.println(" " + a.getId());
        System.out.println("Changing the ID in process...");
        a.setId(1111222230);
        System.out.println("ID seted successfuly: " + a.getId());

        List<Customer> customerList = List.of(a,b,c);
        customerList.forEach(customer -> {
            System.out.println(customer.print());
        });

        System.out.println("\n Route of " + x.getName() + " " );
        System.out.println(" " + x.getRoute());
        System.out.println("Changing the Route number is in process...");
        x.setRoute(1);
        System.out.println("Route reseted successfuly: " + x.getRoute());

        List<Courier> courierList = List.of(x,y,z);
        courierList.forEach(courier -> {
            System.out.println(courier.print());
        });
    }

}
