package doctorslist;

import doctor.Doctor;

public class Doc9 implements Doctor {
    //Doc9 initially has 10 unregistered appointments
    private static boolean appointmentSlots[] = new boolean[10];

    @Override
    public void getAppointment() {
        for (int i = 0; i < 10; i++)
            if (!appointmentSlots[i]) {
                appointmentSlots[i] = true;
                System.out.println("Doc9 appointment set at " + (i + 1) + " slot");
                return;
            }
        System.out.println("Appointments full!!");
        System.out.println("Cannot appoint doctor");


    }
}