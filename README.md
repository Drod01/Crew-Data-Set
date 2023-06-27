# Crew-Data-Set

## Getting Started

To get started with the Crew-Data-Set project, you can follow the instructions below.

## Description

The Crew-Data-Set project is a Java application that manages a fleet of starships and their crew members. It provides classes for representing crew members, starships, and fleets. The application allows loading starship data from files and displaying information about the fleet and its members.

## Usage

To use the Crew-Data-Set application, you can follow these steps:

1. Compile the Java classes using a Java compiler.
2. Run the `Lab2` class as the entry point of the application.
3. The application will load starship data from the "data" directory.
4. The loaded fleet and its starships will be displayed in the console.

## Example

Here's an example of how to use the Crew-Data-Set application:

```java
Fleet unitedFederation = new Fleet("United Federation of Planets");

try {
    unitedFederation.loadStarships("data");
} catch (Exception e) {
    e.printStackTrace();
}

System.out.println(unitedFederation);
    }    
}



