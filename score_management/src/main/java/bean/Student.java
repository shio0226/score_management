//package bean;
//
//import java.io.Serializable;
//
//public class Student implements Serializable {
//
//	private int studentId;
//	private String studentName;
//	private int courseId;
//	private String courseName; //chap15問題15で追加
//
//	public int getStudentId() {
//		return studentId;
//	}
//	public void setStudentId(int studentId) {
//		this.studentId = studentId;
//	}
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	public int getCourseId() {
//		return courseId;
//	}
//	public void setCourseId(int courseId) {
//		this.courseId = courseId;
//	}
//
//	public String getCourseName() {
//		return courseName;
//	}
//	public void setCourseName(String courseName) {
//		this.courseName = courseName;
//	}
//
//}

package bean;

public class StudentBean {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}