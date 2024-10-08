package org.example.miprimerspring.service.Impl;

import org.example.miprimerspring.entity.Student;
import org.example.miprimerspring.repository.IStudentRepository;
import org.example.miprimerspring.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepository iStudentRepository;



    public StudentServiceImpl(IStudentRepository iStudentRepository){
        this.iStudentRepository = iStudentRepository;
    }
    @Override
    public Student getStudent(Long id) {
        Optional<Student> optionalStudent = iStudentRepository.findById(id);
        if (optionalStudent.isPresent()){
            return optionalStudent.get();
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return iStudentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return iStudentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return iStudentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        iStudentRepository.deleteById(id);
    }
}
