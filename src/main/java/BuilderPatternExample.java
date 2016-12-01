/**
 * Created by eishkinina on 14.11.16.
 */
public class BuilderPatternExample {
    public static void main(String[] args) {
        Body man = Body.newBuilder("John")
                .withAge(10)
                .withLastName("Doe")
                .build();
        System.out.println(man);

        Body woman = Body.newBuilder("Jane").withNationality("Indian").withLastName("Doe").withSex(Sex.F).build();
        System.out.println(woman);

        Body JonSnow = Body.newBuilder("Jon").withAge(30).withLastName("Snow").withSex(Sex.M)
                .withNationality("North guy").build();

        System.out.println(JonSnow);
    }
}

enum Sex {
    M, F;
}

class Body {
    // optional fields
    private final String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private Sex sex;

    private Body(Builder b) {
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.age = b.age;
        this.nationality = b.nationality;
        this.sex = b.sex;
    } // нужен, чтобы единственным способом создать объект был один способ- через билдер

    static Builder newBuilder(String name) {
        return new Builder(name);
    }

    static class Builder {
        private Sex sex;
        private String nationality;
        private int age;
        private String lastName;
        private final String firstName;

        public Builder(String firstName) {
            this.firstName = firstName;
        }

        public Builder withNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder withSex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Body build() { //
            return new Body(this);
        }
    }

    @Override
    public String toString() {
        return "Body [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", nationality="
                + nationality + ", sex=" + sex + "]";
    }

}
