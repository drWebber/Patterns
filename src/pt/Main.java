package pt;

import java.util.Date;

import pt.creational.builder.account.Account;
import pt.creational.builder.house.*;
import pt.creational.prototype.word.Word;
import pt.benavioral.state.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder pattern:");
        System.out.println("#1");
        HouseDirector hDirector = new HouseDirector(new StoneHouseBuilder());
        hDirector.buildHouse();
        System.out.println(hDirector.getHouse());
        
        System.out.println("#2");        
        Account account = Account.getBuilder()
                .setUsername("Vasiliy")
                .setPassword("123")
                .setBio("butcher")
                .setDob(new Date())
                .build();
        System.out.println(account);
        
        System.out.println("\nPrototype pattern:");
        Word prototype = new Word("hello");
        System.out.println(prototype);
        
        try {
            Word newWord = prototype.clone();
            prototype.setWord("hi");
            System.out.println(newWord);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nState pattern:");
        Radio radio = new Radio(new ChannelDfm());
        for (int i = 0; i < 3; i++) {
            radio.play();
            radio.nextChannel();
        }
        
    }
}
