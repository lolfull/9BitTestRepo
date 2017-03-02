package facespace

import grails.rest.RestfulController

class UserAccountController extends RestfulController{

    static allowedMethods = [createAccount: 'POST']
    static responseFormats = ['json', 'xml']

    UserAccountController(){
        super(UserAccount)
    }

    def index() {
        // some default behaviour could be here
    }

    def addTransaction(){
        def amount = params.amount
        def category = params.category
        def date = params.date

        //create transaction object here
        ArrayList<String> transaction = new ArrayList<String>()
        transaction.add(amount)
        transaction.add(category)
        transaction.add(date)



        //add transaction object to the database here

        // check transaction can be found in database
        if(transaction.size() == 0){
            response.status = 404
        }
        else {
            response.status = 200
        }

    }
}