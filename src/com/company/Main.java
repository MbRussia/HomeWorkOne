package com.company;

public class Main {

    public static void main(String[] args) {

        Square.SquareText();


    }
//        boolean loop = true;
//        while (loop) {
//            System.out.println(
//                    "Выбрать 1 для просмотра всех профайлов \n" +
//                            "Выбрать 2 для регстрации нового профайла \n" +
//                            "Выбрать 3 для редактирвания профайла \n" +
//                            "Выбрать 4 для завершения программы");
//
//            Scanner scn = new Scanner(System.in);
//
//            int input = scn.nextInt();
//
//            switch (input) {
//                case 1:
//                    System.out.println("Все профайлы");
//                    Profile.profileUser();
//                    break;
//                case 2:
//
//                    System.out.println("Введите Фио");
//                    String inputNameUser = scn.nextLine();
//                    System.out.println("Введите mail");
//                    String inpunUserMail = scn.nextLine();
//                    System.out.println("Введите город проживания");
//                    String inputUserLocation = scn.nextLine();
//                    System.out.println("Введите номер телефона");
//                    long inputUserPhone = scn.nextLong();
//                    Profile profile = new Profile(inputNameUser, inpunUserMail, inputUserLocation, inputUserPhone);
//                    Profile.addProfile(profile);
//                    break;
//                case 3:
//
//                    System.out.println("для изменения профиля введите mail");
//                    String mail = scn.nextLine();
//                    System.out.println("Введите Фио");
//                    String cNameUser = scn.nextLine();
//                    System.out.println("Введите mail");
//                    String cUserMail = scn.nextLine();
//                    System.out.println("Введите город проживания");
//                    String cUserLocation = scn.nextLine();
//                    System.out.println("Введите номер телефона");
//                    long cUserPhone = scn.nextLong();
//                    Profile profileChange = new Profile(cNameUser, cUserMail, cUserLocation, cUserPhone);
//                    Profile.changeUser(mail, profileChange);
//                    break;
//                case 4:
//                    loop = false;
//                    break;
//
//            }
//        }
//
//
//    // 2. Определить две константы `a` и `b` типа `Double`, присвоить им любые значения.
//    // Вычислить среднее значение и сохранить результат в переменную `avarage`.
//    private static void cons() {//const*
//        final double a, b;
//        a = 2.65;
//        b = 12.57;
//        double avarage = (a + b) / 2;
//        System.out.println(avarage);
//        // лишняя пустая строка
//    }
//
//    //3. Создать класс, и задать два любых строковых значения с названиями `firstName` и `lastName`.
//    // Далее необходимо вывести в консоль строку в формате "Full name: [firstName] [lastName]".
//    private static void name() {
//        String firstName, lastname;
//        firstName = "Иван";
//        lastname = "Иванов";
//
//        System.out.println("Full name " + firstName + " " + lastname);
//
//        // лишняя пустая строка
//    }
//
//    //4. Напишите программу для вывода первых 15 чисел последовательности Фибоначчи
//    private static void f() {
//        int[] arr = new int[15];
//        int a, b;
//        a = 0;
//        b = 1;
//        arr[0] = 1;
//        for (int i = 1; i < arr.length; i++) { //на соблюден кодСтайл - лайфхак, нажми - ctrl + alt + l - и весь код будет отформатирован по код стайлу
//            int x = a + b;
//            a = b;
//            b = x;
//            arr[i] = x;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//    //5. Напишите программу для сортировки массива, использующую метод пузырька.
//    // Сотрировка должна происходить в отдельной функции, принимающей на вход исходный массив
//
//    private static int[] rnd_array() {
//        int[] arr = new int[15];
//        Random rnd = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt(100);
//
//        }
//
//        return arr;
//        // лишняя пустая строка
//    }
//
//    private static void sortA() {
//        int[] newArr = rnd_array();
//        System.out.println(Arrays.toString(newArr));
//
//        Arrays.sort(newArr);
//        System.out.println(Arrays.toString(newArr));
//        // лишняя пустая строка
//    }
//
//    //6. Напишите программу, решающую задачу: есть входящая строка формата "abc123",
//    // где сначала идет любая последовательность букв, потом число. Необходимо получить новую строку,
//    // в конце которой будет число на единицу больше предыдущего, то есть "abc124".
//    private static void createString() {
//        String word = "sdsdf2344";
//        System.out.println(word);
//        char[] arr = word.toCharArray();
//        arr[arr.length - 1] = (char) (arr[arr.length - 1] + 1);
//        String word1 = new String(arr);
//        System.out.println(word1);
//    }
    //        Profile profile = new Profile(Profile.checkName("павлуша павлушевич"), "mail", "ростов", 112211);
    //   Profile.addProfile(profile);
//        Profile profile1 = new Profile("name".toUpperCase(), "mail", "location", 1231231);
//        Profile.profiles[0] = profile;
//        Profile.profiles[1] = profile1;
//        System.out.println(Arrays.toString(Profile.profiles));
//
//        Profile profile2 = Profile.profiles[0];
//        System.out.println(Arrays.toString(Profile.profiles));

}
