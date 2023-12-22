package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.domain.AbstractAccount;
import com.luxoft.bankapp.domain.CheckingAccount;
import com.luxoft.bankapp.domain.SavingAccount;
import com.luxoft.bankapp.factory.AccountFactory;
import com.luxoft.bankapp.factory.AccountType;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class AccountFactoryTest {

  @Test
  public void testSavingAccountCreation() {
    AbstractAccount savingAccount = AccountFactory.newAccount(AccountType.SAVING, 1, 100);
    assertThat(savingAccount, instanceOf(SavingAccount.class));
  }

  @Test
  public void testCheckingAccountCreation() {
    AbstractAccount checkingAccount = AccountFactory.newAccount(AccountType.CHECKING, 2, 100);
    assertThat(checkingAccount, instanceOf(CheckingAccount.class));
  }
}
