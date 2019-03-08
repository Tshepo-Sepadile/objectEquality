package ac.za.cput;

public class TheInstitution {

    public static void main(String[]args)
    {
        varsityDetails();
    }


    public static void varsityDetails()
    {
        TheAddress myAddress = new TheAddress("cnr Keizergracht & Tenant Str");
        TheLocation myInstitution = new TheLocation("Cape Town");
        TheStudents myStudents = new TheStudents(30000);

        System.out.println("The Cape Peninsula University of Technology is located in " + myInstitution.getLoc() + ", at " + myAddress.getAdrs() + ". It has over " + myStudents.getStud() + " students.");
    }


}
