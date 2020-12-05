public class Client {
    private Service service = new Service();
    public void doSomething(){
        doSomethingPhaseOne();
        //service.doSomethingAsync(()->doSomethingPhaseTwo());
        service.doSomethingAsync(this::doSomethingPhaseTwo);
    }
    private void doSomethingPhaseOne(){
        System.out.println("doSomethingPhaseOne");

    }
    public void doSomethingPhaseTwo(){
        System.out.println("doSomethingPhaseTwo");
    }

}
