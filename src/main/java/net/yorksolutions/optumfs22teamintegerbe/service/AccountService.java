package net.yorksolutions.optumfs22teamintegerbe.service;

import net.yorksolutions.optumfs22teamintegerbe.dto.UpdateAccountRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.entity.Account;
import net.yorksolutions.optumfs22teamintegerbe.repository.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class AccountService {

    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public Account register(String email, String password, int type) {
        try {
            return this.accountRepository.save(
                    new Account(email, password, type));
        } catch (RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    public Account login(String email, String password) {
        Optional<Account> accountOpt = this.accountRepository.findByEmailAndPassword(email, password);
        if (accountOpt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return accountOpt.get();
    }

    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }


    public Account update(UpdateAccountRequestDTO account) {
        Optional<Account> accountOpt = this.accountRepository.findById(account.id);
        if (accountOpt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Account currentAccount = accountOpt.get();
        currentAccount.setType(account.type);
        currentAccount.setPassword(account.password);
        return accountRepository.save(currentAccount);
    }

    public void delete(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}
