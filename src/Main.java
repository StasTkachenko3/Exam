public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {


        employees[0] = new Employee("Иван", "Иванов", "Иванович", 1, 5_000);
        employees[1] = new Employee("Леха", "Кузьмин", "Тигрович", 2, 6_000);
        employees[2] = new Employee("Михаил", "Васин", "Игоревич", 3, 7_000);
        employees[3] = new Employee("Вазген", "Фиников", "Александрович", 4, 8_000);
        employees[4] = new Employee("Борис", "Калякин", "Александрович", 5, 9_000);
        employees[5] = new Employee("Рубен", "Абрамовичев", "Айратович", 2, 10_000);
        employees[6] = new Employee("Владимир", "Викторов", "Витальевич", 1, 11_000);
        employees[7] = new Employee("Мария", "Арбузова", "Витальевна", 3, 12_000);
        employees[8] = new Employee("Виктория", "Игорева", "Сидоровна", 4, 13_000);
        employees[9] = new Employee("Анастасия", "Куклачева", "Артемовна", 1, 14_000);

        all();
        System.out.println("____________________________________________");
        System.out.println("Итого: " + getSumSalaryPerMonth());

        System.out.println("____________________________________________");

        System.out.println("Сотрудник с мин.зарплатой: " + getMinSalary());

        System.out.println("____________________________________________");

        System.out.println("Сотрудник с макс.зарплатой: " + getMaxSalary());

        System.out.println("_____________________________________________");

        System.out.println("Среднее значение зарплат: " + getSredneeZnachenie());

        System.out.println("_____________________________________________");

        System.out.println(getFioEmployees());


    }

    private static void all() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static double getSumSalaryPerMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    public static Employee getMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }

    public static double getSredneeZnachenie() {
        double sum = getSumSalaryPerMonth();
        int count = countEmployees();
        return sum / count;
    }

    public static int countEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean getFioEmployees() {
        System.out.println("Список Ф.И.О. работников:");
        for (Employee empl : employees) {
            if (empl == null) continue;
            System.out.println(empl.getFullName());
        }
        return false;
    }
}






