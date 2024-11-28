import java.util.Scanner;
import java.util.Random;


class Trivia
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Repeat
        String Gap = ("\n\n\n");

        //vars
        int triviaChoice;
        int trivQ;
        boolean answer = false;
        boolean response;

        boolean showSystemProperties;


        //Main Menu Prompt
        System.out.println(Gap + "Trivia!\n");
        System.out.println("Choose trivia type:");
        System.out.println("1. Space");
        System.out.println("2. Minecraft");
        System.out.println("3. United States");
        triviaChoice = sc.nextInt();
        System.out.println(Gap);


        //Space Trivia
        if (triviaChoice == 1)

        {

            System.out.println("Space Trivia Selected!\n\n");


            for (int i = 1; i <= 3; i++)
                {

                trivQ = rand.nextInt(8)+1;

                //Question Bank
                switch (trivQ)
                    {
                    case 1:
                        System.out.println("The first animal in space was a mouse...\n");
                        answer = false;
                        break;

                    case 2:
                        System.out.println("Humans have been to the Moon...\n");
                        answer = true;
                        break;

                    case 3:
                        System.out.println("Our galaxy is called the Orion...\n");
                        answer = false;
                        break;

                    case 4:
                        System.out.println("Apollo 11 was the first mission in which humanity stepped foot on the " +
                                "moon" +
                                "...\n");
                        answer = true;
                        break;

                    case 5:
                        System.out.println("Mercury is the hottest planet in the Solar System...\n");
                        answer = false;
                        break;

                    case 6:
                        System.out.println("The Sun is the center of the universe...\n");
                        answer = false;
                        break;

                    case 7:
                        System.out.println("The most distant human-made object from earth is Voyager I...\n");
                        answer = true;
                        break;

                    case 8:
                        System.out.println("The Andromeda Galaxy is the closest galaxy to the Milky Way...\n");
                        answer = true;
                        break;


                    default:
                    }

                System.out.println("Answer true or false");
                response = sc.nextBoolean();

                if( answer == response )
                    {
                    System.out.println("Correct!");
                    }
                else
                    {
                    System.out.println("Wrong :(");
                    }

                System.out.println(Gap);

                }

        }



        //Minecraft Trivia
        if (triviaChoice == 2)
        {
            System.out.println("Minecraft Trivia Selected!\n\n");


            for (int i = 1; i <= 3; i++)
            {


            trivQ = rand.nextInt(8)+1;

            //Question Bank
            switch (trivQ)
                {
                case 1:
                    System.out.println("Minecraft was officially released in 2009...\n");
                    answer = false;
                    break;

                case 2:
                    System.out.println("Wolves can be tamed with rotten flesh...\n");
                    answer = true;
                    break;

                case 3:
                    System.out.println("Minecraft has three game modes...\n");
                    answer = false;
                    break;

                case 4:
                    System.out.println("One Blue Ice block is equal to 81 Ice blocks...\n");
                    answer = true;
                    break;

                case 5:
                    System.out.println("The Azure Bluet is a block...\n");
                    answer = true;
                    break;

                case 6:
                    System.out.println("A Glistering Melon Slice can be used to make a Mundane Potion...\n");
                    answer = false;
                    break;

                case 7:
                    System.out.println("Carrots can make orange dye...\n");
                    answer = false;
                    break;

                case 8:
                    System.out.println("Brown mushrooms are the only type to emit light...\n");
                    answer = true;
                    break;

                default:
                }

            System.out.println("Answer true or false");
            response = sc.nextBoolean();

            if( answer == response )
                {
                System.out.println("Correct!");
                }
            else
                {
                System.out.println("Wrong :(");
                }

            System.out.println(Gap);
            }
        }



        //US History Trivia
        if (triviaChoice == 3)
        {
        System.out.println("United States 🇺🇸 Trivia Selected!\n\n");


        for (int i = 1; i <= 3; i++)
            {


            trivQ = rand.nextInt(8)+1;

            //Question Bank
            switch (trivQ)
                {
                case 1:
                    System.out.println("FDR was the president during the Cuban Missile Crisis...\n");
                    answer = false;
                    break;

                case 2:
                    System.out.println("The U.S. men’s Olympic hockey team defeated the Soviet Union in the " +
                            "semi-finals of the 1980 Winter Olympics, & is known as the 'Miracle on Ice'...\n");
                    answer = true;
                    break;

                case 3:
                    System.out.println("The 27th Amendment took over 200 years to ratify...\n");
                    answer = true;
                    break;

                case 4:
                    System.out.println("Benjamin Franklin was the 6th president of Pennsylvania...\n");
                    answer = true;
                    break;

                case 5:
                    System.out.println("The oldest European-founded city in the US is located in Virginia...\n");
                    answer = false;
                    break;

                case 6:
                    System.out.println("The US declared its independence in 1777...\n");
                    answer = false;
                    break;

                case 7:
                    System.out.println("Hawaii is the state with the most active volcanoes...\n");
                    answer = false;
                    break;

                case 8:
                    System.out.println("The Declaration of Independence begins with the phrase 'We The People'...\n");
                    answer = true;
                    break;

                default:
                }

            System.out.println("Answer true or false");
            response = sc.nextBoolean();

            if( answer == response )
                {
                System.out.println("Correct!");
                }
            else
                {
                System.out.println("Wrong :(");
                }

            System.out.println(Gap);
            }
        }


        System.out.println("Thanks for playing!");
        System.out.println("Feel free to play again to get other questions!");

        showSystemProperties = true;

        if (showSystemProperties)
            {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on November 28th 2024");
            }

    }
}