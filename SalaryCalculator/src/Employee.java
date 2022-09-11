
public class Employee {
    String name;    // Çalışanın adı ve soyadı
    double salary;     // Çalışanın maaşı
    int workHours;  // Haftalık çalışma saati
    int hireYear;   // İşe başlangıç yılı

    public Employee(String name, double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if(salary<=1000)
            return 0;
        else{
            return (salary*0.03);
        }
    }
    public int bonus(){
        if(workHours>40){
            return (workHours-40)*30;
        }
        else
            return 0;
    }
    public double raiseSalary(){
        int yıl =2021;
        if(yıl-hireYear<10){
            return (salary*0.05);
        }else if(yıl-hireYear>9 && yıl-hireYear<20){
            return  (salary*0.1);
        }else{
            return  (salary*0.15);
        }
    }

    public void Print(){
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee salary: " + this.salary);
        System.out.println("Working hour: " + this.workHours);
        System.out.println("Start year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Raise of salary : " + raiseSalary());
        System.out.println("salary with taxes and bonus : " + (this.salary-tax()+bonus()));
        System.out.println("Total salary : " + (this.salary+raiseSalary()));
        this.salary = this.salary+raiseSalary();
    }
}
