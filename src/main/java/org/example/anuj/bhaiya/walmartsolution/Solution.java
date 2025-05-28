package org.example.anuj.bhaiya.walmartsolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book{
    private String name;
    private int id;
    private String author;
    private int copies;

    public Book(String name, int id,String author, int copies){
        this.name=name;
        this.id=id;
        this.author=author;
        this.copies=copies;
    }

    public int getId(){
        return id;
    }
    public int getCopies(){
        return copies;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setCopies(int copies){
        this.copies=copies;
    }

    public String toString(){

        return String.valueOf(copies);
    }

}

class BookManager{
    static Map<Integer,Book> bookMap;


    public BookManager(){
        bookMap=new HashMap<>();
    }

    public void addBook(Book book){
        if(bookMap.containsKey(book.getId())){
            bookMap.get(book.getId()).setCopies(bookMap.get(book.getId()).getCopies()+1);
        }
        else{
            bookMap.put(book.getId(),book);
        }

    }
    public void addBookCopy(){
        //increase the copy number
    }


    public void checkout(Book book){


        if(bookMap.containsKey(book.getId())){
            if(bookMap.get(book.getId()).getCopies()<=0){
                System.out.print("Booknot available");
            }
            else{
                bookMap.get(book.getId()).setCopies(bookMap.get(book.getId()).getCopies()-1);
                System.out.print("Checked out");
            }


        }
        else{
            System.out.print("Booknot available");
        }
    }






}

class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book book1=new Book("b1", 1, "author 1",1);
        Book book2=new Book("b1", 2, "author 1",1);
        Book book3=new Book("b1", 3, "author 1",1);
        Book book4=new Book("b1", 4, "author 1",1);
        BookManager bm=new BookManager();
        bm.addBook(book1);
        bm.addBook(book2);
        bm.addBook(book3);
        bm.addBook(book4);

        System.out.print(bm.bookMap);

        bm.checkout(book1);
        System.out.print(bm.bookMap);
    }
}

