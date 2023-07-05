import java.util.*;
public class game {
    public static void gamefun(char com,char b){
        if(com == 's'){
            if(b == 'w'){
                System.out.println("you are lose .. because com choose snake");
            }
            else if(b == 'g'){
                System.out.println("you are win .. because com choose snake");
            }
            else if(b == 's'){
                System.out.println("Draw .. because com choose snake");
            }
            else{
                System.out.println("Wrong choice");
            }
        }
        if(com == 'w'){
            if(b == 'g'){
                System.out.println("you are lose .. because com choose water");
            }
            else if(b == 's'){
                System.out.println("you are win .. because com choose water");
            }
            else if(b == 'w'){
                System.out.println("Draw .. because com choose water");
            }
            else{
                System.out.println("Wrong choice");
            }
        }
        if(com == 'g'){
            if(b == 's'){
                System.out.println("you are lose .. because com choose gun");
            }
            else if(b == 'w'){
                System.out.println("you are win .. because com choose gun");
            }
            else if(b == 'g'){
                System.out.println("Draw .. because com choose gun");
            }
            else{
                System.out.println("Wrong choice");
            }
        }
        if(b == 'S' || b == 'W' || b == 'G'){
            System.out.println("please enter small letter ");
        }
    } 
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Wait for com turn.........");
        int x = rand.nextInt(3);
        char com;
        if(x==0){
            com = 's';
        }
        else if(x==1){
            com = 'w';
        }
        else{
            com = 'g';
        }
        System.out.println(" 1. s for snake \n 2. w for water \n 3. g for gun");
        System.out.println("Enter your choice : ");
        String c = sc.next();
        char b=c.toLowerCase().charAt(0);
        gamefun(com,b);
    }
}
