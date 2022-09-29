public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov"; //для хранения имени
        String middleName = "Ivan"; //для хранения отчества
        String lastName = "Ivanovich"; //для хранения фамилии
        String fullName = firstName + ' ' + middleName + ' ' + lastName; // для хранения ФИО
        System.out.println("ФИО сотрудника —" + fullName + ".");
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullName.toUpperCase());
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё","е"));
    }
}