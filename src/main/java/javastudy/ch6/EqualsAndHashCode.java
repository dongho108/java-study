package javastudy.ch6;

import java.util.HashMap;
import java.util.HashSet;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        Person person = (Person) obj;

        if (this.name == null && person.name != null) {
            return false;
        }

        if (this.age == person.age && this.name.equals(person.name)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((name == null) ? 0 : name.hashCode());
        hashCode = prime * hashCode + age;

        return hashCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class EqualsAndHashCode {
    public static void main(String[] args) {
        Person p1 = new Person("동호", 25);
        Person p2 = new Person("동호", 25);

        HashMap<Person, Integer> map = new HashMap<>();

        map.put(p1, 1);
        map.put(p2, 2);

        System.out.println("map.size = " + map.size());

        HashSet set = new HashSet();
        set.add(p1);
        set.add(p2);

        System.out.println("set.size = " + set.size());

    }
}
