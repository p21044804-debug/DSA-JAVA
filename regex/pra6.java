import java.util.*;

class Library {
    Scanner sc = new Scanner(System.in);
    String[] author;// author name
    String[] book;// book name
    String[] price;// book price
    String[] publisher;// publisher
    String[] stock;// stock
    String[] noti;// notification
    int[] book_price, book_stock;

    void ReadData(int books) {
        author = new String[books];
        book = new String[books];
        price = new String[books];
        publisher = new String[books];
        stock = new String[books];
        noti = new String[books];
        book_price = new int[books];
        book_stock = new int[books];

        for (int i = 0; i < books; i++) {

            while (true) {
                System.out.println("Enter author name:");

                author[i] = sc.nextLine();
                if (author[i].matches("\\A-Za-z")) {
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter alphabets only.");
                }
            }

            while (true) {
                System.out.println("Enter book name:");
                book[i] = sc.nextLine();
                if (book[i].matches("\\A-Za-z")) {
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please  enter alphabets only.");
                }
            }
            while (true) {
                System.out.println("Enter book price:");
                price[i] = sc.nextLine();
                if (price[i].matches("\\d+")) {
                    book_price[i] = Integer.parseInt(price[i]);
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter digits only.");
                }
            }

            while (true) {
                System.out.println("Enter publisher name:");//
                publisher[i] = sc.nextLine();
                if (publisher[i].matches("\\A-Za-z")) {
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter alphabets only.");
                }
            }

            while (true) {
                System.out.println("Enter stock:");
                stock[i] = sc.nextLine();
                if (stock[i].matches("\\d+")) {
                    book_stock[i] = Integer.parseInt(stock[i]);
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter digits only.");
                }
            }

            while (true) {
                System.out.println("Enter notification:");
                noti[i] = sc.nextLine();
                if (noti[i].matches("\\A-Za-z")) {
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter alphabets only.");
                }
            }

        }

    }

    void ShowData() {

        for (int i = 0; i < book.length; i++) {
            System.out.print((i + 1) + "\t" + author[i] + "\t\t" + book[i] + "\t\t" + price[i] + "\t\t" + publisher[i]
                    + "\t\t" + stock[i] + "\t\t" + book_price[i] * book_stock[i] + "\t\t" + noti[i] + "\n");
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
                    if (book_price[j] > book_price[j + 1]) {
                        String b = author[j + 1];
                        author[j + 1] = author[j];
                        author[j] = b;

                        String c = book[j + 1];
                        book[j + 1] = book[j];
                        book[j] = c;

                        int temp = book_price[j + 1];
                        book_price[j + 1] = book_price[j];
                        book_price[j] = temp;

                        String d = publisher[j + 1];
                        publisher[j + 1] = publisher[j];
                        publisher[j] = d;

                        int e = book_stock[j + 1];
                        book_stock[j + 1] = book_stock[j];
                        book_stock[j] = e;

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
                    + "\t\t" + stock[i] + "\t\t" + book_price[i] * book_stock[i] + "\t\t" + noti[i] + "\n");
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
        System.out.println(
                "................................................................................................................................");
        lib.ShowData();
        System.out.println("");
        System.out.println("");
        lib.AccendingData();

        sc.close();

    }
}
