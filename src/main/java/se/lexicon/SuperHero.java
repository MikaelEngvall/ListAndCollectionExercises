package se.lexicon;

class SuperHero implements Comparable<SuperHero> {
    private int id;
    private String name;
    private int age;

    public SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(SuperHero other) {
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return "SuperHero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}