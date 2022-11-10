package net.yorksolutions.optumfs22teamintegerbe.controller;

import net.yorksolutions.optumfs22teamintegerbe.dto.UpdateAccountRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.entity.Account;
import net.yorksolutions.optumfs22teamintegerbe.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Accounts")
@CrossOrigin
public class AccountController {
    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public Account register(@RequestParam String email, String password, int type) {
        return this.accountService.register(email, password, type);
    }

    @GetMapping
    public Account login(@RequestParam String email, String password) {
        return this.accountService.login(email, password);
    }

    @GetMapping("/ListAll")
    public Iterable<Account> getAllAccountsList() {
        return this.accountService.getAllAccounts();
    }

    @PutMapping
    public Account updateAccount(@RequestBody UpdateAccountRequestDTO account) {
        return this.accountService.update(account);
    }

    @DeleteMapping
    public void deleteAccount(@RequestParam Long accountId) {
        this.accountService.delete(accountId);
    }

}
