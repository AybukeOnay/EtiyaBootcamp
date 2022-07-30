public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"Aybuke","Onay","00123");
        Customer customer2 = customer1;

        Person person1 = customer2;
        Person person2 = new Employee();

        PersonDal personDal = new PersonDal();
        personDal.add(new Customer(1,"Nalan","Onay","54345"));
    }
}
