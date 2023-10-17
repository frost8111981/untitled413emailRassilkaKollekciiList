package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String textTemplate = "Здравствуйте, %s, у нас для вас специальное предложение!";

        UserProfile userProfile1 = new UserProfile("Иванов","Иван", "ivan777@yandex.ru");
        UserProfile userProfile2 = new UserProfile("Мостовая","Татьяна", "tatiana1@yandex.ru");
        UserProfile userProfile3 = new UserProfile("Бузова","Ольга", "olga123@yandex.ru");

        ArrayList<UserProfile> userProfiles = new ArrayList<>();
        userProfiles.add(userProfile1);
        userProfiles.add(userProfile2);
        userProfiles.add(userProfile3);

        ArrayList<Mail> emailList = new ArrayList<>();
        for (UserProfile userProfile: userProfiles) {
            Mail email = new Mail(userProfile.getEmail(), String.format(textTemplate, userProfile.getName()));
            emailList.add(email);
        }

        Iterator<Mail> emailListIterator = emailList.iterator();
        while (emailListIterator.hasNext()) {
            Mail email = emailListIterator.next();
            System.out.printf("%s\n\n", email);
        }
    }
}
