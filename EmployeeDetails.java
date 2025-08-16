public class EmployeeDetails {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an employee ID as a command line argument.");
            return;
        }

        String empId = args[0];

        // Employee data: EmpNo, EmpName, JoinDate, DesignationCode, Department, Basic, HRA, IT
        String[][] employees = {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul",  "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman",  "1/1/2000",   "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        boolean found = false;

        for (String[] emp : employees) {
            if (emp[0].equals(empId)) {
                String designation = "";
                int da = 0;

                // Switch-case to determine designation and DA
                switch (emp[3]) {
                    case "e": designation = "Engineer";     da = 20000; break;
                    case "c": designation = "Consultant";   da = 32000; break;
                    case "k": designation = "Clerk";        da = 12000; break;
                    case "r": designation = "Receptionist"; da = 15000; break;
                    case "m": designation = "Manager";      da = 40000; break;
                    default:  designation = "Unknown";      da = 0;
                }

                int basic = Integer.parseInt(emp[5]);
                int hra = Integer.parseInt(emp[6]);
                int it = Integer.parseInt(emp[7]);
                int salary = basic + hra + da - it;

                // Output in expected format
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(emp[0] + "\t" + emp[1] + "\t\t" + emp[4] + "\t\t" + designation + "\t" + salary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }
    }
}
