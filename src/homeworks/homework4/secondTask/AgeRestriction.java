package homeworks.homework4.secondTask;

public enum AgeRestriction {
    NONE (0),
    TEENAGER (18),
    ADULT (21);

    private int age;

    AgeRestriction(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
