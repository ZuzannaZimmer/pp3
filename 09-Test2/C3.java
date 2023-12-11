
public class C3 {
    private Person[] members;

    public C3(Person[] members) {
        this.members = members;
    }

    public int adults() {
        int sum = 0;

        for (Person person : members) {
            if (person.getAge() >= 18) {
                sum++;
            }
        }
        return sum;

    }
}
