package org.example.service;

import org.example.customannotation.Timable;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountService {


    @Timable
    public void withdrow(double amount,String accountName){
        System.out.println("You withdrow : "+amount+" from "+accountName);

    }

    public double balance(){
        System.out.println("Your balance : "+100);
        return 100;
    }
}
