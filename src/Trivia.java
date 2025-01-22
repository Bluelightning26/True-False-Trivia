import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.awt.Color.*;


public class Trivia implements ActionListener
    {

    static final Random ra = new Random();

    float version = 2.1f;
    int questions;

    int triviaChoice = 0;
    int trivQ;
    boolean answer;
    boolean selectedAnswer;
    boolean firstTime = true;
    int increment;

    JFrame frame;
    JPanel panel;

    JButton nextButton;

    JButton tSpace;
    JButton tMinecraft;
    JButton tUnitedStates;
    JButton tWorld;
    JButton tCountryCapital;
    JButton tCityLocation;
    JButton tJava;

    JButton trueButton;
    JButton falseButton;


    JLabel prompt;
    JLabel question;
    JLabel ans;

    JProgressBar progressBar;

    JSlider slider;
    JLabel sliderInstructions;

    public Trivia()
    {

        frame = new JFrame("Trivia");
        frame.setBackground(pink);


        tSpace = new JButton("Space");
        tSpace.addActionListener(this);
        tSpace.setFont(new Font("American Typewriter", Font.BOLD, 30));
        tSpace.setForeground(lightGray);

        tMinecraft = new JButton("Minecraft");
        tMinecraft.addActionListener(this);
        tMinecraft.setFont(new Font("American Typewriter", Font.BOLD, 30));
        tMinecraft.setForeground(green);

        tUnitedStates = new JButton("United States");
        tUnitedStates.addActionListener(this);
        tUnitedStates.setFont(new Font("American Typewriter", Font.BOLD, 30));
        tUnitedStates.setForeground(red);

        tWorld = new JButton("World");
        tWorld.addActionListener(this);
        tWorld.setFont(new Font("American Typewriter", Font.BOLD, 30));
        tWorld.setForeground(blue);

        tCountryCapital = new JButton("Country Capitals");
        tCountryCapital.addActionListener(this);
        tCountryCapital.setFont(new Font("American Typewriter", Font.BOLD, 30));
        tCountryCapital.setForeground(magenta);

        tCityLocation = new JButton("City Locations");
        tCityLocation.addActionListener(this);
        tCityLocation.setFont(new Font("American Typewriter", Font.BOLD, 30));
        tCityLocation.setForeground(orange);


        tJava = new JButton("Java");
        tJava.addActionListener(this);
        tJava.setFont(new Font("American Typewriter", Font.BOLD, 30));

        prompt = new JLabel();
        prompt.setFont(new Font("American Typewriter", Font.BOLD, 30));

        question = new JLabel("Select Trivia Category");
        question.setFont(new Font("American Typewriter", Font.BOLD, 30));

        ans = new JLabel("Enter number of questions");
        ans.setFont(new Font("American Typewriter", Font.BOLD, 15));
        ans.setVisible(false);


        trueButton = new JButton("True");
        trueButton.addActionListener(this);
        trueButton.setFont(new Font("American Typewriter", Font.BOLD, 30));
        trueButton.setVisible(false);

        falseButton = new JButton("False");
        falseButton.addActionListener(this);
        falseButton.setFont(new Font("American Typewriter", Font.BOLD, 30));
        falseButton.setVisible(false);

        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        nextButton.setVisible(false);


        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setForeground(darkGray);
        progressBar.setBackground(pink);
        progressBar.setOpaque(true);
        progressBar.setFont(new Font("Monospaced", Font.BOLD, 30));
        progressBar.setValue(0);
        progressBar.setVisible(false);


        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(2);
        slider.setMinorTickSpacing(1);
        slider.setValue(6);
        slider.setMinimum(4);
        slider.setMaximum(10);
        slider.setSnapToTicks(true);

        sliderInstructions = new JLabel("Number of Questions:");
        sliderInstructions.setFont(new Font("Monospaced", Font.BOLD, 30));
        sliderInstructions.setForeground(white);

        slider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            System.out.println(slider.getValue());
            //temp
            questions = slider.getValue();
            increment = 100/questions;
        }
        });


        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(50, 80, 50, 80));
        panel.setLayout(new GridLayout(0, 1));
        panel.setBackground(pink);
        panel.setOpaque(true);
        panel.setFont(new Font("Monospaced", Font.PLAIN, 30));

        panel.add(prompt);
        panel.add(question);
        panel.add(trueButton);
        panel.add(falseButton);
        panel.add(tSpace);
        panel.add(tMinecraft);
        panel.add(tUnitedStates);
        panel.add(tWorld);
        panel.add(tCountryCapital);
        panel.add(tCityLocation);
        panel.add(tJava);
        panel.add(ans);
        panel.add(nextButton);
        panel.add(progressBar);
        panel.add(sliderInstructions);
        panel.add(slider);


        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(1640, 1480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String[] args)
    {
        new Trivia();
    }



    /*
    Snippets of Old Code I believe May become useful /shrug

System.out.println("Many city names are reused across the globe, this game attempts to avoid duplicates but only
refers the most populated instance of a name in such a scenario");

  System.out.println("Thanks for playing!");
System.out.println("Feel free to play again to get other questions!");

    */



    public void menuSelection()
    {

        if (firstTime)
            {
            System.out.println("Debug Panel\n\nDo not look at if you are playing the game");

            tSpace.setVisible(false);
            tMinecraft.setVisible(false);
            tUnitedStates.setVisible(false);
            tWorld.setVisible(false);
            tCountryCapital.setVisible(false);
            tCityLocation.setVisible(false);
            tJava.setVisible(false);

            slider.setVisible(false);
            panel.remove(slider);
            panel.remove(sliderInstructions);

            prompt.setFont(new Font("American Typewriter", Font.BOLD, 15));
            question.setFont(new Font("American Typewriter", Font.BOLD, 20));
            frame.setSize(800, 1480);

            trueButton.setVisible(true);
            falseButton.setVisible(true);
            nextButton.setVisible(true);

            progressBar.setVisible(false);

            firstTime = false;
            }

        System.out.println("Questions: " + questions);

        if (questions == 0)
            {
            End();
            }

        switch (triviaChoice)
            {
            case 1:
                SpaceTrivia();
                break;
            case 2:
                MinecraftTrivia();
                break;
            case 3:
                UnitedStatesTrivia();
                break;
            case 4:
                WorldTrivia();
                break;
            case 5:
                CountryCapitalTrivia();
                break;
            case 6:
                CityLocationTrivia();
                break;
            case 7:
                JavaTrivia();
                break;
            default:
            }
    }



    public void menuAns()
    {

        switch (triviaChoice)
            {
            case 1:
                SpaceTriviaAns();
                break;
            case 2:
                MinecraftTriviaAns();
                break;
            case 3:
                UnitedStatesTriviaAns();
                break;
            case 4:
                WorldTriviaAns();
                break;
            case 5:
                CountryCapitalTriviaAns();
                break;
            case 6:
                CityLocationTriviaAns();
                break;
            case 7:
                JavaTriviaAns();
                break;
            default:
            }
    }



    public void SpaceTrivia()
    {

        prompt.setText("Space Trivia Selected!");
        ans.setVisible(false);
        nextButton.setVisible(false);

        trivQ = ra.nextInt(8) + 1;
        //System.out.println(" Question Number: " + trivQ);

        //Question Bank
        switch (trivQ)
            {
            case 1:
                question.setText("The first animal in space was a mouse");
                answer = false;
                break;

            case 2:
                question.setText("Humans have been to the Moon");
                answer = true;
                break;

            case 3:
                question.setText("Our galaxy is called the Orion");
                answer = false;
                break;

            case 4:
                question.setText("Apollo 11 was the first mission in which humanity stepped foot on the moon");
                answer = true;
                break;

            case 5:
                question.setText("Mercury is the hottest planet in the Solar System");
                answer = false;
                break;

            case 6:
                question.setText("The Sun is the center of the universe");
                answer = false;
                break;

            case 7:
                question.setText("The most distant human-made object from earth is Voyager I");
                answer = true;
                break;

            case 8:
                question.setText("The Andromeda Galaxy is the closest galaxy to the Milky Way");
                answer = true;
                break;

            default:
            }
        //System.out.println("Answer real:" + answer);
    }



    public void SpaceTriviaAns()
    {

        if (selectedAnswer == answer)
            {
            question.setText("Correct!");
            } else
            {
            ans.setVisible(true);
            question.setText("Wrong :(");

            switch (trivQ)
                {
                case 1:
                    ans.setText("Fruit flies were launched by the USA in 1947!");
                    break;
                case 3:
                    ans.setText("We live in the great Milky Way Galaxy!");
                    break;
                case 5:
                    ans.setText("Venus, while not the closest planet, is the hottest!");
                    break;
                case 6:
                    ans.setText("The sun is the center of the solar system... not the Universe");
                    break;
                }
            }

        trueButton.setVisible(false);
        falseButton.setVisible(false);
    }



    public void MinecraftTrivia()
    {

        prompt.setText("Minecraft Trivia Selected!");
        ans.setVisible(false);
        nextButton.setVisible(false);

        trivQ = ra.nextInt(8) + 1;
        //System.out.println("Question Number: " + trivQ);

        //Question Bank
        switch (trivQ)
            {
            case 1:
                question.setText("Minecraft was officially released in 2009");
                answer = false;
                break;

            case 2:
                question.setText("Wolves can be tamed with rotten flesh");
                answer = true;
                break;

            case 3:
                question.setText("Minecraft has three game modes");
                answer = false;
                break;

            case 4:
                question.setText("One Blue Ice block is equal to 81 Ice blocks");
                answer = true;
                break;

            case 5:
                question.setText("The Azure Bluet is a block");
                answer = true;
                break;

            case 6:
                question.setText("A Glistering Melon Slice can be used to make an Awkward Potion");
                answer = false;
                break;

            case 7:
                question.setText("Carrots can make orange dye");
                answer = false;
                break;

            case 8:
                question.setText("Brown mushrooms are the only type to emit light");
                answer = true;
                break;

            default:
            }
        //System.out.println("Answer real:" + answer);
    }



    public void MinecraftTriviaAns()
    {

        if (selectedAnswer == answer)
            {
            question.setText("Correct!");
            } else
            {
            ans.setVisible(true);
            question.setText("Wrong :(");

            switch (trivQ)
                {
                case 1:
                    ans.setText("The full release was in 2011, the alpha was in 2009!");
                    break;
                case 3:
                    ans.setText("Hardcore, survival, adventure, creative!");
                    break;
                case 6:
                    ans.setText("Mundane potions and potions of healing");
                    break;
                case 7:
                    ans.setText("No... it's a carrot... you eat it");
                    break;
                }
            }

        trueButton.setVisible(false);
        falseButton.setVisible(false);
    }



    public void UnitedStatesTrivia()
    {

        prompt.setText("United States Trivia Selected!");
        ans.setVisible(false);
        nextButton.setVisible(false);

        trivQ = ra.nextInt(8) + 1;
        //System.out.println("Question Number: " + trivQ);

        //Question Bank
        switch (trivQ)
            {
            case 1:
                question.setText("FDR was the president during the Cuban Missile Crisis");
                answer = false;
                break;

            case 2:
                question.setText("The U.S. men’s Olympic hockey team defeated the Soviet Union in the " +
                        "semi-finals of the 1980 Winter Olympics, & is known as the 'Miracle on Ice'");
                answer = true;
                break;

            case 3:
                question.setText("The 27th Amendment took over 200 years to ratify");
                answer = true;
                break;

            case 4:
                question.setText("Benjamin Franklin was the 6th president of Pennsylvania");
                answer = true;
                break;

            case 5:
                question.setText("The oldest European-founded city in a US state is located in Virginia");
                answer = false;
                break;

            case 6:
                question.setText("The US declared its independence in 1777");
                answer = false;
                break;

            case 7:
                question.setText("Hawaii is the state with the most active volcanoes");
                answer = false;
                break;

            case 8:
                question.setText("The Declaration of Independence begins with the phrase 'We The People'");
                answer = true;
                break;

            default:
            }
        //System.out.println("Answer real:" + answer);
    }



    public void UnitedStatesTriviaAns()
    {

        if (selectedAnswer == answer)
            {
            question.setText("Correct!");
            } else
            {
            ans.setVisible(true);
            question.setText("Wrong :(");

            switch (trivQ)
                {
                case 1:
                    ans.setText("John F Kennedy was the president, FDR was there in WWII");
                    break;
                case 5:
                    ans.setText("Saint Augustine, Florida dates back to the Spanish in 1565!");
                    break;
                case 6:
                    ans.setText("July 4, 1776!");
                    break;
                case 7:
                    ans.setText("Alaska tops this leaderboard");
                    break;
                }
            }

        trueButton.setVisible(false);
        falseButton.setVisible(false);
    }



    public void WorldTrivia()
    {

        prompt.setText("World Trivia Selected!");
        ans.setVisible(false);
        nextButton.setVisible(false);

        trivQ = ra.nextInt(8) + 1;
        //System.out.println("Question Number: " + trivQ);

        //Question Bank
        switch (trivQ)
            {
            case 1:
                question.setText("The longest river in the world is the Rio Grande");
                answer = false;
                break;

            case 2:
                question.setText("The world's largest producer of coffee is Brazil");
                answer = true;
                break;

            case 3:
                question.setText("Bolivia has 36 official languages");
                answer = true;
                break;

            case 4:
                question.setText("Indonesia has the most active volcanoes of any country");
                answer = true;
                break;

            case 5:
                question.setText("Russia has the most natural lakes");
                answer = false;
                break;

            case 6:
                question.setText("Great Britain is comprised of three countries");
                answer = false;
                break;

            case 7:
                question.setText("England uses km/h (Kilometers per Hour) when enforcing speed limits");
                answer = false;
                break;

            case 8:
                question.setText("Angel Falls located in Venezuela are the tallest in the world");
                answer = true;
                break;

            default:
            }
        //System.out.println("Answer real:" + answer);
    }



    public void WorldTriviaAns()
    {

        if (selectedAnswer == answer)
            {
            question.setText("Correct!");
            } else
            {
            ans.setVisible(true);
            question.setText("Wrong :(");

            switch (trivQ)
                {
                case 1:
                    ans.setText("The Nile River in Africa tops of this list, with the Amazon a close second");
                    break;
                case 5:
                    ans.setText("Canada is vastly ahead of the competition in this category");
                    break;
                case 6:
                    ans.setText("England, Scotland, Wales, and Northern Ireland make up four in Great Britain");
                    break;
                case 7:
                    ans.setText("Nope, they use m/ph, but oddly they introduced k/ph to most colonies");
                    break;
                }
            }

        trueButton.setVisible(false);
        falseButton.setVisible(false);
    }



    public void CountryCapitalTrivia()
    {

        prompt.setText("Country Capital Trivia Selected!");
        ans.setVisible(false);
        nextButton.setVisible(false);

        trivQ = ra.nextInt(8) + 1;
        //System.out.println("Question Number: " + trivQ);

        //Question Bank
        switch (trivQ)
            {
            case 1:
                question.setText("Toronto is the capital of Canada");
                answer = false;
                break;

            case 2:
                question.setText("Shanghai is the capital of China");
                answer = false;
                break;

            case 3:
                question.setText("Sydney is the capital of Australia");
                answer = false;
                break;

            case 4:
                question.setText("Bamako is Mali's capital city");
                answer = true;
                break;

            case 5:
                question.setText("Sāo Paulo is Brazil's capital");
                answer = false;
                break;

            case 6:
                question.setText("The capital city of Russia is St. Petersburg");
                answer = false;
                break;

            case 7:
                question.setText("Alexandria is NOT the capital of Egypt");
                answer = true;
                break;

            case 8:
                question.setText("Manila is the capital of the Philippines");
                answer = true;
                break;

            default:
            }
        //System.out.println("Answer real:" + answer);
    }



    public void CountryCapitalTriviaAns()
    {

        if (selectedAnswer == answer)
            {
            question.setText("Correct!");
            } else
            {
            ans.setVisible(true);
            question.setText("Wrong :(");

            switch (trivQ)
                {
                case 1:
                    ans.setText("Ottawa, Canada!");
                    break;
                case 2:
                    ans.setText("Beijing, China!");
                    break;
                case 3:
                    ans.setText("Canberra, Australia... have you heard of them?");
                    break;
                case 5:
                    ans.setText("Brasília, Brazil");
                    break;
                case 6:
                    ans.setText("Moscow, Russia");
                    break;
                }
            }

        trueButton.setVisible(false);
        falseButton.setVisible(false);
    }



    public void CityLocationTrivia()
    {

        prompt.setText("City Location Trivia Selected!");
        ans.setVisible(false);
        nextButton.setVisible(false);

        trivQ = ra.nextInt(8) + 1;
        //System.out.println("Question Number: " + trivQ);

        //Question Bank
        switch (trivQ)
            {
            case 1:
                question.setText("Bogotá is located in Colombia");
                answer = true;
                break;

            case 2:
                question.setText("León is a French city");
                answer = false;
                break;

            case 3:
                question.setText("Busan is Chinese");
                answer = false;
                break;

            case 4:
                question.setText("Bamako is Mali's capital city");
                answer = true;
                break;

            case 5:
                question.setText("Chennai is a city in Oman");
                answer = false;
                break;

            case 6:
                question.setText("Zanzibar is located in Madagascar");
                answer = false;
                break;

            case 7:
                question.setText("Cayenne is in French Guiana");
                answer = true;
                break;

            case 8:
                question.setText("Manila is the capital of the Philippines");
                answer = true;
                break;

            default:
            }
        //System.out.println("Answer real:" + answer);
    }



    public void CityLocationTriviaAns()
    {

        if (selectedAnswer == answer)
            {
            question.setText("Correct!");
            } else
            {
            ans.setVisible(true);
            question.setText("Wrong :(");

            switch (trivQ)
                {
                case 2:
                    ans.setText("The two famous León's are from Spain and Mexico");
                    break;
                case 3:
                    ans.setText("Second most populous South Korean city!");
                    break;
                case 5:
                    ans.setText("Chennai, India!");
                    break;
                case 6:
                    ans.setText("Zanzibar is Tanzanian!");
                    break;
                }
            }

        trueButton.setVisible(false);
        falseButton.setVisible(false);
    }



    public void JavaTrivia()
    {

        prompt.setText("Java Trivia Selected!");
        ans.setVisible(false);
        nextButton.setVisible(false);

        trivQ = ra.nextInt(8) + 1;
        //System.out.println("Question Number: " + trivQ);

        //Question Bank
        switch (trivQ)
            {
            case 1:
                question.setText("Java is a high level object-orientated programming language");
                answer = true;
                break;

            case 2:
                question.setText("Java's slogan is 'Write once, run Anywhere'");
                answer = true;
                break;

            case 3:
                System.out.println("Java was originally developed at Sun MiniSystems");
                answer = false;
                break;

            case 4:
                question.setText("As of 2022, Java is the third most popular programming language");
                answer = true;
                break;

            case 5:
                question.setText("Java is named after the Ancient City of Java located in modern day Djibouti");
                answer = false;
                break;

            case 6:
                question.setText("Java is known for not being portable");
                answer = false;
                break;

            case 7:
                question.setText("This program is written in java");
                answer = true;
                break;

            case 8:
                question.setText("JDK stands for Java Debugging Kit");
                answer = false;
                break;

            default:
            }
        //System.out.println("Answer real:" + answer);
    }



    public void JavaTriviaAns()
    {

        if (selectedAnswer == answer)
            {
            question.setText("Correct!");
            } else
            {
            ans.setVisible(true);
            question.setText("Wrong :(");

            switch (trivQ)
                {
                case 3:
                {
                question.setText("Java was developed at Sun Microsystems!\n");
                }
                break;
                case 5:
                {
                question.setText("Java is named after Java coffee - which originates on the Island of (Indonesia)!\n");
                }
                break;
                case 6:
                {
                question.setText("Java is well known for it's portability!\n");
                }
                break;
                case 7:
                {
                question.setText("JDK Stands for Java Development Kit!\n");
                }
                break;
                }
            }

        trueButton.setVisible(false);
        falseButton.setVisible(false);
    }



    public void End()
    {

        trueButton.setVisible(false);
        falseButton.setVisible(false);
        nextButton.setVisible(false);
        prompt.setVisible(false);
        question.setVisible(false);
        prompt.setText("Thanks for playing :)");
        question.setText("End");
        panel.setBackground(orange);
        progressBar.setBackground(orange);
        progressBar.setValue(100);
        panel.remove(progressBar);

        frame.setTitle("Thanks for playing!");
        System.out.println("\n\n\n");


        JLabel labelVer = new JLabel();
        labelVer.setFont(new Font("American Typewriter", Font.BOLD, 20));
        panel.add(labelVer);

        JLabel label1 = new JLabel();
        label1.setFont(new Font("American Typewriter", Font.BOLD, 20));
        panel.add(label1);

        JLabel label2 = new JLabel();
        label2.setFont(new Font("American Typewriter", Font.BOLD, 20));
        panel.add(label2);

        JLabel label3 = new JLabel();
        label3.setFont(new Font("American Typewriter", Font.BOLD, 20));
        panel.add(label3);

        JLabel label4 = new JLabel();
        label4.setFont(new Font("American Typewriter", Font.BOLD, 20));
        panel.add(label4);

        JLabel label5 = new JLabel();
        label5.setFont(new Font("American Typewriter", Font.BOLD, 20));
        panel.add(label5);

        JLabel label6 = new JLabel();
        label6.setFont(new Font("American Typewriter", Font.BOLD, 20));
        panel.add(label6);

        JLabel label7 = new JLabel();
        label7.setFont(new Font("American Typewriter", Font.BOLD, 20));
        panel.add(label7);

        panel.add(progressBar);

        labelVer.setText("Version: " + version);
        label1.setText("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java" +
                ".vendor"));
        //label2.setText("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
        label3.setText("Operating System: " + System.getProperty("os.name") + " " + System.getProperty("os.version"));
        label5.setText("Architecture: " + System.getProperty("os.arch"));
        label6.setText("By: Blu");
        label7.setText("Coded for Hack Club High Seas on January 21st 2025");


        System.out.println("\n\n\n");
        System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
        //System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
        System.out.print("Operating System: " + System.getProperty("os.name"));
        System.out.println(" " + System.getProperty("os.version"));
        System.out.println("Architecture: " + System.getProperty("os.arch"));
        System.out.println("By: Blu");
        System.out.println("Coded for Hack Club High Seas on January 21st 2025");

        //quitButton.setEnabled(true);
    }



    @Override
    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() == tSpace)
            {
            triviaChoice = 1;
            menuSelection();
            }

        if (e.getSource() == tMinecraft)
            {
            triviaChoice = 2;
            menuSelection();
            }

        if (e.getSource() == tUnitedStates)
            {
            triviaChoice = 3;
            menuSelection();
            }

        if (e.getSource() == tWorld)
            {
            triviaChoice = 4;
            menuSelection();
            }
        
        if (e.getSource() == tCountryCapital)
            {
            triviaChoice = 5;
            menuSelection();
            }
        
        if (e.getSource() == tCityLocation)
            {
            triviaChoice = 6;
            menuSelection();
            }
        
        if (e.getSource() == tJava)
            {
            triviaChoice = 7;
            menuSelection();
            }
        

        if (e.getSource() == trueButton)
            {
            selectedAnswer = true;
            System.out.println("User: " + selectedAnswer);
            System.out.println("Real:" + answer);
            System.out.println();
            nextButton.setVisible(true);
            menuAns();
            }

        if (e.getSource() == falseButton)
            {
            selectedAnswer = false;
            System.out.println("User: " + selectedAnswer);
            System.out.println("Real:" + answer);
            System.out.println();
            nextButton.setVisible(true);
            menuAns();
            }


        if (e.getSource() == nextButton) {
        ans.setVisible(false);
        trueButton.setVisible(true);
        falseButton.setVisible(true);
        questions--;
        progressBar.setValue(progressBar.getValue() + increment);
        menuSelection();
        }
    }

}
//Thanks for looking through the src! Any suggestions? DM me :)