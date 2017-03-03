package facespace

import grails.rest.RestfulController

class AccountsController extends RestfulController{

    static allowedMethods = [createAccount: 'POST']
    static responseFormats = ['json', 'xml']

    def accounts = [] as ArrayList

    AccountsController(){
        super(UserAccount)
    }

    def index() { }

    def signUp(){
        def uname = params.userName
        def password = params.password
        boolean found = false

        String account = uname.concat(" ").concat(password)
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts[i].equals(account)) {
                //response.status = 200
                found = true
            }
        }
        if(found){
            response.status = 404
        }
        else {
            accounts.add(account)
            response.status = 200
        }

    }

    def login(){
        def uname = params.userName
        def password = params.password
        boolean found = false

        String account = uname.concat(" ").concat(password)
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts[i].equals(account)) {
                //response.status = 200
                found = true
            }
        }
        if(found){
            response.status = 200
        }
        else {
            response.status = 404
        }

    }


    //sign up and login functions
}
