package cz.malanius.udesee.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CleanerTest {

    @Test
    void cleanText() {
        String input = "Section: 1\n" +
                "1 / 1\n" +
                "Introduction\n" +
                "1. Getting Started With This Course\n" +
                "7:58\n" +
                "Section: 2\n" +
                "10 / 10\n" +
                "Setup\n" +
                "2. Which version of Java should you use?\n" +
                "5:16\n" +
                "3. Install JDK 10 on Windows\n" +
                "4:48\n" +
                " Oracle Java Site\n" +
                "4. Install and Configure Intellij on Windows\n" +
                "9:53\n" +
                " Jetbrains site\n" +
                "5. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "0:00\n" +
                "6. Install JDK 10 on a Mac\n" +
                "2:19\n" +
                " Oracle Java Site\n" +
                "7. Install and Configure Intellij on a Mac\n" +
                "9:40\n" +
                " Jetbrains site\n" +
                "8. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "0:00\n" +
                "9. Install JDK 10 on Linux\n" +
                "4:36\n" +
                " Oracle Java Site\n" +
                " Additional Linux JDK Notes\n" +
                "10. Install and Configure Intellij on Linux\n" +
                "9:39\n" +
                " Jetbrains site\n" +
                "11. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "0:00\n" +
                "Section: 3\n" +
                "3 / 3\n" +
                "First Steps\n" +
                "12. Introduction\n" +
                "0:37\n" +
                "13. Creating Your First Java Project\n" +
                "12:10\n" +
                " Source Code - First Steps - Creating Your First Java Project\n" +
                "14. Exploring The IntelliJ Interface\n" +
                "7:24\n" +
                "Section: 4\n" +
                "8 / 8\n" +
                "Variables, Datatypes and Operators\n" +
                "15. Introduction\n" +
                "0:27\n" +
                "16. What Are Variables?\n" +
                "15:13\n" +
                " Source Code - Variables, Datatypes and Operators - What Are Variables\n" +
                "17. Getting To Know Primitive Data Types - The Byte, Short, Int And Long\n" +
                "18:45\n" +
                " Source Code - Variables, Datatypes and Operators - Getting To Know Primitive Data Types - The Byte, Short, Int And Long\n" +
                "18. Getting To Know Primitive Data Types - Float And Double\n" +
                "12:57\n" +
                " Source Code - Variables, Datatypes and Operators - Getting To Know Primitive Data Types - Float And Double\n" +
                "19. Getting To Know Primitive Data Types - Char And Boolean\n" +
                "7:22\n" +
                " Unicode Table website\n" +
                " Source Code - Variables, Datatypes and Operators - Getting To Know Primitive Data Types - Char And Boolean\n" +
                "20. Understanding Strings And Finishing Up Primitive Data Types\n" +
                "11:56\n" +
                " Source Code - Variables, Datatypes and Operators - Understanding Strings And Finishing Up Primitive Data Types\n" +
                "21. Operators In Java\n" +
                "16:12\n" +
                " Source Code - Variables, Datatypes and Operators - Operators In Java\n" +
                "22. More On Operators And Operator Precedence\n" +
                "19:22\n" +
                " Summary of Operators\n" +
                " Java Operator Precedence Table\n" +
                " Source Code - Variables, Datatypes and Operators - More On Operators And Operator Precedence\n" +
                "Section: 5\n" +
                "20 / 20\n" +
                "Java Tutorial: Expressions, Statements, Code blocks, Methods and more\n" +
                "23. Introduction\n" +
                "0:31\n" +
                "24. Keywords And Expressions\n" +
                "7:18\n" +
                " List of Java Keywords\n" +
                " Source Code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Keywords And Expressions\n" +
                "25. Statements, Whitespace and Indentation (Code Organization)\n" +
                "9:24\n" +
                " Source Code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Statements, Whitespace and Intentation (Code Organization)\n" +
                "26. Code Blocks And The If Then Else Control Statements\n" +
                "17:08\n" +
                " Source Code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Code Blocks And The If Then Else Control Statements\n" +
                "27. if then else Recap\n" +
                "4:19\n" +
                "28. Methods In Java\n" +
                "18:01\n" +
                " Source Code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Methods In Java\n" +
                "29. More On Methods And A Challenge\n" +
                "15:34\n" +
                " lecture-28-challenge.txt\n" +
                " Source Code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - More On Methods And A Challenge\n" +
                "30. Method Challenge - Final Code Changes\n" +
                "7:27\n" +
                " Source code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Method Challenge - Final Changes to Code\u200B\n" +
                "31. DiffMerge Tool Introduction\n" +
                "1:54\n" +
                "32. Install DiffMerge\n" +
                "2:01\n" +
                " Download DiffMerge\n" +
                "33. Using DiffMerge\n" +
                "17:29\n" +
                " Original Source code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Using DiffMerge\u200B\n" +
                "34. Coding Exercises\n" +
                "13:24\n" +
                "Coding Exercise 1: MegaBytes Converter\n" +
                "0:00\n" +
                "Coding Exercise 2: Barking Dog\n" +
                "0:00\n" +
                "Coding Exercise 3: Leap Year Calculator\n" +
                "0:00\n" +
                "35. Method Overloading\n" +
                "27:01\n" +
                " Feet to Centimeters\n" +
                " Source Code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Method Overloading\n" +
                "36. Method Overloading Recap\n" +
                "3:38\n" +
                "37. Seconds and Minutes Challenge\n" +
                "13:49\n" +
                " Challenge Text - Seconds and Minutes Challenge\n" +
                " Source code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Seconds and Minutes Challenge\u200B\n" +
                "38. Bonus Challenge Solution\n" +
                "11:12\n" +
                " Source code - Java Tutorial Expressions, Statements, Code blocks, Methods and more - Bonus Challenge Solution\u200B\n" +
                "Coding Exercise 4: Area Calculator\n" +
                "0:00\n" +
                "Section: 6\n" +
                "15 / 15\n" +
                "Control Flow Statements\n" +
                "39. Introduction\n" +
                "0:38\n" +
                "40. The switch statement (+Challenge Exercise)\n" +
                "19:32\n" +
                " lecture-31-challenge.txt\n" +
                " Source Code - Control Flow Statements - The switch statement (plus Challenge Exercise)\n" +
                "41. Day of the Week Challenge\n" +
                "10:47\n" +
                " Challenge Text - Day of the Week Challenge\n" +
                "Coding Exercise 5: Number In Word\n" +
                "0:00\n" +
                "Coding Exercise 6: Number Of Days In Month\n" +
                "0:00\n" +
                "42. The for Statement (+Challenge Exercise)\n" +
                "25:02\n" +
                " The First 1,000 Primes\n" +
                " lecture-32-challenge.txt\n" +
                " Source Code - Control Flow Statements - The for Statement (plus Challenge Exercise)\n" +
                "43. For Loop Recap\n" +
                "7:59\n" +
                "44. Sum 3 and 5 Challenge\n" +
                "6:13\n" +
                " Challenge Text - Sum 3 and 5 Challenge\n" +
                "Coding Exercise 7: Sum Odd\n" +
                "0:00\n" +
                "45. The while and do while statements (+Challenge Exercise)\n" +
                "24:21\n" +
                " lecture-33-challenge.txt\n" +
                " Source Code - Control Flow Statements - The while and do while statements (+Challenge Exercise)\n" +
                "46. While and Do While Recap\n" +
                "7:58\n" +
                "47. Digit Sum Challenge\n" +
                "10:30\n" +
                " Challenge Text - Digit Sum Challenge\n" +
                "Coding Exercise 8: Number Palindrome\n" +
                "0:00\n" +
                "Coding Exercise 9: First And Last Digit Sum\n" +
                "0:00\n" +
                "Coding Exercise 10: Number To Words\n" +
                "0:00\n" +
                "Section: 7\n" +
                "12 / 12\n" +
                "OOP Part 1 - Classes, Constructors and Inheritance\n" +
                "48. Introduction\n" +
                "0:36\n" +
                "49. Classes Part 1\n" +
                "16:31\n" +
                " Source Code - OOP Part 1 - Classes Part 1\n" +
                "50. Classes Part 2\n" +
                "13:27\n" +
                " Source Code - OOP Part 1 - Classes Part 2\n" +
                "51. Constructors - Part 1 (+Challenge Exercise)\n" +
                "20:10\n" +
                " lecture-37-challenge.txt\n" +
                " Source Code - OOP Part 1 - Constructors - Part 1 (plus Challenge Exercise)\n" +
                "52. Constructors - Part 2 (+Challenge Exercise)\n" +
                "16:00\n" +
                " Withdrawal-method-bug-fix.zip\n" +
                " lecture-38-challenge.txt\n" +
                " Source Code - OOP Part 1 - Constructors - Part 2 (plus Challenge Exercise)\n" +
                "53. Inheritance - Part 1\n" +
                "19:39\n" +
                " Source Code - OOP Part 1 - Inheritance - Part 1\n" +
                "54. Inheritance - Part 2\n" +
                "13:24\n" +
                " Source Code - OOP Part 1 - Inheritance - Part 2\n" +
                "55. Reference vs Object vs Instance vs Class\n" +
                "6:52\n" +
                "56. this vs super\n" +
                "6:52\n" +
                "57. Method Overloading vs Overriding Recap\n" +
                "7:32\n" +
                "58. Inheritance Challenge Part 1 (+Challenge Exercise)\n" +
                "16:38\n" +
                " lecture-41-challenge.txt\n" +
                " Source Code - OOP Part 1 - Inheritance Challenge Part 1 (plus Challenge Exercise)\n" +
                "59. Inheritance Challenge Part 2\n" +
                "10:04\n" +
                " Source Code - OOP Part 1 - Inheritance Challenge Part 2\n" +
                "Section: 8\n" +
                "9 / 9\n" +
                "OOP Part 2 - Composition, Encapsulation, and Polymorphism\n" +
                "60. Introduction\n" +
                "0:37\n" +
                "61. Composition\n" +
                "17:19\n" +
                " Source Code - OOP Part 2 - Composition\n" +
                "62. Composition Part 2 (+Challenge Exercise)\n" +
                "14:17\n" +
                " lecture-45-challenge.txt\n" +
                " Source Code - OOP Part 2 - Composition Part 2 (plus Challenge Exercise)\n" +
                "63. Encapsulation\n" +
                "19:23\n" +
                " Source Code - OOP Part 2 - Encapsulation\n" +
                "64. Encapsulation (+Challenge Exercise)\n" +
                "15:15\n" +
                " lecture-47-challenge.txt\n" +
                " Source Code - OOP Part 2 - Encapsulation (plus Challenge Exercise)\n" +
                "65. Polymorphism\n" +
                "20:35\n" +
                " Source Code - OOP Part 2 - Polymorphism\n" +
                "66. Polymorphism (+Challenge Exercise)\n" +
                "18:46\n" +
                " lecture-49-challenge.txt\n" +
                " Source Code - OOP Part 2 - Polymorphism (plus Challenge Exercise)\n" +
                "67. OOP Master Challenge Exercise\n" +
                "16:41\n" +
                " lecture-50-challenge.txt\n" +
                " Source Code - OOP Part 2 - OOP Master Challenge Exercise\n" +
                "68. OOP Challenge - Solution\n" +
                "16:46\n" +
                " Source Code - OOP Part 2 - OOP Challenge - Solution\n" +
                "Section: 9\n" +
                "21 / 21\n" +
                "Arrays, Java inbuilt Lists, Autoboxing and Unboxing\n" +
                "69. Arrays\n" +
                "21:27\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Arrays\n" +
                "70. Arrays (Challenge Exercise)\n" +
                "16:20\n" +
                " lecture-53-challenge.txt\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Arrays (Challenge Exercise)\n" +
                "71. Arrays Recap\n" +
                "7:19\n" +
                "72. List and ArrayList Part 1\n" +
                "16:29\n" +
                " ArrayResizeDemo.java\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - List and ArrayList Part 1\n" +
                "73. ArrayList Part 2\n" +
                "20:11\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Part 2\n" +
                "74. ArrayList Part 3\n" +
                "16:48\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Part 3\n" +
                "75. ArrayList Challenge Part 1\n" +
                "14:00\n" +
                " lecture-57-challenge.txt\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Challenge Part 1\n" +
                "76. ArrayList Challenge Part 2\n" +
                "18:12\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Challenge Part 2\n" +
                "77. ArrayList Challenge Part 3\n" +
                "10:49\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Challenge Part 3\n" +
                "78. Bug Fix for ArrayList Challenge\n" +
                "6:41\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Bug Fix for ArrayList Challenge\n" +
                "79. Autoboxing and Unboxing\n" +
                "16:16\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Autoboxing and Unboxing\n" +
                "80. Autoboxing & Unboxing (Challenge Exercise) - Part 1\n" +
                "16:49\n" +
                " lecture-61-challenge.txt\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Autoboxing & Unboxing (Challenge Exercise) - Part 1\n" +
                "81. Autoboxing & Unboxing (Challenge Exercise) - Part 2\n" +
                "17:08\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Autoboxing & Unboxing (Challenge Exercise) - Part 2\n" +
                "82. Autoboxing & Unboxing (Challenge Exercise) - Part 3\n" +
                "9:32\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Autoboxing & Unboxing (Challenge Exercise) - Part 3\n" +
                "83. LinkedList Part 1\n" +
                "16:43\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Part 1\n" +
                "84. LinkedList Part 2\n" +
                "15:30\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Part 2\n" +
                "85. LinkedList Part 3\n" +
                "20:46\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Part 3\n" +
                "86. LinkedList Challenge Part 1\n" +
                "15:05\n" +
                " lecture-67-challenge.txt\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Challenge Part 1\n" +
                "87. Bug Fix for \"Track 1\" Error\n" +
                "1:03\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Bug Fix for \"Track 1\" Error\n" +
                "88. LinkedList Challenge Part 2\n" +
                "17:20\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Challenge Part 2\n" +
                "89. LinkedList Challenge Part 3 (Final video)\n" +
                "15:45\n" +
                " Source Code - Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Challenge Part 3 (Final video)\n" +
                "Section: 10\n" +
                "13 / 13\n" +
                "Inner and Abstract Classes & Interfaces\n" +
                "90. Interfaces\n" +
                "12:34\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Interfaces\n" +
                "91. Interfaces Part 2\n" +
                "14:30\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Interfaces Part 2\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Interfaces Part 2 Mobile Phone\n" +
                "92. Interfaces Challenge Part 1\n" +
                "18:11\n" +
                " lecture-72-challenge.txt\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Interfaces Challenge Part 1\n" +
                "93. Interfaces Challenge Part 2\n" +
                "9:00\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Interfaces Challenge Part 2\n" +
                "94. Inner classes Part 1\n" +
                "17:10\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Inner classes Part 1\n" +
                "95. Inner Classes Part 2\n" +
                "14:45\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Inner Classes Part 2\n" +
                "96. Inner Classes Challenge\n" +
                "11:57\n" +
                " lecture-78-challenge.txt\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Inner Classes Challenge\n" +
                "97. Abstract Classes Part 1\n" +
                "16:42\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Abstract Classes Part 1\n" +
                "98. Abstract Classes Part 2\n" +
                "10:55\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Abstract Classes Part 2\n" +
                "99. Interface vs Abstract Class\n" +
                "4:48\n" +
                "100. Abstract Class Challenge Part 1\n" +
                "19:46\n" +
                " lecture-79-challenge.txt\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Abstract Class Challenge Part 1\n" +
                "101. Abstract Class Challenge Part 2\n" +
                "12:53\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Abstract Class Challenge Part 2\n" +
                "102. Abstract Class Challenge Part 3 (includes recursion).\n" +
                "19:46\n" +
                " Source Code - Inner and Abstract Classes & Interfaces - Abstract Class Challenge Part 3\n" +
                "Section: 11\n" +
                "5 / 5\n" +
                "Java Generics\n" +
                "103. Generics Introduction\n" +
                "11:12\n" +
                " Source Code - Java Generics - Generics Introduction\n" +
                "104. Our Generics Class\n" +
                "11:37\n" +
                " Source Code - Java Generics - Our Generics Class\n" +
                "105. Our Generics Class Part 2\n" +
                "18:57\n" +
                " Source Code - Java Generics - Our Generics Class Part 2\n" +
                "106. Our Generics Class Part 3\n" +
                "10:13\n" +
                " Source Code - Java Generics - Our Generics Class Part 3\n" +
                "107. Generics Challenge\n" +
                "13:08\n" +
                " lecture-86-challenge.txt\n" +
                " Source Code - Java Generics - Generics Challenge\n" +
                "Section: 12\n" +
                "12 / 12\n" +
                "Naming Conventions and Packages. static and final keywords\n" +
                "108. Naming Conventions\n" +
                "7:09\n" +
                "109. Packages\n" +
                "17:40\n" +
                " Source Code - Naming Conventions and Packages - Packages\n" +
                "110. Packages Part 2\n" +
                "11:40\n" +
                " Source Code - Naming Conventions and Packages - Packages Part 2\n" +
                "111. Packages Part 3\n" +
                "12:05\n" +
                " Source Code - Naming Conventions and Packages - Packages Part 3\n" +
                "112. Packages (Challenge Exercise)\n" +
                "13:28\n" +
                " lecture-91-challenge.txt\n" +
                " Source Code - Naming Conventions and Packages - Packages (Challenge Exercise)\n" +
                "113. Scope\n" +
                "17:25\n" +
                " Source Code - Naming Conventions and Packages - Scope\n" +
                "114. Scope Part 2 and Visibility\n" +
                "12:07\n" +
                " Source Code - Naming Conventions and Packages - Scope Part 2 and Visibility\n" +
                "115. Scope +(Challenge Exercise)\n" +
                "5:56\n" +
                " lecture-94-challenge.txt\n" +
                " Source Code - Naming Conventions and Packages - Scope plus (Challenge Exercise)\n" +
                "116. Access Modifiers\n" +
                "16:51\n" +
                " Source Code - Naming Conventions and Packages - Access Modifiers\n" +
                "117. The static statement\n" +
                "12:32\n" +
                " Source Code - Naming Conventions and Packages - The static statement\n" +
                "118. The final statement\n" +
                "14:37\n" +
                " Source Code - Naming Conventions and Packages - The final statement\n" +
                "119. Final Part 2 and Static Initializers\n" +
                "9:01\n" +
                " Source Code - Naming Conventions and Packages - Final Part 2 and Static Initializers\n" +
                "Section: 13\n" +
                "27 / 27\n" +
                "Java Collections\n" +
                "120. Collections Overview\n" +
                "15:47\n" +
                " Source Code - Java Collections - Collections Overview\n" +
                "121. Binary Search\n" +
                "15:39\n" +
                " Interfaces Java Docs\n" +
                " Source Code - Java Collections - Binary Search\n" +
                "122. Collections List Methods\n" +
                "18:23\n" +
                " Source Code - Java Collections - Collections List Methods\n" +
                "123. Comparable and Comparator\n" +
                "18:55\n" +
                " Source Code - Java Collections - Comparable and Comparator\n" +
                "124. Maps\n" +
                "16:51\n" +
                " Maps Document Link\n" +
                " Source Code - Java Collections - Maps\n" +
                "125. Map Continued and Adventure Game\n" +
                "16:33\n" +
                " Source Code - Java Collections - Map Continued and Adventure Game\n" +
                "126. Adding Exits to the Adventure game\n" +
                "18:04\n" +
                " Source Code - Java Collections - Adding Exits to the Adventure game\n" +
                "127. Adventure Game challenge\n" +
                "8:13\n" +
                " lecture-106-challenge.txt\n" +
                " Source Code - Java Collections - Adventure Game challenge\n" +
                "128. Immutable Classes\n" +
                "15:42\n" +
                " A Strategy for Defining Immutable Objects\n" +
                " Source Code - Java Collections - Immutable Classes\n" +
                "129. Immutable Class Challenge\n" +
                "4:32\n" +
                " lecture-108-challenge.txt\n" +
                " Source Code - Java Collections - Immutable Class Challenge\n" +
                "130. Sets & HashSet\n" +
                "19:52\n" +
                " Virtual Machine Performance Enhancements\n" +
                " Source Code - Java Collections - Sets & HashSet\n" +
                "131. HashSet - equals() and hashCode()\n" +
                "16:52\n" +
                " Source Code - Java Collections - HashSet - equals() and hashCode()\n" +
                "132. Finish off equals() and hashcode()\n" +
                "10:56\n" +
                " equals documentation\n" +
                " Source Code - Java Collections - Finish off equals() and hashcode()\n" +
                "133. Potential issue with equals() and sub-classing\n" +
                "11:59\n" +
                " lecture-112-challenge.txt\n" +
                " Source Code - Java Collections - Potential issue with equals() and sub-classing\n" +
                "134. Sets - Symmetric & Asymmetric\n" +
                "15:34\n" +
                " The Set Interface\n" +
                " Source Code - Java Collections - Sets - Symmetric & Asymmetric\n" +
                "135. Finishing Off Sets\n" +
                "9:16\n" +
                " Source Code - Java Collections - Finishing Off Sets\n" +
                "136. Sets Challenge Part 1\n" +
                "15:26\n" +
                " lecture-115-challenge.txt\n" +
                " Source Code - Java Collections - Sets Challenge Part 1\n" +
                "137. Sets Challenge Part 2\n" +
                "12:50\n" +
                " Source Code - Java Collections - Sets Challenge Part 2\n" +
                "138. Sets Challenge Part 3\n" +
                "18:17\n" +
                " International Astronomical Union\n" +
                " Source Code - Java Collections - Sets Challenge Part 3\n" +
                "139. Sorted Collections\n" +
                "13:11\n" +
                " Source Code - Java Collections - Sorted Collections\n" +
                "140. StockList Class With Maps\n" +
                "17:05\n" +
                " Source Code - Java Collections - StockList Class With Maps\n" +
                "141. Add a Basket\n" +
                "15:49\n" +
                " Source Code - Java Collections - Add a Basket\n" +
                "142. TreeMap and Unmodifiable Maps\n" +
                "20:50\n" +
                " Source Code - Java Collections - TreeMap and Unmodifiable Maps\n" +
                "143. Challenge Part 1\n" +
                "12:40\n" +
                " lecture-122-challenge.txt\n" +
                " Source Code - Java Collections - Challenge Part 1\n" +
                "144. Challenge Part 2\n" +
                "10:52\n" +
                " Source Code - Java Collections - Challenge Part 2\n" +
                "145. Challenge Part 3\n" +
                "7:56\n" +
                " Source Code - Java Collections - Challenge Part 3\n" +
                "146. Challenge Part 4 (Final)\n" +
                "18:04\n" +
                " Source Code - Java Collections - Challenge Part 4 (Final)\n" +
                "Section: 14\n" +
                "44 / 44\n" +
                "JavaFX\n" +
                "147. Introduction\n" +
                "17:31\n" +
                " Source Code - JavaFX - Introduction\n" +
                "148. Code Vs FXml\n" +
                "13:27\n" +
                " Source Code - JavaFX - Code Vs FXml\n" +
                "149. GridPane Layout\n" +
                "15:34\n" +
                " GridPane Oracle Docs\n" +
                " AnchorPane Oracle Docs\n" +
                " Source Code - JavaFX - GridPane Layout\n" +
                "150. HBox Layout\n" +
                "13:11\n" +
                " HBox Oracle Docs\n" +
                " VBox Oracle Docs\n" +
                " Source Code - JavaFX - HBox Layout\n" +
                "151. BorderPane Layout\n" +
                "13:16\n" +
                " BorderPane Oracle Docs\n" +
                " Source Code - JavaFX - BorderPane Layout\n" +
                "152. Other Layouts\n" +
                "17:09\n" +
                " FlowPane Oracle Docs\n" +
                " Stackpane Oracle Docs\n" +
                " TilePane Oracle Docs\n" +
                "Show more (2)\n" +
                "153. Controls\n" +
                "15:17\n" +
                " Button Oracle Docs\n" +
                " Graphic Repository\n" +
                " Source Code - JavaFX - Controls\n" +
                "154. RadioButton and CheckBox\n" +
                "17:02\n" +
                " Source Code - JavaFX - RadioButton and CheckBox\n" +
                "155. ComboBox and ChoiceBox\n" +
                "17:13\n" +
                " Source Code - JavaFX - ComboBox and ChoiceBox\n" +
                "156. Slider, Spinner, ColorPicker & DatePicker Controls\n" +
                "14:30\n" +
                " Source Code - JavaFX - Slider, Spinner, ColorPicker & DatePicker Controls\n" +
                "157. TitledPane\n" +
                "6:42\n" +
                " Source Code - JavaFX - TitledPane\n" +
                "158. Events and Event Handlers\n" +
                "14:29\n" +
                " Source Code - JavaFX - Events and Event Handlers\n" +
                "159. Events Continued\n" +
                "14:38\n" +
                " Source Code - JavaFX - Events Continued\n" +
                "160. UI Thread\n" +
                "14:40\n" +
                " Checkbox JavaFX Oracle\n" +
                " Source Code - JavaFX - UI Thread\n" +
                "161. Threads and Runnable\n" +
                "16:18\n" +
                " Concurrency in JavaFX\n" +
                " Source Code - JavaFX - Threads and Runnable\n" +
                "162. Setup Sample Todo List Application\n" +
                "12:59\n" +
                " Source Code - JavaFX - Setup Sample Todo List Application\n" +
                "163. Base Interface\n" +
                "13:28\n" +
                " Source Code - JavaFX - Base Interface\n" +
                "164. Add Change Listener\n" +
                "14:17\n" +
                " Source Code - JavaFX - Add Change Listener\n" +
                "165. Formatting Dates\n" +
                "7:03\n" +
                " Class DateTimeFormatter\u200B\n" +
                " Source Code - JavaFX - Formatting Dates\n" +
                "166. Singletons\n" +
                "15:04\n" +
                " Class DateTimeFormatter\n" +
                " Source Code - JavaFX - Singletons\n" +
                "167. Load and Save ToDo Items from/to Disk\n" +
                "16:25\n" +
                " Package java.nio\n" +
                " Class String\n" +
                " Source Code - JavaFX - Load and Save ToDo Items from/to Disk\n" +
                "168. Add DialogPane\n" +
                "16:31\n" +
                " Class DialogPane\n" +
                " Source Code - JavaFX - Add DialogPane\n" +
                "169. Show Dialog and Add Controller Code\n" +
                "14:33\n" +
                " Source Code - JavaFX - Show Dialog and Add Controller Code\n" +
                "170. Bug Fix and Update List View\n" +
                "10:27\n" +
                " Source Code - JavaFX - Bug Fix and Update List View\n" +
                "171. Data Binding and Observable\n" +
                "11:20\n" +
                " Class FXCollections\n" +
                " Lorem ipsum Generator\n" +
                " Source Code - JavaFX - Data Binding and Observable\n" +
                "172. Cell Factories\n" +
                "14:44\n" +
                " Source Code - JavaFX - Context Menu\n" +
                "173. Context Menu\n" +
                "15:37\n" +
                " Source Code - JavaFX - Context Menu\n" +
                "174. KeyEvents and Toolbars\n" +
                "15:41\n" +
                " Source Code - JavaFX - KeyEvents and Toolbars\n" +
                "175. SortedList\n" +
                "12:44\n" +
                " Source Code - JavaFX - SortedList\n" +
                "176. FilteredList\n" +
                "16:18\n" +
                " Source Code - JavaFX - FilteredList\n" +
                "177. CSS With JavaFX\n" +
                "17:39\n" +
                " JavaFX CSS Reference Guide\n" +
                " Source Code - JavaFX - CSS With JavaFX\n" +
                "178. Transforming Nodes and Choosers\n" +
                "16:37\n" +
                " Class Bloom\n" +
                " Source Code - JavaFX - Transforming Nodes and Choosers\n" +
                "179. More on Choosers and Web Pages\n" +
                "22:11\n" +
                " Class WebEngine\n" +
                " Source Code - JavaFX - More on Choosers and Web Pages\n" +
                "180. SceneBuilder\n" +
                "3:23\n" +
                "181. Installing SceneBuilder for Windows\n" +
                "5:00\n" +
                " Gluon Labs\n" +
                "182. Installing SceneBuilder for Mac\n" +
                "3:39\n" +
                " Scene Builder\n" +
                "183. Overview of SceneBuilder\n" +
                "7:15\n" +
                " Source Code - JavaFX - Overview of SceneBuilder\n" +
                "184. Building a UI with SceneBuilder\n" +
                "15:49\n" +
                " Source Code - JavaFX - Building a UI with SceneBuilder\n" +
                "185. More on SceneBuilder\n" +
                "17:27\n" +
                " setting up Scene Builder with NetBeans 8.0.2\n" +
                " Source Code - JavaFX - More on SceneBuilder\n" +
                "186. JavaFX Challenge\n" +
                "15:14\n" +
                " ContactData source file\n" +
                " Source Code - JavaFX - JavaFX Challenge\n" +
                "187. JavaFX Challenge Part 2\n" +
                "13:16\n" +
                " Source Code - JavaFX - JavaFX Challenge Part 2\n" +
                "188. JavaFX Challenge Part 3\n" +
                "16:07\n" +
                " Source Code - JavaFX - JavaFX Challenge Part 3\n" +
                "189. JavaFX Challenge Part 4\n" +
                "14:03\n" +
                " Source Code - JavaFX - JavaFX Challenge Part 4\n" +
                "190. JavaFX Challenge Wrap up\n" +
                "9:15\n" +
                " Source Code - JavaFX - JavaFX Challenge Wrap up\n" +
                "Section: 15\n" +
                "38 / 38\n" +
                "Basic Input & Output including java.util\n" +
                "191. Exceptions\n" +
                "14:00\n" +
                " Source Code - Basic Input & Output including java.util - Exceptions\n" +
                "192. Stack Trace and Call Stack\n" +
                "13:04\n" +
                " Source Code - Basic Input & Output including java.util - Stack Trace and Call Stack\n" +
                "193. Catching and throwing Exceptions\n" +
                "14:20\n" +
                " Source Code - Basic Input & Output including java.util - Catching and throwing Exceptions\n" +
                "194. Multi Catch Exceptions\n" +
                "8:06\n" +
                " Source Code - Basic Input & Output including java.util - Multi Catch Exceptions\n" +
                "195. Introduction to I/O\n" +
                "15:55\n" +
                " Source Code - Basic Input & Output including java.util - Introduction to IO\n" +
                "196. Writing content - FileWriter class and Finally block\n" +
                "14:58\n" +
                " Souce Code - Basic Input & Output including java.util - Writing content - FileWriter class and Finally block\n" +
                "197. Try with Resources\n" +
                "12:12\n" +
                " The try-with-resources Statement\n" +
                " Source Code - Basic Input & Output including java.util - Try with Resources\n" +
                "198. FileReader and Closeable\n" +
                "12:55\n" +
                " lecture-156-challenge.txt\n" +
                " Source Code - Basic Input & Output including java.util - FileReader and Closeable\n" +
                "199. BufferedReader\n" +
                "12:59\n" +
                " Source Code - Basic Input & Output including java.util - BufferedReader\n" +
                "200. Load Big Location and Exits Files\n" +
                "7:29\n" +
                " GameData.zip\n" +
                " Source Code - Basic Input & Output including java.util - Load Big Location and Exits Files\n" +
                "201. Challenge\n" +
                "5:01\n" +
                " lecture-159-challenge.txt\n" +
                " Source Code - Basic Input & Output including java.util - Challenge\n" +
                "202. Buffered Writer and Challenge\n" +
                "13:11\n" +
                " Source Code - Basic Input & Output including java.util - Buffered Writer and Challenge\n" +
                "203. Byte Streams\n" +
                "15:45\n" +
                " Source Code - Basic Input & Output including java.util - Byte Streams\n" +
                "204. Reading Binary Data and End of File Exceptions\n" +
                "15:44\n" +
                " Source Code - Basic Input & Output including java.util - Reading Binary Data and End of File Exceptions\n" +
                "205. Object Input Output including Serialization\n" +
                "14:15\n" +
                " Source Code - Basic Input & Output including java.util - Object Input Output\n" +
                "206. Finish Object I/O and RandomAccessFile class\n" +
                "16:03\n" +
                " Source Code - Basic Input & Output including java.util - Finish Object IO and RandomAccessFile class\n" +
                "207. Create Random Access File\n" +
                "14:29\n" +
                " Source Code - Basic Input & Output including java.util - Create Random Access File\n" +
                "208. Update Static Initializer Block With Random File Access\n" +
                "11:37\n" +
                " Source Code - Basic Input & Output including java.util - Update Static Initializer Block With Random File Access\n" +
                "209. Update Adventure Game to Read Random Access File\n" +
                "14:20\n" +
                " Source Code - Basic Input & Output including java.util - Update Adventure Game to Read Random Access File\n" +
                "210. Java NIO\n" +
                "14:47\n" +
                " InputOutput NIO\n" +
                " Source Code - Basic Input & Output including java.util - Java NIO\n" +
                "211. Writing Objects With Java NIO\n" +
                "11:36\n" +
                " Source Code - Basic Input & Output including java.util - Writing Objects With Java NIO\n" +
                "212. Reading and Writing with Java NIO\n" +
                "15:47\n" +
                " Source Code - Basic Input & Output including java.util - Reading and Writing with Java NIO\n" +
                "213. Writing Binary Files with Java NIO\n" +
                "13:36\n" +
                " Souce Code - Basic Input & Output including java.util - Writing Binary Files with Java NIO\n" +
                "214. Reading Files with NIO\n" +
                "15:47\n" +
                " Basic Input & Output including java.util - Reading Files with NIO\n" +
                " Source Code - Basic Input & Output including java.util - Reading Files with NIO\n" +
                "215. Absolute and Relative Reads\n" +
                "11:10\n" +
                " Souce Code - Basic Input & Output including java.util - Absolute and Relative Reads\n" +
                "216. Chained Put Methods\n" +
                "13:55\n" +
                " Source Code - Basic Input & Output including java.util - Chained Put Methods\n" +
                "217. Writing Sequentially\n" +
                "13:04\n" +
                " Source Code - Basic Input & Output including java.util - Writing Sequentially\n" +
                "218. FileChannel to Copy Files and Pipes with Threads\n" +
                "15:04\n" +
                " Source Code - Basic Input & Output including java.util - FileChannel to Copy Files and Pipes with Threads\n" +
                "219. Filesystem\n" +
                "18:02\n" +
                " FileSystemText1.txt\n" +
                " FileSystemText2.txt\n" +
                " FileSystemText3.txt\n" +
                "Show more (1)\n" +
                "220. More on Paths\n" +
                "12:17\n" +
                " Source Code - Basic Input & Output including java.util - More on Paths\n" +
                "221. Exists and CopyFile\n" +
                "11:59\n" +
                " Source Code - Basic Input & Output including java.util - Exists and CopyFile\n" +
                "222. Move, Rename and Delete\n" +
                "11:16\n" +
                " Source Code - Basic Input & Output including java.util - Move, Rename and Delete\n" +
                "223. File Attributes\n" +
                "12:50\n" +
                " Class Files\n" +
                " Interface BasicFileAttributes\n" +
                " Source Code - Basic Input & Output including java.util - File Attributes\n" +
                "224. Read Existing Directory Contents\n" +
                "14:15\n" +
                " getPathMatcher\n" +
                " Source Code - Basic Input & Output including java.util - Read Existing Directory Contents\n" +
                "225. Separators Temp Files and File Stores\n" +
                "12:25\n" +
                " Source Code - Basic Input & Output including java.util - Separators Temp Files and File Stores\n" +
                "226. Walk File Tree\n" +
                "11:33\n" +
                " Source Code - Basic Input & Output including java.util - Walk File Tree\n" +
                "227. Copy Entire Tree\n" +
                "12:58\n" +
                " Source Code - Basic Input & Output including java.util - Copy Entire Tree\n" +
                "228. Mapping IO and NIO Methods\n" +
                "12:53\n" +
                " Source Code - Basic Input & Output including java.util - Mapping IO and NIO Methods\n" +
                "Section: 16\n" +
                "29 / 29\n" +
                "Concurrency in Java\n" +
                "229. Concurrency and Threads Introduction\n" +
                "6:59\n" +
                "230. Threads\n" +
                "13:32\n" +
                " Constants.txt\n" +
                " Source Code - Concurrency in Java - Threads\n" +
                "231. Runnable and Thread\n" +
                "13:19\n" +
                " Class Thread\n" +
                " Source Code - Concurrency in Java - Runnable and Thread\n" +
                "232. Interrupt and Join\n" +
                "9:44\n" +
                " Source Code - Concurrency in Java - Interrupt and Join\n" +
                "233. Multiple Threads\n" +
                "11:52\n" +
                " ThreadColor.java\n" +
                " Source Code - Concurrency in Java - Multiple Threads\n" +
                "234. Thread Variables\n" +
                "9:53\n" +
                " Source Code - Concurrency in Java - Thread Variables\n" +
                "235. Synchronisation\n" +
                "11:05\n" +
                " Source Code - Concurrency in Java - Synchronisation\n" +
                "236. Producer and Consumer\n" +
                "10:55\n" +
                " Source Code - Concurrency in Java - Producer and Consumer\n" +
                "237. Deadlocks, wait, notify and notifyAll methods\n" +
                "14:05\n" +
                " Class Collections\n" +
                " Source Code - Concurrency in Java - Deadlocks, wait, notify and notifyAll methods\n" +
                "238. The Java Util Concurrent package\n" +
                "12:09\n" +
                " ThreadColor.java\n" +
                " Source Code - Concurrency in Java - The Java Util Concurrent package\n" +
                "239. Thread Interference\n" +
                "11:15\n" +
                " Class ArrayList<E>\n" +
                " Source Code - Concurrency in Java - Thread Interference\n" +
                "240. Reentrant Lock and Unlock\n" +
                "10:28\n" +
                " Source Code - Concurrency in Java - Reentrant Lock and Unlock\n" +
                "241. Using Try Finally With Threads\n" +
                "10:36\n" +
                " Interface Lock\n" +
                " Source Code - Concurrency in Java - Using Try Finally With Threads\n" +
                "242. Thread Pools\n" +
                "12:03\n" +
                " Source Code - Concurrency in Java - Thread Pools\n" +
                "243. ArrayBlockingQueue Class\n" +
                "12:29\n" +
                " Interface ExecutorService\n" +
                " Source Code - Concurrency in Java - ArrayBlockingQueue Class\n" +
                "244. Deadlocks\n" +
                "10:34\n" +
                " Source Code - Concurrency in Java - Deadlocks\n" +
                "245. More on Deadlocks\n" +
                "14:06\n" +
                " Source Code - Concurrency in Java - More on Deadlocks\n" +
                "246. Thread Starvation\n" +
                "16:47\n" +
                " ThreadColor.java\n" +
                " Source Code - Concurrency in Java - Thread Starvation\n" +
                "247. Fair Locks and Live Locks\n" +
                "12:55\n" +
                " Source Code - Concurrency in Java - Fair Locks and Live Locks\n" +
                "248. Live Lock Example and Slipped Conditions\n" +
                "5:04\n" +
                " Source Code - Concurrency in Java - Live Lock Example and Slipped Conditions\n" +
                "249. Other Thread Issues\n" +
                "14:04\n" +
                " Package java.util.concurrent.atomic\n" +
                " Class AtomicInteger\n" +
                "250. JavaFX Background Tasks\n" +
                "15:25\n" +
                " Class Task<V>\n" +
                " Source Code - Concurrency in Java - JavaFX Background Tasks\n" +
                "251. Data Binding\n" +
                "10:16\n" +
                " Source Code - Concurrency in Java - Data Binding\n" +
                "252. Service\n" +
                "14:34\n" +
                " Source Code - Concurrency in Java - Service\n" +
                "253. Challenge 1 and 2\n" +
                "9:09\n" +
                " BankAccountClass.txt\n" +
                " Source Code - Concurrency in Java - Challenge 1 and 2\n" +
                "254. Challenge 3,4 and 5\n" +
                "11:15\n" +
                " Source Code - Concurrency in Java - Challenge 3,4 and 5\n" +
                "255. Challenge 6 and 7\n" +
                "11:00\n" +
                " Code.txt\n" +
                " Source Code - Concurrency in Java - Challenge 6 and 7\n" +
                "256. Challenge 8\n" +
                "5:30\n" +
                " challenge8code.txt\n" +
                " Source Code - Concurrency in Java - Challenge 8\n" +
                "257. Challenge 9\n" +
                "4:53\n" +
                " Source Code - Concurrency in Java - Challenge 9\n" +
                "Section: 17\n" +
                "13 / 13\n" +
                "Lambda Expressions\n" +
                "258. Lambda Expressions Introduction\n" +
                "15:33\n" +
                " Interface Comparator<T>\n" +
                " Source Code - Lambda Expressions - Lambda Expressions Introduction\n" +
                "259. Lambda Expressions Continued\n" +
                "14:50\n" +
                " Source Code - Lambda Expressions - Lambda Expressions Continued\n" +
                "260. Lambda Expressions Nested Blocks\n" +
                "14:45\n" +
                " Source Code - Lambda Expressions - Lambda Expressions Nested Blocks\n" +
                "261. Scope and Functional Programming\n" +
                "15:02\n" +
                " Functional programming\n" +
                " Source Code - Lambda Expressions - Scope and Functional Programming\n" +
                "262. Functional Interfaces & Predicates\n" +
                "16:38\n" +
                " Interface Consumer<T>\n" +
                " Source Code - Lambda Expressions - Functional Interfaces & Predicates\n" +
                "263. More on Predicates & Suppliers\n" +
                "12:06\n" +
                " Source Code - Lambda Expressions - More on Predicates & Suppliers\n" +
                "264. Functions\n" +
                "13:11\n" +
                " Source Code - Lambda Expressions - Functions\n" +
                "265. Chaining java.util.function Functions\n" +
                "11:56\n" +
                " Package java.util.function\n" +
                " Lambda-Expressions-Chaining-java.util.function-Functions-table.png\n" +
                " Source Code - Lambda Expressions - Chaining java.util.function Functions\n" +
                "266. Streams\n" +
                "13:50\n" +
                " Method References\n" +
                " Interface Stream\n" +
                " Source Code - Lambda Expressions - Streams\n" +
                "267. Streams - Intermediate and Terminal Operations\n" +
                "13:06\n" +
                " Source Code - Lambda Expressions - Streams - Intermediate and Terminal Operations\n" +
                "268. Streams - Flatmap & Lambda Best Practices\n" +
                "21:30\n" +
                " Source Code - Lambda Expressions - Streams - Flatmap & Lambda Best Practices\n" +
                "269. Lambda Challenge Part 1\n" +
                "12:07\n" +
                " stringbuilder.java\n" +
                " anonymousrunnable.java\n" +
                " Source Code - Lambda Expressions - Lambda Challenge Part 1\n" +
                "270. Lambda Challenge Part 2\n" +
                "16:33\n" +
                " top15babynameslist.java\n" +
                " chain.java\n" +
                " Interface Comparator\n" +
                "Show more (3)\n" +
                "Section: 18\n" +
                "8 / 8\n" +
                "Regular Expressions\n" +
                "271. Regular Expressions Introduction\n" +
                "16:21\n" +
                " Source Code - Regular Expressions - Regular Expressions Introduction\n" +
                "272. Character classes and Boundary Matchers\n" +
                "13:55\n" +
                " Class Pattern\n" +
                " Source Code - Regular Expressions - Character classes and Boundary Matchers\n" +
                "273. Quantifiers and the Pattern and Matcher classes\n" +
                "14:42\n" +
                " Class Matcher\n" +
                " Class Pattern\n" +
                " Source Code - Regular Expressions - Quantifiers and the Pattern and Matcher classes\n" +
                "274. Matcher find and Group Methods\n" +
                "15:03\n" +
                " Class Matcher\n" +
                " Source Code - Regular Expressions - Matcher find and Group Methods\n" +
                "275. And, Or & Not\n" +
                "15:26\n" +
                " Source Code - Regular Expressions - And, Or & Not\n" +
                "276. Regular Expressions Challenge Part 1\n" +
                "17:04\n" +
                " Source Code - Regular Expressions - Regular Expressions Challenge Part 1\n" +
                "277. Regular Expressions Challenge Part 2\n" +
                "15:30\n" +
                " Matcher\n" +
                " Source Code - Regular Expressions - Regular Expressions Challenge Part 2\n" +
                "278. Regular Expressions Challenge Part 3\n" +
                "6:13\n" +
                " Source Code - Regular Expressions - Regular Expressions Challenge Part 3\n" +
                "Section: 19\n" +
                "11 / 11\n" +
                "Debugging and Unit Testing\n" +
                "279. Introduction to Debugging\n" +
                "17:57\n" +
                " Source Code - Debugging and Unit Testing - Introduction to Debugging\n" +
                "280. More on Debugging\n" +
                "11:24\n" +
                " Source Code - Debugging and Unit Testing - More on Debugging\n" +
                "281. Field Watch Points\n" +
                "16:14\n" +
                " Source Code - Debugging and Unit Testing - Field Watch Points\n" +
                "282. Advanced Debugging\n" +
                "10:14\n" +
                " JTransforms\n" +
                " Source Code - Debugging and Unit Testing - Advanced Debugging\n" +
                "283. Introduction to Unit Testing with JUnit\n" +
                "16:20\n" +
                " Source Code - Debugging and Unit Testing - Introduction to Unit Testing with JUnit\n" +
                "284. Asserts in Junit\n" +
                "18:19\n" +
                " Source Code - Debugging and Unit Testing - Asserts in Junit\n" +
                "285. More Asserts and Exception Handling\n" +
                "16:34\n" +
                " Source Code - Debugging and Unit Testing - More Asserts and Exception Handling\n" +
                "286. Parameterized Testing\n" +
                "12:21\n" +
                " Source Code - Debugging and Unit Testing - Parameterized Testing\n" +
                "287. JUnit Challenge #1 and #2\n" +
                "21:41\n" +
                " Debugging and Unit Testing - JUnit Challenge 1 and 2\u200B - challenge code.txt\n" +
                " Source Code - Debugging and Unit Testing - JUnit Challenge 1 and 2\n" +
                "288. JUnit Challenges #3 to #7\n" +
                "12:22\n" +
                " Source Code - Debugging and Unit Testing - JUnit Challenges 3 to 7\n" +
                "289. Junit Challenges #8 to #10\n" +
                "12:06\n" +
                " Source Code - Debugging and Unit Testing - Junit Challenges 8 to 10\n" +
                "Section: 20\n" +
                "35 / 35\n" +
                "Databases\n" +
                "290. Section Introduction\n" +
                "1:55\n" +
                "291. Database Terminology\n" +
                "10:32\n" +
                "292. Install and Setup SQLite for Windows\n" +
                "7:56\n" +
                "293. Install and Setup SQLite for Mac\n" +
                "2:00\n" +
                "294. Install and Setup SQLite for Linux\n" +
                "2:38\n" +
                "295. Introduction to SQLite\n" +
                "11:15\n" +
                "296. More with SQLite\n" +
                "10:42\n" +
                "297. Querying Data With SQL\n" +
                "16:02\n" +
                " SQLite Autoincrement\n" +
                " music.zip\n" +
                "298. SQL Order by and Joins\n" +
                "13:11\n" +
                "299. More Complex Joins\n" +
                "11:44\n" +
                "300. Wildcards in Queries and Views\n" +
                "15:17\n" +
                "301. Housekeeping and Final SQL Challenge\n" +
                "14:17\n" +
                "302. JDBC and SQLite GUI Browser\n" +
                "15:49\n" +
                " Bit Bucket\n" +
                " DB Browser for SQLite\n" +
                " Source Code - Databases - JDBC and SQLite GUI Browser\n" +
                "303. Creating Databases With JDBC in Java\n" +
                "17:26\n" +
                " Source Code - Databases - Creating Databases With JDBC in Java\n" +
                "304. JDBC Insert, Update, Delete\n" +
                "15:49\n" +
                " Source Code - Databases - JDBC Insert, Update, Delete\n" +
                "305. .executeQuery() and using Constants\n" +
                "20:39\n" +
                " Source Code - Databases - .executeQuery() and using Constants\n" +
                "306. The Music SQLite Database\n" +
                "12:43\n" +
                " Source Code - Databases - The Music SQLite Database\n" +
                "307. Write Java Query for Artists\n" +
                "14:46\n" +
                " Source Code - Databases - Write Java Query for Artists\n" +
                "308. Executing SQL in DB Browser\n" +
                "17:18\n" +
                " Source Code - Databases - Executing SQL in DB Browser\n" +
                "309. Query Albums by Artist Method\n" +
                "16:23\n" +
                " Source Code - Databases - Query Albums by Artist Method\n" +
                "310. Query Artists for Song method\n" +
                "15:03\n" +
                " Source Code - Databases - Query Artists for Song method\n" +
                "311. Result Set Meta Data\n" +
                "14:38\n" +
                " Interface ResultSetMetaData\n" +
                " Source Code- Databases - Result Set Meta Data\n" +
                "312. Functions and Views\n" +
                "16:38\n" +
                " Source Code - Databases - Functions and Views\n" +
                "313. Write the Method to Query View\n" +
                "11:48\n" +
                " Source Code - Databases - Write the Method to Query View\n" +
                "314. SQL Injection Attacks and Prepared Statements\n" +
                "17:01\n" +
                " Source Code - Databases - SQL Injection Attacks and Prepared Statements\n" +
                "315. Transactions\n" +
                "13:40\n" +
                " Source Code - Databases - Transactions\n" +
                "316. Inserting Records With JDBC\n" +
                "10:08\n" +
                " Source Code - Databases - Inserting Records With JDBC\n" +
                "317. Insert Albums, Artists, and Songs\n" +
                "14:00\n" +
                " Source Code - Databases - Insert Albums, Artists, and Songs\n" +
                "318. Test Insert JDBC Code\n" +
                "18:07\n" +
                " Source Code - Databases - Test Insert JDBC Code\n" +
                "319. JDBC with a GUI Program\n" +
                "17:53\n" +
                " main.fxml.txt\n" +
                " Source Code - Databases - JDBC with a GUI Program\n" +
                "320. Add Artists\n" +
                "12:35\n" +
                " Source Code - Databases - Add Artists\n" +
                "321. Fix Artist and Preload Records\n" +
                "13:24\n" +
                " Source Code - Databases - Fix Artist and Preload Records\n" +
                "322. Implement Artist Query\n" +
                "11:57\n" +
                " Source Code - Databases - Implement Artist Query\n" +
                "323. Add ProgressBar\n" +
                "9:38\n" +
                " Source Code - Databases - Add ProgressBar\n" +
                "324. Handling Updates\n" +
                "15:14\n" +
                " Source Code - Databases - Handling Updates\n" +
                "Section: 21\n" +
                "9 / 9\n" +
                "Java Networking Programming\n" +
                "325. Networking Overview\n" +
                "9:39\n" +
                "326. First Client and Server Apps\n" +
                "15:02\n" +
                " Source Code - Java Networking - First Client and Server Apps\n" +
                "327. Multi Threaded Server\n" +
                "14:04\n" +
                " Source Code - Java Networking - Multi Threaded Server\n" +
                "328. Multi-Threading and Timeouts\n" +
                "12:46\n" +
                " Source Code - Java Networking - Multi-Threading and Timeouts\n" +
                "329. UDP Server and Client\n" +
                "18:13\n" +
                " Source Code - Java Networking - UDP Server and Client\n" +
                "330. High Level APIS\n" +
                "18:55\n" +
                " URIs, URLs, and URNs: Clarifications and Recommendations 1.0\n" +
                " Uniform Resource Identifier\n" +
                " Source Code - Java Networking - High Level APIS\n" +
                "331. URL Connections and Input Stream Reader\n" +
                "16:06\n" +
                " Example Domain\n" +
                " Code\n" +
                " Source Code - Java Networking - URL Connections and Input Stream Reader\n" +
                "332. HTTPUrlConnection\n" +
                "17:57\n" +
                " Method Definitions\n" +
                " List of HTTP header fields\n" +
                " Source Code - Java Networking - HTTPUrlConnection\n" +
                "333. Alternatives to HTTPUrlConnection\n" +
                "21:06\n" +
                " Public feed\n" +
                " Feed Url\n" +
                " JEP 110: HTTP/2 Client (Incubator)\n" +
                "Show more (4)\n" +
                "Section: 22\n" +
                "3 / 3\n" +
                "Java 9 Module System\n" +
                "334. Introduction to Modules\n" +
                "6:21\n" +
                "335. Module Declarations and Statements\n" +
                "2:08\n" +
                "336. Module Types\n" +
                "5:39\n" +
                "Section: 23\n" +
                "7 / 7\n" +
                "Migrating Java Projects to Java 9\n" +
                "337. Project Setup and Test\n" +
                "7:23\n" +
                " music-ui-start.zip\n" +
                " Source Code - Migrating Java Projects to Java 9 - Project Setup and Test\n" +
                "338. Structuring the new project\n" +
                "4:02\n" +
                "339. Creating the first module (Common)\n" +
                "12:04\n" +
                " Source Code - Migrating Java Projects to Java 9 - Creating the first module (Common)\n" +
                "340. Creating the Module Descriptor file\n" +
                "13:25\n" +
                " Source Code - Migrating Java Projects to Java 9 - Creating the Module Descriptor file\n" +
                "341. Creating the 2nd module (Database)\n" +
                "10:44\n" +
                " Source Code - Migrating Java Projects to Java 9 - Creating the 2nd module (Database)\n" +
                "342. Challenge - Create the final module (UI)\n" +
                "9:52\n" +
                " Source Code - Migrating Java Projects to Java 9 - Challenge - Create the final module (UI)\n" +
                "343. Transitive Dependencies\n" +
                "7:29\n" +
                " Source Code - Migrating Java Projects to Java 9 - Transitive Dependencies\n" +
                "Section: 24\n" +
                "3 / 3\n" +
                "Bonus Material\n" +
                "344. Bonus - Please Watch!\n" +
                "0:48\n" +
                "345. All Courses\n" +
                "0:00\n" +
                "346. Source code for all Programs";
        String expected = "Section 1: Introduction\n" +
                "1. Getting Started With This Course\n" +
                "Section 2: Setup\n" +
                "2. Which version of Java should you use?\n" +
                "3. Install JDK 10 on Windows\n" +
                "4. Install and Configure Intellij on Windows\n" +
                "5. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "6. Install JDK 10 on a Mac\n" +
                "7. Install and Configure Intellij on a Mac\n" +
                "8. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "9. Install JDK 10 on Linux\n" +
                "10. Install and Configure Intellij on Linux\n" +
                "11. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "Section 3: First Steps\n" +
                "12. Introduction\n" +
                "13. Creating Your First Java Project\n" +
                "14. Exploring The IntelliJ Interface\n" +
                "Section 4: Variables, Datatypes and Operators\n" +
                "15. Introduction\n" +
                "16. What Are Variables?\n" +
                "17. Getting To Know Primitive Data Types - The Byte, Short, Int And Long\n" +
                "18. Getting To Know Primitive Data Types - Float And Double\n" +
                "19. Getting To Know Primitive Data Types - Char And Boolean\n" +
                "20. Understanding Strings And Finishing Up Primitive Data Types\n" +
                "21. Operators In Java\n" +
                "22. More On Operators And Operator Precedence\n" +
                "Section 5: Java Tutorial: Expressions, Statements, Code blocks, Methods and more\n" +
                "23. Introduction\n" +
                "24. Keywords And Expressions\n" +
                "25. Statements, Whitespace and Indentation (Code Organization)\n" +
                "26. Code Blocks And The If Then Else Control Statements\n" +
                "27. if then else Recap\n" +
                "28. Methods In Java\n" +
                "29. More On Methods And A Challenge\n" +
                "30. Method Challenge - Final Code Changes\n" +
                "31. DiffMerge Tool Introduction\n" +
                "32. Install DiffMerge\n" +
                "33. Using DiffMerge\n" +
                "34. Coding Exercises\n" +
                "Coding Exercise 1: MegaBytes Converter\n" +
                "Coding Exercise 2: Barking Dog\n" +
                "Coding Exercise 3: Leap Year Calculator\n" +
                "35. Method Overloading\n" +
                "36. Method Overloading Recap\n" +
                "37. Seconds and Minutes Challenge\n" +
                "38. Bonus Challenge Solution\n" +
                "Coding Exercise 4: Area Calculator\n" +
                "Section 6: Control Flow Statements\n" +
                "39. Introduction\n" +
                "40. The switch statement (+Challenge Exercise)\n" +
                "41. Day of the Week Challenge\n" +
                "Coding Exercise 5: Number In Word\n" +
                "Coding Exercise 6: Number Of Days In Month\n" +
                "42. The for Statement (+Challenge Exercise)\n" +
                "43. For Loop Recap\n" +
                "44. Sum 3 and 5 Challenge\n" +
                "Coding Exercise 7: Sum Odd\n" +
                "45. The while and do while statements (+Challenge Exercise)\n" +
                "46. While and Do While Recap\n" +
                "47. Digit Sum Challenge\n" +
                "Coding Exercise 8: Number Palindrome\n" +
                "Coding Exercise 9: First And Last Digit Sum\n" +
                "Coding Exercise 10: Number To Words\n" +
                "Section 7: OOP Part 1 - Classes, Constructors and Inheritance\n" +
                "48. Introduction\n" +
                "49. Classes Part 1\n" +
                "50. Classes Part 2\n" +
                "51. Constructors - Part 1 (+Challenge Exercise)\n" +
                "52. Constructors - Part 2 (+Challenge Exercise)\n" +
                "53. Inheritance - Part 1\n" +
                "54. Inheritance - Part 2\n" +
                "55. Reference vs Object vs Instance vs Class\n" +
                "56. this vs super\n" +
                "57. Method Overloading vs Overriding Recap\n" +
                "58. Inheritance Challenge Part 1 (+Challenge Exercise)\n" +
                "59. Inheritance Challenge Part 2\n" +
                "Section 8: OOP Part 2 - Composition, Encapsulation, and Polymorphism\n" +
                "60. Introduction\n" +
                "61. Composition\n" +
                "62. Composition Part 2 (+Challenge Exercise)\n" +
                "63. Encapsulation\n" +
                "64. Encapsulation (+Challenge Exercise)\n" +
                "65. Polymorphism\n" +
                "66. Polymorphism (+Challenge Exercise)\n" +
                "67. OOP Master Challenge Exercise\n" +
                "68. OOP Challenge - Solution\n" +
                "Section 9: Arrays, Java inbuilt Lists, Autoboxing and Unboxing\n" +
                "69. Arrays\n" +
                "70. Arrays (Challenge Exercise)\n" +
                "71. Arrays Recap\n" +
                "72. List and ArrayList Part 1\n" +
                "73. ArrayList Part 2\n" +
                "74. ArrayList Part 3\n" +
                "75. ArrayList Challenge Part 1\n" +
                "76. ArrayList Challenge Part 2\n" +
                "77. ArrayList Challenge Part 3\n" +
                "78. Bug Fix for ArrayList Challenge\n" +
                "79. Autoboxing and Unboxing\n" +
                "80. Autoboxing & Unboxing (Challenge Exercise) - Part 1\n" +
                "81. Autoboxing & Unboxing (Challenge Exercise) - Part 2\n" +
                "82. Autoboxing & Unboxing (Challenge Exercise) - Part 3\n" +
                "83. LinkedList Part 1\n" +
                "84. LinkedList Part 2\n" +
                "85. LinkedList Part 3\n" +
                "86. LinkedList Challenge Part 1\n" +
                "87. Bug Fix for \"Track 1\" Error\n" +
                "88. LinkedList Challenge Part 2\n" +
                "89. LinkedList Challenge Part 3 (Final video)\n" +
                "Section 10: Inner and Abstract Classes & Interfaces\n" +
                "90. Interfaces\n" +
                "91. Interfaces Part 2\n" +
                "92. Interfaces Challenge Part 1\n" +
                "93. Interfaces Challenge Part 2\n" +
                "94. Inner classes Part 1\n" +
                "95. Inner Classes Part 2\n" +
                "96. Inner Classes Challenge\n" +
                "97. Abstract Classes Part 1\n" +
                "98. Abstract Classes Part 2\n" +
                "99. Interface vs Abstract Class\n" +
                "100. Abstract Class Challenge Part 1\n" +
                "101. Abstract Class Challenge Part 2\n" +
                "102. Abstract Class Challenge Part 3 (includes recursion).\n" +
                "Section 11: Java Generics\n" +
                "103. Generics Introduction\n" +
                "104. Our Generics Class\n" +
                "105. Our Generics Class Part 2\n" +
                "106. Our Generics Class Part 3\n" +
                "107. Generics Challenge\n" +
                "Section 12: Naming Conventions and Packages. static and final keywords\n" +
                "108. Naming Conventions\n" +
                "109. Packages\n" +
                "110. Packages Part 2\n" +
                "111. Packages Part 3\n" +
                "112. Packages (Challenge Exercise)\n" +
                "113. Scope\n" +
                "114. Scope Part 2 and Visibility\n" +
                "115. Scope +(Challenge Exercise)\n" +
                "116. Access Modifiers\n" +
                "117. The static statement\n" +
                "118. The final statement\n" +
                "119. Final Part 2 and Static Initializers\n" +
                "Section 13: Java Collections\n" +
                "120. Collections Overview\n" +
                "121. Binary Search\n" +
                "122. Collections List Methods\n" +
                "123. Comparable and Comparator\n" +
                "124. Maps\n" +
                "125. Map Continued and Adventure Game\n" +
                "126. Adding Exits to the Adventure game\n" +
                "127. Adventure Game challenge\n" +
                "128. Immutable Classes\n" +
                "129. Immutable Class Challenge\n" +
                "130. Sets & HashSet\n" +
                "131. HashSet - equals() and hashCode()\n" +
                "132. Finish off equals() and hashcode()\n" +
                "133. Potential issue with equals() and sub-classing\n" +
                "134. Sets - Symmetric & Asymmetric\n" +
                "135. Finishing Off Sets\n" +
                "136. Sets Challenge Part 1\n" +
                "137. Sets Challenge Part 2\n" +
                "138. Sets Challenge Part 3\n" +
                "139. Sorted Collections\n" +
                "140. StockList Class With Maps\n" +
                "141. Add a Basket\n" +
                "142. TreeMap and Unmodifiable Maps\n" +
                "143. Challenge Part 1\n" +
                "144. Challenge Part 2\n" +
                "145. Challenge Part 3\n" +
                "146. Challenge Part 4 (Final)\n" +
                "Section 14: JavaFX\n" +
                "147. Introduction\n" +
                "148. Code Vs FXml\n" +
                "149. GridPane Layout\n" +
                "150. HBox Layout\n" +
                "151. BorderPane Layout\n" +
                "152. Other Layouts\n" +
                "153. Controls\n" +
                "154. RadioButton and CheckBox\n" +
                "155. ComboBox and ChoiceBox\n" +
                "156. Slider, Spinner, ColorPicker & DatePicker Controls\n" +
                "157. TitledPane\n" +
                "158. Events and Event Handlers\n" +
                "159. Events Continued\n" +
                "160. UI Thread\n" +
                "161. Threads and Runnable\n" +
                "162. Setup Sample Todo List Application\n" +
                "163. Base Interface\n" +
                "164. Add Change Listener\n" +
                "165. Formatting Dates\n" +
                "166. Singletons\n" +
                "167. Load and Save ToDo Items from/to Disk\n" +
                "168. Add DialogPane\n" +
                "169. Show Dialog and Add Controller Code\n" +
                "170. Bug Fix and Update List View\n" +
                "171. Data Binding and Observable\n" +
                "172. Cell Factories\n" +
                "173. Context Menu\n" +
                "174. KeyEvents and Toolbars\n" +
                "175. SortedList\n" +
                "176. FilteredList\n" +
                "177. CSS With JavaFX\n" +
                "178. Transforming Nodes and Choosers\n" +
                "179. More on Choosers and Web Pages\n" +
                "180. SceneBuilder\n" +
                "181. Installing SceneBuilder for Windows\n" +
                "182. Installing SceneBuilder for Mac\n" +
                "183. Overview of SceneBuilder\n" +
                "184. Building a UI with SceneBuilder\n" +
                "185. More on SceneBuilder\n" +
                "186. JavaFX Challenge\n" +
                "187. JavaFX Challenge Part 2\n" +
                "188. JavaFX Challenge Part 3\n" +
                "189. JavaFX Challenge Part 4\n" +
                "190. JavaFX Challenge Wrap up\n" +
                "Section 15: Basic Input & Output including java.util\n" +
                "191. Exceptions\n" +
                "192. Stack Trace and Call Stack\n" +
                "193. Catching and throwing Exceptions\n" +
                "194. Multi Catch Exceptions\n" +
                "195. Introduction to I/O\n" +
                "196. Writing content - FileWriter class and Finally block\n" +
                "197. Try with Resources\n" +
                "198. FileReader and Closeable\n" +
                "199. BufferedReader\n" +
                "200. Load Big Location and Exits Files\n" +
                "201. Challenge\n" +
                "202. Buffered Writer and Challenge\n" +
                "203. Byte Streams\n" +
                "204. Reading Binary Data and End of File Exceptions\n" +
                "205. Object Input Output including Serialization\n" +
                "206. Finish Object I/O and RandomAccessFile class\n" +
                "207. Create Random Access File\n" +
                "208. Update Static Initializer Block With Random File Access\n" +
                "209. Update Adventure Game to Read Random Access File\n" +
                "210. Java NIO\n" +
                "211. Writing Objects With Java NIO\n" +
                "212. Reading and Writing with Java NIO\n" +
                "213. Writing Binary Files with Java NIO\n" +
                "214. Reading Files with NIO\n" +
                "215. Absolute and Relative Reads\n" +
                "216. Chained Put Methods\n" +
                "217. Writing Sequentially\n" +
                "218. FileChannel to Copy Files and Pipes with Threads\n" +
                "219. Filesystem\n" +
                "220. More on Paths\n" +
                "221. Exists and CopyFile\n" +
                "222. Move, Rename and Delete\n" +
                "223. File Attributes\n" +
                "224. Read Existing Directory Contents\n" +
                "225. Separators Temp Files and File Stores\n" +
                "226. Walk File Tree\n" +
                "227. Copy Entire Tree\n" +
                "228. Mapping IO and NIO Methods\n" +
                "Section 16: Concurrency in Java\n" +
                "229. Concurrency and Threads Introduction\n" +
                "230. Threads\n" +
                "231. Runnable and Thread\n" +
                "232. Interrupt and Join\n" +
                "233. Multiple Threads\n" +
                "234. Thread Variables\n" +
                "235. Synchronisation\n" +
                "236. Producer and Consumer\n" +
                "237. Deadlocks, wait, notify and notifyAll methods\n" +
                "238. The Java Util Concurrent package\n" +
                "239. Thread Interference\n" +
                "240. Reentrant Lock and Unlock\n" +
                "241. Using Try Finally With Threads\n" +
                "242. Thread Pools\n" +
                "243. ArrayBlockingQueue Class\n" +
                "244. Deadlocks\n" +
                "245. More on Deadlocks\n" +
                "246. Thread Starvation\n" +
                "247. Fair Locks and Live Locks\n" +
                "248. Live Lock Example and Slipped Conditions\n" +
                "249. Other Thread Issues\n" +
                "250. JavaFX Background Tasks\n" +
                "251. Data Binding\n" +
                "252. Service\n" +
                "253. Challenge 1 and 2\n" +
                "254. Challenge 3,4 and 5\n" +
                "255. Challenge 6 and 7\n" +
                "256. Challenge 8\n" +
                "257. Challenge 9\n" +
                "Section 17: Lambda Expressions\n" +
                "258. Lambda Expressions Introduction\n" +
                "259. Lambda Expressions Continued\n" +
                "260. Lambda Expressions Nested Blocks\n" +
                "261. Scope and Functional Programming\n" +
                "262. Functional Interfaces & Predicates\n" +
                "263. More on Predicates & Suppliers\n" +
                "264. Functions\n" +
                "265. Chaining java.util.function Functions\n" +
                "266. Streams\n" +
                "267. Streams - Intermediate and Terminal Operations\n" +
                "268. Streams - Flatmap & Lambda Best Practices\n" +
                "269. Lambda Challenge Part 1\n" +
                "270. Lambda Challenge Part 2\n" +
                "Section 18: Regular Expressions\n" +
                "271. Regular Expressions Introduction\n" +
                "272. Character classes and Boundary Matchers\n" +
                "273. Quantifiers and the Pattern and Matcher classes\n" +
                "274. Matcher find and Group Methods\n" +
                "275. And, Or & Not\n" +
                "276. Regular Expressions Challenge Part 1\n" +
                "277. Regular Expressions Challenge Part 2\n" +
                "278. Regular Expressions Challenge Part 3\n" +
                "Section 19: Debugging and Unit Testing\n" +
                "279. Introduction to Debugging\n" +
                "280. More on Debugging\n" +
                "281. Field Watch Points\n" +
                "282. Advanced Debugging\n" +
                "283. Introduction to Unit Testing with JUnit\n" +
                "284. Asserts in Junit\n" +
                "285. More Asserts and Exception Handling\n" +
                "286. Parameterized Testing\n" +
                "287. JUnit Challenge #1 and #2\n" +
                "288. JUnit Challenges #3 to #7\n" +
                "289. Junit Challenges #8 to #10\n" +
                "Section 20: Databases\n" +
                "290. Section Introduction\n" +
                "291. Database Terminology\n" +
                "292. Install and Setup SQLite for Windows\n" +
                "293. Install and Setup SQLite for Mac\n" +
                "294. Install and Setup SQLite for Linux\n" +
                "295. Introduction to SQLite\n" +
                "296. More with SQLite\n" +
                "297. Querying Data With SQL\n" +
                "298. SQL Order by and Joins\n" +
                "299. More Complex Joins\n" +
                "300. Wildcards in Queries and Views\n" +
                "301. Housekeeping and Final SQL Challenge\n" +
                "302. JDBC and SQLite GUI Browser\n" +
                "303. Creating Databases With JDBC in Java\n" +
                "304. JDBC Insert, Update, Delete\n" +
                "305. .executeQuery() and using Constants\n" +
                "306. The Music SQLite Database\n" +
                "307. Write Java Query for Artists\n" +
                "308. Executing SQL in DB Browser\n" +
                "309. Query Albums by Artist Method\n" +
                "310. Query Artists for Song method\n" +
                "311. Result Set Meta Data\n" +
                "312. Functions and Views\n" +
                "313. Write the Method to Query View\n" +
                "314. SQL Injection Attacks and Prepared Statements\n" +
                "315. Transactions\n" +
                "316. Inserting Records With JDBC\n" +
                "317. Insert Albums, Artists, and Songs\n" +
                "318. Test Insert JDBC Code\n" +
                "319. JDBC with a GUI Program\n" +
                "320. Add Artists\n" +
                "321. Fix Artist and Preload Records\n" +
                "322. Implement Artist Query\n" +
                "323. Add ProgressBar\n" +
                "324. Handling Updates\n" +
                "Section 21: Java Networking Programming\n" +
                "325. Networking Overview\n" +
                "326. First Client and Server Apps\n" +
                "327. Multi Threaded Server\n" +
                "328. Multi-Threading and Timeouts\n" +
                "329. UDP Server and Client\n" +
                "330. High Level APIS\n" +
                "331. URL Connections and Input Stream Reader\n" +
                "332. HTTPUrlConnection\n" +
                "333. Alternatives to HTTPUrlConnection\n" +
                "Section 22: Java 9 Module System\n" +
                "334. Introduction to Modules\n" +
                "335. Module Declarations and Statements\n" +
                "336. Module Types\n" +
                "Section 23: Migrating Java Projects to Java 9\n" +
                "337. Project Setup and Test\n" +
                "338. Structuring the new project\n" +
                "339. Creating the first module (Common)\n" +
                "340. Creating the Module Descriptor file\n" +
                "341. Creating the 2nd module (Database)\n" +
                "342. Challenge - Create the final module (UI)\n" +
                "343. Transitive Dependencies\n" +
                "Section 24: Bonus Material\n" +
                "344. Bonus - Please Watch!\n" +
                "345. All Courses\n" +
                "346. Source code for all Programs";

        assertEquals(expected, Cleaner.cleanText(input));
    }
}
