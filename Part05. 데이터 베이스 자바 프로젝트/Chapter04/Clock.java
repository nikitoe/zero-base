public class Clock {

   int hour;
   int minute;
   int second;

   boolean useAlarmYn;
   int alarmHour;
   int alarmMinute;

   public void alarmOn(){
       useAlarmYn = true;
   }

    public void alarmOff(){
        useAlarmYn = false;
    }

   public void setAlarm (int hour, int minute) {
       alarmHour = hour;
       alarmMinute = minute;
   }


}
