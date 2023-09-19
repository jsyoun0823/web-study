package item26.generic;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Set<Account> accounts = new HashSet<>();
//        accounts.add(new Account(1L, "yjs"));
        Set<Message> messages = new HashSet<>();
        messages.add(new Message(1L, "안녕"));
        GenericRepository genericRepository = new GenericRepository(messages);

        Account myAccount = (Account) genericRepository.findById(1L).get();
        System.out.println(myAccount.getUserName());

        Repository<Account> repository = new Repository<>();
        Account account2 = repository.findById(1L).get();
        System.out.println(account2);

    }
}