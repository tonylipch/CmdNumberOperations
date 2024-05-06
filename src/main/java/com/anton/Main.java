package com.anton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
           System.out.println("Instructions");
           return;
        }
        String fileNameOrItemsNumber = args[0];

        List<Integer> items = null;

        if (StringUtils.isNumeric(fileNameOrItemsNumber)) {
           items = readItemsFromConsole (Integer.parseInt(fileNameOrItemsNumber));
        } else {
            items = readItemsFromFile (fileNameOrItemsNumber);
        }
        if (items == null) {
            System.out.println("Couldn't read items");
            return;
        }
        //Result output
        List<Integer> result = processNumbers(items);
        System.out.println(result);
    }

  public static List<Integer> readItemsFromFile(String fileName) {

       if (!new File(fileName).isFile()) {
            System.out.println(String.format("Wrong file '%s'", fileName));
            return null;
       }

       List<Integer> result = new ArrayList<Integer>();

        try (Scanner scanner= new Scanner( new File(fileName))){
            while (scanner.hasNext()) {
                try {
                    if (scanner.hasNextInt()) {
                        result.add(scanner.nextInt());
                    } else {
                        scanner.next(); // continue
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid data in file. Please ensure all data is integers.");
                    return  null;
                }
            }

        }catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
       return result;
    }


   public static List<Integer> readItemsFromConsole(int numberOfItems) {
       List<Integer> result = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

      for(int i = 0 ; i<numberOfItems; i++){
          try {
              result.add(scanner.nextInt());
          } catch (InputMismatchException e) {
              System.out.println("Error: Invalid input. Please enter an integer.");
              scanner.next(); // clear the input buffer
              i--; // retry input for the same element
          }
        }
        return result;
    }

 public   static List<Integer> processNumbers(List<Integer> numbers){
        List<Integer> result = new ArrayList<>();

        int count = numbers.size();

        for (Integer number : numbers){

            if(number%2==0 && count%2==0){
                result.add(number);
            } else if (number%2!=0 && count%2!=0) {
                result.add(number);
            }

        }
        return result;
    }
}
