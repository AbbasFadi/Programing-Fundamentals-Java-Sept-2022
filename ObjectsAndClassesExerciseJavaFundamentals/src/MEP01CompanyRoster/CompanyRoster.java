package MEP01CompanyRoster;

import java.util.List;

public class CompanyRoster {
    static class Department {
        String name;
        List<Employee> employee;
        double avgSalary;

        Department(String name, List<Employee> employee) {
            this.name = name;
            this.employee = employee;
            this.avgSalary = employee.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        }

        double getAvgSalary() {
            return avgSalary;
        }

        String getName() {
            return name;
        }

        List<Employee> getEmployee() {
            return employee;
        }
    }

    static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        Employee() {
            this.email = "n/a";
            this.age = -1;
        }

        void setName(String name) {
            this.name = name;
        }

        void setSalary(double salary) {
            this.salary = salary;
        }

        void setPosition(String position) {
            this.position = position;
        }

        void setDepartment(String department) {
            this.department = department;
        }

        void setEmail(String email) {
            this.email = email;
        }

        void setAge(int age) {
            this.age = age;
        }

        double getSalary() {
            return salary;
        }

        String getDepartment() {
            return department;
        }

        String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        String getEmail() {
            return email;
        }

        int getAge() {
            return age;
        }
    }
}
