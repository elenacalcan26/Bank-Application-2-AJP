package com.luxoft.bankapp.domain;

import com.luxoft.bankapp.factory.AccountFactory;
import com.luxoft.bankapp.factory.AccountType;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {
  protected static final Map<String, AbstractAccount> accounts = new HashMap<>();

  private AccountCache() { }

  public static void loadCache() {
    accounts.put(
        AccountType.CHECKING.name(),
        AccountFactory.newAccount(AccountType.CHECKING, 0, 0));

    accounts.put(
        AccountType.SAVING.name(),
        AccountFactory.newAccount(AccountType.SAVING, 0, 0));
  }

  public static AbstractAccount createAccount(AccountType accountType) {
    return accounts.get(accountType.name()).clone();
  }
}
