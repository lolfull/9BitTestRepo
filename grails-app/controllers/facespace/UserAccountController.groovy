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

        //add transaction object to the database here

        // check if transaction successful
        //if sucessful
            response.status = 200
        //else
            response.status = 404

    }
}