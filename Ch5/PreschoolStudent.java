//Dustin Peterson
//pg 190 09/17/2026

public class PreschoolStudent 
{
    int idNum;
    int age;
    public final int High_ID = 9999;
    public final int High_AGE = 6;
    public PreschoolStudent(int num, int studentAge)
    {
        setIdNum(num);
        setAge(studentAge);
    }

    public void setIdNum(int num)
    {
        if(num <= High_ID)
            idNum = num;
        else
            idNum = 0;
    }
    public void setAge(int studentAge)
    {
        if(studentAge <= High_AGE)
            age = studentAge;
        else
        {
            age = 0;
        }
    }
    public int getIdNum()
    {
        return idNum;
    }
    public int getAge()
    {
        return age;
    }
}
