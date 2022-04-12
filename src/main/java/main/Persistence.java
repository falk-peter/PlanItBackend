package main;

public interface Persistence {
      public void saveAppointment(String json);
      public Appointment[] loadAppointments();
      public void deleteAppointment(int app_ID);
      public void updateAppointment(Appointment appointment);
}
