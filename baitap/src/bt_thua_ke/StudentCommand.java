/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_thua_ke;

/**
 *
 * @author pc
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class StudentCommand {
    Student[] students;
	
	public static void Show(Student[] students) {
		for (Student o: students) {
			System.out.println(o.toString());
			System.out.println("");
		}
	}
	
	public static Student[] sortStudent(Student[] stds) {
		for(int i = 0; i < stds.length - 1; i++) {
			for(int j = i + 1; j < stds.length; j++) {
				if(stds[i].compareTo(stds[j]) == -1) {
					Student temp = stds[i];
					stds[i] = stds[j];
					stds[j] = temp;
				}
			}
		}
		return stds;
		
	}
	
	public void write(Student[] student) { 
		
        try {   
            FileOutputStream f = new FileOutputStream("D:\\Student.txt");  
            ObjectOutputStream oStream = new ObjectOutputStream(f); 
            oStream.writeObject(student);   
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }
    
	}
	
    public Student[] read() {
    	
        Student[] student = null;
        try {   
            FileInputStream f = new FileInputStream("D:\\Student.txt"); 
            ObjectInputStream inStream = new ObjectInputStream(f);  
           
            student = (Student[]) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
        return student;
    }
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nh???p s??? l?????ng sinh vi??n");
		int n = input.nextInt();
		
		StudentCommand list = new StudentCommand();
		list.students = new Student[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("nh???p th??ng tin cho sinh vi??n th???  " + (i + 1) + ": ");
			list.students[i] = new Student();
			list.students[i].setInfo();
		}
// hi???n th???
		Show(list.students);
// s???p x???p
		Student[] result = sortStudent(list.students);
		
		System.out.println("sau khi s???p x???p xong: ");
		Show(result);
// thao t??c v???i file file
		list.write(result);
		
		Student[] resultReadFile = list.read();
		
		System.out.println("?????c ???????c t??? file :");
		Show(resultReadFile);
	}
}
