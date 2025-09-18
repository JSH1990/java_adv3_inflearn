package lamda.defaultMethod.ex2;

import lamda.defaultMethod.ex1.Notifier;

public class SMSNotifier implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("[SMS] " + message);
    }
}
