package task;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String deptName;
    private Employee position;
    private List<Employee> employees;

    public class Employee extends Person {
        private Position position;
        private int salary;

        public Position getPosition() {
            return position;
        }

        public void setPosition(Position position) {
            this.position = position;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Employee(String name, String surname, Position position, int salary) {
            super(name, surname);
            this.position = position;
            this.salary = salary;
            employees.add(this);
        }

        public List<Employee> filterByPosition(Position position) {
            List<Employee> employeesByPosition = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getPosition().equals(position)) {
                    employeesByPosition.add(employee);
                }
            }
            return employeesByPosition;
        }
    }

    public enum Position {
        MANAGER, PROGRAMMER, HR, TESTER
    }
}
