package com.example.demo.service;
import org.springframework.stereotypes.service;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@service
public class StudentServiceimpl implements Student{
    public Student saveStudent(Student student)
    {
        private final StudentRepository studentrepository;
        public StudentServiceimpl(StudentRepository studentrepository){
            this.StudentRepository=studentrepository;
        }
    }
    @Autowired
    StudentRepository studentrepository;
    
    public Student saveStudent(Student student){
        return studentrepository.save(student);
    }

}