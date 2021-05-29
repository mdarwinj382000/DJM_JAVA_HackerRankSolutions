package labs.djm.hackerrank;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collections;

class Stud {
    void getName() {
    }

    void putName() {
    }

    void zapphone() {
    }

    void swipeNumber() {
    }
}

class Reflection {
    public static void main(String[] args) {
        Class<Stud> student = Stud.class;
        Method[] methods = student.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<>();
        for (Method temp : methods) {
            methodList.add(temp.getName());
        }
        Collections.sort(methodList);
        for (String temp : methodList) {
            System.out.println(temp);
        }

    }
}
