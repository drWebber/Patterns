package pt;

import java.util.Date;
import pt.builder.account.Account;
import pt.builder.house.*;

public class Main {
    public static void main(String[] args) {
        HouseDirector hDirector = new HouseDirector(new StoneHouseBuilder());
        hDirector.buildHouse();
        System.out.println(hDirector.getHouse());
        
        Account account = Account.getBuilder()
                .setUsername("Vasiliy")
                .setPassword("123")
                .setBio("butcher")
                .setDob(new Date())
                .build();
        System.out.println(account);
    }
}
