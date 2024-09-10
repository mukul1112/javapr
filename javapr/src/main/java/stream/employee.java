package stream;

public class employee {

    public String name;
    public  Integer age;
    public double salary;

    public  employee( String name,Integer age,Integer salary){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

