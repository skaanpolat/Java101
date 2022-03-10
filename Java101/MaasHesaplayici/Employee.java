package Java101.MaasHesaplayici;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax (int salary){
        salary=this.salary;
        double v;
        if (salary<1000){
            return 0;
        }
        if(salary>=1000){
            v = salary*0.03;
            return v;
        }
        return 1;
    }

    double bonus(int workHours){
        int xtraHours=0;
        if(workHours>40){
            xtraHours = workHours-40;
            int bonus = xtraHours * 30;
            return bonus;
        }
        return 0;
    }
    double raiseSalary(int hireYear){
        if (hireYear<2022-19){
            return salary*0.15;

        }
        else if((hireYear<2022-10) && (hireYear>2022-19)){

            return salary*0.10;
        }
        else if (hireYear>2022-10){

            return salary*0.5;
        }
        return 0;
    }

    public void toString(Employee employee){
        System.out.println("Adı : " + this.name
                + "\nMaaşı : " + this.salary
                + "\nÇalışma saati : " + this.workHours
                + "\nBaşlangıç yılı : " + hireYear
                + "\nVergi : "+ tax(salary)
                + "\nBonus : "+ bonus(workHours)
                + "\nMaaş Artışı : " + raiseSalary(hireYear)
                + "\nVergi ve Bonuslar ile birlikte maaş : "+ ((salary+bonus(workHours))-(tax(salary)))
                + "\nToplam Maaş : " + (salary+raiseSalary(hireYear)));

    }


}
