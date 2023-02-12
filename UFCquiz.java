import java.util.Scanner;
/**
 * This is a 3 question quiz on the ufc.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UFCquiz
{
    public static void main (String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String ans;
        double score = 0;
        int timesPlayed = 0;
        int correctAns = 0;
        int incorrectAns = 0;

        do{
            score= 0;
            correctAns = 0;
            incorrectAns = 0;

            System.out.println("\n\nThis is a short 3 question quiz on the UFC(Ultimate Fighting Championship)"); //Very Brief introduction
            System.out.println("There will be Three options 1, 2 or 3 please enter one of these numbers.");
            System.out.println("If you want a hint press H. \n \n \n");
            System.out.println("If you want to quit at any time press \"Q\" ");
            System.out.println("------------------------------------------------");

            System.out.println("Question 1  \n");
            System.out.println("Who is the president of the ufc? \n");
            System.out.println(" 1. Dana White  2. Vince Mcmahon 3. Roy Keane H. Hint  \n");

            do{
                System.out.println("Enter Answer: "); 
                ans = stdIn.nextLine();     
                //user enters their guess
                if (!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q")) 
                {
                    System.out.println("Sorry, please enter 1, 2, 3, H or Q ONLY");
                }
                else if (ans.equals("1"))
                {
                    System.out.println("Correct! You get 3 points!");
                    score= score +3;
                    correctAns= correctAns +1;
                }
                else if (ans.equals("2") || ans.equals("3"))
                {
                    System.out.println("Sorry, that answer is incorrect. You will lose 3 points");
                    score= score -3;
                    incorrectAns= incorrectAns + 1;
                }
                else if (ans.equalsIgnoreCase("h"))
                {
                    do{ if (!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q")) 
                        {
                            System.out.println("Sorry, please enter 1, 2, 3, H or Q ONLY");
                        }
                        else if (ans.equalsIgnoreCase("h"))
                        {System.out.println("They're not Irish");
                        }

                        System.out.println("Enter Answer: "); 
                        ans = stdIn.nextLine();
                    }while(!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("Q") && !ans.equals("q"));

                    if (ans.equals("1"))
                    {
                        System.out.println("Correct! You get 1.5 points!");
                        score= score +1.5;
                        correctAns= correctAns +1;
                    }
                    else if (ans.equals("2") || ans.equals("3"))
                    {
                        System.out.println("Sorry, that answer is incorrect. You will lose 3 points");
                        score= score -3;
                        incorrectAns= incorrectAns + 1;
                    }

                }
                else if (ans.equalsIgnoreCase("Q"))
                {
                    System.out.println("You have pressed quit");
                }

            }while(!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q"));
            do{
                if (!ans.equalsIgnoreCase("Q"))
                {System.out.println("\n \nQuestion 2 \n");
                    System.out.println("Who is the current ufc heavyweight Champion? \n");
                    System.out.println(" 1. Brock Lesnar  2. Stipe Miocic 3. Jon Jones H. Hint  \n");
                    do{
                        System.out.println("Enter Answer: "); 
                        ans = stdIn.nextLine();                                                                      //user enters their guess

                        if (!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q")) 
                        {
                            System.out.println("Sorry, please enter 1, 2, 3, H or Q ONLY");
                        }
                        else if (ans.equals("2"))
                        {
                            System.out.println("Correct! You get 3 points!");
                            score= score +3;
                            correctAns= correctAns +1;
                        }
                        else if (ans.equals("1") || ans.equals("3"))
                        {
                            System.out.println("Sorry, that answer is incorrect. You will lose 3 points");
                            score= score -3;
                            incorrectAns= incorrectAns + 1;
                        }
                        else if (ans.equalsIgnoreCase("h"))
                        {
                            do{ if (!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q")) 
                                {
                                    System.out.println("Sorry, please enter 1, 2, 3, H or Q ONLY");
                                }
                                else if (ans.equalsIgnoreCase("h"))
                                {System.out.println("Their name is hard to pronounce");
                                }

                                System.out.println("Enter Answer: "); 
                                ans = stdIn.nextLine();
                            }while(!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("Q") && !ans.equals("q"));

                            if (ans.equals("2"))
                            {
                                System.out.println("Correct! You get 1.5 points!");
                                score= score +1.5;
                                correctAns= correctAns +1;
                            }
                            else if (ans.equals("1") || ans.equals("3"))
                            {
                                System.out.println("Sorry, that answer is incorrect. You will lose 3 points");
                                score= score -3;
                                incorrectAns= incorrectAns + 1;
                            }

                        }
                        else if (ans.equalsIgnoreCase("Q"))
                        {
                            System.out.println("You have pressed quit");
                        }

                    }while(!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q"));
                }
            }while(!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q"));
            do{
                if (!ans.equalsIgnoreCase("Q"))

                do{
                System.out.println("\n \nQuestion 3 \n");
                System.out.println("In what city did Conor Mcgregor win the featherweight belt?\n");
                System.out.println(" 1. Dublin  2. New York City 3. Las Vegas H. Hint  \n");System.out.println("Enter Answer: "); 
                    ans = stdIn.nextLine();                                                                      //user enters their guess

                    if (!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q")) 
                    {
                        System.out.println("Sorry, please enter 1, 2, 3, H or Q ONLY");
                    }
                    else if (ans.equals("3"))
                    {
                        System.out.println("Correct! You get 3 points!");
                        score= score +3;
                        correctAns= correctAns +1;
                    }
                    else if (ans.equals("1") || ans.equals("2"))
                    {
                        System.out.println("Sorry, that answer is incorrect. You will lose 3 points");
                        score= score -3;
                        incorrectAns= incorrectAns + 1;
                    }
                    else if (ans.equalsIgnoreCase("h"))
                    {
                        do{ if (!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q")) 
                            {
                                System.out.println("Sorry, please enter 1, 2, 3, H or Q ONLY");
                            }
                            else if (ans.equalsIgnoreCase("h"))
                            {System.out.println("Gambling");
                            }

                            System.out.println("Enter Answer: "); 
                            ans = stdIn.nextLine();
                        }while(!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("Q") && !ans.equals("q"));

                        if (ans.equals("3"))
                        {
                            System.out.println("Correct! You get 1.5 points!");
                            score= score +1.5;
                            correctAns= correctAns +1;
                        }
                        else if (ans.equals("1") || ans.equals("2"))
                        {
                            System.out.println("Sorry, that answer is incorrect. You will lose 3 points");
                            score= score -3;
                            incorrectAns= incorrectAns + 1;
                        }

                    }
                    else if (ans.equalsIgnoreCase("Q"))
                    {
                        System.out.println("You have pressed quit");
                    }

                }while(!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q"));
            }while(!ans.equals("1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("h") && !ans.equals("H") && !ans.equals("Q") && !ans.equals("q"));
        
    timesPlayed = timesPlayed + 1;
    System.out.println("\nYour Score is " + score);
    System.out.println("You got " + correctAns + " answer(s) correct");
    System.out.println("You got " + incorrectAns + " answer(s) incorrect");
    System.out.println("You've played the UFC quiz " + timesPlayed + " time(s)");
 
    do{ 
 
            System.out.println("\nDo you want to play again YES/NO");
            System.out.println("Please enter yes or no");
            ans= stdIn.nextLine();
                           
    }while(!ans.equalsIgnoreCase("YES") && !ans.equalsIgnoreCase("NO") && !ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N") && !ans.equalsIgnoreCase("Q"));
    
}while(ans.equalsIgnoreCase("YES") || ans.equalsIgnoreCase("Y"));
System.out.println("\n\nThank you for Playing The UFC quiz,\nGoodbye");

}
}


