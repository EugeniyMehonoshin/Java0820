package lesson1;

public class Lesson5 {
    public static void main(String[] args) {
         /*       Workman workman = new Workman("Иванов Иван Иванович", "Директор", "director@mail.su", "895555555", 5000, 50);
        Workman workman1 = new Workman("Сан Саныч Санин", "Зам Директор", "zamdirector@mail.su", "896666666", 4900, 43);

        System.out.println();

        workman.workman();

        System.out.println();

        workman1.workman();*/


        Workman[] workmen = new Workman[5];
        workmen[0] = new Workman("Иванов Иван Иванович", "Директор", "director@mail.su", "895555555", 5000, 50);
        workmen[1] = new Workman("Сан Саныч Санин", "Зам Директор", "zamdirector@mail.su", "896666666", 4900, 43);
        workmen[2] = new Workman("Александр Сергеевич Грибоедов", "Инжинер", "ingineer@mail.su", "897777777", 4500, 41);
        workmen[3] = new Workman("Иванова Ольга Витальевна", "Секретарь", "sekret@mail.su", "898888888", 5500, 25);
        workmen[4] = new Workman("Милый Семён Владимирович", "Водитель", "drive@mail.su", "899999999", 3500, 35);


        for (Workman work : workmen)
            if (work.getAge() > 40)
                System.out.println(work);


    }
}
