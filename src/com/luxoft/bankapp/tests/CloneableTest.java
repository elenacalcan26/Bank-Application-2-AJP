package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.domain.CheckingAccount;
import com.luxoft.bankapp.domain.SavingAccount;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class CloneableTest {
  @Test
  public void testSavingAccountClone() {
    SavingAccount savingAccount = new SavingAccount(1, 100);
    SavingAccount savingAccountClone = (SavingAccount) savingAccount.clone();

    savingAccountClone.setBalance(200);

    assertNotSame(savingAccount, savingAccountClone);

    assertSame(savingAccount.getId(), savingAccountClone.getId());
    assertSame(savingAccount.getCurrency(), savingAccountClone.getCurrency());
    assertNotSame(savingAccount, savingAccountClone);
  }

  @Test
  public void testCheckingAccountClone() {
    CheckingAccount checkingAccount = new CheckingAccount(1, 100, 50);
    CheckingAccount checkingAccountClone = (CheckingAccount) checkingAccount.clone();

    checkingAccountClone.setBalance(200);
    checkingAccount.setOverdraft(100);

    assertNotSame(checkingAccount, checkingAccountClone);
    assertSame(checkingAccount.getId(), checkingAccountClone.getId());
    assertSame(checkingAccount.getCurrency(), checkingAccountClone.getCurrency());
    assertNotSame(checkingAccount.getBalance(), checkingAccountClone.getBalance());
    assertNotSame(checkingAccount.getOverdraft(), checkingAccountClone.getOverdraft());
  }
}
