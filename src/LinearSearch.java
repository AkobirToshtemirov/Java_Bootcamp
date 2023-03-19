import java.util.Scanner;

public class LinearSearch {
    public static void main(String []args) {
        String[] studentNames = {"Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson"};
        System.out.println("Enter the name of the student: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        boolean count = false;
        for(int i = 0; i < studentNames.length; i++){
            if(studentNames[i].equals(searchName))
            {
                count = true;
                break;
            }
        }
        if(count)
        {
            System.out.println("The student " + searchName + " is present in the class.");
        }else
        {
            System.out.println("The student " + searchName + " is absent from class.");
        }
        scanner.close();
    }
}