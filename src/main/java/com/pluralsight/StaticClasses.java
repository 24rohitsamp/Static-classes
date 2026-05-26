package com.pluralsight;

public class StaticClasses {
    public static void main(String[] args) {

        String formattedName1 = NameFormatter.format("Dr.", "Zayn", "Specter", "DLo", "SR.");
        System.out.println(formattedName1);

        System.out.println(NameFormatter.format("Mel Johnson"));
        System.out.println(NameFormatter.format("Mel B Johnson, PhD"));
        System.out.println(NameFormatter.format("Dr. Mel B Johnson, PhD"));

        String formattedName3 = NameFormatter.format("Anthony", "Edwards");
        System.out.println(formattedName3);
    }
}