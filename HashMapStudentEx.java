import java.util.*;

class Student{
    int id;
    String tel;
    public Student(int id, String tel){
        this.id = id;
        this.tel = tel;
    }
    public int getId() {
        return id;
    }
    public String getTel(){
        return tel;
    }
}

public class HashMapStudentEx{
    public static void main(String[] args){
        HashMap<String, Student> map = new HashMap<String, Student>();
        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("최종현", new Student(2, "010-222-2222"));

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("검색할 이름?>>");
            String name = scanner.nextLine();
            if(name.equals("Exit")){
                break;
            }
            Student student = map.get(name);
            if(student == null){
                System.out.println(name + "은 없는 사람입니다.");
            }
            else{
                System.out.println("id : " + student.getId() + "전화 : " + student.getTel());
            }
        }
        scanner.close();
    
    }
}