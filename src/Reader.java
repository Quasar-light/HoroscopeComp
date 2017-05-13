import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Reader {
	public static void main(String[] args) throws Exception {

		StringBuilder a = new StringBuilder(" ");

		a.append("Guidance from the stars. ").append("Welcome!");
		System.out.println(a.toString());

		Scanner s = new Scanner(System.in);

		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
		 * System.out.println("Enter a date: (MM/dd)"); String input =
		 * s.nextLine().split("/");
		 */

		BufferedReader keyIn = new BufferedReader(new InputStreamReader(
				System.in));

		String zodiac = "";

		System.out.println("Month of Birth (M)");
		int month = Integer.parseInt(keyIn.readLine());
		System.out.println("Date of Birth (DD)");
		int day = Integer.parseInt(keyIn.readLine());

		switch (month) {

		case 1:
			if (day > 0 && day <= 20)
				zodiac = "Capricorn";
			else if (day > 20 && day < 32)
				zodiac = "Aquarius";
			else
				zodiac = "INVALID INPUT";
			break;

		case 2:
			if (day > 0 && day <= 19)
				zodiac = "Aquarius";
			else if (day > 19 && day < 30)
				zodiac = "Pisces";
			else
				zodiac = "INVALID INPUT";
			break;

		case 3:
			if (day > 0 && day <= 20)
				zodiac = "Pisces";
			else if (day > 20 && day < 32)
				zodiac = "Aries";
			else
				zodiac = "INVALID INPUT";
			break;
		case 4:
			if (day > 0 && day <= 20)
				zodiac = "Aries";
			else if (day > 20 && day < 31)
				zodiac = "Taurus";
			else
				zodiac = "INVALID INPUT";
			break;
		case 5:
			if (day > 0 && day <= 21)
				zodiac = "Taurus";
			else if (day > 21 && day < 32)
				zodiac = "Gemini";
			else
				zodiac = "INVALID INPUT";
			break;
		case 6:
			if (day > 0 && day <= 21)
				zodiac = "Gemini";
			else if (day > 21 && day < 31)
				zodiac = "cancer";
			else
				zodiac = "INVALID INPUT";
			break;
		case 7:
			if (day > 0 && day <= 22)
				zodiac = "Cancer";
			else if (day > 22 && day < 32)
				zodiac = "Leo";
			else
				zodiac = "INVALID INPUT";
			break;

		case 8:
			if (day > 0 && day <= 21)
				zodiac = "Leo";
			else if (day > 21 && day < 32)
				zodiac = "Virgo";
			else
				zodiac = "INVALID INPUT";
			break;

		case 9:
			if (day > 0 && day <= 23)
				zodiac = "Virgo";
			else if (day > 23 && day < 31)
				zodiac = "Libra";
			else
				zodiac = "INVALID INPUT";
			break;

		case 10:
			if (day > 0 && day <= 23)
				zodiac = "Libra";
			else if (day > 23 && day < 32)
				zodiac = "Scorpio";
			else
				zodiac = "INVALID INPUT";
			break;

		case 11:
			if (day > 0 && day <= 22)
				zodiac = "Scorpio";
			else if (day > 22 && day < 31)
				zodiac = "Sagittarius";
			else
				zodiac = "INVALID INPUT";
			break;
		case 12:
			if (day > 0 && day <= 22)
				zodiac = "Sagittarius";
			else if (day > 22 && day < 32)
				zodiac = "Capricorn";
			else
				zodiac = "INVALID INPUT";
			break;
		default:
			zodiac = "INVALID INPUT";

		}

		System.out.println(zodiac);

	}

}
