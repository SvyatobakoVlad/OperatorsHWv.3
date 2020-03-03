package com.itbulls.learnit.HomeWork7.svyatobatko;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.*;

public class FindFiles {


	Path start = Paths.get("C:\\Program Files\\Sourse");
	int maxDepth = 5;
	try (Stream<Path> stream = Files.find(start, maxDepth, (path, attr) ->
	        String.valueOf(path).endsWith(".java"))) {
	    String joined = stream
	        .sorted()
	        .map(String::valueOf)
	        .collect(Collectors.joining("; "));
	    System.out.println("Found: " + joined);
	}
	
}
