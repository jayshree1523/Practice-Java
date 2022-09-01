public class Employee extends Person
{
  private double salary;
  private String position;
  public Employee (String Name, String Contact_no, double salary,
		   String position)
  {
    super (Name, Contact_no);
    this.salary = salary;
    this.position = position;
  }
  public double getSalary ()
  {
    return salary;
  }

  public String getPosition ()
  {
    return position;
  }
  @Override
  public String toString(){
      return "Customer [ Name = "+getName()+" Contact_no "+ getContact_no()+" Salary "+getSalary()+" position "+getPosition()+" ]";
  }

}
