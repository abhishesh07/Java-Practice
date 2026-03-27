package ClassesAndObject;

class Lib {
    String[] books;
    int nBooks;
    Lib(){
        this.books=new String[100];
        this.nBooks=0;
    }
    void addBook(String book){
        this.books[this.nBooks]=book;
        nBooks++;
        System.out.println(book+" has been added!");
    };
    void showAvailableBooks(){
        System.out.println("Available Books:");
        for(int i=0;i<this.nBooks;i++){
            System.out.println(this.books[i]);
        }
    }
    void issueBook(String book){
        this.books[this.nBooks]=book;
            System.out.println("Book Issued: "+book);

    }
    void returnBook(String book){
        this.books[this.nBooks]=book;
        System.out.println("Returned book: "+book);
    }

}
public class Library{
    public static void main(String[] args) {
        Lib l1=new Lib();
        l1.addBook("Book 1");
        l1.addBook("Book 2");
        l1.addBook("Book 3");
        l1.showAvailableBooks();
        l1.issueBook("Book 2");
        l1.returnBook("Book 2");
    }
}
