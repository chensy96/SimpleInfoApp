package com.example.chensy96.midterm1;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by chensy96 on 10/19/2017.
 */
public class Faculty {
    public List<Professor> professorList;

    public Faculty (Context c)
    {
        professorList = new ArrayList<>();

        professorList.add(new Professor("Michael Eckmann", "Department Associate Chair and Associate Professor of Computer Science", "Harder Hall 219", "meckmann@skidmore.edu", introm, 1));
        professorList.add(new Professor("Thomas O’ Connell", "Department Chair and Associate Professor of Computer Science", "Dana 292", "toconnel@skidmore.edu", introc, 2));
        professorList.add(new Professor("Aarathi Prasad", "Assistant Professor", "Harder 204D", "aprasad@skidmore.edu", introp, 3));
        professorList.add(new Professor("Christine Reilly", "Assistant Professor", "Harder 204B", "creilly@skidmore.edu", intror, 4));
        professorList.add(new Professor("David Read", "Lecturer", "Harder 224", "dread@skidmore.edu", introd, 5));
    }

    public Professor getProfessor(String name)
    {
        for(Professor p : professorList)
        {
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }

    String introm = "Professor Eckmann joined the department in the Fall of 2004 as a lecturer of computer science, and in the Fall of 2007, he was appointed to the position of assistant professor. Mike received his Ph.D. in computer science from Lehigh University in 2007, with a dissertation titled \"Sifting for Better Features to Track -- Exploiting Space and Time.” He also holds a Masters Degree in computer science and Bachelor’s degrees in mathematics and computer engineering, all from Lehigh University. His research interests are in computer vision and graphics and he has authored/co-authored a number of papers in the area. He teaches computer science courses in the department.";
    String introc = "Professor O'Connell received his Ph.D. in computer science from The University at Albany, completing a thesis that applied ideas from theoretical computer science to problems in game theory. Prior to coming to Skidmore, Prof. O'Connell worked as a software developer at IBM and a visiting professor at Dartmouth College. Prof. O'Connell's current research interest is in developing heuristic algorithms for hard computational problems. Prof. O'Connell teaches computer science courses at all levels, especially in the areas of algorithms and the theory of computation";
    String introp = "Professor Prasad received her Ph.D. in Computer Science from Dartmouth College, completing a thesis that proposed techniques to allow users to share information, when using mobile health applications, while protecting their privacy.  Prior to coming to Skidmore, she worked as a visiting professor at Amherst College. Her research interest is in developing secure and usable applications for mobile and wearable technologies. She teaches computer science courses at all levels, especially in the areas of systems and securit.";
    String intror = "Contact her for more infomation";
    String introd = "Contact him for more infomation";
}
