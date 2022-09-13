package hashMapTejas;

class StudentData
{
    private String name;
    private int age;
      
    StudentData(String name, int age)
    {
    this.name=name;
    this.age=age;
    }
   
      
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	


	@Override
    public boolean equals(Object o)
    {
        StudentData s;
        if(!(o instanceof StudentData))
        {
            return false;
        }
          
        else
        {
            s=(StudentData)o;
            if(this.name.equals(s.getName()) && this.age== s.getAge())
            {
                return true;
            }
        }
        return false;
    }
}


