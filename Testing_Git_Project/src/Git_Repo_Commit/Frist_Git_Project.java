package Git_Repo_Commit;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.comparator.LastModifiedFileComparator;

public class Frist_Git_Project {

	public static void main(String[] args) {
		File dir = new File("/home/pankaj/workSpace/BOAutomation/Download Reports/CSV");
		
		File[] files = dir.listFiles();

		System.out.println("Sort files in ascending order base on last modification date");

		Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_COMPARATOR);
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			System.out.printf("File: %s - " + new Date(file.lastModified()) + "\n", file.getName());
		}

		System.out.println("\nSort files in descending order base on last modification date");

		Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
		System.out.println(files[0].getName().split("[.]")[1]+"  formate");
		
		try {
		    boolean deleted = dir.delete();
		    if (files[0].delete()) {
		        System.out.println("Directory removed.");
		    } else {
		        System.out.println("Directory could not be removed");
		    }
		} catch (SecurityException ex) {
		    System.out.println("Delete is denied.");
		}

		
	
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			System.out.printf("File: %s - " + new Date(file.lastModified()) + "\n", file.getName());
		}
	}

}
