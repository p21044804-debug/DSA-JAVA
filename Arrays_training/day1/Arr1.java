public class Arr1 {
    public static void main(String[] args) {
        String [] student={"s1","s2","s3","s4"};
        System.out.println(student);    // it will print the reference of the array
        System.out.println(student[0]); // it will print the first element of the array
        student[0]="s5"; // it will change the first element of the array to s5
        System.out.println(student[0]); // it will print the first element of the array which is now s5
        System.out.println(student);
        
    }
}