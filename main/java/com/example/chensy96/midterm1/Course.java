package com.example.chensy96.midterm1;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by chensy96 on 10/19/2017.
 */
public class Course {
    public List<Content> contentList;

    public Course (Context c)
    {
        contentList = new ArrayList<>();

        contentList.add(new Content("CS 106", "Introduction to Computer Science I", "4", intro1, 1, 0));
        contentList.add(new Content("CS 206", "Introduction to Computer Science II", "4", intro2, 2, 1));
        contentList.add(new Content("CS 230", "Programming Languages", "4", intro3, 3, 2));
        contentList.add(new Content("CS 275", "Introduction to Research", "1", intro4, 4, 0));
        contentList.add(new Content("CS 305", "Design and Analysis of Algorithms", "4", intro5, 5, 2));
        contentList.add(new Content("CS 306", "Computability, Complexity and Heuristics", "4", intro6, 6, 5));
        contentList.add(new Content("CS 318", "Introduction to Computer Organization", "4", intro7, 7, 2));
        contentList.add(new Content("CS 322", "Artificial Intelligence", "4", intro8, 8, 5));
        contentList.add(new Content("CS 323", "Software Design", "4", intro9, 9, 2));
        contentList.add(new Content("CS 324", "Concurrent Programming", "3", intro10, 10, 2));
        contentList.add(new Content("CS 325", "Computer Graphics", "4", intro11, 11, 2));
        contentList.add(new Content("CS 371", "Independent Study", "3", intro12, 12, 0));
        contentList.add(new Content("CS 381", "Senior Thesis", "3", intro13, 13, 0));
    }

    public Content getContent(String name)
    {
        for(Content c : contentList)
        {
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }

   String intro1 = "An introduction to the principles of design, implementation, and testing of object-oriented programs. The course covers language features such as control structures, classes, file I/0, and basic data structures including arrays. Other topics include recursion and fundamental algorithms, such as elementary searching and sorting algorithms.";
   String intro2  = "Fundamentals of software development and algorithm design. Topics include recursion, data structures, analysis of algorithms, and program verification.";
    String intro3  = "An introduction to different programming language paradigms: functional, logic, and object-oriented programming. Students will also study language concepts such as regular expressions, syntax grammars and semantics. Specific topics may include Perl, Scheme, Java, C++, and Prolog.";
    String intro4  = "An introductory exploration of research in computer science. The students, in collaboration with a faculty mentor, will participate in a research project in a particular area of computer science. The research projects may, for example, include designing new algorithms for computational problems, surveying the research literature, implementing existing algorithms from the research literature, or performing computational experiments.";
    String intro5  = "A study of techniques used to design algorithms for complex computational problems that are efficient in terms of time and memory required during execution. Students will also learn the techniques used to evaluate an algorithm's efficiency. Topics include advanced sorting techniques, advanced data structures, dynamic programming, greedy algorithms, amortized analysis, graph algorithms, network flow algorithms, and linear programming.";
    String intro6  = "Using abstract machine models to measure the complexity of computational problems and to explore the limits of computational power. In addition, students will investigate strategies to deal with intractable computational problems when they arise. Topics include finite automata, Turing machines, undecidability, NP-completeness, approximation algorithms, heuristic algorithms, and experimental algorithmics.";
    String intro7  = "An introduction to multilevel machines, including basic components of a computer, digital circuits, Boolean algebra, microprogramming, machine and assembly languages, and operating systems.";
    String intro8  = "An introduction to the field of artificial intelligence. The course covers the main techniques used to develop computer programs to solve problems that we normally think of as requiring intelligence. Topics include search, games, knowledge representation, logical reasoning systems, and machine learning.";
    String intro9  = "A study of the design, implementation, documentation, and testing of software. Focuses on object-oriented design using UML (Unified Modeling Language) models and design patterns, implementing and documenting large software systems by working in teams, and methods for software testing and debugging.";
    String intro10  = "A study of the concepts and techniques in concurrent or multithreaded programming that form the basis for operating systems, as well as real-time, distributed, and multi-processor systems. Focuses on concurrent programming with threads and shared variables using locks, semaphores, and monitors, and explores such issues as thread safety and liveness, mutual exclusion, and message passing between processes.";
    String intro11  = "Computer graphics involves using computers to generate images, as opposed to generating images using cameras. Computer graphics images typically try to mimic reality. In this course, students will explore the necessary background for further study in computer graphics. Students will explore the basics of human vision that influence the way computers generate images; projections from three-dimensional space to two-dimensional space; various models of real-world entities such as lighting, surface reflectance, and color; and classic algorithms in computer graphics that students will implement and with which they will have the opportunity to experiment. ";
    String intro12  = "Special study in computing outside of the regular departmental offerings.";
    String intro13  = "Optional for computer science majors. Recommended for those working toward professional careers or graduate study in computer science, and those seeking to satisfy the criteria for departmental honors.";


}
