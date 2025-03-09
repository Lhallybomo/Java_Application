
package Chapter_10.Assignment;



public abstract class Employe {
   private final String name;
    private final String ssn; // Social Security Number

    public Employe(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public abstract double earnings(); // Abstract method

    @Override
    public String toString() {
        return String.format("Name: %s%nSSN: %s", name, ssn);
    }
}