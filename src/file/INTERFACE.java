
package file;
import java.lang.Cloneable;
import java.lang.Comparable;
import java.io.Serializable;
public class Student implements Cloneable, Comparable<Student>, Serializable{
    String fullname;
    String birthday;
    char gender;
    float gpa;
    float social_activities;

    public Student() {
    }

    
    public Student(String fullname, String birthday, char gender, float social, int social_activities) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa >= 0 && gpa <= 5) {
            this.gpa = gpa;
        } else this.gpa = 0;
    }

    public float getSocial_activities() {
        return social_activities;
    }

    public void setSocial_activities(float social_activities) {
        if (social_activities >= 0 && social_activities  <= 5) {
            this.social_activities = social_activities;
        }
        
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }

    @Override
    public int hashCode() {
        return super.hashCode(); 
    }

    @Override
    public int compareTo(Student o) {
        if (gpa == o.gpa && social_activities == o.social_activities) {
            return 0;
        } else if (gpa > o.gpa || social_activities > o.social_activities) {
            return 1;
        } else {
            return -1;
        }
        
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
    
}
public class INTERFACE {
     public static void main(String[] args) {
        
        Student st1 = new Student(); 
        st1.setFullname("Nguyen Van Hung");
        st1.setBirthday("04/09/2001");
        st1.setGender('1');
        st1.setGpa(4.5f);
        st1.setSocial_activities(4.3f);
        
        Student st2 = new Student(); 
        st2.setFullname("Nguyen Tien Dat");
        st2.setBirthday("21/02/2000");
        st2.setGender('1');
        st2.setGpa(4.6f);
        st2.setSocial_activities(4.2f);
        
        if (st1.compareTo(st2) == 0) {
            System.out.println("2 sinh vien bang nhau");
        } else if (st1.compareTo(st2) == 1) {
            System.out.println("Sinh vien 1 lon hon sv2");
        } else {
            System.out.println("Sinh vien 1 be hon sv2");
        }
    }
}
