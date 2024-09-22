package controller;


import dto.AccountDto;
import entities.Account;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.account.AccountService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/accounts")
public class AccountRestController {

    private final ModelMapper modelMapper;

    public AccountService accountService;
    public AccountRestController(AccountService accountService, ModelMapper modelMapper) {
        this.accountService = accountService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello world from Service A!";
    }


    //вывод всех операций по счету
    @GetMapping
    public List<AccountDto> getAllAccounts() {
        return accountService.getAllAccounts()
                .stream().map(account -> modelMapper.map(account, AccountDto.class))
                .collect(Collectors.toList());
    }

    //вывод операции по id
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable(name = "id") Long id) {
        Account account = accountService.getAccountById(id);

        //convert entity to DTO
        AccountDto accountResponse = modelMapper.map(account, AccountDto.class);

        return ResponseEntity.ok().body(accountResponse);
    }

    //Создание новой операции
    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto) {
        // convert DTO to entity
        Account accountRequest = modelMapper.map(accountDto, Account.class);
        Account account = accountService.createAccount(accountRequest);

        // convert entity to DTO
        AccountDto accountResponse = modelMapper.map(account, AccountDto.class);

        return new ResponseEntity<AccountDto>(accountResponse, HttpStatus.CREATED);
    }

    //Изменение операции
    @PutMapping("/{id}")
    public ResponseEntity<AccountDto> updateAccount(@PathVariable Long id,
                                                    @RequestBody AccountDto accountDto) {

        // convert DTO to Entity
        Account accountRequest = modelMapper.map(accountDto, Account.class);
        Account account = accountService.updateAccount(id, accountRequest);

        // entity to DTO
        AccountDto accountResponse = modelMapper.map(account, AccountDto.class);

        return ResponseEntity.ok().body(accountResponse);
    }

    //удаление операции
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable(name = "id") Long id) {
        accountService.deleteAccount(id);
        return  ResponseEntity.noContent().build();
    }
}
