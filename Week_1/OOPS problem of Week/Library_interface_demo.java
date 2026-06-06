interface Library_User {
    void register_Account();
    void request_Book();
}
 class Kid_Users implements LibraryUser {
    int age;
    String book_Type;
    public void register_Account() {
        if(age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        }else{
           System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    public void request_Book() {
        if(bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book witthin 10 days");
        }else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

 class Adult_user implements LibraryUser {
    int age;
    String bookType;
    public void register_Account() {
        if(age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        }else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    public void request_Book() {
        if(bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }else{
            System.out.println("OOPS, you are not allowed to take only adult Fiction books");
        }
    }
}
public class Library_Interface_Demo {
    public static void main(String[] args) {
        System.out.println("---------KID_USER-------");
        Kid_Users kid = new Kid_Users();
        kid.age = 10;
        kid.register_Account();
        kid.age = 18;
        kid.register_Account();
        kid.bookType = "Kids";
        kid.request_Book();
        kid.bookType = "Fiction";
        kid.request_Book();
       
        System.out.println("----------ADULT_USER---------");
        Adult_User adult = new Adult_User();
        adult.age = 5;
        adult.register_Account();
        adult.age = 23;
        adult.register_Account();
        adult.bookType = "Kids";
        adult.request_Book();
        adult.bookType = "Fiction";
        adult.request_Book();

    }
}
