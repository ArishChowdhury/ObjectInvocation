import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);


        MyProfile p1 = new MyProfile();

        print("Please enter your id: ");
        p1.id = ss.nextInt();

        print("Please enter your name: ");
        p1.name = ss.next();

        print("Please enter your nickname: ");
        p1.nick_name = ss.next();

        print("Please enter your age: ");
        p1.age = ss.nextInt();
        
        print("Profile has been created succesfully! ");
        print("ID: "+ p1.id);
        print("Name: "+p1.name);
        print("Nickname: "+p1.nick_name);
        print("Age:"+p1.age+" years old");



        MyMarkSheet m1 = new MyMarkSheet();
        
        print("Please enter mathematics marks: ");
        m1.math = ss.nextDouble();

        print("Please enter science marks: ");
        m1.science = ss.nextDouble();

        print("Please enter history marks: ");
        m1.history = ss.nextDouble();

        print("Mark Sheet has been created!");
        print("Mathematics: "+m1.math);
        print("Science: "+m1.science);
        print("History: "+m1.history);
        
        double TotalScore = m1.math + m1.science + m1.history;
        double Percentage = (TotalScore/300)*100;
        print("Total score: "+TotalScore);
        print("Percentage: "+Percentage+"%");
        
        
    }
    public static void print(String args) {System.out.println(args);}

}


