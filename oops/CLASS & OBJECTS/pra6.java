import java.util.*;

class Library {
    Scanner sc = new Scanner(System.in);
    String[] author;// author name
    String[] book;// book name
    int[] price;// book price
    String[] publisher;// publisher
    int[] stock;// stock
    String[] noti;// notification

    void ReadData(int books) {
        author = new String[books];
        book = new String[books];
        price = new int[books];
        publisher = new String[books];
        stock = new int[books];
        noti = new String[books];

        for (int i = 0; i < books; i++) {
            System.out.println("Enter author name:");

            author[i] = sc.nextLine();

            System.out.println("Enter book name:");//
            book[i] = sc.nextLine();

            System.out.println("Enter book price:");
            price[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter publisher name:");//
            publisher[i] = sc.nextLine();

            System.out.println("Enter stock:");
            stock[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter notification:");
            noti[i] = sc.nextLine();
        }

    }

    void ShowData() {

       

        for (int i = 0; i < book.length; i++) {
            System.out.print((i + 1) + "\t" + author[i] + "\t\t" + book[i] + "\t\t" + price[i] + "\t\t" + publisher[i]
                    + "\t\t" + stock[i] + "\t\t" + price[i] * stock[i] + "\t\t" + noti[i] + "\n");
                     System.out.println(
                "_______________________________________________________________________________________________________________________________");
        }

        for (int i = 0; i < noti.length; i++) {
            System.out.println("- " + noti[i] + " -X");
        }
    }

    void AccendingData() {
        System.out.println("please enter Ascending Order Option by input Enter:\n 1. for price \n 2. for qty");
        int a = sc.nextInt();
        sc.nextLine();

        if (a == 1) {
            for (int i = 0; i < book.length; i++) {
                for (int j = 0; j < book.length - i - 1; j++) {
                    if (price[j] > price[j + 1]) {
                        String b = author[j + 1];
                        author[j + 1] = author[j];
                        author[j] = b;

                        String c = book[j + 1];
                        book[j + 1] = book[j];
                        book[j] = c;

                        int temp = price[j + 1];
                        price[j + 1] = price[j];
                        price[j] = temp;

                        String d = publisher[j + 1];
                        publisher[j + 1] = publisher[j];
                        publisher[j] = d;

                        int e = stock[j + 1];
                        stock[j + 1] = stock[j];
                        stock[j] = e;

                        String f = noti[j + 1];
                        noti[j + 1] = noti[j];
                        noti[j] = f;
                    }
                }
            }
        }
        System.out.println("No\tAuthor name\tBook name\tBook Price\tPublisher Name\t\tStock\t\tTotal\t\tNotification");
        System.out.println(
                "................................................................................................................................");
        for (int i = 0; i < book.length; i++) {
            System.out.print((i + 1) + "\t" + author[i] + "\t\t" + book[i] + "\t\t" + price[i] + "\t\t" + publisher[i]
                    + "\t\t" + stock[i] + "\t\t" + price[i] * stock[i] + "\t\t" + noti[i] + "\n");
            System.out.println(
                    "_______________________________________________________________________________________________________________________________");
        }

    }
}

public class pra6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many books you want to enter?");
        int books = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter book details");
        Library lib = new Library();
        lib.ReadData(books);

        System.out.println("No\tAuthor name\tBook name\tBook Price\tPublisher Name\t\tStock\t\tTotal\t\tNotification");
        System.out.println("................................................................................................................................");
        lib.ShowData();
        System.out.println("");
        System.out.println("");
        lib.AccendingData();
    }

}
