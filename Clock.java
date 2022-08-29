class Clock {
    String time;
    void setTime(String t) {
        time = t;
    }
    String getTime() {
        return this.time;
    }
}
class ClockTestDrive {
    public static void main(String [] args) {
        Clock c = new Clock();
        c.setTime("12:45 PM");
        String tod = c.getTime();
        System.out.println("Time: " + tod);
    }
}
