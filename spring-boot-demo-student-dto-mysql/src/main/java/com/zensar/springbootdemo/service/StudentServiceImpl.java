package com.zensar.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.springbootdemo.dto.StudentDto;
import com.zensar.springbootdemo.entity.Student;
import com.zensar.springbootdemo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public StudentDto getStudent(int studentId) {
		Student student= studentRepository.findById(studentId).get();
		
		//StudentDto dto=mapToDto(student);
		return modelMapper.map(student,StudentDto.class);
	}
	
	
	

	@Override
	public List<StudentDto> getAllStudents() {
		List<Student> listOfStudents =  studentRepository.findAll();
		
		List<StudentDto> listOfStudentDto= new ArrayList<StudentDto>();
		
		for(Student student:listOfStudents) {
			//listOfStudentDto.add(mapToDto(student));
			listOfStudentDto.add(modelMapper.map(student,StudentDto.class));
		}
		return listOfStudentDto;
	}

	@Override
	public StudentDto insertStudent(StudentDto studentDto) {
		
		//Student student=mapToEntity(studentDto);
		Student student=modelMapper.map(studentDto,Student.class);
		Student insertStudent=studentRepository.save(student);
		//StudentDto mapToDto=mapToDto(insertStudent);
		return modelMapper.map(insertStudent,StudentDto.class);
		
	}

	@Override
	public void updateStudent(int studentId, StudentDto studentDto) {
		//Student student=mapToEntity(studentDto);
		
		Student student=modelMapper.map(studentDto,Student.class);
		studentRepository.save(student);
		
	}
		
	

	@Override
	public void deleteStudent(int studentId) {
		 studentRepository.deleteById(studentId);
			
		}
	
	/*public StudentDto mapToDto(Student student) {
		StudentDto dto = new StudentDto();
		dto.setStudentId(student.getStudentId());
		dto.setStudentName(student.getStudentName());
		dto.setStudentAge(student.getStudentAge());
		return dto;
	}
	
	public Student mapToEntity(StudentDto studentDto) {
		Student student=new Student();
		student.setStudentId(studentDto.getStudentId());
		student.setStudentName(studentDto.getStudentName());
		student.setStudentAge(studentDto.getStudentAge());
		return student;
	}*/
		
	}

