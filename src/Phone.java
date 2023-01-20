public interface Phone {
    void PhoneOn();
    void callNumber(String number);
    void receiveCall(String number);
    boolean answerCall();
    boolean isRinging();

}
