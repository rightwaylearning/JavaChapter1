package Damini_ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class StorageProfile {

	static List<Profile> list=new ArrayList();
	void saveprofile(Profile p)
	{
		try {
			if(p.age<18)
			{
				throw new Agelimitexception();
			}
			else
			{
				list.add(p);
			}
		}catch(Agelimitexception e)
		{
			System.out.println(e);
		}
		
	}
	}


