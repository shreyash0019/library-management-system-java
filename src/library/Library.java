package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the Library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered in the library.");
        } else {
            System.out.println("Members in the Library:");
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }
}
