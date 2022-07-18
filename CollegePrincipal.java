/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class
class Teacher
  {
    String collegeName;
    String designation;
    void work()
    {
      System.out.println("Working");
    }
  }
//Add MathTeacher class
class MathTeacher extends Teacher
  {
    
  }

//Add EnglishTeacher class
class EnglishTeacher extends Teacher
  {
    
  }

//Add MusicTeacher class
class MusicTeacher extends Teacher
  {
    
  }

class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.
  public static void main(String args[])
  {
    MathTeacher math = new MathTeacher();
    math.collegeName = "IIT";
    math.designation = "Math teacher";
    EnglishTeacher eng = new EnglishTeacher();
    eng.collegeName = "IIT";
    eng.designation = "English Teacher";
    MusicTeacher music = new MusicTeacher();
    music.collegeName = "IIT";
    music.designation = "Music Teacher";
    System.out.println(math.designation+"    "+math.collegeName);
    System.out.println(eng.designation+"    "+eng.collegeName);
    System.out.println(music.designation+"    "+music.collegeName);
  }


}