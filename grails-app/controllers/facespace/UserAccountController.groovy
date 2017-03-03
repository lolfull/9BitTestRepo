package facespace

import grails.rest.RestfulController

class UserAccountController extends RestfulController{

    static allowedMethods = [createAccount: 'POST']
    static responseFormats = ['json', 'xml']

    UserAccountController(){
        super(UserAccount)
    }

    def transaction = {
        // some default behaviour could be here
        redirect (controller: "UserAccountController", action: "transaction")

        //would this index point to the transaction view?
    }

    def addTransaction(){
        //def uname = params.userName
        def amount = params.amount
        def category = params.category
        def date = params.date

        //check that username exists and if it's not null then add a new transaction
        //def account = UserAccount.find{userName == uname}
        //if (account != null){
        //respond account.getProfile().get_transactions()
        //create new transaction object and save it
        //new Transaction(amount: amount, category: category, date: date).save()
        //check that transaction is in list?
        //}
        //else {
        //response.status = 404
        //}


        //create transaction object here
        ArrayList<Transaction> transactions = new ArrayList<Transaction>()

        //add transaction object to the database here
        Transaction newTransaction = new Transaction(amount: amount, category: category, date: date)
        newTransaction.save()

        transactions.add(newTransaction)

        //ArrayList<String> transaction = new ArrayList<String>()
        //transaction.add(amount)
        //transaction.add(category)
        //transaction.add(date)


        // check transaction can be found in database
        //def check_transaction = Profile.getTransactions()

        //check if transaction was added (works for single transaction added)
        if(transactions.size() == 0){
            response.status = 404
        }
        else {
            response.status = 200
        }

    }

    //def get_transactions(){
    //return transactions
    //}
}