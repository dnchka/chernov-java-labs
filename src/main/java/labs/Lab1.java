package labs;

import java.util.Date;

public class Lab1 {
    public static void main(String[] args) {
        String firstStudName = "Данил";
        String middleStudName = "Владимирович";
        String lastStudName = "Чернов";
        String firstTeachName = "Елена";
        String middleTeachName = "Сергеевна";
        String lastTeachName = "Владимирова";
        String groupName = "ИВТ/б - 12о";
        Date date = new Date();
        int varNum = 23;
        int valueStud = 11000;
        int valueStep = 3500;
        int valueStepFond = valueStep * valueStud;

        String fullStudName = fullName(lastStudName, firstStudName, middleStudName);
        String fullTeachName = fullName(lastTeachName, firstTeachName, middleTeachName);

        System.out.println("Программу выполнил:\n" + fullStudName);
        System.out.println("Шифр группы: " + groupName);
        System.out.println("Дата: " + date);
        System.out.println("Номер варианта: " + varNum);
        System.out.println("Количество студентов: " + valueStud);
        System.out.println("Размер стипендии: " + valueStep);
        System.out.println("Размер степендиального фонда в рублях: " + valueStepFond);
        System.out.println("Проверил:\n" + fullTeachName);
    }

    public static String fullName(String a, String b, String c) {
        return a + " " + b + " " + c;
    }

}

