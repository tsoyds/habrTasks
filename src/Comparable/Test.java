package Comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<Person>();
        Set<Person> peopleSet = new TreeSet<Person>();
        addElements(peopleList);
        addElements(peopleSet);

        Person person1 = new Person(3,"Mike");
        Person person2 = new Person(4, "Mico");
        Person person3 = new Person(1, "Thiko");
        Queue<Person> people = new LinkedList<Person>();
        people.add(person2);
        people.add(person3);
        people.add(person1);
        // person2 -> person3 -> person1

        for(Person person: people)
            System.out.println(person);

        Collections.sort(peopleList); // сортируем peopleList

        //System.out.println(peopleList);
        //System.out.println(peopleSet); // TreeSet не требует сортировки, т.к. в этой коллекции
        //автоматически идет сортировка

    }

    private static void addElements(Collection collection){ // новые объекты класса Person
        collection.add(new Person(3, "Katty"));
        collection.add(new Person(2, "Jim"));
        collection.add(new Person(5, "Andrew"));
        collection.add(new Person(7, "Fuse"));
        collection.add(new Person(1, "Olga"));
    }
}

class Person implements Comparable<Person>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person o) { // переписываем метод compare,
        // сортировка будет идти по id, реализация ниже
        if (this.id>o.getId()){
            return 1;
        } else if(this.id < o.getId()){
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
