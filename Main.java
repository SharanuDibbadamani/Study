/*
Foundational Project

-----------------------------Study Buddy------------------------------------
Study Buddy is an online study app, which rewards users for quiz completions. 
The app caters to learners of all experience levels by enabling them to easily
enroll in courses by difficulty level. Study Buddy’s alluring balance of 
challenge and reward helps facilitate engaging user experience.

*/


import java.util.*;
class Main{
        static void gameOn(String name,int age){
            Scanner l=new Scanner(System.in);
            System.out.println("1 ) What is the capital of Karnataka?");
            System.out.println();
            System.out.println("(a) Bangalore");//
            System.out.println("(b) Dharwad");
            System.out.println("(c) Gadag");
            System.out.println("(d) belgaum");
            System.out.print("\nAnswer : ");
            char n1=l.next().charAt(0);
            System.out.println();
            
            System.out.println("2 ) Which City is known as the Silicon Valley Of India?");
            System.out.println();
            System.out.println("(a) Bangalore");//
            System.out.println("(b) Dharwad");
            System.out.println("(c) Hubbali");
            System.out.println("(d) Ballary");
            System.out.print("\nAnswer : ");
            char n2=l.next().charAt(0);
            System.out.println();

            System.out.println("3 ) Which District of Karnataka has the Maximum Number of Waterfalls?");
            System.out.println();
            System.out.println("(a) Shimoga District");//
            System.out.println("(b) Dharwad District");
            System.out.println("(c) Gadag District");
            System.out.println("(d) Belgaum District");
            System.out.print("\nAnswer : ");
            char n3=l.next().charAt(0);
            System.out.println();

            System.out.println("4 ) Which City is Located in the Southeast of Karnataka?");
            System.out.println();
            System.out.println("(a) Tamil Nadu");//
            System.out.println("(b) Kerala");
            System.out.println("(c) Maharastra");
            System.out.println("(d) Goa");
            System.out.print("\nAnswer : ");
            char n4=l.next().charAt(0);
            System.out.println();
            
            System.out.println("5 ) How many Districts are in Karnataka??");
            System.out.println();
            System.out.println("(a) 31");
            System.out.println("(b) 29");
            System.out.println("(c) 30");//
            System.out.println("(d) 28");
            System.out.print("\nAnswer : ");
            char n5=l.next().charAt(0);
            System.out.println();
            
            System.out.println("6 ) How many Divisions are in Karnataka?");
            System.out.println();
            System.out.println("(a) 4");//
            System.out.println("(b) 3");
            System.out.println("(c) 8");
            System.out.println("(d) 9");
            System.out.print("\nAnswer : ");
            char n6=l.next().charAt(0);
            System.out.println();
            
            System.out.println("7 ) Who is current prime minister of India?");
            System.out.println();
            System.out.println("(a) 	Manmohan Singh");
            System.out.println("(b) 	Narendra Modi");//
            System.out.println("(c) Jawaharlal Nehru");
            System.out.println("(d) Shehbaz Sharif");
            System.out.print("\nAnswer : ");
            char n7=l.next().charAt(0);
            System.out.println();
            
            System.out.println("8 ) Who is the current CM of Karnataka?");
            System.out.println();
            System.out.println("(a) 	B. S. Yediyurappa");    
            System.out.println("(b) K. Chengalaraya Reddy");
            System.out.println("(c) Kengal Hanumanthaiah");
            System.out.println("(d) Basavaraj Bommai");//
            System.out.print("\nAnswer : ");
            char n8=l.next().charAt(0);
            System.out.println();
            
            System.out.println("9 ) When was Mysore renamed as Karnataka?");
            System.out.println();
            System.out.println("(a) 1973");//
            System.out.println("(b) 1971");
            System.out.println("(c) 1958");
            System.out.println("(d) 1998");
            System.out.print("\nAnswer : ");
            char n9=l.next().charAt(0);
            System.out.println();
            
            System.out.println("10 ) How many Indian States Surround Karnataka?");
            System.out.println();
            System.out.println("(a) 6");//
            System.out.println("(b) 4");
            System.out.println("(c) 5");
            System.out.println("(d) 7");
            System.out.print("\nAnswer : ");
            char n10=l.next().charAt(0);
            System.out.println();
            
            int count=0;
            
            if(n1=='a'){
                count++;
            }
            if(n2=='a'){
                count++;
            }
            if(n3=='a'){
                count++;
            }
            if(n4=='a'){
                count++;
            }
            if(n5=='c'){
                count++;
            }
            if(n6=='a'){
                count++;
            }
            if(n7=='b'){
                count++;
            }
            if(n8=='c'){
                count++;
            }
            if(n9=='a'){
                count++;
            }
            if(n10=='a'){
                count++;
            }
            System.err.println("\n-------------------------------\nCeritification from Study buddy\n-------------------------------");
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("-------------------------------");
            System.out.println("Your score : "+count);
            System.out.println("-------------------------------");

            System.out.println("\nThank-you "+name+" for attending the quiz\n-------------------------------\n\n");
        }
        public static void main(String[] args) {
        Scanner l=new Scanner(System.in);


        outer:
        System.out.println("\nWelcome to Study buddy");

        System.out.print("Enter your name : ");
        String name=l.nextLine();
        
        System.out.print("Enter your age : ");
        int age=l.nextInt();

        gameOn(name,age);      
        
        
    }
    
}