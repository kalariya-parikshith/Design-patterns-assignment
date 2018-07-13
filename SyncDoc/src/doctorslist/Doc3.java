package doctorslist;

import doctor.Doctor;

public class Doc3 implements Doctor {
    //Doc3 initially has 10 unregistered appointments
    private static boolean appointmentSlots[] = new boolean[10];
    @Override
    public void getAppointment() {
        for (int i=0; i<10; i++)
            if (!appointmentSlots[i]) {
                appointmentSlots[i] = true;
                System.out.println("Doc3 appointment set at " + (i + 1) + " slot");
                return;
            }
        System.out.println("Appointments full!!");
        System.out.println("Cannot appoint doctor");


    }
}