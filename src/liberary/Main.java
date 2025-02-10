package com.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        library.displayBooks();
        System.out.println();
        library.displayMembers();
    }
}
