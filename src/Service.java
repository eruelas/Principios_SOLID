public class Service {

    public interface CallBack{
        void onDoSomethingAsyncDone();
    }
    public void doSomethingAsync(CallBack callBack){
        System.out.println("doSomethingAsync antes");
        callBack.onDoSomethingAsyncDone();
        System.out.println("doSomethingAsync despues de done");
            
    }
}
