public class Employee {
    private String Name;

    private String Surname;

    private String Patronymic;

    private final int id;

    private static int counter;

    private int Department;

    private int Salary;

    public Employee(String name, String surname, String patronymic, int department, int salary) {
        if (department <= 0 || department > 5)
            throw new IllegalArgumentException("Такого не существует !!!");
        counter++;
        Name = name;
        Surname = surname;
        Patronymic = patronymic;
        this.id = getCounter();
        Department = department;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
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

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        if (department > 1 || department <= 5)
            Department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "" +
                "Имя: " + Name + ',' +
                " Фамилия: " + Surname + ',' +
                " Отчество: " + Patronymic + ',' +
                " id: " + id +
                " Отдел: " + Department +
                " Зарплата: " + Salary;
    }
    public String getFullName(){
        return Name + " " + Surname + " " + Patronymic;
    }


}

