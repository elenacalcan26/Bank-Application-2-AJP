package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.domain.AbstractAccount;
import com.luxoft.bankapp.domain.AccountCache;
import com.luxoft.bankapp.domain.CheckingAccount;
import com.luxoft.bankapp.domain.SavingAccount;
import com.luxoft.bankapp.factory.AccountType;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;

public class AccountCacheTest {

  @Test
  public void testSavingAccountCache() {
    AccountCache.loadCache();
    AbstractAccount savingAccount = AccountCache.createAccount(AccountType.SAVING);

    assertThat(savingAccount, instanceOf(SavingAccount.class));
    assertEquals(0, savingAccount.getId());
    assertEquals(0, savingAccount.getBalance(), 0);
  }

  @Test
  public void testCheckingAccountCache() {
    AccountCache.loadCache();
    AbstractAccount checkingAccount = AccountCache.createAccount(AccountType.CHECKING);

    assertThat(checkingAccount, instanceOf(CheckingAccount.class));
    assertEquals(0, checkingAccount.getId());
  }
}
