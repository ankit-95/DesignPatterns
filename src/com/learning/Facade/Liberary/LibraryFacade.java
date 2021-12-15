package com.learning.Facade.Liberary;

public class LibraryFacade {
    Librarian librarian;
    Transaction transaction;

    LibraryFacade(){
        librarian = new Librarian();
        transaction = new Transaction();
    }

    public void requestBook(){
        librarian.issueBook();
        transaction.makeTransacton();
    }
}
