package org.example.selenide.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
String firstName;
String lastName;
String userEmail;
String gender;
String mobileNumber;
String dataOfBirth;
String currentAddress;
String uploadPicture;

//    public static boolean main(String[] args) {
//        String a = "kot";
//        String b = "tok";
//        a.toLowerCase();
//        b.toLowerCase();
//        a.trim();
//        b.trim();
//
//        if (a.length()!=b.length()){
//            return false;
//        }
//        else {
//            char [] aa = a.toCharArray();
//            char [] bb = b.toCharArray();
//
//            Arrays.sort(aa);
//            Arrays.sort(bb);
//
//            return Arrays.equals(aa,bb);
//        }
//
//        String str = "()sdf";
//
//        }
//        public static boolean xxx(String str){
//        Stack <Character> stack = new Stack<>();
//
//        for(char c: str.toCharArray()){
//            if(c=='('){
//                stack.push(c);
//            } else if(c ==')'){
//                if(stack.isEmpty()){
//                    return false;
//                } stack.pop();
//            }
//        } return stack.isEmpty();
//
//
//    }

}
