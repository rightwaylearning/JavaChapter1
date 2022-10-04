package Akshay_OperationOnFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CreateFileAndFolderOnDiffLocation {

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\File IO");
		f.mkdir();
		System.out.println(f.exists());

		File f1 = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\File IO\\Akshay Resume.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println("====================================================================");

// Using FileWriter
		File f2 = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\File IO\\Akshay Resume");

		FileWriter fw = new FileWriter(f2);

		fw.write("          RESUME          \n\n\n");

		fw.write("* Personal Details\n\n");
		fw.write("A.Name = Akshay Vilas Tejale\n");
		fw.write("B.Date of Birth = 13-July-1994\n");
		fw.write("C.Blood Group = A+\n");
		fw.write("D.Languages Known = English, Marathi & Hindi\n");
		fw.write("-----------------------------------------------------------------\n\n");

		fw.write("* Contact Details\n\n");
		fw.write("A.Address = House No.3017, Dani Chawk, Motha Rajwada, Vadala Naka, Nashik - 422001\n");
		fw.write("B.Mobile no = 9673717091\n");
		fw.write("-----------------------------------------------------------------\n\n");

		fw.write("* Educational Details\n\n");
		fw.write("A. Master of Business Administration [MBA] in Finance in 2018\n");
		fw.write("B. Batchlor of Commerce in Banking in 2015/n");
		fw.write("C. HSC in 2011/n");
		fw.write("D. SSC in 2009\n");
		fw.write("-----------------------------------------------------------------\n\n");

		fw.write("* Computer Awareness\n\n");
		fw.write("A. MS-CIT\n");
		fw.write("B. English Typing 30/wpm & 40/wpm\n");
		fw.write("C. Marathi Typing 30/wpm & 40/wpm\n");
		fw.write("D. Hindi Typing 30/wpm\n");
		fw.write("-----------------------------------------------------------------\n\n");

		fw.write("* Work Experience\n\n");
		fw.write("A. Dr. Torne ENT Hospital at Nashik. - Position held: Receiptionist & Supervisor in 1 year\n");
		fw.write("B. Sarda farm (Camel House)- Position held: Admin executive from 8 years.\n");
		fw.write("-----------------------------------------------------------------\n\n");

		fw.write("* My Principles:\n\n");
		fw.write("Respect, Responsibility, Coordination & Honesty...\n");
		fw.write("-----------------------------------------------------------------\n\n");

		fw.write("* Declaration\n\n");
		fw.write("I the undersigned declare that, the information furnished above is correct to the best of my\n");
		fw.write("knowledge, and if found false I will be ready to withdraw my application from the specified\n");
		fw.write("intention...\n\n");
		fw.write("Date: / / 2022\n\n");
		fw.write("Place: Nashik\n\n\n");
		fw.write("Yours faithfully\n\n");
		fw.write("(Akshay Tejale\n\n");
		fw.write("====================================================================");

		fw.flush();
		fw.close();

// BufferedWriter

		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

		bw.write("          RESUME          \n\n\n");

		bw.write("* Personal Details\n\n");
		bw.write("A.Name = Akshay Vilas Tejale\n");
		bw.write("B.Date of Birth = 13-July-1994\n");
		bw.write("C.Blood Group = A+\n");
		bw.write("D.Languages Known = English, Marathi & Hindi\n");
		bw.write("-----------------------------------------------------------------\n\n");

		bw.write("* Contact Details\n\n");
		bw.write("A.Address = House No.3017, Dani Chawk, Motha Rajwada, Vadala Naka, Nashik - 422001\n");
		bw.write("B.Mobile no = 9673717091\n");
		bw.write("-----------------------------------------------------------------\n\n");

		bw.write("* Educational Details\n\n");
		bw.write("A. Master of Business Administration [MBA] in Finance in 2018\n");
		bw.write("B. Batchlor of Commerce in Banking in 2015\n");
		bw.write("C. HSC in 2011\n");
		bw.write("D. SSC in 2009\n");
		bw.write("-----------------------------------------------------------------\n\n");

		bw.write("* Computer Awareness\n\n");
		bw.write("A. MS-CIT\n");
		bw.write("B. English Typing 30/wpm & 40/wpm\n");
		bw.write("C. Marathi Typing 30/wpm & 40/wpm\n");
		bw.write("D. Hindi Typing 30/wpm\n");
		bw.write("-----------------------------------------------------------------\n\n");

		bw.write("* Work Experience\n\n");
		bw.write("A. Dr. Torne ENT Hospital at Nashik. - Position held: Receiptionist & Supervisor in 1 year\n");
		bw.write("B. Sarda farm (Camel House)- Position held: Admin executive from 8 years.\n");
		bw.write("-----------------------------------------------------------------\n\n");

		bw.write("* My Principles:\n\n");
		bw.write("Respect, Responsibility, Coordination & Honesty...\n");
		bw.write("-----------------------------------------------------------------\n\n");

		bw.write("* Declaration\n\n");
		bw.write("I the undersigned declare that, the information furnished above is \n");
		bw.write("correct to the best of my knowledge, and if found false I will be \n");
		bw.write("ready to withdraw my application from the specified intention...\n\n");
		bw.write("Date: / / 2022                                  Yours faithfully\n\n");
		bw.write("Place: Nashik                                   Akshay Tejale\n\n");
		bw.write("====================================================================");

		bw.flush();
		bw.close();

// Using File Reader
		
//		FileReader fr = new FileReader (f2);
//		
//		int i = fr.read();
//		
//		while (i != -1) {
//			
//			System.out.println(i);
//			i = fr.read();
//		}
//		
//		fr.close();
//	}

		BufferedReader ak = new BufferedReader(new FileReader(f2));

		String line = ak.readLine();

		while (line != null) {
			System.out.println(line);
			line = ak.readLine();
		}

		ak.close();

	}
}

// We have created new folder in desktop and created in that a txt file through the coding.
// We have used File Writer & Buffer Writer method.
// But Writer & Buffer writer almost same.
// We can't use File writer & Buffer writer in same class or in main method only last writers in coding will work only.
// Need to focus on File Reader method.
