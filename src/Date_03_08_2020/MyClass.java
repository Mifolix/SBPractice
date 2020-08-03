package Date_03_08_2020;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
    private String name;
    private char mainChar;
    private int number;
    private int[] mainArray = new int[]{0, 0 ,0 ,0, 0};
    private Map<String,String> dict = new HashMap<String,String>();

    public void setName(String name){
        this.name = name;
    }

    public void setMainChar(char ch){
        this.mainChar = ch;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setMainArray(int[] mainArray) {
        this.mainArray = mainArray;
    }

    public void setDict(String key, String value) {
        dict.put(key, value);
    }

    public String getName(){
        return name;
    }

    public char getMainChar(){
        return mainChar;
    }

    public int getNumber(){
        return number;
    }

    public int[] getMainArray() {
        return mainArray;
    }

    public Map<String, String> getDict() {
        return dict;
    }

    public void fly(){
        System.out.println("Let's fly!");
    }
}
