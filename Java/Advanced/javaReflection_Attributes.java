/*
problem : https://www.hackerrank.com/challenges/java-reflection-attributes
*/

public class javaReflection_Attributes {

        public static void main(String[] args){
            //Student obj = new Student;
            Class student = new Student().getClass();
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method method:methods){
                methodList.add(method.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
