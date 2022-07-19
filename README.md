# TestVagrant

Project name: Sample

How to run the project

Clone it to local - git clone  and

Navigate to that folder

Now there are two ways to run the project

1) First- running file

navigate to directory from command prompt

execute below command

  mvn clean install 
this will execute the code

2) Sencond way - Directly running from the testng.xml 
Open the project in IntelliJ Idea or eclipse
And run the testng.xml file inside src/test/resources folder

3) Third way: Running from Jenkins
create a new pipeline for Maven project
mention the git hub repository link
enter pom.xml  file 
enter the command mvn clean install
then Build Now


Output: 

1) First Test case @Test : Test that validates that the team has only 4 foreign players

Output: 
Total no of players :11
Total no of Foreign Players :4
Validated :Team  has only 4 foreign players


2) Second Test case : Test that valdiates that there is atleast one wicket keeper

output:
Total no of wicket-Keepers :1
Validated :Team  has atleast one wicket keeper




