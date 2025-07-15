ITSC1213 Summer 2025
Problem Solve 19
Nmae: Guylain Masengo
Email: gmasengo@charlotte.edu



Original source
The original files for this assignment are provided at https://github.com/Charlotte-CCI-ICC/1213-problem-solve19.gitLinks to an external site. (by nanajjarLinks to an external site., last accessed on July 14, 2025).

Contents
README.md: Empty Markdown file.

RectangleTest.java: Template for a Java program that will do some geometric calculations using rectangles.

Circle.java: This class describes a circle with a given radius and color.

Set up a new GitHub project
Basic reading
We are assuming you read the following sections on the Runestone book:

12.7 What are Git and GitHub? (click hereLinks to an external site.).

12.8 Getting the Project Code: Cloning (click hereLinks to an external site..

12.9 Working with Versions: Branches and Checkout (click hereLinks to an external site.)

12.10 Project Setup, Branches, and Tooling Context (click hereLinks to an external site.)

Soft tips about Git from the Phyloinformatics Lab
What is Git?Links to an external site.

EXTRA: Set up Git to handle GitLab projects (command line solutions for Linux)Links to an external site.

EXTRA: Using GitHub Desktop with GitLabLinks to an external site.

Additional resources
Git, GitHub, & GitHub Desktop for beginners, by Code Coder. Available from
YouTubeLinks to an external site.

(last accessed on July 14, 2025).

A step-by-step guide to Git installation: How to install Git on macOS, Windows and Linux, by Kyryl Sidak. Available from codefinityLinks to an external site. (last accessed on July 14, 2025).

Setting up
Make sure you have a GitHub account.

Download and install the GitHub desktop app.

On GitHub's website, in your account, create a new GitHub project for this activity. Call it ITSC1213_ProblemSolve19.

Clone that empty project locally. Add the contents of https://github.com/Charlotte-CCI-ICC/1213-problem-solve19.gitLinks to an external site. in there. Update your project.

Modify the RectangleTest.java program
At the top of RectangleTest.java , add:

 import java.util.Scanner;
Let us modify the program to read width and height from the user. Inside the main method, add the following code:

 // Inside main() 
 Scanner input = new Scanner(System.in);
 System.out.print("Enter width: "); 
 int width = input.nextInt();
 System.out.print("Enter height: "); 
 int height = input.nextInt();
Once your program runs correctly and calculates the area based on user input, you’re ready to move on to the next part. Be prepared to show how this program runs to the instructional team during the review.

Document your code with JavaDoc
In this part we will work on document your code with JavaDoc comments and generate documentation.

Open the Circle.java file and review its content. Then, replace the basic comments with proper JavaDoc-style comments. 1.1. Above the class: purpose + @author 1.2. Above methods/constructors: summary, @param, @return

Generate the documentation by running the following command in the terminal:

 javadoc -d docs Circle.java
The command above creates a folder named docs and fills it with HTML files that contain your JavaDoc comments, formatted as a browsable website.

 

Help! Command not found on Windows:

If you run into this error:

javadoc : The term 'javadoc' is not recognized as the name of a cmdlet, function, script file, or operable program.

you will need to ensure your system knows where to find Java is installed in your machine.

On Windows, it’s usually:

C:\Program Files\Java\jdk-<version>

You want the path that contains folders like bin, lib, etc.

Use your File Explorer to locate it.

Once you've located it, scroll up to the top of this assignment page and expand the "Fixing JavaDoc on Windows" section of the Background.

Follow the steps and screenshots posted there. Relaunch VS Code and all terminal windows (including those in VS Code) to ensure these changes are in effect and verify Java was added to the PATH by running javadoc --version in your terminal.

 

To verify the generated documentation, open docs/index.html in a web browser and review the JavaDoc you created.

If you notice anything that needs fixing, update your JavaDoc comments and re-run the command to regenerate the documentation.

Now, save your changes using Git. Be sure to track both the Circle.java file and the generated documentation.

Once everything looks good, you're ready to show your work to the instructional team for review.

Modify the README file
Add the following details to your README file using Markdown language:

Your full name

Your UNC Charlotte's email address

Your UNC Charlotte's ID number

Your GitHub user name.

The name of this activity

An explanation of the RectangleTest.java program, in plain English. This should be a complete and detailed explanation of the code and what it does.

An explanation of the Circle.java program, in plain English. This should be a complete and detailed explanation of the code and what it does.

The URL for your private project in GitHub.

Deliverables
Download your complete project from GitHub and upload it here as a compressed (.zip) file. Your compressed file should contain the following:

README.md: Your README file, with the requested information in it.

RectangleTest.java: Your working rectangle program after you implemented and tested the requested modifications.

Circle.java: Your circle program.

docs/: The documentation that you created.
