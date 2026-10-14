import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random r;
    private int Dice;
    private ArrayList<String> responses;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        r = new Random();
        responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
    }

    public void printOneRandom()
    {
        System.out.println(r.nextInt(100));
    }
    
    public void printMultiRandom(int howMany){
        int i = 0;
        while (i<howMany){
            System.out.println(r.nextInt(100));
            i++;            
        }
    }
    
    public int throwDice(){
        return r.nextInt(6) + 1;
    }
    public String getResponse(){
        int index = r.nextInt(responses.size());
        return responses.get(index);
    }
    
    public int getUpToMax(int min, int max){
        return r.nextInt(max)+1;
    }
}