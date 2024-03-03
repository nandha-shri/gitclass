import java.util.*;
class Fizzbizz
{
	string s= "";
	int t=0, f=0;
	for (int i=0;i<=50;i++)
	{
		t++;
		f++;
		if(t == 3)
		{
			s += "fizz";
			t = 0;
		}
		if(f == 5)
		{
			s+="buzz";
			f = 0;
		}
		
	}
}