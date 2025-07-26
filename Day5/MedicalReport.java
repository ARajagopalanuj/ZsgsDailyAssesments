/*1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.*/

import java.util.Scanner;
class MedicalRecord{
int recordId;
String patientName;
String dateOfVisit;
String diagnosis;


void inputRecordDetails(int recordId,String patientName,String dateOfVisit,String diagnosis){
this.recordId=recordId;
this.patientName=patientName;
this.dateOfVisit=dateOfVisit;
this.diagnosis=diagnosis;
}

void displayRecord(){
	System.out.println("record Id: "+recordId);
	System.out.println("patient name: " +patientName);
	System.out.println("Date of Vist: "+ dateOfVisit);
	System.out.println("Diagnosis: " +diagnosis);
	}
}

class InPatientRecord extends MedicalRecord{

	int roomNo;
	int noOfDaysAdmited;
	double roomCharges;

	InPatientRecord(int recordId,String patientName,String dateOfVisit,String diagnosis,int roomNo,int noOfDaysAdmited,double roomCharges){
	super.inputRecordDetails(recordId,patientName,dateOfVisit,diagnosis);
	this.roomNo=roomNo;
	this.noOfDaysAdmited=noOfDaysAdmited;
	this.roomCharges=roomCharges;
	
	}

	double calculateTotalCharges(){
	return roomCharges+(double)(noOfDaysAdmited*1000);
	}

	void displayRecord(){
	super.displayRecord();
	System.out.println("Room no: "+roomNo);
	System.out.println("Number of days Admitted: "+noOfDaysAdmited);
	System.out.println("Room Charges: " +roomCharges);
	System.out.println("Total fees: " +calculateTotalCharges());
	}
	
}

/*Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.*/

class OutPatientRecord extends MedicalRecord{
private String doctorName;
private Double consultationFee;

OutPatientRecord(String doctorName,Double consultationFee,int recordId,String patientName,String dateOfVisit,String diagnosis){
super.inputRecordDetails(recordId,patientName,dateOfVisit,diagnosis);
this.doctorName=doctorName;
this.consultationFee=consultationFee;
}

 void displayRecord(){
	super.displayRecord();
	System.out.println("Doctor Name: "+doctorName);
	System.out.println("ConsultationFee: "+consultationFee);
}
}

class Hospital{

	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
		boolean check=true;
	while(check){
	System.out.println("if you are inner patient click 1\n else if you are out patiet click 2\n Exit click 3");
	int choice=scan.nextInt();

	switch(choice){
	
	case 1:
		System.out.println("Enter the  recordId");
		int recordId=scan.nextInt();
		scan.nextLine();
		System.out.println("Patient Name: ");
		String patientName=scan.nextLine();
		System.out.println("date: ");
		String dateOfVisit=scan.nextLine();
		System.out.println("diagnosis: ");
		String diagnosis=scan.nextLine();

		System.out.println("Room no: ");
		int roomNo=scan.nextInt();
		System.out.println("no of days Admitted: ");
		int noOfDaysAdmited=scan.nextInt();

		System.out.println("Room fee: ");
		double roomCharges=scan.nextDouble();

		InPatientRecord ipRecord=new InPatientRecord(recordId,patientName,dateOfVisit,diagnosis,roomNo,noOfDaysAdmited,roomCharges);	
		ipRecord.displayRecord();
		break;

	case 2:
		System.out.println("Enter the record Id: ");
		int RecordId=scan.nextInt();
		System.out.println("Enter the Patient Name: ");
		scan.nextLine();
		String PatientName=scan.nextLine();
		System.out.println("Enter the date of visit");
		String DateOfVisit=scan.nextLine();
		System.out.println("diagnosis: ");
		String Diagnosis=scan.nextLine();

		System.out.println("Enter the Doctor Name: ");
		String doctorName=scan.nextLine();

		System.out.println("Enter the Consultation Fee: ");
		double consFee=scan.nextDouble();

		
		OutPatientRecord opRecord=new OutPatientRecord(doctorName,consFee,RecordId,PatientName,DateOfVisit,Diagnosis);

		opRecord.displayRecord();
		break;

	case 3:
		System.out.println("Get Well soon");
		check=false;
		scan.close();
		break;

	default:
		System.out.println("please Enter the correct Value");
		break;
	
}
}
}
}










	







