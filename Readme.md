**UFC QUIZ**

**Sean McELroy**

**A.Diary**

Day 1. I Thought of ideas for quiz. Narrowed down the ideas to small few, ultimately decided on Ufc quiz. I came up with 3 relatively challenging questions and hints for every question also.

Day 2. I thought about how I would build the quiz, and broke down the assignment into steps in an attempt to make it as easy as possible 

Day 3. – I opened java and started playing around with different features we had learned in previous weeks. I watched YouTube tutorials along with reading the lecture notes to help me get started. The first task I did was make sure I could get all the questions to appear.

Day 4.- I imported the scanner which allows the user to type in answers following my question. I was very happy when this happened as I could actually see the quiz coming together.

Day 5. Up to Now the tasks were easy enough but Day 5 I struggled because I needed to implement do while loops and if statements so the user couldn’t enter anything in the answer, I ran into a lot of difficulty.

Day 6. I started to understand where the loops and if statements were needed thanks to my classmates and the teachers in the lab classes, still I was quite surprised on how many loops and if statements were needed in the short quiz.

Day 7. My Quiz was coming along nicely. The hints were coming up like they’re supposed to and the points were adding to the score. Except I couldn’t get the end loop to make the quiz not  repeat by entering No to the final question.

Day 8. I was still puzzled why the final loop wasn’t working then I saw that the “o” in “No” was actually the number “0”. I was pleased that I figured out the problem but also annoyed that I made that mistake.

Day 9. The quiz was done or so I thought. I went home pleased with my work and asked my dad to play the quiz, there was a big problem, when he typed hint twice, it skipped to the next question so  I needed to add more loops after hint to make sure the user presses 1,2,3,h again or q for quit.(Extra Feature)

Day 10. The final day I just decided to add a tahnk you message at the end of the quiz 


**B. ALGORITHIM**

1. Problem Decomposition (Break quiz into tasks)
1. Display quiz Intro/summary
1. Display the opening ufc question
1. Ask user to input value.(Answer or hint)
1. If the user gets answer correct 3 points with hint 1.5 points. Wrong answer – 3 points
1. Can quit at any time by pressing “Q”
1. At end of quiz total score will be displayed
1. Finally user will be prompted to play again
1. If user types yes, quiz restarts 

1. Data Determination

Variables

A-Declare string ans 

B-Declare double score

C-Declare int timesPlayed 

D-Declare int correctans

E-Declare int incorrectans





**(Pseudocode)**

**import Scanner**

`        `Scanner Scan

//Declare all variables

`          `Declare             String ans              // users answers

`          `Declare             double score        // this is users score

`          `Declare             int timesPlayed   //no. times user has played quiz

`          `Declare             int correctAns     //no. of answers user entered correct

`          `Declare             int incorrectAns //no. of answers incorrect  }



`     `Set score= 0;   //score starts at zero

`     `Set correctAns = 0 

`     `Set  incorrectAns = 0

`     `Set timesPlayed=0

**Do** (Everything inside brackets) **{**

Display ”This is a short 3 question quiz on the UFC(Ultimate Fighting Championship) ");  //Very Brief introduction.

Display “There will be Three options 1, 2 or 3 please enter one of these numbers If you want a hint press H. "   //explaining the quiz format



//Get Answer for question 1

`           `Display “Who is the president of the ufc?"

`            `//Give users choices  " 1. Dana White   2. Vince Mcmahon  3. Roy Keane  H. Hint  "



**Do**  {Display “Enter Answer: "

`                `User Inputs Answer     



`                `if (Answer doesn’t = 1,2,3,h or q) 

`                `Display “Sorry, please enter 1, 2, 3, H or Q ONLY"



`                `**Else if**  Answer equals ("1")

`                `Display "Correct! You get 3 points!"

`                    `score= score +3;                   //user gets 3 points

`                    `correctAns= correctAns +1;



`                `Else if (Answer = 2 or 3)



`                    `Display "Sorry, that answer is incorrect. You will lose 3 points" 

`                    `score= score -3;                //user loses 3 points

`                    `incorrectAns= incorrectAns + 1;



`               `Else if (Answer equals "h")



**Do** Everything inside brackets {  

`          `If   (answer isn’t 1,2,3,h or q)

`                     `Display ("Sorry, please enter 1, 2, 3, H or Q ONLY");

`                             `Else if (Answer is "h")

`                         `Display  "They're not Irish"



`                        `Display “Enter Answer: “ 

`                        `User Inputs Answer

` `}**While** Answer isn’t answer isn’t (1,2,3,h or q)    //user must enter one of these options

`                    `If (Answer = "1")

`                    `Display “Correct! You get 1.5 points!"

`                        `score= score +1.5;

`                        `correctAns= correctAns +1;



`                    `Else if (Answer is 2 or 3)



`                        `Display “Sorry, that answer is incorrect. You will lose 3 points"

`                        `score= score -3;                //user loses 3 points

`                        `incorrectAns= incorrectAns + 1;





`                `Else if  ( Answer is “Q”) 



`                    `Display “You have pressed quit"  // This will bring quiz to an end (EXTRA FEATURE)



`            `}**While** (Answer isn’t 1,2,3 h or q)




`    `**do{**

`                `**If**   Answer isn’t “q”

`                    `Display  “Question 2 

`                    `Who is the current ufc heavyweight Champion? “

`                    `Display “ 1. Brock Lesnar  2. Stipe Miocic 3. Jon Jones H. Hint  “

`                    `**Do{**

`                        `Display ("Enter Answer: ") 

`                        `User Inputs their answer for Q.2                                                                      

`                        `**If** (Answer isn’t “1,2,3 , h or q”)



`                            `Display “Sorry, please enter 1, 2, 3, H or Q ONLY");



`                        `Else if (Answer = 2)

`                        `Display "Correct! You get 3 points!"

`                            `score= score +3;

`                            `correctAns= correctAns +1;



`                        `Else if (Answer = “1 or 3”)

`                        `Display ("Sorry, that answer is incorrect. You will lose 3 points");

`                            `score= score -3;

`                            `incorrectAns= incorrectAns + 1;



`                        `Else if (Answer equals ("h"))



`                            `Do {  If answer doesn’t equal 1,2,3, h or q 

`                                `Display ("Sorry, please enter 1, 2, 3, H or Q ONLY");



`                                `Else if (Answer is ("h"))

`                                `Display ("Their name is hard to pronounce");



Display “Enter Answer: ") 

`                                `User Inputs answer

`                            `**}While**  Answer doesn’t equal “1,2,3 h or q”

`                            `If  Answer equals 2



`                                `Display "Correct! You get 1.5 points!"

`                                `score= score +1.5;

`                                `correctAns= correctAns +1;



`                            `**Else if** (Answer= “1 or 3”)

`                            `Display ("Sorry, that answer is incorrect. You will lose 3 points")

`                                `score= score -3;

`                                `incorrectAns= incorrectAns + 1;



`                        `**Else if**  (Answer ("Q"))



`                            `**Display** ("You have pressed quit")



`                    `**}while**(Answer doesn’t equal 1,2,3 h or q)



`            `**}while** (Answer doesn’t equal 1,2,3 h or q)



`    `**do{**

` 	`If Answer isn’t “q”

Display  “Question 2 In what city did Conor Mcgregor win the featherweight belt? “

Display “1. Dublin  2. New York City 3. Las Vegas H. Hint  

Display "Enter Answer: “

`                    `**Do{**

`                        `Display ("Enter Answer: ") 

`                        `User Inputs their answer for Q.3                                                                     

`                        `if (Answer isn’t “1,2,3 , h or q”)



`                            `Display “Sorry, please enter 1, 2, 3, H or Q ONLY");



`                        `**else if** (Answer = 3)

`                        `Display "Correct! You get 3 points!"

`                            `score= score +3;

`                            `correctAns= correctAns +1;



`                        `**Else if** (Answer = “1 or 2”)

`                        `Display ("Sorry, that answer is incorrect. You will lose 3 points");

`                            `score= score -3;

`                            `incorrectAns= incorrectAns + 1;



`                        `**Else if** (Answer equals ("h"))



`                            `**Do {**  If answer doesn’t equal 1,2,3, h or q 

`                                `Display ("Sorry, please enter 1, 2, 3, H or Q ONLY");



`                                `Else if (Answer is ("h"))

`                                `Display ("Gambling");



Display “Enter Answer: ") 

`                                `User Inputs answer

`                            `**}While** Answer doesn’t equal “1,2,3 h or q”

`                            `If Answer equals 3



`                                `Display "Correct! You get 1.5 points!"

`                                `score= score +1.5;

`                                `correctAns= correctAns +1;



`                            `**Else if** (Answer= “1 or 2”)

`                            `Display ("Sorry, that answer is incorrect. You will lose 3 points")

`                                `score= score -3;

`                                `incorrectAns= incorrectAns + 1;



`                        `**Else if**  (Answer ("Q"))



`                            `**Display** ("You have pressed quit")



`                    `**}while**(Answer doesn’t equal 1,2,3 h or q)



`            `**}while** (Answer doesn’t equal 1,2,3 h or q)



`    `timesPlayed = timesPlayed + 1;

`    `Display “Your Score is (users total score) “ 

`    `Display “You got  (correctAns )  answer(s) correct"

`    `Display “You got  (incorrectAns)  answer(s) incorrect"

`    `Display “You've played the UFC quiz  (timesPlayed) time(s)”



`    `**Do{** 



`            `Display ” you want to play again YES/NO"

`            `Display “Please enter yes or no"

`            `User Inputs response



`    `**}while** Answer doesn’t equal “Yes, Y, N, No or Q”



**}while**  Answer equals “yes or y” (Quiz will repeat if user answers yes, go to start of original loop

Display “Thank you for Playing The UFC quiz,Goodbye"   //if user says no


**[Extra Feature]**

The extra feature I decided to add was letting the user end the quiz at any time by pressing “q” and a message would appear  telling the user they have pressed quit and offering them to play again. I think this a clever yet simple thing that most other quizzes have and a lot of other programmes for that fact also.  I had to make new if statements which made it possible for the programme to flow to the end by pressing one quit button. I added it to the do while loop and made new if statements. I made it work for the first question and then was able to copy and paste it for the other questions  while changing the answer numbers.



**C. Written Description**

For Part of our assignment we had to make a short 3 question quiz on a topic of our choice. The user would be given 3 possible answers and a hint if they press h. If they answer correctly, they will receive 3 points. I decided that the user should receive 1.5 points if they get answer right with a hint. If they answer a question wrong, they will lose 3 points. At the end the user will be prompted to take the quiz again. At the end the users score will be displayed. I decided to make the score reset after every game. I am a big fan of the UFC and the sport of MMA, and know a lot about it, so a quiz on this subject was apt.

The key to this quiz was do while loops and if statements to ensure users could only enter the right answers to proceed.



