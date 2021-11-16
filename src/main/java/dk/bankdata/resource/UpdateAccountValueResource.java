package dk.bankdata.resource;

import dk.bankdata.model.Account;
import dk.bankdata.service.AccountService;
import io.quarkus.scheduler.Scheduled;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class UpdateAccountValueResource {

  @Inject AccountService accountService;

//  @Transactional
//  void addToAccount(int diff) {
//    Account accountAktiesparekonto = accountService.getAccountAktiesparekonto();
//    accountService.subtractFromBalance();
//  }
}
