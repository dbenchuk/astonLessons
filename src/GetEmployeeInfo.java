public class GetEmployeeInfo {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Petrov Petr Petrovich", "C Developer",
                "petrov@gmail.com", "375448070514", 1200, 22);
        employeeArray[1] = new Employee("Fedotov Fedor Stepanovich", "C++ Developer",
                "fedotov@gmail.com", "375293150280", 1220, 23);
        employeeArray[2] = new Employee("Stepanov Maksim Nikolaevich", "C# Developer",
                "stepanov@gmail.com", "375256354217", 1315, 21);
        employeeArray[3] = new Employee("Lapushkova Irina Alexandrovna", "Kotlin Developer",
                "lapushkova@gmail.com", "375252138212", 1280, 24);
        employeeArray[4] = new Employee("Dorofeeva Elena Nikolaevna", "Assembly Developer",
                "dorofeeva@gmail.com", "375444521736", 1500, 22);

        for (Employee employee : employeeArray)
            employee.getInfo();
    }
}