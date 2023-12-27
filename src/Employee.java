public class Employee {
    private String SurName;

    private String Name;

    private String Patronymic;

    private int Department;

    private int Salary;

    private final int id;

    private static int counter;

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public Employee(String surName, String name, String patronymic, int department, int salary) {
        if (department <= 0 || department > 5)
            throw new IllegalArgumentException("Такого сотрудника не существует");
        counter++;
        SurName = surName;
        Name = name;
        Patronymic = patronymic;
        Department = department;
        Salary = salary;
        this.id = getCounter();
    }

    @Override
    public String toString() {
        return "" +
                "Фамилия-" + SurName + "," +
                " Имя-" + Name + "," +
                " Отчество-" + Patronymic + "," +
                " Отдел-" + Department + ":" +
                " Зарплата-" + Salary +
                " id=" + id +
                "";
    }
    public String getFullName(){
        return SurName + " " + Name +" "+ Patronymic;
    }

}


