public class LandLine implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private  boolean isPoweron;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging=false;
        isPoweron=true;
    }

    @Override
    public void PhoneOn() {
        isPoweron=true;
    }

    @Override
    public void callNumber(String number) {
        if(isPoweron==true){
            System.out.println("Calling : "+number);
        }
        else{
            System.out.println("Your mobile is off");
            return;
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPoweron==true && myPhoneNo.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("Getting call from"+phoneNo);
        }
        else{
            System.out.println("Your mobile is off");
            return;
        }
    }

    @Override
    public boolean answerCall() {
        if(this.isRinging){
            System.out.println("Call answer");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
