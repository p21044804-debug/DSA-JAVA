import java.util.*;
public class Book{
    public String title;
    public String author;
    public int pagecount;
public Book(){
    this.title="Unknown Title";
    this.author="Unknown Author";
    this.pagecount=0;
}

public Book(String title,String author,int pagecount){
    this.title=title;
    this.author=author;
    this.pagecount=pagecount;
}
void displayBookDetails(){
    System.out.println("Title :"+title);
    System.out.println("Author :"+author);
    System.out.println("Page Count :"+pagecount);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of books:");
        int n=sc.nextInt();
        Book[] b=new Book[n];

        for(int i=0;i<n;i++){
        System.out.println(("details for Book : "+(i+1)));
        System.out.println(("Title : "));
        String t1=sc.nextLine();
        System.out.println(("Author : "));
        String a1=sc.nextLine();
        System.out.println(("Pagecount : "));
        int pg=sc.nextInt();

        b[i]=new Book(t1,a1,pg);
        }

        for(Book a:b){
            a.displayBookDetails();
        }
    }
}
