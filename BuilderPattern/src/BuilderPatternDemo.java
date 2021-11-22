public class BuilderPatternDemo {
    /**
     * The builder pattern is a design pattern that allows for the step-by-step
     * creation of complex objects using the correct sequence of actions.
     * The construction is controlled by a director object that only needs to know the type of object it is to create
     *
     * Builder patter is used for classes that have a lot of many member variables and allow us to build the object
     * only with desired properties
     *
     * Thread Save because we create immutable object
     */
    public static void main(String[] args) {
        // PersonBuilder instance
        Person.PersonBuilder builder = new Person.PersonBuilder();

        // builder builds the instance
        builder.name("Pesho")
                .surname("Bakalov")
                .id(666)
                .setOccupied(true);

        // Immutable Person object is initiated with build() method
        Person person = builder.build();

        System.out.println(person);
    }
}
