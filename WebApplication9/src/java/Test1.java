import entities.* ;
import java.util.Date;
import service.* ;
public class Test1 {
     public static void main(String[] args) {
        // Create some sample services and employees for testing

        ServiceService ss = new ServiceService();
        EmployeService es = new EmployeService();

        // Create Services
        
        Service service1 = new Service();
        service1.setCode("Serv1");
        service1.setLibelle("Service 1");

        Service service2 = new Service();
        service2.setCode("Serv2");
        service2.setLibelle("Service 2");
        Service service3 = new Service();
        service3.setCode("Serv3");
        service3.setLibelle("Service 3");     
        // Save Services
        ss.create(service1);
        ss.create(service2);
        ss.create(service3);
        // Create Employees
        Employe employee1 = new Employe();
        employee1.setNom("Ouichou");
        employee1.setPrenom("Wissal");
        employee1.setDateNaissance(new Date());
        employee1.setPhoto("wissal_photo.jpg"); 
        employee1.setChef(null); 
        employee1.setService(service2); 

        Employe employee2 = new Employe();
        employee2.setNom("Ouichou");
        employee2.setPrenom("Wiwi");
        employee2.setDateNaissance(new Date());
        employee2.setPhoto("wiwi_photo.jpg"); 
        employee2.setChef(employee1); 
        employee2.setService(service1);
        
        Employe employee3 = new Employe();
        employee3.setNom("Oui");
        employee3.setPrenom("Wiwiwi");
        employee3.setDateNaissance(new Date());
        employee3.setPhoto("wiwiwi_photo.jpg"); 
        employee3.setChef(employee3); 
        employee3.setService(service3); 

        // Save Employees
        es.create(employee1);
        es.create(employee2);
        es.create(employee3 );
        // Test the nbemployee method
       /* System.out.println("Number of employees in each service:");
        for (Object[] result : es.nbemploye()) {
            System.out.println("Service: " + result[1] + ", Count: " + result[0]);
        }*/

       /* // Test the getbydates method
        Date startDate = new Date();
        Date endDate = new Date();
        endDate.setTime(startDate.getTime() + 100000000); // Adding milliseconds for testing

        System.out.println("\nEmployees between " + startDate + " and " + endDate + ":");
        for (Employee employee : es.getbydates(startDate, endDate)) {
            System.out.println("Employee: " + employee.getNom() + ", Date of Birth: " + employee.getDateDeNaisssance());
        }

    }*/
  }
}
