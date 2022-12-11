public class S_string {
    public static void main(java.lang.String[] args) {

        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        System.out.println("Задача 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача 3");
        String fullName2 = "Иванов Семён Семёнович";

        String fullName21 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника —  " + fullName21);

        String[] strs = fullName2.split("ё");
        for (String text : strs) {
 //           System.out.println(text);
        }
        System.out.print("Данные ФИО сотрудника —  ");
        for (int i=0; i< strs.length; i++) {
            System.out.print(strs[i]);
            if (i != strs.length - 1) {
                System.out.print("е");
            }
        }
        System.out.println();

    }

}