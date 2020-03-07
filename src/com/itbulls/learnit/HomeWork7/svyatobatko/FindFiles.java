package com.itbulls.learnit.HomeWork7.svyatobatko;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FindFiles {
	
	
	public static void main(String[] args) throws IOException {

		
		Path start = Paths.get("E:\\SourseIT2020");
		int maxDepth = 5;
	
		try  (Stream<Path> stream = Files.find(start, maxDepth,
				(path, attr) -> String.valueOf(path).endsWith(".java"))) {
			String joined = stream.sorted().map(String::valueOf).collect(Collectors.joining("; " + "\n"));
			System.out.println("Found: " + joined );
			

			
			String s1 = joined.replace("."," ").replace("!"," ").replace("?", " ").toLowerCase();
			String[]sArr=s1.split(" ");
			String words = "java";
			int count = 0;
			for(int i=0;i<sArr.length;i++) {
				if(words.equalsIgnoreCase(sArr[i]))
					count++;
			}
			System.out.println(count);
		}
		
		
	}
}
