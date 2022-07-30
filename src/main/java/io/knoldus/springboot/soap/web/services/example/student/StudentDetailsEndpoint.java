package io.knoldus.springboot.soap.web.services.example.student;

import io.knoldus.students.GetStudentDetailsRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.knoldus.students.GetStudentDetailsResponse;
import io.knoldus.students.StudentDetails;

@Endpoint
public class StudentDetailsEndpoint {

	@PayloadRoot(namespace = "https://www.google.com/", localPart = "GetStudentDetailsRequest")
	@ResponsePayload
	public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request) {
		GetStudentDetailsResponse response = new GetStudentDetailsResponse();
		
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setId(request.getId());
		studentDetails.setName("Adam");
		studentDetails.setPassportNumber("E1234567");
		
		response.setStudentDetails(studentDetails);
		
		return response;
	}

}