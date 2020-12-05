public class Client {
    private Service service;
    public void doSomething(){
        service = new Service();
        doSomethingPhaseOne();
        service.doSomethingAsync(this::doSomethingPhaseTwo);

    }
    private void doSomethingPhaseOne(){
        System.out.println("doSomethingPhaseOne");

    }
    public void doSomethingPhaseTwo(){
        System.out.println("doSomethingPhaseTwo");
    }

}
