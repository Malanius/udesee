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
                "2. How to Use This Section Of The Course\n" +
                "1:01\n" +
                "3. How To Install The Java Development Kit (JDK) For Windows\n" +
                "5:15\n" +
                "4. Download and Install IntelliJ (FREE and PAID version) for Windows\n" +
                "9:54\n" +
                "5. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "0:00\n" +
                "6. How To Install The Java Development Kit (JDK) For Mac OS X\n" +
                "2:44\n" +
                "7. Download and Install IntelliJ (FREE and PAID version) on a Mac\n" +
                "9:43\n" +
                "8. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "0:00\n" +
                "9. How To Install The Java Development Kit (JDK) For Ubuntu Linux\n" +
                "4:20\n" +
                "10. Install and Configure IntelliJ (FREE and PAID version) for Ubuntu Linux\n" +
                "10:22\n" +
                "11. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "0:00\n" +
                "Section: 3\n" +
                "3 / 3\n" +
                "First Steps\n" +
                "12. Introduction\n" +
                "0:37\n" +
                "13. Creating Your First Java Project\n" +
                "12:10\n" +
                " First Steps - Creating Your First Java Project\n" +
                "14. Exploring The IntelliJ Interface\n" +
                "7:24\n" +
                "Section: 4\n" +
                "8 / 8\n" +
                "Variables, Datatypes and Operators\n" +
                "15. Introduction\n" +
                "0:27\n" +
                "16. What Are Variables?\n" +
                "15:13\n" +
                " Variables, Datatypes and Operators - What Are Variables\n" +
                "17. Getting To Know Primitive Data Types - The Byte, Short, Int And Long\n" +
                "18:45\n" +
                " Variables, Datatypes and Operators - Getting To Know Primitive Data Types - The Byte, Short, Int And Long\n" +
                "18. Getting To Know Primitive Data Types - Float And Double\n" +
                "12:57\n" +
                " Variables, Datatypes and Operators - Getting To Know Primitive Data Types - Float And Double\n" +
                "19. Getting To Know Primitive Data Types - Char And Boolean\n" +
                "7:22\n" +
                " Unicode Table website\n" +
                " Variables, Datatypes and Operators - Getting To Know Primitive Data Types - Char And Boolean\n" +
                "20. Understanding Strings And Finishing Up Primitive Data Types\n" +
                "11:56\n" +
                " Variables, Datatypes and Operators - Understanding Strings And Finishing Up Primitive Data Types\n" +
                "21. Operators In Java\n" +
                "16:12\n" +
                " Variables, Datatypes and Operators - Operators In Java\n" +
                "22. More On Operators And Operator Precedence\n" +
                "19:22\n" +
                " Summary of Operators\n" +
                " Java Operator Precedence Table\n" +
                " Variables, Datatypes and Operators - More On Operators And Operator Precedence\n" +
                "Section: 5\n" +
                "7 / 7\n" +
                "Java Tutorial: Expressions, Statements, Code blocks, Methods and more\n" +
                "23. Introduction\n" +
                "0:31\n" +
                "24. Keywords And Expressions\n" +
                "7:18\n" +
                " List of Java Keywords\n" +
                " Java Tutorial Expressions, Statements, Code blocks, Methods and more - Keywords And Expressions\n" +
                "25. Statements, Whitespace and Indentation (Code Organization)\n" +
                "9:24\n" +
                " Java Tutorial Expressions, Statements, Code blocks, Methods and more - Statements, Whitespace and Intentation (Code Organization)\n" +
                "26. Code Blocks And The If Then Else Control Statements\n" +
                "17:08\n" +
                " Java Tutorial Expressions, Statements, Code blocks, Methods and more - Code Blocks And The If Then Else Control Statements\n" +
                "27. Methods In Java\n" +
                "17:43\n" +
                " Java Tutorial Expressions, Statements, Code blocks, Methods and more - Methods In Java\n" +
                "28. More On Methods And A Challenge\n" +
                "15:08\n" +
                " lecture-28-challenge.txt\n" +
                " Java Tutorial Expressions, Statements, Code blocks, Methods and more - More On Methods And A Challenge\n" +
                "29. Method Overloading\n" +
                "27:01\n" +
                " Feet to Centimeters\n" +
                " Java Tutorial Expressions, Statements, Code blocks, Methods and more - Method Overloading\n" +
                "Section: 6\n" +
                "4 / 4\n" +
                "Control Flow Statements\n" +
                "30. Introduction\n" +
                "0:38\n" +
                "31. The switch statement (+Challenge Exercise)\n" +
                "19:32\n" +
                " lecture-31-challenge.txt\n" +
                " Control Flow Statements - The switch statement (plus Challenge Exercise)\n" +
                "32. The for Statement (+Challenge Exercise)\n" +
                "25:02\n" +
                " The First 1,000 Primes\n" +
                " lecture-32-challenge.txt\n" +
                " Control Flow Statements - The for Statement (plus Challenge Exercise)\n" +
                "33. The while and do while statements (+Challenge Exercise)\n" +
                "16:31\n" +
                " lecture-33-challenge.txt\n" +
                " Control Flow Statements - The while and do while statements (+Challenge Exercise)\n" +
                "Section: 7\n" +
                "9 / 9\n" +
                "OOP Part 1 - Classes, Constructors and Inheritance\n" +
                "34. Introduction\n" +
                "0:36\n" +
                "35. Classes Part 1\n" +
                "16:31\n" +
                " OOP Part 1 - Classes Part 1\n" +
                "36. Classes Part 2\n" +
                "13:27\n" +
                " OOP Part 1 - Classes Part 2\n" +
                "37. Constructors - Part 1 (+Challenge Exercise)\n" +
                "18:55\n" +
                " lecture-37-challenge.txt\n" +
                " OOP Part 1 - Constructors - Part 1 (plus Challenge Exercise)\n" +
                "38. Constructors - Part 2 (+Challenge Exercise)\n" +
                "16:00\n" +
                " Withdrawal-method-bug-fix.zip\n" +
                " lecture-38-challenge.txt\n" +
                " OOP Part 1 - Constructors - Part 2 (plus Challenge Exercise)\n" +
                "39. Inheritance - Part 1\n" +
                "19:39\n" +
                " OOP Part 1 - Inheritance - Part 1\n" +
                "40. Inheritance - Part 2\n" +
                "13:24\n" +
                " OOP Part 1 - Inheritance - Part 2\n" +
                "41. Inheritance Challenge Part 1 (+Challenge Exercise)\n" +
                "16:38\n" +
                " lecture-41-challenge.txt\n" +
                " OOP Part 1 - Inheritance Challenge Part 1 (plus Challenge Exercise)\n" +
                "42. Inheritance Challenge Part 2\n" +
                "10:04\n" +
                " OOP Part 1 - Inheritance Challenge Part 2\n" +
                "Section: 8\n" +
                "9 / 9\n" +
                "OOP Part 2 - Composition, Encapsulation, and Polymorphism\n" +
                "43. Introduction\n" +
                "0:37\n" +
                "44. Composition\n" +
                "17:19\n" +
                " OOP Part 2 - Composition\n" +
                "45. Composition Part 2 (+Challenge Exercise)\n" +
                "14:17\n" +
                " lecture-45-challenge.txt\n" +
                " OOP Part 2 - Composition Part 2 (plus Challenge Exercise)\n" +
                "46. Encapsulation\n" +
                "19:23\n" +
                " OOP Part 2 - Encapsulation\n" +
                "47. Encapsulation (+Challenge Exercise)\n" +
                "14:16\n" +
                " lecture-47-challenge.txt\n" +
                " OOP Part 2 - Encapsulation (plus Challenge Exercise)\n" +
                "48. Polymorphism\n" +
                "20:35\n" +
                " OOP Part 2 - Polymorphism\n" +
                "49. Polymorphism (+Challenge Exercise)\n" +
                "18:46\n" +
                " lecture-49-challenge.txt\n" +
                " OOP Part 2 - Polymorphism (plus Challenge Exercise)\n" +
                "50. OOP Master Challenge Exercise\n" +
                "15:59\n" +
                " lecture-50-challenge.txt\n" +
                " OOP Part 2 - OOP Master Challenge Exercise\n" +
                "51. OOP Challenge - Solution\n" +
                "15:32\n" +
                " OOP Part 2 - OOP Challenge - Solution\n" +
                "Section: 9\n" +
                "18 / 18\n" +
                "Arrays, Java inbuilt Lists, Autoboxing and Unboxing\n" +
                "52. Arrays\n" +
                "21:27\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Arrays\n" +
                "53. Arrays (Challenge Exercise)\n" +
                "16:20\n" +
                " lecture-53-challenge.txt\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Arrays (Challenge Exercise)\n" +
                "54. List and ArrayList Part 1\n" +
                "16:29\n" +
                " ArrayResizeDemo.java\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - List and ArrayList Part 1\n" +
                "55. ArrayList Part 2\n" +
                "20:11\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Part 2\n" +
                "56. ArrayList Part 3\n" +
                "16:48\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Part 3\n" +
                "57. ArrayList Challenge Part 1\n" +
                "14:00\n" +
                " lecture-57-challenge.txt\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Challenge Part 1\n" +
                "58. ArrayList Challenge Part 2\n" +
                "18:12\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Challenge Part 2\n" +
                "59. ArrayList Challenge Part 3\n" +
                "10:49\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - ArrayList Challenge Part 3\n" +
                "60. Autoboxing and Unboxing\n" +
                "16:16\n" +
                " https://www.dropbox.com/s/kht56ric73byvts/Arrays%2C-Java-inbuilt-Lists%2C-Autoboxing-and-Unboxing-ArrayList-Challenge-Part-3-Source-code.zip?dl=1\n" +
                "61. Autoboxing & Unboxing (Challenge Exercise) - Part 1\n" +
                "16:49\n" +
                " lecture-61-challenge.txt\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Autoboxing & Unboxing (Challenge Exercise) - Part 1\n" +
                "62. Autoboxing & Unboxing (Challenge Exercise) - Part 2\n" +
                "17:08\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Autoboxing & Unboxing (Challenge Exercise) - Part 2\n" +
                "63. Autoboxing & Unboxing (Challenge Exercise) - Part 3\n" +
                "9:32\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - Autoboxing & Unboxing (Challenge Exercise) - Part 3\n" +
                "64. LinkedList Part 1\n" +
                "16:43\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Part 1\n" +
                "65. LinkedList Part 2\n" +
                "15:30\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Part 2\n" +
                "66. LinkedList Part 3\n" +
                "20:46\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Part 3\n" +
                "67. LinkedList Challenge Part 1\n" +
                "14:05\n" +
                " lecture-67-challenge.txt\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Challenge Part 1\n" +
                "68. LinkedList Challenge Part 2\n" +
                "17:20\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Challenge Part 2\n" +
                "69. LinkedList Challenge Part 3 (Final video)\n" +
                "15:45\n" +
                " Arrays, Java inbuilt Lists, Autoboxing and Unboxing - LinkedList Challenge Part 3 (Final video)\n" +
                "Section: 10\n" +
                "12 / 12\n" +
                "Inner and Abstract Classes & Interfaces\n" +
                "70. Interfaces\n" +
                "12:34\n" +
                " Inner and Abstract Classes & Interfaces - Interfaces\n" +
                "71. Interfaces Part 2\n" +
                "14:30\n" +
                " Inner and Abstract Classes & Interfaces - Interfaces Part 2\n" +
                " Inner and Abstract Classes & Interfaces - Interfaces Part 2 Mobile Phone\n" +
                "72. Interfaces Challenge Part 1\n" +
                "17:39\n" +
                " lecture-72-challenge.txt\n" +
                " Inner and Abstract Classes & Interfaces - Interfaces Challenge Part 1\n" +
                "73. Interfaces Challenge Part 2\n" +
                "9:00\n" +
                " Inner and Abstract Classes & Interfaces - Interfaces Challenge Part 2\n" +
                "74. Inner classes Part 1\n" +
                "17:10\n" +
                " Inner and Abstract Classes & Interfaces - Inner classes Part 1\n" +
                "75. Inner Classes Part 2\n" +
                "14:45\n" +
                " Inner and Abstract Classes & Interfaces - Inner Classes Part 2\n" +
                "76. Inner Classes Challenge\n" +
                "10:32\n" +
                " lecture-78-challenge.txt\n" +
                " Inner and Abstract Classes & Interfaces - Inner Classes Challenge\n" +
                "77. Abstract Classes Part 1\n" +
                "16:42\n" +
                " Inner and Abstract Classes & Interfaces - Abstract Classes Part 1\n" +
                "78. Abstract Classes Part 2\n" +
                "10:55\n" +
                " Inner and Abstract Classes & Interfaces - Abstract Classes Part 2\n" +
                "79. Abstract Class Challenge Part 1\n" +
                "19:46\n" +
                " lecture-79-challenge.txt\n" +
                " Inner and Abstract Classes & Interfaces - Abstract Class Challenge Part 1\n" +
                "80. Abstract Class Challenge Part 2\n" +
                "12:53\n" +
                " Inner and Abstract Classes & Interfaces - Abstract Class Challenge Part 2\n" +
                "81. Abstract Class Challenge Part 3\n" +
                "19:46\n" +
                " Inner and Abstract Classes & Interfaces - Abstract Class Challenge Part 3\n" +
                "Section: 11\n" +
                "5 / 5\n" +
                "Java Generics\n" +
                "82. Generics Introduction\n" +
                "11:12\n" +
                " Java Generics - Generics Introduction\n" +
                "83. Our Generics Class\n" +
                "11:37\n" +
                " Java Generics - Our Generics Class\n" +
                "84. Our Generics Class Part 2\n" +
                "18:57\n" +
                " Java Generics - Our Generics Class Part 2\n" +
                "85. Our Generics Class Part 3\n" +
                "10:13\n" +
                " Java Generics - Our Generics Class Part 3\n" +
                "86. Generics Challenge\n" +
                "13:08\n" +
                " lecture-86-challenge.txt\n" +
                " Java Generics - Generics Challenge\n" +
                "Section: 12\n" +
                "12 / 12\n" +
                "Naming Conventions and Packages. static and final keywords\n" +
                "87. Naming Conventions\n" +
                "7:09\n" +
                "88. Packages\n" +
                "17:02\n" +
                " Naming Conventions and Packages - Packages\n" +
                "89. Packages Part 2\n" +
                "11:40\n" +
                " Naming Conventions and Packages - Packages Part 2\n" +
                "90. Packages Part 3\n" +
                "12:05\n" +
                " Naming Conventions and Packages - Packages Part 3\n" +
                "91. Packages (Challenge Exercise)\n" +
                "12:57\n" +
                " lecture-91-challenge.txt\n" +
                " Naming Conventions and Packages - Packages (Challenge Exercise)\n" +
                "92. Scope\n" +
                "17:25\n" +
                " Naming Conventions and Packages - Scope\n" +
                "93. Scope Part 2 and Visibility\n" +
                "12:07\n" +
                " Naming Conventions and Packages - Scope Part 2 and Visibility\n" +
                "94. Scope +(Challenge Exercise)\n" +
                "5:56\n" +
                " lecture-94-challenge.txt\n" +
                " Naming Conventions and Packages - Scope plus (Challenge Exercise)\n" +
                "95. Access Modifiers\n" +
                "16:51\n" +
                " Naming Conventions and Packages - Access Modifiers\n" +
                "96. The static statement\n" +
                "12:32\n" +
                " Naming Conventions and Packages - The static statement\n" +
                "97. The final statement\n" +
                "14:37\n" +
                " Naming Conventions and Packages - The final statement\n" +
                "98. Final Part 2 and Static Initializers\n" +
                "9:01\n" +
                " Naming Conventions and Packages - Final Part 2 and Static Initializers\n" +
                "Section: 13\n" +
                "27 / 27\n" +
                "Java Collections\n" +
                "99. Collections Overview\n" +
                "15:47\n" +
                " Java Collections - Collections Overview\n" +
                "100. Binary Search\n" +
                "15:39\n" +
                " Interfaces Java Docs\n" +
                " Java Collections - Binary Search\n" +
                "101. Collections List Methods\n" +
                "18:23\n" +
                " Java Collections - Collections List Methods\n" +
                "102. Comparable and Comparator\n" +
                "18:55\n" +
                " Java Collections - Comparable and Comparator\n" +
                "103. Maps\n" +
                "16:51\n" +
                " Maps Document Link\n" +
                " Java Collections - Maps\n" +
                "104. Map Continued and Adventure Game\n" +
                "16:33\n" +
                " Java Collections - Map Continued and Adventure Game\n" +
                "105. Adding Exits to the Adventure game\n" +
                "18:04\n" +
                " Java Collections - Adding Exits to the Adventure game\n" +
                "106. Adventure Game challenge\n" +
                "8:13\n" +
                " lecture-106-challenge.txt\n" +
                " Java Collections - Adventure Game challenge\n" +
                "107. Immutable Classes\n" +
                "15:42\n" +
                " A Strategy for Defining Immutable Objects\n" +
                " Java Collections - Immutable Classes\n" +
                "108. Immutable Class Challenge\n" +
                "4:32\n" +
                " lecture-108-challenge.txt\n" +
                " Java Collections - Immutable Class Challenge\n" +
                "109. Sets & HashSet\n" +
                "19:52\n" +
                " Virtual Machine Performance Enhancements\n" +
                " Java Collections - Sets & HashSet\n" +
                "110. HashSet - equals() and hashCode()\n" +
                "16:52\n" +
                " Java Collections - HashSet - equals() and hashCode()\n" +
                "111. Finish off equals() and hashcode()\n" +
                "10:56\n" +
                " equals documentation\n" +
                " Java Collections - Finish off equals() and hashcode()\n" +
                "112. Potential issue with equals() and sub-classing\n" +
                "11:59\n" +
                " lecture-112-challenge.txt\n" +
                " Java Collections - Potential issue with equals() and sub-classing\n" +
                "113. Sets - Symmetric & Asymmetric\n" +
                "15:34\n" +
                " The Set Interface\n" +
                " Java Collections - Sets - Symmetric & Asymmetric\n" +
                "114. Finishing Off Sets\n" +
                "9:16\n" +
                " Java Collections - Finishing Off Sets\n" +
                "115. Sets Challenge Part 1\n" +
                "15:26\n" +
                " lecture-115-challenge.txt\n" +
                " Java Collections - Sets Challenge Part 1\n" +
                "116. Sets Challenge Part 2\n" +
                "12:50\n" +
                " Java Collections - Sets Challenge Part 2\n" +
                "117. Sets Challenge Part 3\n" +
                "18:17\n" +
                " International Astronomical Union\n" +
                " Java Collections - Sets Challenge Part 3\n" +
                "118. Sorted Collections\n" +
                "13:11\n" +
                " Java Collections - Sorted Collections\n" +
                "119. StockList Class With Maps\n" +
                "17:05\n" +
                " Java Collections - StockList Class With Maps\n" +
                "120. Add a Basket\n" +
                "15:49\n" +
                " Java Collections - Add a Basket\n" +
                "121. TreeMap and Unmodifiable Maps\n" +
                "20:50\n" +
                " Java Collections - TreeMap and Unmodifiable Maps\n" +
                "122. Challenge Part 1\n" +
                "12:40\n" +
                " lecture-122-challenge.txt\n" +
                " Java Collections - Challenge Part 1\n" +
                "123. Challenge Part 2\n" +
                "10:52\n" +
                " Java Collections - Challenge Part 2\n" +
                "124. Challenge Part 3\n" +
                "7:56\n" +
                " Java Collections - Challenge Part 3\n" +
                "125. Challenge Part 4 (Final)\n" +
                "18:04\n" +
                " Java Collections - Challenge Part 4 (Final)\n" +
                "Section: 14\n" +
                "43 / 43\n" +
                "JavaFX\n" +
                "126. Introduction\n" +
                "17:31\n" +
                " JavaFX - Introduction\u200B\n" +
                "127. Code Vs FXml\n" +
                "13:27\n" +
                " JavaFX - Code Vs FXml\u200B\n" +
                "128. GridPane Layout\n" +
                "15:34\n" +
                " GridPane Oracle Docs\n" +
                " AnchorPane Oracle Docs\n" +
                " JavaFX - GridPane Layout\u200B\n" +
                "129. BorderPane Layout\n" +
                "13:16\n" +
                " BorderPane Oracle Docs\n" +
                " JavaFX - BorderPane Layout\u200B\n" +
                "130. Other Layouts\n" +
                "17:09\n" +
                " FlowPane Oracle Docs\n" +
                " Stackpane Oracle Docs\n" +
                " TilePane Oracle Docs\n" +
                "Show more (2)\n" +
                "131. Controls\n" +
                "15:17\n" +
                " Button Oracle Docs\n" +
                " Graphic Repository\n" +
                " JavaFX - Controls\u200B\n" +
                "132. RadioButton and CheckBox\n" +
                "17:02\n" +
                " JavaFX - RadioButton and CheckBox\u200B\n" +
                "133. ComboBox and ChoiceBox\n" +
                "17:13\n" +
                " JavaFX - ComboBox and ChoiceBox\u200B\n" +
                "134. Slider, Spinner, ColorPicker & DatePicker Controls\n" +
                "14:30\n" +
                " JavaFX - Slider, Spinner, ColorPicker & DatePicker Controls\u200B\n" +
                "135. TitledPane\n" +
                "6:42\n" +
                " JavaFX - TitledPane\u200B\n" +
                "136. Events and Event Handlers\n" +
                "14:29\n" +
                " JavaFX - Events and Event Handlers\u200B\n" +
                "137. Events Continued\n" +
                "14:38\n" +
                " JavaFX - Events Continued\u200B\n" +
                "138. UI Thread\n" +
                "14:40\n" +
                " Checkbox JavaFX Oracle\n" +
                " JavaFX - UI Thread\u200B\n" +
                "139. Threads and Runnable\n" +
                "16:18\n" +
                " Concurrency in JavaFX\n" +
                " JavaFX - Threads and Runnable\u200B\n" +
                "140. Setup Sample Todo List Application\n" +
                "12:59\n" +
                " JavaFX - Setup Sample Todo List Application\u200B\n" +
                "141. Base Interface\n" +
                "13:28\n" +
                " JavaFX - Base Interface\u200B\n" +
                "142. Add Change Listener\n" +
                "14:17\n" +
                " JavaFX - Add Change Listener\u200B\n" +
                "143. Formatting Dates\n" +
                "7:03\n" +
                " Class DateTimeFormatter\u200B\n" +
                " JavaFX - Formatting Dates\u200B\n" +
                "144. Singletons\n" +
                "15:04\n" +
                " Class DateTimeFormatter\n" +
                " JavaFX - Singletons\u200B\n" +
                "145. Load and Save ToDo Items from/to Disk\n" +
                "16:25\n" +
                " Package java.nio\n" +
                " Class String\n" +
                " JavaFX - Load and Save ToDo Items from/to Disk\u200B\n" +
                "146. Add DialogPane\n" +
                "16:31\n" +
                " Class DialogPane\n" +
                " JavaFX - Add DialogPane\u200B\n" +
                "147. Show Dialog and Add Controller Code\n" +
                "14:33\n" +
                " JavaFX - Show Dialog and Add Controller Code\u200B\n" +
                "148. Bug Fix and Update List View\n" +
                "10:27\n" +
                " JavaFX - Bug Fix and Update List View\u200B\n" +
                "149. Data Binding and Observable\n" +
                "11:20\n" +
                " JavaFX - Data Binding and Observable\u200B\n" +
                " Class FXCollections\n" +
                " Lorem ipsum Generator\n" +
                "150. Cell Factories\n" +
                "14:44\n" +
                " JavaFX - Cell Factories\u200B\n" +
                "151. Context Menu\n" +
                "15:37\n" +
                " JavaFX - Context Menu\u200B\n" +
                "152. KeyEvents and Toolbars\n" +
                "15:41\n" +
                " JavaFX - KeyEvents and Toolbars\u200B\n" +
                "153. SortedList\n" +
                "12:44\n" +
                " JavaFX - SortedList\u200B\n" +
                "154. FilteredList\n" +
                "16:18\n" +
                " JavaFX - FilteredList\u200B\n" +
                "155. CSS With JavaFX\n" +
                "17:39\n" +
                " JavaFX CSS Reference Guide\n" +
                " JavaFX - CSS With JavaFX\u200B\n" +
                "156. Transforming Nodes and Choosers\n" +
                "16:37\n" +
                " Class Bloom\n" +
                " JavaFX - Transforming Nodes and Choosers\u200B\n" +
                "157. More on Choosers and Web Pages\n" +
                "22:11\n" +
                " Class WebEngine\n" +
                " JavaFX - More on Choosers and Web Pages\u200B\n" +
                "158. SceneBuilder\n" +
                "3:23\n" +
                "159. Installing SceneBuilder for Windows\n" +
                "5:00\n" +
                " Gluon Labs\n" +
                "160. Installing SceneBuilder for Mac\n" +
                "3:39\n" +
                " Scene Builder\n" +
                "161. Overview of SceneBuilder\n" +
                "7:15\n" +
                " JavaFX - Overview of SceneBuilder\u200B\n" +
                "162. Building a UI with SceneBuilder\n" +
                "15:49\n" +
                " JavaFX - Building a UI with SceneBuilder\u200B\n" +
                "163. More on SceneBuilder\n" +
                "17:27\n" +
                " setting up Scene Builder with NetBeans 8.0.2\n" +
                " JavaFX - More on SceneBuilder\u200B\n" +
                "164. JavaFX Challenge\n" +
                "15:14\n" +
                " ContactData source file\n" +
                " JavaFX - JavaFX Challenge\u200B\n" +
                "165. JavaFX Challenge Part 2\n" +
                "13:16\n" +
                " JavaFX - JavaFX Challenge Part 2\u200B\u200B\n" +
                "166. JavaFX Challenge Part 3\n" +
                "16:07\n" +
                " JavaFX - JavaFX Challenge Part 3\u200B\u200B\n" +
                "167. JavaFX Challenge Part 4\n" +
                "14:03\n" +
                " JavaFX - JavaFX Challenge Part 4\u200B\u200B\n" +
                "168. JavaFX Challenge Wrap up\n" +
                "9:15\n" +
                " JavaFX - JavaFX Challenge Wrap up\u200B\u200B\n" +
                "Section: 15\n" +
                "38 / 38\n" +
                "Basic Input & Output including java.util\n" +
                "169. Exceptions\n" +
                "14:00\n" +
                " Basic Input & Output including java.util - Exceptions\u200B\n" +
                "170. Stack Trace and Call Stack\n" +
                "13:04\n" +
                " Basic Input & Output including java.util - Stack Trace and Call Stack\u200B\n" +
                "171. Catching and throwing Exceptions\n" +
                "14:20\n" +
                " Basic Input & Output including java.util - Catching and throwing Exceptions\u200B\n" +
                "172. Multi Catch Exceptions\n" +
                "8:06\n" +
                " Basic Input & Output including java.util - Multi Catch Exceptions\u200B\n" +
                "173. Introduction to I/O\n" +
                "15:55\n" +
                " Basic Input & Output including java.util - Introduction to IO\u200B\n" +
                "174. Writing content - FileWriter class and Finally block\n" +
                "14:58\n" +
                " Basic Input & Output including java.util - Writing content - FileWriter class and Finally block\u200B\n" +
                "175. Try with Resources\n" +
                "12:12\n" +
                " The try-with-resources Statement\n" +
                " Basic Input & Output including java.util - Try with Resources\u200B\n" +
                "176. FileReader and Closeable\n" +
                "12:55\n" +
                " lecture-156-challenge.txt\n" +
                " Basic Input & Output including java.util - FileReader and Closeable\u200B\n" +
                "177. BufferedReader\n" +
                "12:59\n" +
                " Basic Input & Output including java.util - BufferedReader\u200B\n" +
                "178. Load Big Location and Exits Files\n" +
                "7:29\n" +
                " GameData.zip\n" +
                " Basic Input & Output including java.util - Load Big Location and Exits Files\u200B\n" +
                "179. Challenge\n" +
                "5:01\n" +
                " lecture-159-challenge.txt\n" +
                " Basic Input & Output including java.util - Challenge\u200B\n" +
                "180. Buffered Writer and Challenge\n" +
                "13:11\n" +
                " Basic Input & Output including java.util - Buffered Writer and Challenge\u200B\n" +
                "181. Byte Streams\n" +
                "15:45\n" +
                " Basic Input & Output including java.util - Byte Streams\u200B\n" +
                "182. Reading Binary Data and End of File Exceptions\n" +
                "15:44\n" +
                " Basic Input & Output including java.util - Reading Binary Data and End of File Exceptions\u200B\n" +
                "183. Object Input Output including Serialization\n" +
                "14:15\n" +
                " Basic Input & Output including java.util - Object Input Output\u200B\n" +
                "184. Finish Object I/O and RandomAccessFile class\n" +
                "16:03\n" +
                " Basic Input & Output including java.util - Finish Object IO and RandomAccessFile class\u200B\n" +
                "185. Create Random Access File\n" +
                "14:29\n" +
                " Basic Input & Output including java.util - Create Random Access File\u200B\n" +
                "186. Update Static Initializer Block With Random File Access\n" +
                "11:37\n" +
                " Basic Input & Output including java.util - Update Static Initializer Block With Random File Access\u200B\n" +
                "187. Update Adventure Game to Read Random Access File\n" +
                "14:20\n" +
                " Basic Input & Output including java.util - Update Adventure Game to Read Random Access File\u200B\n" +
                "188. Java NIO\n" +
                "14:47\n" +
                " InputOutput NIO\n" +
                " Basic Input & Output including java.util - Java NIO\u200B\n" +
                "189. Writing Objects With Java NIO\n" +
                "11:36\n" +
                " Basic Input & Output including java.util - Writing Objects With Java NIO\n" +
                "190. Reading and Writing with Java NIO\n" +
                "15:47\n" +
                " Basic Input & Output including java.util - Reading and Writing with Java NIO\n" +
                "191. Writing Binary Files with Java NIO\n" +
                "13:36\n" +
                " Basic Input & Output including java.util - Writing Binary Files with Java NIO\n" +
                "192. Reading Files with NIO\n" +
                "15:47\n" +
                " Basic Input & Output including java.util - Reading Files with NIO\n" +
                "193. Absolute and Relative Reads\n" +
                "11:10\n" +
                " Basic Input & Output including java.util - Absolute and Relative Reads\n" +
                "194. Chained Put Methods\n" +
                "13:55\n" +
                " Basic Input & Output including java.util - Chained Put Methods\n" +
                "195. Writing Sequentially\n" +
                "13:04\n" +
                " Basic Input & Output including java.util - Writing Sequentially\n" +
                "196. FileChannel to Copy Files and Pipes with Threads\n" +
                "15:04\n" +
                " Basic Input & Output including java.util - FileChannel to Copy Files and Pipes with Threads\n" +
                "197. Filesystem\n" +
                "18:02\n" +
                " Basic Input & Output including java.util - Filesystem\n" +
                " FileSystemText1.txt\n" +
                " FileSystemText2.txt\n" +
                "Show more (1)\n" +
                "198. More on Paths\n" +
                "12:17\n" +
                " Basic Input & Output including java.util - More on Paths\n" +
                "199. Exists and CopyFile\n" +
                "11:59\n" +
                " Basic Input & Output including java.util - Exists and CopyFile\n" +
                "200. Move, Rename and Delete\n" +
                "11:16\n" +
                " Basic Input & Output including java.util - Move, Rename and Delete\n" +
                "201. File Attributes\n" +
                "12:50\n" +
                " Basic Input & Output including java.util - File Attributes\n" +
                " Class Files\n" +
                " Interface BasicFileAttributes\n" +
                "202. Read Existing Directory Contents\n" +
                "14:15\n" +
                " Basic Input & Output including java.util - Read Existing Directory Contents\n" +
                " getPathMatcher\n" +
                "203. Separators Temp Files and File Stores\n" +
                "12:25\n" +
                " Basic Input & Output including java.util - Separators Temp Files and File Stores\n" +
                "204. Walk File Tree\n" +
                "11:33\n" +
                " Basic Input & Output including java.util - Walk File Tree\n" +
                "205. Copy Entire Tree\n" +
                "12:58\n" +
                " Basic Input & Output including java.util - Copy Entire Tree\n" +
                "206. Mapping IO and NIO Methods\n" +
                "12:53\n" +
                " Basic Input & Output including java.util - Mapping IO and NIO Methods\n" +
                "Section: 16\n" +
                "29 / 29\n" +
                "Concurrency in Java\n" +
                "207. Concurrency and Threads Introduction\n" +
                "6:59\n" +
                "208. Threads\n" +
                "13:32\n" +
                " Constants.txt\n" +
                " Concurrency in Java - Threads\u200B\n" +
                "209. Runnable and Thread\n" +
                "13:19\n" +
                " Class Thread\n" +
                " Concurrency in Java - Runnable and Thread\u200B\n" +
                "210. Interrupt and Join\n" +
                "9:44\n" +
                " Concurrency in Java - Interrupt and Join\u200B\n" +
                "211. Multiple Threads\n" +
                "11:52\n" +
                " ThreadColor.java\n" +
                " Concurrency in Java - Multiple Threads\u200B\n" +
                "212. Thread Variables\n" +
                "9:53\n" +
                " Concurrency in Java - Thread Variables\u200B\n" +
                "213. Synchronisation\n" +
                "11:05\n" +
                " Concurrency in Java - Synchronisation\u200B\n" +
                "214. Producer and Consumer\n" +
                "10:55\n" +
                " Concurrency in Java - Producer and Consumer\u200B\n" +
                "215. Deadlocks, wait, notify and notifyAll methods\n" +
                "14:05\n" +
                " Class Collections\n" +
                " Concurrency in Java - Deadlocks, wait, notify and notifyAll methods\u200B\n" +
                "216. The Java Util Concurrent package\n" +
                "12:09\n" +
                " ThreadColor.java\n" +
                " Concurrency in Java - The Java Util Concurrent package\u200B\n" +
                "217. Thread Interference\n" +
                "11:15\n" +
                " Class ArrayList<E>\n" +
                " Concurrency in Java - Thread Interference\u200B\n" +
                "218. Reentrant Lock and Unlock\n" +
                "10:28\n" +
                " Concurrency in Java - Reentrant Lock and Unlock\u200B\n" +
                "219. Using Try Finally With Threads\n" +
                "10:36\n" +
                " Interface Lock\n" +
                " Concurrency in Java - Using Try Finally With Threads\u200B\n" +
                "220. Thread Pools\n" +
                "12:03\n" +
                " Concurrency in Java - Thread Pools\u200B\n" +
                "221. ArrayBlockingQueue Class\n" +
                "12:29\n" +
                " Interface ExecutorService\n" +
                " Concurrency in Java - ArrayBlockingQueue Class\u200B\n" +
                "222. Deadlocks\n" +
                "10:34\n" +
                " Concurrency in Java - Deadlocks\u200B\n" +
                "223. More on Deadlocks\n" +
                "14:06\n" +
                " Concurrency in Java - More on Deadlocks\u200B\n" +
                "224. Thread Starvation\n" +
                "16:47\n" +
                " ThreadColor.java\n" +
                " Concurrency in Java - Thread Starvation\u200B\n" +
                "225. Fair Locks and Live Locks\n" +
                "12:55\n" +
                " Concurrency in Java - Fair Locks and Live Locks\u200B\n" +
                "226. Live Lock Example and Slipped Conditions\n" +
                "5:04\n" +
                " Concurrency in Java - Live Lock Example and Slipped Conditions\u200B\n" +
                "227. Other Thread Issues\n" +
                "14:04\n" +
                " Package java.util.concurrent.atomic\n" +
                " Class AtomicInteger\n" +
                "228. JavaFX Background Tasks\n" +
                "15:25\n" +
                " Class Task<V>\n" +
                " Concurrency in Java - JavaFX Background Tasks\u200B\n" +
                "229. Data Binding\n" +
                "10:16\n" +
                " Concurrency in Java - Data Binding\u200B\n" +
                "230. Service\n" +
                "14:34\n" +
                " Concurrency in Java - Service\u200B\n" +
                "231. Challenge 1 and 2\n" +
                "9:09\n" +
                " BankAccountClass.txt\n" +
                " Concurrency in Java - Challenge 1 and 2\u200B\n" +
                "232. Challenge 3,4 and 5\n" +
                "11:15\n" +
                " Concurrency in Java - Challenge 3,4 and 5\u200B\n" +
                "233. Challenge 6 and 7\n" +
                "11:00\n" +
                " Code.txt\n" +
                " Concurrency in Java - Challenge 6 and 7\u200B\n" +
                "234. Challenge 8\n" +
                "5:30\n" +
                " challenge8code.txt\n" +
                " Concurrency in Java - Challenge 8\u200B\n" +
                "235. Challenge 9\n" +
                "4:53\n" +
                " Concurrency in Java - Challenge 9\u200B\n" +
                "Section: 17\n" +
                "13 / 13\n" +
                "Lambda Expressions\n" +
                "236. Lambda Expressions Introduction\n" +
                "15:33\n" +
                " Interface Comparator<T>\n" +
                " Lambda Expressions - Lambda Expressions Introduction\u200B\n" +
                "237. Lambda Expressions Continued\n" +
                "14:50\n" +
                " Lambda Expressions - Lambda Expressions Continued\u200B\n" +
                "238. Lambda Expressions Nested Blocks\n" +
                "14:45\n" +
                " Lambda Expressions - Lambda Expressions Nested Blocks\u200B\n" +
                "239. Scope and Functional Programming\n" +
                "15:02\n" +
                " Functional programming\n" +
                " Lambda Expressions - Scope and Functional Programming\u200B\n" +
                "240. Functional Interfaces & Predicates\n" +
                "16:38\n" +
                " Interface Consumer<T>\n" +
                " Lambda Expressions - Functional Interfaces & Predicates\u200B\n" +
                "241. More on Predicates & Suppliers\n" +
                "12:06\n" +
                " Lambda Expressions - More on Predicates & Suppliers\u200B\n" +
                "242. Functions\n" +
                "13:11\n" +
                " Lambda Expressions - Functions\u200B\n" +
                "243. Chaining java.util.function Functions\n" +
                "11:56\n" +
                " Package java.util.function\n" +
                " Lambda Expressions - Chaining java.util.function Functions\u200B\n" +
                " Lambda-Expressions-Chaining-java.util.function-Functions-table.png\n" +
                "244. Streams\n" +
                "13:50\n" +
                " Method References\n" +
                " Interface Stream\n" +
                " Lambda Expressions - Streams\u200B\n" +
                "245. Streams - Intermediate and Terminal Operations\n" +
                "13:06\n" +
                " Lambda Expressions - Streams - Intermediate and Terminal Operations\u200B\n" +
                "246. Streams - Flatmap & Lambda Best Practices\n" +
                "21:30\n" +
                " Lambda Expressions - Streams - Flatmap & Lambda Best Practices\u200B\n" +
                "247. Lambda Challenge Part 1\n" +
                "12:07\n" +
                " stringbuilder.java\n" +
                " anonymousrunnable.java\n" +
                " Lambda Expressions - Lambda Challenge Part 1\u200B\n" +
                "248. Lambda Challenge Part 2\n" +
                "16:33\n" +
                " top15babynameslist.java\n" +
                " chain.java\n" +
                " Interface Comparator\n" +
                "Show more (3)\n" +
                "Section: 18\n" +
                "8 / 8\n" +
                "Regular Expressions\n" +
                "249. Regular Expressions Introduction\n" +
                "16:21\n" +
                " Regular Expressions - Regular Expressions Introduction\u200B\n" +
                "250. Character classes and Boundary Matchers\n" +
                "13:55\n" +
                " Class Pattern\n" +
                " Regular Expressions - Character classes and Boundary Matchers\u200B\n" +
                "251. Quantifiers and the Pattern and Matcher classes\n" +
                "14:42\n" +
                " Class Matcher\n" +
                " Regular Expressions - Quantifiers and the Pattern and Matcher classes\u200B\n" +
                " Class Pattern\n" +
                "252. Matcher find and Group Methods\n" +
                "15:03\n" +
                " Class Matcher\n" +
                " Regular Expressions - Matcher find and Group Methods\u200B\n" +
                "253. And, Or & Not\n" +
                "15:26\n" +
                " Regular Expressions - And, Or & Not\u200B\n" +
                "254. Regular Expressions Challenge Part 1\n" +
                "17:04\n" +
                " Regular Expressions - Regular Expressions Challenge Part 1\u200B\n" +
                "255. Regular Expressions Challenge Part 2\n" +
                "15:30\n" +
                " Matcher\n" +
                " Regular Expressions - Regular Expressions Challenge Part 2\u200B\n" +
                "256. Regular Expressions Challenge Part 3\n" +
                "6:13\n" +
                " Regular Expressions - Regular Expressions Challenge Part 3\u200B\n" +
                "Section: 19\n" +
                "11 / 11\n" +
                "Debugging and Unit Testing\n" +
                "257. Introduction to Debugging\n" +
                "17:57\n" +
                " Debugging and Unit Testing - Introduction to Debugging\u200B\n" +
                "258. More on Debugging\n" +
                "11:24\n" +
                " Debugging and Unit Testing - More on Debugging\u200B\n" +
                "259. Field Watch Points\n" +
                "16:14\n" +
                " Debugging and Unit Testing - Field Watch Points\u200B\n" +
                "260. Advanced Debugging\n" +
                "10:14\n" +
                " JTransforms\n" +
                " Debugging and Unit Testing - Advanced Debugging\u200B\n" +
                "261. Introduction to Unit Testing with JUnit\n" +
                "16:20\n" +
                " Debugging and Unit Testing - Introduction to Unit Testing with JUnit\u200B\n" +
                "262. Asserts in Junit\n" +
                "18:19\n" +
                " Debugging and Unit Testing - Asserts in Junit\u200B\n" +
                "263. More Asserts and Exception Handling\n" +
                "16:34\n" +
                " Debugging and Unit Testing - More Asserts and Exception Handling\n" +
                "264. Parameterized Testing\n" +
                "12:21\n" +
                " Debugging and Unit Testing - Parameterized Testing\u200B\n" +
                "265. JUnit Challenge #1 and #2\n" +
                "21:41\n" +
                " Debugging and Unit Testing - JUnit Challenge 1 and 2\u200B\n" +
                " Debugging and Unit Testing - JUnit Challenge 1 and 2\u200B - challenge code.txt\n" +
                "266. JUnit Challenges #3 to #7\n" +
                "12:22\n" +
                " Debugging and Unit Testing - JUnit Challenges 3 to 7\u200B\n" +
                "267. Junit Challenges #8 to #10\n" +
                "12:06\n" +
                " Debugging and Unit Testing - Junit Challenges 8 to 10\u200B\n" +
                "Section: 20\n" +
                "12 / 35\n" +
                "Databases\n" +
                "268. Section Introduction\n" +
                "1:55\n" +
                "269. Database Terminology\n" +
                "10:32\n" +
                "270. Install and Setup SQLite for Windows\n" +
                "7:56\n" +
                "271. Install and Setup SQLite for Mac\n" +
                "2:00\n" +
                "272. Install and Setup SQLite for Linux\n" +
                "2:38\n" +
                "273. Introduction to SQLite\n" +
                "11:15\n" +
                "274. More with SQLite\n" +
                "10:42\n" +
                "275. Querying Data With SQL\n" +
                "16:02\n" +
                " SQLite Autoincrement\n" +
                " music.zip\n" +
                "276. SQL Order by and Joins\n" +
                "13:11\n" +
                "277. More Complex Joins\n" +
                "11:44\n" +
                "278. Wildcards in Queries and Views\n" +
                "15:17\n" +
                "279. Housekeeping and Final SQL Challenge\n" +
                "14:17\n" +
                "280. JDBC and SQLite GUI Browser\n" +
                "15:49\n" +
                " Bit Bucket\n" +
                " DB Browser for SQLite\n" +
                " Databases - JDBC and SQLite GUI Browser\u200B\n" +
                "281. Creating Databases With JDBC in Java\n" +
                "17:26\n" +
                " Databases - Creating Databases With JDBC in Java\u200B\n" +
                "282. JDBC Insert, Update, Delete\n" +
                "15:49\n" +
                " Databases - JDBC Insert, Update, Delete\u200B\n" +
                "283. .executeQuery() and using Constants\n" +
                "20:39\n" +
                " Databases - .executeQuery() and using Constants\u200B\n" +
                "284. The Music SQLite Database\n" +
                "12:43\n" +
                " Databases - The Music SQLite Database\u200B\n" +
                "285. Write Java Query for Artists\n" +
                "14:46\n" +
                " Databases - Write Java Query for Artists\u200B\n" +
                "286. Executing SQL in DB Browser\n" +
                "17:18\n" +
                " Databases - Executing SQL in DB Browser\u200B\n" +
                "287. Query Albums by Artist Method\n" +
                "16:23\n" +
                " Databases - Query Albums by Artist Method\u200B\n" +
                "288. Query Artists for Song method\n" +
                "15:03\n" +
                " Databases - Query Artists for Song method\u200B\n" +
                "289. Result Set Meta Data\n" +
                "14:38\n" +
                " Interface ResultSetMetaData\n" +
                " Databases - Result Set Meta Data\u200B\n" +
                "290. Functions and Views\n" +
                "16:38\n" +
                " Databases - Functions and Views\u200B\n" +
                "291. Write the Method to Query View\n" +
                "11:48\n" +
                " Databases - Write the Method to Query View\u200B\n" +
                "292. SQL Injection Attacks and Prepared Statements\n" +
                "17:01\n" +
                " Databases - SQL Injection Attacks and Prepared Statements\u200B\n" +
                "293. Transactions\n" +
                "13:40\n" +
                " Databases - Transactions\u200B\n" +
                "294. Inserting Records With JDBC\n" +
                "10:08\n" +
                " Databases - Inserting Records With JDBC\u200B\n" +
                "295. Insert Albums, Artists, and Songs\n" +
                "14:00\n" +
                " Databases - Insert Albums, Artists, and Songs\u200B\n" +
                "296. Test Insert JDBC Code\n" +
                "18:07\n" +
                " Databases - Test Insert JDBC Code\u200B\n" +
                "297. JDBC with a GUI Program\n" +
                "17:53\n" +
                " main.fxml.txt\n" +
                " Databases - JDBC with a GUI Program\u200B\n" +
                "298. Add Artists\n" +
                "12:35\n" +
                " Databases - Add Artists\u200B\n" +
                "299. Fix Artist and Preload Records\n" +
                "13:24\n" +
                " Databases - Fix Artist and Preload Records\u200B\n" +
                "300. Implement Artist Query\n" +
                "11:57\n" +
                " Databases - Implement Artist Query\u200B\n" +
                "301. Add ProgressBar\n" +
                "9:38\n" +
                " Databases - Add ProgressBar\u200B\n" +
                "302. Handling Updates\n" +
                "15:14\n" +
                " Databases - Handling Updates\u200B\n" +
                "Section: 21\n" +
                "0 / 9\n" +
                "Java Networking Programming\n" +
                "303. Networking Overview\n" +
                "9:39\n" +
                "304. First Client and Server Apps\n" +
                "15:02\n" +
                " Java Networking - First Client and Server Apps\u200B\n" +
                "305. Multi Threaded Server\n" +
                "14:04\n" +
                " Java Networking - Multi Threaded Server\n" +
                "306. Multi-Threading and Timeouts\n" +
                "12:46\n" +
                " Java Networking - Multi-Threading and Timeouts\n" +
                "307. UDP Server and Client\n" +
                "18:13\n" +
                " Java Networking - UDP Server and Client\u200B\n" +
                "308. High Level APIS\n" +
                "18:55\n" +
                " Java Networking - High Level APIS\n" +
                " URIs, URLs, and URNs: Clarifications and Recommendations 1.0\n" +
                " Uniform Resource Identifier\n" +
                "309. URL Connections and Input Stream Reader\n" +
                "16:06\n" +
                " Java Networking - URL Connections and Input Stream Reader\n" +
                " Example Domain\n" +
                " Code\n" +
                "310. HTTPUrlConnection\n" +
                "17:57\n" +
                " Java Networking - HTTPUrlConnection\n" +
                " Method Definitions\n" +
                " List of HTTP header fields\n" +
                "311. Alternatives to HTTPUrlConenction\n" +
                "21:06\n" +
                " Java Networking - Alternatives to HTTPUrlConenction\n" +
                " Public feed\n" +
                " Feed Url\n" +
                "Show more (4)\n" +
                "Section: 22\n" +
                "1 / 3\n" +
                "Bonus Material\n" +
                "312. Bonus - Please Watch!\n" +
                "0:48\n" +
                "313. All Courses\n" +
                "0:00\n" +
                "314. Source code for all Programs";
        String expected = "Section 1: Introduction\n" +
                "1. Getting Started With This Course\n" +
                "Section 2: Setup\n" +
                "2. How to Use This Section Of The Course\n" +
                "3. How To Install The Java Development Kit (JDK) For Windows\n" +
                "4. Download and Install IntelliJ (FREE and PAID version) for Windows\n" +
                "5. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "6. How To Install The Java Development Kit (JDK) For Mac OS X\n" +
                "7. Download and Install IntelliJ (FREE and PAID version) on a Mac\n" +
                "8. Free 90 Day Extended Trial of IntelliJ Ultimate Edition Now Available\n" +
                "9. How To Install The Java Development Kit (JDK) For Ubuntu Linux\n" +
                "10. Install and Configure IntelliJ (FREE and PAID version) for Ubuntu Linux\n" +
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
                "27. Methods In Java\n" +
                "28. More On Methods And A Challenge\n" +
                "29. Method Overloading\n" +
                "Section 6: Control Flow Statements\n" +
                "30. Introduction\n" +
                "31. The switch statement (+Challenge Exercise)\n" +
                "32. The for Statement (+Challenge Exercise)\n" +
                "33. The while and do while statements (+Challenge Exercise)\n" +
                "Section 7: OOP Part 1 - Classes, Constructors and Inheritance\n" +
                "34. Introduction\n" +
                "35. Classes Part 1\n" +
                "36. Classes Part 2\n" +
                "37. Constructors - Part 1 (+Challenge Exercise)\n" +
                "38. Constructors - Part 2 (+Challenge Exercise)\n" +
                "39. Inheritance - Part 1\n" +
                "40. Inheritance - Part 2\n" +
                "41. Inheritance Challenge Part 1 (+Challenge Exercise)\n" +
                "42. Inheritance Challenge Part 2\n" +
                "Section 8: OOP Part 2 - Composition, Encapsulation, and Polymorphism\n" +
                "43. Introduction\n" +
                "44. Composition\n" +
                "45. Composition Part 2 (+Challenge Exercise)\n" +
                "46. Encapsulation\n" +
                "47. Encapsulation (+Challenge Exercise)\n" +
                "48. Polymorphism\n" +
                "49. Polymorphism (+Challenge Exercise)\n" +
                "50. OOP Master Challenge Exercise\n" +
                "51. OOP Challenge - Solution\n" +
                "Section 9: Arrays, Java inbuilt Lists, Autoboxing and Unboxing\n" +
                "52. Arrays\n" +
                "53. Arrays (Challenge Exercise)\n" +
                "54. List and ArrayList Part 1\n" +
                "55. ArrayList Part 2\n" +
                "56. ArrayList Part 3\n" +
                "57. ArrayList Challenge Part 1\n" +
                "58. ArrayList Challenge Part 2\n" +
                "59. ArrayList Challenge Part 3\n" +
                "60. Autoboxing and Unboxing\n" +
                "61. Autoboxing & Unboxing (Challenge Exercise) - Part 1\n" +
                "62. Autoboxing & Unboxing (Challenge Exercise) - Part 2\n" +
                "63. Autoboxing & Unboxing (Challenge Exercise) - Part 3\n" +
                "64. LinkedList Part 1\n" +
                "65. LinkedList Part 2\n" +
                "66. LinkedList Part 3\n" +
                "67. LinkedList Challenge Part 1\n" +
                "68. LinkedList Challenge Part 2\n" +
                "69. LinkedList Challenge Part 3 (Final video)\n" +
                "Section 10: Inner and Abstract Classes & Interfaces\n" +
                "70. Interfaces\n" +
                "71. Interfaces Part 2\n" +
                "72. Interfaces Challenge Part 1\n" +
                "73. Interfaces Challenge Part 2\n" +
                "74. Inner classes Part 1\n" +
                "75. Inner Classes Part 2\n" +
                "76. Inner Classes Challenge\n" +
                "77. Abstract Classes Part 1\n" +
                "78. Abstract Classes Part 2\n" +
                "79. Abstract Class Challenge Part 1\n" +
                "80. Abstract Class Challenge Part 2\n" +
                "81. Abstract Class Challenge Part 3\n" +
                "Section 11: Java Generics\n" +
                "82. Generics Introduction\n" +
                "83. Our Generics Class\n" +
                "84. Our Generics Class Part 2\n" +
                "85. Our Generics Class Part 3\n" +
                "86. Generics Challenge\n" +
                "Section 12: Naming Conventions and Packages. static and final keywords\n" +
                "87. Naming Conventions\n" +
                "88. Packages\n" +
                "89. Packages Part 2\n" +
                "90. Packages Part 3\n" +
                "91. Packages (Challenge Exercise)\n" +
                "92. Scope\n" +
                "93. Scope Part 2 and Visibility\n" +
                "94. Scope +(Challenge Exercise)\n" +
                "95. Access Modifiers\n" +
                "96. The static statement\n" +
                "97. The final statement\n" +
                "98. Final Part 2 and Static Initializers\n" +
                "Section 13: Java Collections\n" +
                "99. Collections Overview\n" +
                "100. Binary Search\n" +
                "101. Collections List Methods\n" +
                "102. Comparable and Comparator\n" +
                "103. Maps\n" +
                "104. Map Continued and Adventure Game\n" +
                "105. Adding Exits to the Adventure game\n" +
                "106. Adventure Game challenge\n" +
                "107. Immutable Classes\n" +
                "108. Immutable Class Challenge\n" +
                "109. Sets & HashSet\n" +
                "110. HashSet - equals() and hashCode()\n" +
                "111. Finish off equals() and hashcode()\n" +
                "112. Potential issue with equals() and sub-classing\n" +
                "113. Sets - Symmetric & Asymmetric\n" +
                "114. Finishing Off Sets\n" +
                "115. Sets Challenge Part 1\n" +
                "116. Sets Challenge Part 2\n" +
                "117. Sets Challenge Part 3\n" +
                "118. Sorted Collections\n" +
                "119. StockList Class With Maps\n" +
                "120. Add a Basket\n" +
                "121. TreeMap and Unmodifiable Maps\n" +
                "122. Challenge Part 1\n" +
                "123. Challenge Part 2\n" +
                "124. Challenge Part 3\n" +
                "125. Challenge Part 4 (Final)\n" +
                "Section 14: JavaFX\n" +
                "126. Introduction\n" +
                "127. Code Vs FXml\n" +
                "128. GridPane Layout\n" +
                "129. BorderPane Layout\n" +
                "130. Other Layouts\n" +
                "131. Controls\n" +
                "132. RadioButton and CheckBox\n" +
                "133. ComboBox and ChoiceBox\n" +
                "134. Slider, Spinner, ColorPicker & DatePicker Controls\n" +
                "135. TitledPane\n" +
                "136. Events and Event Handlers\n" +
                "137. Events Continued\n" +
                "138. UI Thread\n" +
                "139. Threads and Runnable\n" +
                "140. Setup Sample Todo List Application\n" +
                "141. Base Interface\n" +
                "142. Add Change Listener\n" +
                "143. Formatting Dates\n" +
                "144. Singletons\n" +
                "145. Load and Save ToDo Items from/to Disk\n" +
                "146. Add DialogPane\n" +
                "147. Show Dialog and Add Controller Code\n" +
                "148. Bug Fix and Update List View\n" +
                "149. Data Binding and Observable\n" +
                "150. Cell Factories\n" +
                "151. Context Menu\n" +
                "152. KeyEvents and Toolbars\n" +
                "153. SortedList\n" +
                "154. FilteredList\n" +
                "155. CSS With JavaFX\n" +
                "156. Transforming Nodes and Choosers\n" +
                "157. More on Choosers and Web Pages\n" +
                "158. SceneBuilder\n" +
                "159. Installing SceneBuilder for Windows\n" +
                "160. Installing SceneBuilder for Mac\n" +
                "161. Overview of SceneBuilder\n" +
                "162. Building a UI with SceneBuilder\n" +
                "163. More on SceneBuilder\n" +
                "164. JavaFX Challenge\n" +
                "165. JavaFX Challenge Part 2\n" +
                "166. JavaFX Challenge Part 3\n" +
                "167. JavaFX Challenge Part 4\n" +
                "168. JavaFX Challenge Wrap up\n" +
                "Section 15: Basic Input & Output including java.util\n" +
                "169. Exceptions\n" +
                "170. Stack Trace and Call Stack\n" +
                "171. Catching and throwing Exceptions\n" +
                "172. Multi Catch Exceptions\n" +
                "173. Introduction to I/O\n" +
                "174. Writing content - FileWriter class and Finally block\n" +
                "175. Try with Resources\n" +
                "176. FileReader and Closeable\n" +
                "177. BufferedReader\n" +
                "178. Load Big Location and Exits Files\n" +
                "179. Challenge\n" +
                "180. Buffered Writer and Challenge\n" +
                "181. Byte Streams\n" +
                "182. Reading Binary Data and End of File Exceptions\n" +
                "183. Object Input Output including Serialization\n" +
                "184. Finish Object I/O and RandomAccessFile class\n" +
                "185. Create Random Access File\n" +
                "186. Update Static Initializer Block With Random File Access\n" +
                "187. Update Adventure Game to Read Random Access File\n" +
                "188. Java NIO\n" +
                "189. Writing Objects With Java NIO\n" +
                "190. Reading and Writing with Java NIO\n" +
                "191. Writing Binary Files with Java NIO\n" +
                "192. Reading Files with NIO\n" +
                "193. Absolute and Relative Reads\n" +
                "194. Chained Put Methods\n" +
                "195. Writing Sequentially\n" +
                "196. FileChannel to Copy Files and Pipes with Threads\n" +
                "197. Filesystem\n" +
                "198. More on Paths\n" +
                "199. Exists and CopyFile\n" +
                "200. Move, Rename and Delete\n" +
                "201. File Attributes\n" +
                "202. Read Existing Directory Contents\n" +
                "203. Separators Temp Files and File Stores\n" +
                "204. Walk File Tree\n" +
                "205. Copy Entire Tree\n" +
                "206. Mapping IO and NIO Methods\n" +
                "Section 16: Concurrency in Java\n" +
                "207. Concurrency and Threads Introduction\n" +
                "208. Threads\n" +
                "209. Runnable and Thread\n" +
                "210. Interrupt and Join\n" +
                "211. Multiple Threads\n" +
                "212. Thread Variables\n" +
                "213. Synchronisation\n" +
                "214. Producer and Consumer\n" +
                "215. Deadlocks, wait, notify and notifyAll methods\n" +
                "216. The Java Util Concurrent package\n" +
                "217. Thread Interference\n" +
                "218. Reentrant Lock and Unlock\n" +
                "219. Using Try Finally With Threads\n" +
                "220. Thread Pools\n" +
                "221. ArrayBlockingQueue Class\n" +
                "222. Deadlocks\n" +
                "223. More on Deadlocks\n" +
                "224. Thread Starvation\n" +
                "225. Fair Locks and Live Locks\n" +
                "226. Live Lock Example and Slipped Conditions\n" +
                "227. Other Thread Issues\n" +
                "228. JavaFX Background Tasks\n" +
                "229. Data Binding\n" +
                "230. Service\n" +
                "231. Challenge 1 and 2\n" +
                "232. Challenge 3,4 and 5\n" +
                "233. Challenge 6 and 7\n" +
                "234. Challenge 8\n" +
                "235. Challenge 9\n" +
                "Section 17: Lambda Expressions\n" +
                "236. Lambda Expressions Introduction\n" +
                "237. Lambda Expressions Continued\n" +
                "238. Lambda Expressions Nested Blocks\n" +
                "239. Scope and Functional Programming\n" +
                "240. Functional Interfaces & Predicates\n" +
                "241. More on Predicates & Suppliers\n" +
                "242. Functions\n" +
                "243. Chaining java.util.function Functions\n" +
                "244. Streams\n" +
                "245. Streams - Intermediate and Terminal Operations\n" +
                "246. Streams - Flatmap & Lambda Best Practices\n" +
                "247. Lambda Challenge Part 1\n" +
                "248. Lambda Challenge Part 2\n" +
                "Section 18: Regular Expressions\n" +
                "249. Regular Expressions Introduction\n" +
                "250. Character classes and Boundary Matchers\n" +
                "251. Quantifiers and the Pattern and Matcher classes\n" +
                "252. Matcher find and Group Methods\n" +
                "253. And, Or & Not\n" +
                "254. Regular Expressions Challenge Part 1\n" +
                "255. Regular Expressions Challenge Part 2\n" +
                "256. Regular Expressions Challenge Part 3\n" +
                "Section 19: Debugging and Unit Testing\n" +
                "257. Introduction to Debugging\n" +
                "258. More on Debugging\n" +
                "259. Field Watch Points\n" +
                "260. Advanced Debugging\n" +
                "261. Introduction to Unit Testing with JUnit\n" +
                "262. Asserts in Junit\n" +
                "263. More Asserts and Exception Handling\n" +
                "264. Parameterized Testing\n" +
                "265. JUnit Challenge #1 and #2\n" +
                "266. JUnit Challenges #3 to #7\n" +
                "267. Junit Challenges #8 to #10\n" +
                "Section 20: Databases\n" +
                "268. Section Introduction\n" +
                "269. Database Terminology\n" +
                "270. Install and Setup SQLite for Windows\n" +
                "271. Install and Setup SQLite for Mac\n" +
                "272. Install and Setup SQLite for Linux\n" +
                "273. Introduction to SQLite\n" +
                "274. More with SQLite\n" +
                "275. Querying Data With SQL\n" +
                "276. SQL Order by and Joins\n" +
                "277. More Complex Joins\n" +
                "278. Wildcards in Queries and Views\n" +
                "279. Housekeeping and Final SQL Challenge\n" +
                "280. JDBC and SQLite GUI Browser\n" +
                "281. Creating Databases With JDBC in Java\n" +
                "282. JDBC Insert, Update, Delete\n" +
                "283. .executeQuery() and using Constants\n" +
                "284. The Music SQLite Database\n" +
                "285. Write Java Query for Artists\n" +
                "286. Executing SQL in DB Browser\n" +
                "287. Query Albums by Artist Method\n" +
                "288. Query Artists for Song method\n" +
                "289. Result Set Meta Data\n" +
                "290. Functions and Views\n" +
                "291. Write the Method to Query View\n" +
                "292. SQL Injection Attacks and Prepared Statements\n" +
                "293. Transactions\n" +
                "294. Inserting Records With JDBC\n" +
                "295. Insert Albums, Artists, and Songs\n" +
                "296. Test Insert JDBC Code\n" +
                "297. JDBC with a GUI Program\n" +
                "298. Add Artists\n" +
                "299. Fix Artist and Preload Records\n" +
                "300. Implement Artist Query\n" +
                "301. Add ProgressBar\n" +
                "302. Handling Updates\n" +
                "Section 21: Java Networking Programming\n" +
                "303. Networking Overview\n" +
                "304. First Client and Server Apps\n" +
                "305. Multi Threaded Server\n" +
                "306. Multi-Threading and Timeouts\n" +
                "307. UDP Server and Client\n" +
                "308. High Level APIS\n" +
                "309. URL Connections and Input Stream Reader\n" +
                "310. HTTPUrlConnection\n" +
                "311. Alternatives to HTTPUrlConenction\n" +
                "Section 22: Bonus Material\n" +
                "312. Bonus - Please Watch!\n" +
                "313. All Courses\n" +
                "314. Source code for all Programs";

        assertEquals(expected, Cleaner.cleanText(input));
    }
}
