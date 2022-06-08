package day08_06_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P03_ListOfMaps {
    public static void main(String[] args) {
        List<Map<String,String>> employees = new ArrayList<>();

        Map<String, String> emp1Data = new HashMap<>();
        emp1Data.put("EmpID","123");
        emp1Data.put("EmpName","Mike");
        emp1Data.put("JobTitle","SDET");
        emp1Data.put("Salary","120000");


        Map<String, String> emp2Data = new HashMap<>();
        emp2Data.put("EmpID","123");
        emp2Data.put("EmpName","Mike");
        emp2Data.put("JobTitle","SDET");
        emp2Data.put("Salary","120000");


        Map<String, String> emp3Data = new HashMap<>();
        emp3Data.put("EmpID","123");
        emp3Data.put("EmpName","Mike");
        emp3Data.put("JobTitle","SDET");
        emp3Data.put("Salary","120000");

        employees.add(emp1Data);
        employees.add(emp2Data);
        employees.add(emp3Data);

        //print the employees
        System.out.println(employees);

        //print the 1st emp by using employees method
        System.out.println(employees.get(0));

        //how many employees do we have in the employees
        System.out.println(employees.size());

        //how many data is stored in the 1st map
        System.out.println(employees.get(0).size());

        //print 1st employees employee name -> based on .get(), which is the key -> return the value
        System.out.println(employees.get(0).get("EmpName"));

        //print last employees salary
        System.out.println(employees.get(employees.size()-1).get("Salary"));

        //calculate total salary of all employees


        int sum = 0;
        for(int i=0; i<employees.size(); i++){
            sum += Integer.parseInt(employees.get(i).get("Salary"));
        }
        System.out.println(sum);

    }
}
