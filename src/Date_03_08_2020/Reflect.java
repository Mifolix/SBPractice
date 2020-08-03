package Date_03_08_2020;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Reflect {
    public static void main(String[] args) throws Exception{
        MyClass myClass1 = new MyClass();
        int[] array = new int[] {1, 2 ,3 ,4 ,5};
        myClass1.setName("Name");
        myClass1.setNumber(12345);
        myClass1.setMainChar('A');
        myClass1.setDict("A", "B");
        myClass1.setDict("C", "D");
        myClass1.setDict("E", "F");
        showMethods(myClass1);
        isFly(myClass1);
        int number = copyForName(myClass1, "number");
        System.out.println(number);
        String name = copyForName(myClass1, "name");
        System.out.println(name);
        array = copyForName(myClass1, "mainArray");
        System.out.println(Arrays.toString(array));
        Map<String,String> dictionary = new HashMap<String,String>();
        dictionary = copyForName(myClass1, "dict");
        System.out.println(dictionary.toString());
    }

    public static void showMethods(Object object) throws Exception{
        Method[] methods = object.getClass().getDeclaredMethods();
        for (Method method: methods) {
            method.setAccessible(true);
            System.out.print(method.getName() + " ");
        }
        System.out.println();
    }

    public static void isFly(Object object) throws Exception{
        Method[] methods = object.getClass().getDeclaredMethods();
        for (Method method: methods) {
            method.setAccessible(true);
            if(method.getName() == "fly"){
                method.invoke(object);
            }
        }
    }

    public static <T> T copyForName(Object object,String nameField) throws Exception{
        T content = null;
        Field field = object.getClass().getDeclaredField(nameField);
        field.setAccessible(true);
        content = (T) field.get(object);
        return content;
    }
}


