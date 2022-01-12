package xyz.springbootamigos.springwebappamigos.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }
    /*Generate "Hello World!" String in web browser*/
//	@GetMapping()
//	public String hello(){
//		return "Hello World!";

//	}
//	/*Generate List.of Strings in web browser*/
//	@GetMapping()
//	public List<String> hello(){
//		return List.of("Hello", "World!");

//	}
}
