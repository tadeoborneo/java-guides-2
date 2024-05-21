package guide6;

import guide6.Models.Password;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainGuide6 {
    public static void main(String[] args) {

        List<Password> passwordList = new ArrayList<>();
        List<Boolean> strongPassword = new ArrayList<>();
        Map<Integer, Password> passwordMap = new HashMap<>();

        //Create ten passwords in the array and add each one to a hashmap
        for (int i = 0; i < 10; i++) {
            passwordList.add(new Password(8 + (int) (Math.random() * 42))); //Create a password with a length between 8 and 12 characters
            Password actualPassword = passwordList.get(i);
            passwordMap.put(actualPassword.hashCode(), actualPassword);

            if(actualPassword.isStrong())
                strongPassword.add(true);
            else
                strongPassword.add(false);

            System.out.println(actualPassword + " is strong = " + strongPassword.get(i));
        }
    }
}