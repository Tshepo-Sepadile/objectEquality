package ac.za.cput;

public class Person {

    String name;

    public Person(String name)
    {
        this.name = name;
    }

    public boolean equals(Person p)
    {
        return (p.name == name);
    }
}
