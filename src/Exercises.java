
public class Exercises {
	public static int digitSwapper(int input)
	{// 123
		
		//int a = input/100*100;  //100
		//System.out.println(a);
		//int b = input%10*10;    //30
		//System.out.println(b);
		//int c = input%100/10;    //  23/10 = 2
		//System.out.println(c);
		
		//int d = input/10%10;  //  2
		
		int output = (input/100*100) + (input%10)*10 + (input%100)/10;
		return output;
	}
	
	public static int dayOfWeek(int daysOfWeek1, int day)
	{
		
		return (day -1 + daysOfWeek1)%7;
		//return (day%7+daysOfWeek1)%7;
		//return day%7 + daysOfWeek1 -1;
		//return (day -(8-daysOfWeek1)+7)%7;
		//return (daysOfWeek1 +(day%7) +6)%7;

		return b;


	}
	
	public static void timeLeft(int currHour, int currMin, int depHour, int depMin)
	{
		int minLeft = (depHour - currHour)*60 + (depMin-currMin);
		System.out.println(minLeft/60 + " Hours and " + minLeft%60 + " minutes.");;
		
//		int minLeft = ((depMin-currMin)+60)%60;
//		int hourLeft = (((((depHour-currHour)+12)*60-minLeft)/60)%60)%12;
//		System.out.println(hourLeft + " " + minLeft);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 123;
		int output = digitSwapper(input);
		System.out.println(input +" " + output);
		
		input = 6;
		output = digitSwapper(input);
		System.out.println(input +" " + output);
		
		input = 381;
		output = digitSwapper(input);
		System.out.println(input +" " + output);
		
		System.out.println(dayOfWeek(0,1));
		System.out.println(dayOfWeek(0,14));
		System.out.println(dayOfWeek(6, 22));
		System.out.println(dayOfWeek(5, 4));
		System.out.println(dayOfWeek(1,24));
		System.out.println(dayOfWeek(2,1));
		
		
		timeLeft(1,34, 8, 20);
		timeLeft(1,15, 4, 36);
		


	}

}
/*
 * 
 * 370250 370205
6 60
381 318
0
6
6
1
3
2
6 Hours and 46 minutes.
3 Hours and 21 minutes.
*/
