package SalaryCalculationWithClasses;

public class SalaryCalculator {
    public static class Employee{
        private String name;
        private int salary;
        private int workHours;
        private int hireYear;

        Employee(String name,int salary,int workHours,int hireYear){
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }
        private float tax(){
            float taxAmount =0;
            if (this.salary <1000)
                return taxAmount;
            else
                taxAmount = this.salary*(3f/100f);
            return taxAmount;
        }
        private float bonus(){
            float bonusPayout =0;
            if (this.workHours>40){
                bonusPayout = (this.workHours-40)*30;
            }
            else
                return bonusPayout;
            return bonusPayout;
        }

        private float raiseSalary(){
            float raise =0;
            if (2021-this.hireYear<10){
                raise = this.salary*5f/100f;
            }
            else if (2021-this.hireYear>10 && 2021-this.hireYear < 20){
                raise = this.salary*10f/100f;
            }
            else if (2021-this.hireYear>=20){
                raise = this.salary*15f/100f;
            }
            return  raise;
        }

        @Override
        public String toString() {
            return  "Name: "+ name + "\n"+
                    "Salary: " + salary + "$\n" +
                    "Worked Hours: " + workHours + "\n" +
                    "Hire Year: " + hireYear + "\n" +
                    "Tax: " +tax() + "$\n"+
                    "Bonus: " + bonus() + "$\n" +
                    "Raise Salary: " + raiseSalary() + "$\n" +
                    "Total Salary: " + (tax()+bonus()+raiseSalary()+salary);
        }
    }


    public static void main(String[] args) {
    Employee holy = new Employee("holy",1000,60,2000);
        System.out.println(holy);
    }
}
