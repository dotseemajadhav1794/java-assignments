//create one customised exception for employee class 
//showing employee age should be more than 14 years

// Customized exception for employee age validation
class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
	{
        super(message);
    }
}

// Employee class with age validation
class Employee 
{
    private String name;
    private int age;

    public Employee(String name, int age) throws InvalidAgeException 
	{
        if (age <= 14) 
			{
				throw new InvalidAgeException("Employee age should be more than 14 years.");
			}
        this.name = name;
        this.age = age;
    }

    public String getName() 
	{
        return name;
    }

    public int getAge() 
	{
        return age;
    }
}

// Main class to demonstrate the usage
public class EmployeeTest 
{
    public static void main(String[] args) 
	{
        try 
		{
            // Creating an employee with age less than 14 (which should throw an exception)
            Employee invalidEmployee = new Employee("John", 12);
            System.out.println("INVALID EMPLOYE CREATED : " + invalidEmployee.getName() + ", Age: " + invalidEmployee.getAge());
        } 
		catch (InvalidAgeException e) 
		{
            System.out.println("INVALID INPUT : INVALID EMPLOYE CREATED : " + e.getMessage());
        }

        try 
		{
            // Creating a valid employee with age more than 14
            Employee validEmployee = new Employee("Alice", 25);
            System.out.println("VALID EMPLOYEE CREATED : " + validEmployee.getName() + ", Age: " + validEmployee.getAge());
        } 
		catch (InvalidAgeException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
    }
}
