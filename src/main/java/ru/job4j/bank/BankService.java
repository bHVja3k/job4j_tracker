package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    // Этот метод ищет счет пользователя по реквизитам. Сначала нужно найти пользователя.
    // Потом получить список счетов этого пользователя и в нем найти нужный счет.
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> account = users.get(user);
        if (user != null) {
            for (Account score : account) {
                if (score.getRequisite().contains(requisite)) {
                    return score;
                }
            }
        }
        return null;
    }

    // Метод для перечисления денег с одного счёта на другой счёт.
    //Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод должен вернуть false.
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount == null || srcAccount.getBalance() < amount) {
            rsl = false;
        } else {
            Account destAccount = findByRequisite(destPassport, destRequisite);
            double value = srcAccount.getBalance() - amount;
            srcAccount.setBalance(value);
            destAccount.setBalance((destAccount.getBalance() + amount));
        }
        return rsl;
    }
}