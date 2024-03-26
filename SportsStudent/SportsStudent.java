import java.util.*;
import java.util.Scanner;
interface Student
{
int score = 10;
void displayScore();
}
interface Sports
{
int score =25;
void displaySportsScore();
}
class Result implements Student,Sports{
public void displayScore(){
System.out.println("Academic score   : " + Student.score);
}
public void displaySportsScore(){
System.out.println("Sports Score     : " + Sports.score);
}
}
class SportsStudent{
public static void main(String[] args)
{
Result r= new Result();
r.displayScore();
r.displaySportsScore();
}
}


