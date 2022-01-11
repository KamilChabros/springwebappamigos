package xyz.springbootamigos.springwebappamigos.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
