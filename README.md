# Trivia!
## A True-False trivia game with 7 categories and a GUI in Java!
![](https://cloud-q8l5eqnpe-hack-club-bot.vercel.app/0truefalsetrivia.png)

## Trivia Question Genres
1. Space
2. Minecraft
3. United States
4. World
5. Country Capitals
6. City Locations
7. Java


## Directions

1. Choose Genre of Question Bank
2. Click True Button or False Button
3. Click Next Button after answer is displayed
4. Repeat steps 2 and 3 until done

## Controls
- Use your mouse and left click to interact with the program!

- The tab key + space key combination works
    - Tab to move cursor
    - Space to select button

## Features
- Utilizes Swing Library to create a GUI
    - Colored JPanel + JFrame
    - Interactive JButtons
    - Colored Buttons
    - JLabels
    - JProgressBar
    - Special Fonts
    - Debug Mode (Open terminal)
    - JSlider** WIP
    - More!


- Selectable Genre
  - 7 options
  - 8 questions to pull from per genre


- Gives correct custom answers when incorrect
  - Helps the user learn while using the program


- Random Question chosen pool every time
  - over 50 questions in entire pool


- Methods employed
  - Code is reusable + repeatable
  - Swing can perform


- A lot more :) Dig around the [source code](src/Trivia.java) to see!

## Download / Compatability
- Due to being coded in Java it works on most mainstream devices! 
  - This is as Java is platform independent and runs on a JVM
- Run the Trivia.class file listed in the releases.


## Info
This project used to be a CLI program that checked for user error but did not implement methods and used for loops instead. 
In this update (Jan 2025) when setting out to create a GUI for this I encountered a plethora of bugs when trying to modify the
old code and essentially ended up starting from scratch. The only piece of old logic that I kept were the question switch cases,
which themselves had to be modified and moved.
This is my first project in which I converted an old CLI program to a GUI app it was far more difficult than I envisioned.
This tested my patience the most out of any project I have built so far as I kept squashing and making bugs for what seemed to be hours, 
and having to go through trial and error many times as I teach myself how the Swing library works.





## Next Steps
### I hope to keep expanding on this project! Here are my ideas on what to add...
1. [x] Implement a Colored UI + Custom Fonts
2. [x] Add progress Bar
3. [x] Add slider for the user to customize number of questions asked
4. [ ] Increase question pool size
5. [ ] Create an ALL trivia option where questions are pulled from the entire pool
 
## Version 2.1

## Changelog
- v1.0
  - Created Base Game as a CLI program!


- v1.1
  - 3 more genres of trivia: 
    - World
    - Country Capitals
    - City Locations!


- v1.2
  - Added Java trivia 
  - Correct answers when ‘false’ questions are answered incorrectly for clarification and knowledge for the user 
    - Java and Space topics only

- v2.0
  - Revamped everything! (LARGE UPDATE)
  - Code is in methods
  - GUI based
  - Created Detailed Readme to explain project


- v2.1
  - Added correct answers for all topics
  - Fixed incorrect phrasing in some questions
  - Added slider functionality
    - User can choose number of questions
