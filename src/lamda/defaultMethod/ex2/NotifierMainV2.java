package lamda.defaultMethod.ex2;

import lamda.defaultMethod.ex1.AppPushNotifier;
import lamda.defaultMethod.ex1.EmailNotifier;
import lamda.defaultMethod.ex1.Notifier;
import lamda.defaultMethod.ex1.SMSNotifier;

import java.util.List;

public class NotifierMainV2 {
    public static void main(String[] args) {
        List<Notifier> notifiers = List.of(new EmailNotifier(), new SMSNotifier(), new AppPushNotifier());
        notifiers.forEach(notifier -> notifier.notify("서비스 가입을 환영합니다."));
    }
}
